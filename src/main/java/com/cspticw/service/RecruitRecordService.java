package com.cspticw.service;

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
}
