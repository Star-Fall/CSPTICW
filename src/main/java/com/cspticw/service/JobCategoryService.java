package com.cspticw.service;

import java.util.List;
import java.util.Map;

import com.cspticw.entity.JobCategory;
import com.cspticw.entity.JobCategoryAllModel;

/**
 * @ClassName: JobCategoryService
 * @author: StarFall
 * @date: 2018年4月30日 下午7:10:52
 * @Description:行业分类
 */
public interface JobCategoryService {

	/**
	 * 添加新行业
	 * 
	 * @param params
	 * @return
	 */
	boolean addJobCategory(Map<String, Object> params);

	/**
	 * 查询主行业
	 * 
	 * @return
	 */
	List<JobCategory> findMainCategory();

	/**
	 * 获取所有的行业职位
	 * 
	 * @return
	 */
	List<JobCategoryAllModel> getJobCategoryAll();
}
