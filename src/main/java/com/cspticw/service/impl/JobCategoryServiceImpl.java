package com.cspticw.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.JobCategoryMapper;
import com.cspticw.entity.JobCategory;
import com.cspticw.entity.JobCategoryAllModel;
import com.cspticw.entity.JobCategoryExample;
import com.cspticw.entity.JobCategoryExample.Criteria;
import com.cspticw.service.JobCategoryService;

@Service
public class JobCategoryServiceImpl implements JobCategoryService {

	@Autowired
	private JobCategoryMapper jobCategoryMapper;

	@Override
	@Transactional
	public boolean addJobCategory(Map<String, Object> params) {
		JobCategory jobCategory = new JobCategory();
		jobCategory.preInsert();
		jobCategory.setParentId(Long.valueOf(params.get("parentId").toString()));
		jobCategory.setCategoryName(params.get("categoryName").toString());
		jobCategory.setIsAvailable(0);
		return jobCategoryMapper.insert(jobCategory) == 1;
	}

	@Override
	public List<JobCategory> findMainCategory() {
		JobCategoryExample example = new JobCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(0L);
		List<JobCategory> list = jobCategoryMapper.selectByExample(example);
		JobCategory cate = new JobCategory();
		cate.setId(0L);
		cate.setCategoryName("--不选择主行业--");
		list.add(0, cate);
		return list;
	}

	@Override
	public List<JobCategoryAllModel> getJobCategoryAll() {
		return jobCategoryMapper.getJobCategoryAll();
	}

}
