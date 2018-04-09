package com.cspticw.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: LoginController
 * @author: StarFall
 * @date: 2018年4月9日 下午10:33:11
 * @Description:
 */
@Controller
public class LoginController extends BaseController {

	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws Exception {
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		if (exceptionClassName != null) {
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				throw new Exception("用户名错误");
			} else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
				throw new Exception("密码错误");
			} else {
				throw new Exception("未知错误");
			}
		}
		return "login";
	}
}
