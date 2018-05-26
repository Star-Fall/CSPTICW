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
import com.cspticw.service.RecruitRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: RecruitRecordController
 * @author: StarFall
 * @date: 2018年5月18日 上午12:13:15
 * @Description:岗位邀请controller
 */
@RestController
public class RecruitRecordController extends BaseController {

	@Autowired
	private RecruitRecordService recruitRecordService;

	/**
	 * 岗位邀请简历
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/job_to_resume", method = RequestMethod.POST)
	public Map<String, Object> addJobToResumee(@RequestBody Map<String, String> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long resumeId = Long.valueOf(map.get("resumeId").toString());
		Long jobId = Long.valueOf(map.get("jobId").toString());
		String result = recruitRecordService.addJobToResumee(resumeId, jobId);
		if (result != null && !result.equals(Constants.SUCCESS)) {
			returnMap.put(Constants.ERROR, result);
			return returnMap;
		}
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}

	/**
	 * 公司查看自己的招聘
	 * 
	 * 可以根据状态查看
	 */
	@RequestMapping("/get_company_recruit_record")
	public Map<String, Object> getCompanyRecruitRecord(
			@RequestParam(value = "status", required = false) String status) {
		Map<String, Object> returnMap = new HashMap<>();
		Integer statusInt = null;
		if (status != null) {
			statusInt = Integer.valueOf(status);
		}
		List<JSONObject> list = recruitRecordService
				.getCompanyRecruitRecord(getCompUserInfo().getId(), statusInt);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 学生查看兼职邀请
	 * 
	 * @return
	 */
	@RequestMapping("/get_student_recruit_record")
	public Map<String, Object> getStudentRecruitRecord(
			@RequestParam(value = "resumeId", required = false) String resumeId,
			@RequestParam(value = "status", required = false) String status) {
		Map<String, Object> returnMap = new HashMap<>();
		// 选择的 岗位id
		Long resumeIdLong = null;
		// 查看的状态 未处理 未查看 已处理
		Integer statusInt = null;
		if (resumeId != null) {
			resumeIdLong = Long.valueOf(resumeId);
		}
		if (status != null) {
			statusInt = Integer.valueOf(status);
		}
		List<JSONObject> list = recruitRecordService
				.getStudentRecruitRecord(getStuUserInfo().getId(), resumeIdLong, statusInt);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 更新记录
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/update_recruit_record", method = RequestMethod.POST)
	public Map<String, Object> updateRecruitRecord(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		// record id
		Long recordId = Long.valueOf(map.get("recordId").toString());
		// 状态
		Integer status = Integer.valueOf(map.get("status").toString());
		// 执行更新
		boolean result = recruitRecordService.updateRecruitRecord(recordId, status);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_RECORD_UPDATE);
		return returnMap;
	}
}
