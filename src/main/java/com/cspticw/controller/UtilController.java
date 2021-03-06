package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.service.JobCategoryService;

/**
 * @ClassName: UtilController
 * @author: StarFall
 * @date: 2018年5月5日 下午8:47:30
 * @Description:工具Controller
 */
@RestController
public class UtilController extends BaseController {

	@Autowired
	private JobCategoryService jobCategoryService;

	/**
	 * 获取所有行业
	 * 
	 * @return
	 */
	@RequestMapping("/get_job_category")
	public Map<String, Object> getJobCategoryAll() {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("data", jobCategoryService.getJobCategoryAll());
		return returnMap;
	}

}
