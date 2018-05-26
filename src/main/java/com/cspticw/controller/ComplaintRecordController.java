package com.cspticw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.service.ComplaintRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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

	/**
	 * 学生查询我的投诉
	 * 
	 * @return
	 */
	@RequestMapping("/get_complaint_record_student")
	public Map<String, Object> getComplaintRecordByStudent() {
		Map<String, Object> returnMap = new HashMap<>();
		List<JSONObject> list = complaintRecordService.getComplaintRecord(getStuUserInfo().getId(),
				null, 0);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 企业查询我的投诉
	 * 
	 * @return
	 */
	@RequestMapping("/get_complaint_record_company")
	public Map<String, Object> getComplaintRecordByCompany() {
		Map<String, Object> returnMap = new HashMap<>();
		List<JSONObject> list = complaintRecordService.getComplaintRecord(null,
				getCompUserInfo().getId(), 1);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 管理员查看投诉信息
	 * 
	 * 企业的/用户的
	 * 
	 * 状态
	 * 
	 * @return
	 */
	@RequestMapping("/get_complaint_record_admin")
	public Map<String, Object> getComplaintRecordAmdin(
			@RequestParam(value = "complaintMode") String complaintMode,
			@RequestParam(value = "status", required = false) String status,
			@RequestParam(value = "pageNum", required = false) String pageNum) {
		Map<String, Object> returnMap = new HashMap<>();
		Integer complaintModeInt = Integer.valueOf(complaintMode);
		Integer statusInt = null;
		if (status != null) {
			statusInt = Integer.valueOf(status);
		}
		if (pageNum == null)
			pageNum = 1 + "";
		PageHelper.startPage(Integer.valueOf(pageNum), 10);
		List<JSONObject> list = complaintRecordService.getComplaintRecordAmdin(complaintModeInt,
				statusInt);
		PageInfo<JSONObject> pageInfo = new PageInfo<>(list, 5);
		returnMap.put("data", pageInfo);
		return returnMap;
	}

	/**
	 * 管理员处理
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/update_complaint_record_admin", method = RequestMethod.POST)
	public Map<String, Object> updateComplaintRecordAmdin(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		Long recordId = Long.valueOf(map.get("recordId").toString());
		String handleResult = map.get("handleResult").toString();
		boolean result = complaintRecordService.updateComplaintRecordAmdin(recordId, handleResult);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, "error");
		return returnMap;
	}
}
