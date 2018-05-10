package com.cspticw.util;

import java.util.UUID;

/**
 * @ClassName: CommonUtils
 * @author: StarFall
 * @date: 2018年5月6日 下午4:01:34
 * @Description:基本工具类
 */
public class CommonUtils {

	/**
	 * 获取唯一标识符
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
