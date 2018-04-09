package com.cspticw.service;

import com.cspticw.entity.CompUserInfo;

/**
 * @ClassName: CompUserInfoService
 * @author: StarFall
 * @date: 2018年4月9日 下午10:26:59
 * @Description:企业用户信息服务接口
 */
public interface CompUserService {

	/**
	 * 根据用户名查询企业用户信息
	 * 
	 * @param userName
	 * @return
	 */
	CompUserInfo selectByUserName(String userName);
}
