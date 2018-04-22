package com.cspticw.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: LoginController
 * @author: StarFall
 * @date: 2018年4月9日 下午10:33:11
 * @Description:
 */
@RestController
public class LoginController extends BaseController {

	private HashMap<String, Object> returnMap;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> login(@RequestBody Map<String, Object> map) {
		returnMap = new HashMap<>();
		if (map == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_PARAMS);
			return returnMap;
		}
		// 登陆者角色
		String loginRole = map.get("loginRole").toString();
		String userName = map.get("userName").toString();
		String password = map.get("password").toString();
		String newUserName = userName + "-" + loginRole;
		Subject currentUser = SecurityUtils.getSubject();
		// 如果为验证
		if (!currentUser.isAuthenticated()) {
			// 把用户名和密码封装为 UsernamePasswordToken 对象
			UsernamePasswordToken token = new UsernamePasswordToken(newUserName, password);
			// rememberme
			token.setRememberMe((boolean) map.get("rememberMe"));
			try {
				// 执行登录.
				currentUser.login(token);
			} catch (UnknownAccountException uae) {
				// 若没有指定的账户, 则 shiro 将会抛出 UnknownAccountException 异常.
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_UNKNOWN_USER);
				return returnMap;
			} catch (IncorrectCredentialsException ice) {
				// 若账户存在, 但密码不匹配, 则 shiro 会抛出 IncorrectCredentialsException 异常。
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_PASSWORD);
				return returnMap;
			} catch (AuthenticationException e) {
				// 所有认证时异常的父类.
				returnMap.put(Constants.ERROR, ErrorCode.ERROR_ORTHER);
				return returnMap;
			}
			// 添加至session
			Session session = currentUser.getSession();
			session.setAttribute(Constants.LOGIN_USER, currentUser.getPrincipal());
		}
		// 登录成功
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;
	}
}
