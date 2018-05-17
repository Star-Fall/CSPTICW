package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
