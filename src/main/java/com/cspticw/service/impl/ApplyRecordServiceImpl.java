package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.ApplyRecordMapper;
import com.cspticw.entity.ApplyRecord;
import com.cspticw.service.ApplyRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

@Service
public class ApplyRecordServiceImpl implements ApplyRecordService {

	@Autowired
	private ApplyRecordMapper applyRecordMapper;

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
		return Constants.SUCCESS;
	}
}
