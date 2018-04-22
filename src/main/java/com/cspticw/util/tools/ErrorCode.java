package com.cspticw.util.tools;

/**
 * @ClassName: ErrorCode
 * @author: StarFall
 * @date: 2018年4月19日 下午10:32:44
 * @Description:定义错误的代码
 */
public interface ErrorCode {
	/**
	 * 100*：系统错误<br>
	 * 200*：用户错误<br>
	 */

	// 参数异常
	public static final String ERROR_PARAMS = "1001";
	// 验证码错误
	public static final String ERROR_VALIDATE = "1002";

	// 添加用户错误
	public static final String ERROR_ADD_USER = "2001";
	// 手机号已存在
	public static final String ERROR_PHONE_EXEXIXT = "2002";
	// 用户不存在
	public static final String ERROR_UNKNOWN_USER = "2003";
	// 密码错误
	public static final String ERROR_PASSWORD = "2004";
	// 其他用户错误
	public static final String ERROR_ORTHER = "2005";
}
