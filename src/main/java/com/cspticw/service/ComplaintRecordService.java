package com.cspticw.service;

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
}
