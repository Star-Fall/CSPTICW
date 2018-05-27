package com.cspticw.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.service.ProvinceService;
import com.cspticw.util.tools.Constants;

/**
 * @ClassName: AddressController
 * @author: StarFall
 * @date: 2018年5月26日 下午10:28:44
 * @Description:地址
 */
@RestController
public class AddressController extends BaseController {
	@Autowired
	private ProvinceService provinceService;

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
	 * 保存省市到session
	 * 
	 * @return
	 */
	@RequestMapping(value = "/save_province_city_session", method = RequestMethod.POST)
	public Map<String, Object> saveProvinceCitySession(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		String province = map.get("province").toString();
		String city = map.get("city").toString();
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		session.setAttribute("province", province);
		session.setAttribute("city", city);
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}

	// 先查询
	@RequestMapping("/get_province_city_session")
	public Map<String, Object> getProvinceCitySession() {
		Map<String, Object> returnMap = new HashMap<>();
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		if (session.getAttribute("province") != null && session.getAttribute("city") != null) {
			String province = session.getAttribute("province").toString();
			String city = session.getAttribute("city").toString();
			returnMap.put("province", province);
			returnMap.put("city", city);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, "error");
		return returnMap;
	}
}
