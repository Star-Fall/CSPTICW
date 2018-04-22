package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.exceptions.ClientException;
import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.service.CompUserService;
import com.cspticw.service.StuUserService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

@RestController
public class RegistController {

	@Autowired
	private StuUserService stuUserService;
	@Autowired
	private CompUserService compUserService;
	// 验证码
	private static String validateCode = "";

	private HashMap<String, Object> returnMap;

	/**
	 * 注册方法
	 * 
	 * @param baseUser
	 *            基本用户
	 * @return 注册结果
	 */
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public Map<String, Object> regist(@RequestBody Map<String, Object> map) {
		returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		String regist = map.get("regist").toString();
		// 验证码
		if ("".equals(validateCode) || "".equals(map.get("validateCode"))
				|| !validateCode.equals(map.get("validateCode"))) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_VALIDATE);
			return returnMap;
		}
		// 转换
		if (Constants.STUDENT_USER.equals(regist)) {
			StuUserInfo student = new StuUserInfo();
			student.setUserName(map.get("userName").toString());
			student.setPassword(map.get("password").toString());
			if (!stuUserService.addUser(student)) {
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_USER);
				return returnMap;
			}
			// 注册完成进行登录 TODO
			afterLogin(Constants.STUDENT_USER, student.getUserName(),
					map.get("password").toString());
		} else if (Constants.COMPANY_USER.equals(regist)) {
			CompUserInfo company = new CompUserInfo();
			company.setUserName(map.get("userName").toString());
			company.setPassword(map.get("password").toString());
			if (!compUserService.addUser(company)) {
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_USER);
				return returnMap;
			}
			// 注册完成进行登录 TODO
			afterLogin(Constants.COMPANY_USER, company.getUserName(),
					map.get("password").toString());
		}
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}

	/**
	 * 发送短信
	 * 
	 * @param userName
	 *            手机号
	 * @return 短信验证码
	 * @throws ClientException
	 */
	@RequestMapping(value = "/regist/send_message", method = RequestMethod.POST)
	public Map<String, Object> sendMessage(@RequestBody Map<String, Object> params)
			throws Exception {
		returnMap = new HashMap<>();
		Map<String, Object> responseMap;
		responseMap = new HashMap<>();
		responseMap.put("Code", "OK");
		responseMap.put("Message", "OK");
		validateCode = "123456";
		// String code = (int) ((Math.random() * 9 + 1) * 100000) + "";
		// responseMap =
		// MoblieMessageUtil.callBackMessage(MoblieMessageUtil.sendSms(userName,
		// code));
		returnMap.put(Constants.MSG, responseMap);
		return returnMap;
	}

	/**
	 * 检验用户名是否存在
	 * 
	 * @param userName
	 *            用户名
	 * @return
	 */
	@RequestMapping(value = "/regist/check_username", method = RequestMethod.GET)
	public Map<String, Object> checkUserName(
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "regist", required = true) String regist) {
		returnMap = new HashMap<>();
		// 学生用户
		if (Constants.STUDENT_USER.equals(regist)) {
			// 验证
			StuUserInfo student = stuUserService.selectByUserName(userName);
			if (student != null) {
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_PHONE_EXEXIXT);
				return returnMap;
			}
		}
		// 企业用户
		else if (Constants.COMPANY_USER.equals(regist)) {
			// 验证
			CompUserInfo company = compUserService.selectByUserName(userName);
			if (company != null) {
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_PHONE_EXEXIXT);
				return returnMap;
			}
		} else {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		returnMap.put(Constants.MSG, Constants.TRUE);
		return returnMap;
	}

	/**
	 * 注册后登录
	 * 
	 * @param userName
	 * @param password
	 */
	private void afterLogin(String loginRole, String userName, String password) {
		UsernamePasswordToken token = new UsernamePasswordToken();
		token.setRememberMe(true);
		token.setUsername(userName + "-" + loginRole);
		token.setPassword(password.toCharArray());
		Subject subject = SecurityUtils.getSubject();
		try {
			if (subject.isAuthenticated()) {
				subject.logout();
			}
			subject.login(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		subject.getSession().setAttribute(Constants.LOGIN_USER, subject.getPrincipal());
	}
}
