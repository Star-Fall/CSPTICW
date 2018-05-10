package com.cspticw.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cspticw.service.CityService;
import com.cspticw.service.StuUserService;
import com.cspticw.util.tools.Constants;

/**
 * @ClassName: TestController
 * @author: StarFall
 * @date: 2018年4月7日 下午10:39:06
 * @Description:测试Controller
 */
@RequestMapping("test")
@RestController
public class TestController extends BaseController {

	@Autowired
	private CityService cityService;

	@Autowired
	private StuUserService stuUserService;

	@RequestMapping("testUser")
	public Map<String, Object> testUser1() {
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

	@RequestMapping(value = "/test_upload", method = RequestMethod.POST)
	public Map<String, Object> testUpLoad(
			@RequestParam(value = "file_image", required = false) MultipartFile file_image,
			@RequestParam(value = "file", required = false) MultipartFile file,
			@RequestParam(value = "data") String data) throws Exception, IOException {
		System.out.println(data);
		Map<String, Object> returnMap = new HashMap<>();
		String path = "D:\\";
		if (file_image != null && !file_image.isEmpty()) {
			String filename = file_image.getOriginalFilename();
			// File filepath = new File(path, filename);
			file_image.transferTo(new File(path + File.separator + filename));
		}
		if (file != null && !file.isEmpty()) {
			String filename2 = file.getOriginalFilename();
			file.transferTo(new File(path + File.separator + filename2));
		}
		returnMap.put("msg", "success");
		return returnMap;
	}

	@RequestMapping("/test_user_info")
	public String testUser() {
		System.out.println(getStuUserInfo());
		System.out.println(getCompUserInfo());
		return "success";
	}

	@RequestMapping("/test_request")
	public String testRequest() {

		String realPath = getUpFilePath(Constants.STUDENT_USER);
		System.out.println(realPath);
		return realPath;
	}
}
