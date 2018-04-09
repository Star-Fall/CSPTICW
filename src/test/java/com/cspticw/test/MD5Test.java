package com.cspticw.test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Test {

	public static void main(String[] args) {
		/**
		 * Md5Hash
		 */

		String source = "123456";

		String salt = "company";

		int hashIterations = 1024;
		Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);
		System.out.println(md5Hash.toString());

		/**
		 * SimpleHash
		 */

		String algorithmName = "MD5";
		SimpleHash simpleHash = new SimpleHash(algorithmName, source, salt, hashIterations);
		System.out.println(simpleHash.toString());
	}
}
