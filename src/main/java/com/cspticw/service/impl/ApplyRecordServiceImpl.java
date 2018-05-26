package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.dao.ApplyRecordMapper;
import com.cspticw.dao.CompJobInfoMapper;
import com.cspticw.entity.ApplyRecord;
import com.cspticw.service.ApplyRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

@Service
public class ApplyRecordServiceImpl implements ApplyRecordService {

	@Autowired
	private ApplyRecordMapper applyRecordMapper;

	@Autowired
	private CompJobInfoMapper compJobInfoMapper;

	@Transactional
	@Override
	public String addResumeToJob(Long resumeId, Long jobId) {
		// 十天内不可重复投递
		Integer days = applyRecordMapper.selectDayById(resumeId, jobId);
		if (days != null) {
			if (days.intValue() <= 10) {
				return ErrorCode.ERROR_RESUME_TENDAY;
			}
		}
		ApplyRecord record = new ApplyRecord();
		record.setCompJobId(jobId);
		record.setResumeId(resumeId);
		record.preInsert();
		record.setStatus(0);
		record.setIsCheck(0);
		applyRecordMapper.insert(record);
		// 增加热度
		compJobInfoMapper.addJobHot(2, jobId);
		return Constants.SUCCESS;
	}

	@Override
	public List<JSONObject> getStudentApplyRecord(Long stuId, Integer status) {
		List<JSONObject> list = applyRecordMapper.getStudentApplyRecord(stuId, status);
		return list;
	}

	@Override
	public List<JSONObject> getCompanyApplyRecord(Long compId, Long jobId, Integer status) {
		List<JSONObject> list = applyRecordMapper.getCompanyApplyRecord(compId, jobId, status);
		return list;
	}

	@Transactional
	@Override
	public boolean updateApplyRecord(Long recordId, Integer status) {
		ApplyRecord record = new ApplyRecord();
		record.setId(recordId);
		record.setStatus(status);
		record.preUpdate();
		int i = applyRecordMapper.updateByPrimaryKeySelective(record);
		return i == 1;
	}
}
