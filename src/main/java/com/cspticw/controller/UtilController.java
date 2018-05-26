package com.cspticw.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.service.JobCategoryService;
import com.cspticw.service.ProvinceService;
import com.cspticw.util.tools.Constants;

/**
 * @ClassName: UtilController
 * @author: StarFall
 * @date: 2018年5月5日 下午8:47:30
 * @Description:工具Controller
 */
@RestController
public class UtilController extends BaseController {

	@Autowired
	private ProvinceService provinceService;
	@Autowired
	private JobCategoryService jobCategoryService;

	/**
	 * 获取省份城市
	 * 
	 * @return
	 */
	@RequestMapping("/get_province_city")
	public Map<String, Object> getProvinceCity() {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("data", provinceService.getProvinceCity());
		return returnMap;
	}

	/**
	 * 根据地级市获取县级
	 * 
	 * @param city
	 * @return
	 */
	@RequestMapping("/get_country_by_city")
	public Map<String, Object> getCountryByCity(@RequestParam("province") String province,
			@RequestParam("city") String city) {
		Map<String, Object> returnMap = new HashMap<>();
		try {
			city = new String(city.getBytes("iso-8859-1"), "utf-8");
			province = new String(province.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			returnMap.put(Constants.ERROR, "error");
			return returnMap;
		}
		List<JSONObject> list = provinceService.getCountryByCity(province, city);
		returnMap.put("data", list);
		return returnMap;
	}

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
