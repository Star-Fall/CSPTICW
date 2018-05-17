package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
