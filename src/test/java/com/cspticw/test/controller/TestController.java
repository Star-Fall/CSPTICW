package com.cspticw.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.service.CityService;
import com.cspticw.service.StuUserService;

/**
 * @ClassName: TestController
 * @author: StarFall
 * @date: 2018年4月7日 下午10:39:06
 * @Description:测试Controller
 */
@RequestMapping("test")
@RestController
public class TestController {

	@Autowired
	private CityService cityService;

	@Autowired
	private StuUserService stuUserService;

	@RequestMapping("testUser")
	public Map<String, Object> testUser() {
		Map<String, Object> map = new HashMap<String, Object>();
		Subject subject = SecurityUtils.getSubject();
		Object user = subject.getPrincipal();
		map.put("user", user);
		return map;
	}

	@RequestMapping("testStuUser")
	public Map<String, Object> testStudentUser() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stuUser", stuUserService.selectByUserName("Star_Fall"));
		return map;
	}

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
