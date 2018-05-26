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
import com.cspticw.service.ApplyRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: ApplyRecordController
 * @author: StarFall
 * @date: 2018年5月18日 上午12:07:26
 * @Description:简历投递Controller
 */
@RestController
public class ApplyRecordController extends BaseController {

	@Autowired
	private ApplyRecordService applyRecordService;

	/**
	 * 简历投递工作
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	@RequestMapping(value = "/resume_to_job", method = RequestMethod.POST)
	public Map<String, Object> addResumeToJob(@RequestBody Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long resumeId = Long.valueOf(map.get("resumeId").toString());
		Long jobId = Long.valueOf(map.get("jobId").toString());
		String result = applyRecordService.addResumeToJob(resumeId, jobId);
		if (result != null && !result.equals(Constants.SUCCESS)) {
			returnMap.put(Constants.ERROR, result);
			return returnMap;
		}
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}

	/**
	 * 学生查看简历投递记录
	 * 
	 * @return
	 */
	@RequestMapping("/get_student_apply_record")
	public Map<String, Object> getStudentApplyRecord(
			@RequestParam(value = "status", required = false) String status) {
		Map<String, Object> returnMap = new HashMap<>();
		List<JSONObject> list = null;
		if (status == null) {
			list = applyRecordService.getStudentApplyRecord(getStuUserInfo().getId(), null);
		} else {
			list = applyRecordService.getStudentApplyRecord(getStuUserInfo().getId(),
					Integer.valueOf(status));
		}
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 公司查看收到的简历
	 * 
	 * @return
	 */
	@RequestMapping("/get_company_apply_record")
	public Map<String, Object> getCompanyApplyRecord(
			@RequestParam(value = "jobId", required = false) String jobId,
			@RequestParam(value = "status", required = false) String status) {
		Map<String, Object> returnMap = new HashMap<>();

		// 选择的 岗位id
		Long jobIdLong = null;
		// 查看的状态 未处理 未查看 已处理
		Integer statusInt = null;
		if (jobId != null) {
			jobIdLong = Long.valueOf(jobId);
		}
		if (status != null) {
			statusInt = Integer.valueOf(status);
		}
		List<JSONObject> list = applyRecordService.getCompanyApplyRecord(getCompUserInfo().getId(),
				jobIdLong, statusInt);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 更新记录
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/update_apply_record", method = RequestMethod.POST)
	public Map<String, Object> updateApplyRecord(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		// record id
		Long recordId = Long.valueOf(map.get("recordId").toString());
		// 状态
		Integer status = Integer.valueOf(map.get("status").toString());
		// 执行更新
		boolean result = applyRecordService.updateApplyRecord(recordId, status);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_RECORD_UPDATE);
		return returnMap;
	}
}
