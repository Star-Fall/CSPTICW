package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
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

	@Override
	public List<JSONObject> getComplaintRecord(Long stuId, Long compId, Integer complaintMode) {
		return complaintRecordMapper.getComplaintRecord(stuId, compId, complaintMode);
	}

	@Override
	public List<JSONObject> getComplaintRecordAmdin(Integer complaintMode, Integer status) {
		return complaintRecordMapper.getComplaintRecordAmdin(complaintMode, status);
	}

	@Transactional
	@Override
	public boolean updateComplaintRecordAmdin(Long recordId, String handleResult) {
		ComplaintRecord record = new ComplaintRecord();
		record.preUpdate();
		record.setId(recordId);
		record.setHandleResult(handleResult);
		record.setStatus(1);
		int i = complaintRecordMapper.updateByPrimaryKeySelective(record);
		return i == 1;
	}

}
