package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.dao.CompJobInfoMapper;
import com.cspticw.entity.CompJobInfo;
import com.cspticw.entity.CompJobInfoExample;
import com.cspticw.entity.CompJobInfoExample.Criteria;
import com.cspticw.service.CompJobService;

@Service
public class CompJobServiceImpl implements CompJobService {

	@Autowired
	private CompJobInfoMapper compJobInfoMapper;

	@Transactional
	@Override
	public boolean addCompJob(CompJobInfo record) {
		record.preInsert();
		record.setIsAvailable(0);
		record.setResuHot(0);
		compJobInfoMapper.insert(record);
		return true;
	}

	@Override
	public List<CompJobInfo> getCompJobList(Long compId) {
		CompJobInfoExample example = new CompJobInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompIdEqualTo(compId);
		List<CompJobInfo> list = compJobInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<CompJobInfo> getCompJobTop10(String province, String city) {
		if (province != null) {
			province = "%" + province + "%";
		}
		if (city != null) {
			city = "%" + city + "%";
		}
		List<CompJobInfo> list = compJobInfoMapper.getCompJobTop10(province, city);
		return list;
	}

	@Override
	public List<CompJobInfo> getCompJobByParams() {
		List<CompJobInfo> list = compJobInfoMapper.selectByExample(null);
		return list;
	}

	@Override
	public List<CompJobInfo> getMyCompJobList(Long compId) {
		CompJobInfoExample example = new CompJobInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompIdEqualTo(compId);
		criteria.andIsAvailableEqualTo(0);
		List<CompJobInfo> list = compJobInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public JSONObject getCompanyJobDetailById(Long jobId) {
		JSONObject jsonObject = compJobInfoMapper.getCompanyJobDetailById(jobId);
		return jsonObject;
	}

}
