package com.cspticw.realm.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * @ClassName: MyFormAuthenticationFilter
 * @author: StarFall
 * @date: 2018年4月9日 下午9:59:17
 * @Description:表单认证过滤器
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

	/**
	 * 支持验证码验证
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
			throws Exception {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String randomcode = request.getParameter("randomcode");
		String validateCode = (String) session.getAttribute("validateCode");
		if (randomcode != null && validateCode != null) {
			if (!randomcode.equals(validateCode)) {
				request.setAttribute("shiroLoginFailure", "randomCodeError");
				return true;
			}
		}
		return super.onAccessDenied(request, response);
	}
}
