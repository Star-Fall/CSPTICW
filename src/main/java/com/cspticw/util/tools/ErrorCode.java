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

	/**
	 * 参数异常
	 */
	public static final String ERROR_PARAMS = "1001";

	/**
	 * 验证码错误
	 */
	public static final String ERROR_VALIDATE = "1002";

	/**
	 * 验证码发送失败
	 */
	public static final String ERROR_SEND_VALIDATE = "1003";

	/**
	 * 添加用户错误
	 */
	public static final String ERROR_ADD_USER = "2001";
	/**
	 * 手机号已存在
	 */
	public static final String ERROR_PHONE_EXEXIXT = "2002";
	/**
	 * 用户不存在
	 */
	public static final String ERROR_UNKNOWN_USER = "2003";
	/**
	 * 密码错误
	 */
	public static final String ERROR_PASSWORD = "2004";
	/**
	 * 其他用户错误
	 */
	public static final String ERROR_ORTHER = "2005";
	/**
	 * 暂无用户登录
	 */
	public static final String ERROR_NO_LONGIN = "2006";

	/**
	 * 上传文件错误
	 */
	public static final String ERROR_UP_FILE = "3000";
	/**
	 * 添加简历错误
	 */
	public static final String ERROR_ADD_RESUME = "3001";
	/**
	 * 更新简历错误
	 */
	public static final String ERROR_UPDATE_RESUME = "3002";
	/**
	 * 删除简历错误
	 */
	public static final String ERROR_DELETE_RESUME = "3003";
	/**
	 * 认证信息上传错误
	 */
	public static final String ERROR_ADD_CERTI = "4001";
	/**
	 * 发布岗位错误
	 */
	public static final String ERROR_ADD_JOB = "4002";

	/**
	 * 大学生用户没有登录
	 */
	public static final String ERROR_STUDENT_LOGIN = "5001";
	/**
	 * 企业用户没有登录
	 */
	public static final String ERROR_COMPANY_LOGIN = "5002";

	/**
	 * 十天内重复投递
	 */
	public static final String ERROR_RESUME_TENDAY = "5003";
	/**
	 * 十天内重复邀请
	 */
	public static final String ERROR_JOB_TENDAY = "5004";
	/**
	 * 收藏失败
	 */
	public static final String ERROR_COLLECT_FAIL = "6001";
	/**
	 * 已经收藏了
	 */
	public static final String ERROR_COLLECT_EXIT = "6002";
	/**
	 * 投诉失败
	 */
	public static final String ERROR_COMPLAINT_FAIL = "6003";
	// 添加行业错误
	public static final String ERROR_ADD_JOB_CATEGORY = "0001";
}
