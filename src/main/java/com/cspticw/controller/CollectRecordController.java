package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.service.CollectRecordService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: CollectRecordController
 * @author: StarFall
 * @date: 2018年5月17日 下午3:39:02
 * @Description:收藏记录controller
 */
@RestController
public class CollectRecordController extends BaseController {

	@Autowired
	private CollectRecordService collectRecordService;

	/**
	 * 新增企业收藏记录
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/add_record_company", method = RequestMethod.POST)
	public Map<String, Object> addRecordByCompany(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long compId = getCompUserInfo().getId();
		Long resumeId = Long.valueOf(map.get("resumeId").toString());
		int collectUser = 1;
		boolean selectRecord = collectRecordService.selectRecordByCompany(compId, resumeId,
				collectUser);
		if (selectRecord) {
			// 已经收藏
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_COLLECT_EXIT);
			return returnMap;
		}
		boolean result = collectRecordService.addCollectRecord(null, null, compId, resumeId,
				collectUser);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_COLLECT_FAIL);
		return returnMap;
	}

	/**
	 * 新增大学生收藏记录
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/add_record_student", method = RequestMethod.POST)
	public Map<String, Object> addRecordByStudent(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		Long stuId = getStuUserInfo().getId();
		Long jobId = Long.valueOf(map.get("jobId").toString());
		int collectUser = 0;
		boolean selectRecord = collectRecordService.selectRecordByStudent(stuId, jobId,
				collectUser);
		if (selectRecord) {
			// 已经收藏
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_COLLECT_EXIT);
			return returnMap;
		}
		boolean result = collectRecordService.addCollectRecord(stuId, jobId, null, null,
				collectUser);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_COLLECT_FAIL);
		return returnMap;
	}

}
