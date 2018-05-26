package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: RecruitRecordService
 * @author: StarFall
 * @date: 2018年5月18日 上午12:13:50
 * @Description:岗位邀请
 */
public interface RecruitRecordService {

	/**
	 * 岗位邀请简历
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	String addJobToResumee(Long resumeId, Long jobId);

	/**
	 * 公司查看自己的招聘
	 * 
	 * @param compId
	 * @param status
	 *            根据状态查看
	 * @return
	 */
	List<JSONObject> getCompanyRecruitRecord(Long compId, Integer status);

	/**
	 * 学生查看兼职邀请
	 * 
	 * @param stuId
	 * @param resumeId
	 * @param status
	 * @return
	 */
	List<JSONObject> getStudentRecruitRecord(Long stuId, Long resumeId, Integer status);

	/**
	 * 更新记录状态
	 * 
	 * @param recordId
	 * @param status
	 * @return
	 */
	boolean updateRecruitRecord(Long recordId, Integer status);
}
