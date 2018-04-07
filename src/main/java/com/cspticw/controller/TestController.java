package com.cspticw.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.service.CityService;

@RequestMapping("test")
@RestController
public class TestController {

	@Autowired
	private CityService cityService;

	@RequestMapping("cities")
	public Map<String, Object> testCities() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cities", cityService.findAllCities());
		return map;
	}

	@RequestMapping(value = "testMap", method = RequestMethod.GET)
	public Map<String, Object> testController() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> list1 = new ArrayList<>();
		list1.add("xiaoming");
		list1.add("tom");
		list1.add("jerry");
		list1.add("marry");
		List<String> list2 = new ArrayList<>();
		list2.add("123");
		list2.add("tom123");
		list2.add("jery123");
		list2.add("lilo123");
		map.put("username", list1);
		map.put("password", list2);
		return map;
	}

	@RequestMapping("str")
	public String test() {
		return "success";
	}
}
