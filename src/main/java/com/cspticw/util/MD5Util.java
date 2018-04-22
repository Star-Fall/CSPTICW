package com.cspticw.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @ClassName: MD5Util
 * @author: StarFall
 * @date: 2018年4月19日 下午9:31:37
 * @Description:MD5加密工具
 */
public class MD5Util {

	private static int hashIterations = 1024;

	/**
	 * MD5加密
	 * 
	 * @param source
	 *            要加密的字符串
	 * @param salt
	 *            盐
	 * @return 加密后的字符串
	 */
	public static String md5(String source, String salt) {
		Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);
		return md5Hash.toString();
	}
}
