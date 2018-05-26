package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: ComplaintRecordService
 * @author: StarFall
 * @date: 2018年5月17日 下午4:32:56
 * @Description:投诉服务
 */
public interface ComplaintRecordService {

	/**
	 * 新增记录
	 * 
	 * @return
	 */
	boolean addComplaintRecord(Long resumeId, Long compId, Long jobId, Long stuId,
			int complaintMode, String complaintTitle, String complaintContent);

	List<JSONObject> getComplaintRecord(Long stuId, Long compId, Integer complaintMode);

	/**
	 * 管理员获取
	 * 
	 * @param complaintMode
	 * @param status
	 * @return
	 */
	List<JSONObject> getComplaintRecordAmdin(Integer complaintMode, Integer status);

	boolean updateComplaintRecordAmdin(Long recordId, String handleResult);
}
