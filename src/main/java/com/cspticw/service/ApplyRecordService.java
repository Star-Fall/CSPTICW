package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: ApplyRecordService
 * @author: StarFall
 * @date: 2018年5月18日 上午12:08:08
 * @Description:简历投递服务
 */
public interface ApplyRecordService {

	/**
	 * 简历投递工作
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	String addResumeToJob(Long resumeId, Long jobId);

	/**
	 * 获取学生的简历投递记录
	 * 
	 * @param stuId
	 * @param status
	 * @return
	 */
	List<JSONObject> getStudentApplyRecord(Long stuId, Integer status);

	/**
	 * 公司查看收到的简历
	 * 
	 * @param compId
	 * @param jobId
	 * @param status
	 * @return
	 */
	List<JSONObject> getCompanyApplyRecord(Long compId, Long jobId, Integer status);

	/**
	 * 更新记录状态
	 * 
	 * @param recordId
	 * @param status
	 * @return
	 */
	boolean updateApplyRecord(Long recordId, Integer status);
}
