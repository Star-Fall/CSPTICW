package com.cspticw.service;

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
}
