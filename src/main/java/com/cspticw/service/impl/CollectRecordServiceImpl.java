package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.CollectRecordMapper;
import com.cspticw.entity.CollectRecord;
import com.cspticw.entity.CollectRecordExample;
import com.cspticw.entity.CollectRecordExample.Criteria;
import com.cspticw.service.CollectRecordService;

@Service
public class CollectRecordServiceImpl implements CollectRecordService {

	@Autowired
	private CollectRecordMapper collectRecordMapper;

	@Override
	public boolean selectRecordByCompany(Long compId, Long resumeId, int collectUser) {
		CollectRecordExample example = new CollectRecordExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompIdEqualTo(compId);
		criteria.andResumeIdEqualTo(resumeId);
		criteria.andCollectUserEqualTo(collectUser);
		// 没删除
		criteria.andIsDeleteEqualTo(0);
		List<CollectRecord> list = collectRecordMapper.selectByExample(example);
		// 不为空且有数据
		if (list != null && list.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean selectRecordByStudent(Long stuId, Long jobId, int collectUser) {
		CollectRecordExample example = new CollectRecordExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuId);
		criteria.andJobIdEqualTo(jobId);
		criteria.andCollectUserEqualTo(collectUser);
		// 没删除
		criteria.andIsDeleteEqualTo(0);
		List<CollectRecord> list = collectRecordMapper.selectByExample(example);
		// 不为空且有数据
		if (list != null && list.size() > 0) {
			return true;
		}
		return false;
	}

	@Transactional
	@Override
	public boolean addCollectRecord(Long stuId, Long jobId, Long compId, Long resumeId,
			int collectUser) {
		CollectRecord record = new CollectRecord();
		record.preInsert();
		record.setStuId(stuId);
		record.setJobId(jobId);
		record.setCompId(compId);
		record.setResumeId(resumeId);
		record.setCollectUser(collectUser);
		record.setIsDelete(0);
		int i = collectRecordMapper.insert(record);
		return i == 1;
	}

}
