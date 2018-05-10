package com.cspticw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.entity.JobCategory;
import com.cspticw.service.JobCategoryService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: AdminController
 * @author: StarFall
 * @date: 2018年4月30日 下午6:44:01
 * @Description:管理员Controller
 */

@RestController
public class AdminController extends BaseController {

	@Autowired
	private JobCategoryService jobCategoryService;

	private HashMap<String, Object> returnMap;

	/**
	 * 新增行业
	 * 
	 * @param params
	 * @return
	 */
	@RequestMapping(value = "/add_job_category", method = RequestMethod.POST)
	public Map<String, Object> addJobCategory(@RequestBody Map<String, Object> params) {
		returnMap = new HashMap<>();
		// 参数异常
		if (null == params) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
		}
		// 添加结果
		if (!jobCategoryService.addJobCategory(params)) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_JOB_CATEGORY);
		}
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}

	/**
	 * 查找主行业
	 * 
	 * @return
	 */
	@RequestMapping(value = "/find_main_category", method = RequestMethod.GET)
	public Map<String, Object> findMainCategory() {
		returnMap = new HashMap<>();
		List<JobCategory> list = jobCategoryService.findMainCategory();
		returnMap.put("data", list);
		return returnMap;
	}
}
