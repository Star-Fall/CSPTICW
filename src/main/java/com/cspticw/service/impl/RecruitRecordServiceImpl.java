package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.RecruitRecordMapper;
import com.cspticw.entity.RecruitRecord;
import com.cspticw.service.RecruitRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

@Service
public class RecruitRecordServiceImpl implements RecruitRecordService {
	@Autowired
	private RecruitRecordMapper recruitRecordMapper;

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
		return Constants.SUCCESS;
	}
}
