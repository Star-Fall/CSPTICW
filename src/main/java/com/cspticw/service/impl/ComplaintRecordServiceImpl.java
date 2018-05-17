package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.ComplaintRecordMapper;
import com.cspticw.entity.ComplaintRecord;
import com.cspticw.service.ComplaintRecordService;

@Service
public class ComplaintRecordServiceImpl implements ComplaintRecordService {

	@Autowired
	private ComplaintRecordMapper complaintRecordMapper;

	@Transactional
	@Override
	public boolean addComplaintRecord(Long resumeId, Long compId, Long jobId, Long stuId,
			int complaintMode, String complaintTitle, String complaintContent) {
		ComplaintRecord record = new ComplaintRecord();
		record.preInsert();
		record.setResumeId(resumeId);
		record.setCompId(compId);
		record.setJobId(jobId);
		record.setStuId(stuId);
		record.setComplaintMode(complaintMode);
		record.setComplaintTitle(complaintTitle);
		record.setComplaintContent(complaintContent);
		// status
		record.setStatus(0);
		int i = complaintRecordMapper.insert(record);
		return i == 1;
	}

}
