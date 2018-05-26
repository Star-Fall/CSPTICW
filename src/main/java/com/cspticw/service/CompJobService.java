package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.CompJobInfo;
import com.cspticw.entity.JobListParams;

public interface CompJobService {

	/**
	 * 发布岗位
	 * 
	 * @param record
	 * @return
	 */
	boolean addCompJob(CompJobInfo record);

	boolean updateCompanyJob(CompJobInfo record);

	boolean deleteCompanyJob(Long id);

	/**
	 * 根据公司Id查找所有岗位
	 * 
	 * @param compId
	 * @return
	 */
	List<CompJobInfo> getCompJobList(Long compId);

	/**
	 * 根据id查看工作公司
	 * 
	 * @param jobId
	 * @return
	 */
	JSONObject getCompanyJobDetailById(Long jobId);

	/**
	 * 热点前10名
	 * 
	 * @return
	 */
	List<CompJobInfo> getCompJobTop10(String province, String city);

	List<CompJobInfo> getCompJobByParams();

	List<JSONObject> getList(JobListParams params);

	/**
	 * 获取我的岗位列表-用于岗位邀请
	 * 
	 * @param compId
	 * @return
	 */
	List<CompJobInfo> getMyCompJobList(Long compId);

}
