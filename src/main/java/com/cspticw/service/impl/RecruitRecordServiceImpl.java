package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.dao.RecruitRecordMapper;
import com.cspticw.dao.StuResumeInfoMapper;
import com.cspticw.entity.RecruitRecord;
import com.cspticw.service.RecruitRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

@Service
public class RecruitRecordServiceImpl implements RecruitRecordService {
	@Autowired
	private RecruitRecordMapper recruitRecordMapper;
	@Autowired
	private StuResumeInfoMapper stuResumeInfoMapper;

	@Transactional
	@Override
	public String addJobToResumee(Long resumeId, Long jobId) {
		// 十天内不可重复投递
		Integer days = recruitRecordMapper.selectDayById2(resumeId, jobId);
		if (days != null) {
			if (days.intValue() <= 10) {
				return ErrorCode.ERROR_JOB_TENDAY;
			}
		}
		RecruitRecord record = new RecruitRecord();
		record.preInsert();
		record.setCompJobId(jobId);
		record.setResumeId(resumeId);
		record.setStatus(0);
		recruitRecordMapper.insert(record);
		// 增加简历热度
		stuResumeInfoMapper.addResumeHot(2, resumeId);
		return Constants.SUCCESS;
	}

	@Override
	public List<JSONObject> getCompanyRecruitRecord(Long compId, Integer status) {
		return recruitRecordMapper.getCompanyRecruitRecord(compId, status);
	}

	@Override
	public List<JSONObject> getStudentRecruitRecord(Long stuId, Long resumeId, Integer status) {
		return recruitRecordMapper.getStudentRecruitRecord(stuId, resumeId, status);
	}

	@Transactional
	@Override
	public boolean updateRecruitRecord(Long recordId, Integer status) {
		RecruitRecord record = new RecruitRecord();
		record.preUpdate();
		record.setId(recordId);
		record.setStatus(status);
		int i = recruitRecordMapper.updateByPrimaryKeySelective(record);
		return i == 1;
	}
}
