package com.cspticw.service;

import com.cspticw.entity.StuUserInfo;

/**
 * @ClassName: StuUserService
 * @author: StarFall
 * @date: 2018年4月9日 下午10:07:42
 * @Description:学生用户基本信息服务接口
 */
public interface StuUserService {

	/**
	 * 根据userName查询学生用户
	 * 
	 * @param userName
	 *            用户名
	 * @return StuUserInfo
	 */
	StuUserInfo selectByUserName(String userName);

	/**
	 * 新增用户
	 * 
	 * @param student
	 * @return
	 */
	boolean addUser(StuUserInfo student);
}
