package com.cspticw.util;

import java.util.HashMap;

/**
 * @ClassName: ValidateMap
 * @author: StarFall
 * @date: 2018年4月27日 下午9:06:59
 * @Description:存放验证码的单例map
 */
public class ValidateMap extends HashMap<String, String> {

	private static final long serialVersionUID = 1170100985085143336L;

	private static ValidateMap validateMap;

	private ValidateMap() {
	}

	public static ValidateMap getInstance() {
		if (null == validateMap) {
			validateMap = new ValidateMap();
		}
		return validateMap;
	}
}
