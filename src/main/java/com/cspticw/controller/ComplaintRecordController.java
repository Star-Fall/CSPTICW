package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.service.ComplaintRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: ComplaintRecordController
 * @author: StarFall
 * @date: 2018年5月17日 下午4:29:31
 * @Description:投诉Controller
 */
@RestController
public class ComplaintRecordController extends BaseController {

	@Autowired
	private ComplaintRecordService complaintRecordService;

	/**
	 * 添加企业投诉
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/add_complaint_record_company", method = RequestMethod.POST)
	public Map<String, Object> addComplaintRecordByCompany(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long resumeId = Long.valueOf(map.get("resumeId").toString());
		String complaintTitle = map.get("complaintTitle").toString();
		String complaintContent = map.get("complaintContent").toString();
		boolean result = complaintRecordService.addComplaintRecord(resumeId,
				getCompUserInfo().getId(), null, null, 1, complaintTitle, complaintContent);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_COMPLAINT_FAIL);
		return returnMap;
	}

	/**
	 * 添加学生投诉
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/add_complaint_record_student", method = RequestMethod.POST)
	public Map<String, Object> addComplaintRecordByStudent(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long jobId = Long.valueOf(map.get("jobId").toString());
		String complaintTitle = map.get("complaintTitle").toString();
		String complaintContent = map.get("complaintContent").toString();
		boolean result = complaintRecordService.addComplaintRecord(null, null, jobId,
				getStuUserInfo().getId(), 0, complaintTitle, complaintContent);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_COMPLAINT_FAIL);
		return returnMap;
	}

}
