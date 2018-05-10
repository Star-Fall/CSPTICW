package com.cspticw.util;

import java.util.Date;

/**
 * @ClassName: DateUtil
 * @author: StarFall
 * @date: 2018年5月6日 下午3:22:04
 * @Description:日期工具类
 */
public class DateUtil {

	/**
	 * 获取毫秒值String
	 * 
	 * @return
	 */
	public static String getTimeInMillis() {
		Date date = new Date();
		return date.getTime() + "";
	}

}
