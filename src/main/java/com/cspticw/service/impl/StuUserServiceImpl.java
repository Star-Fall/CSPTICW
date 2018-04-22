package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.StuUserInfoMapper;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.service.StuUserService;
import com.cspticw.util.MD5Util;

@Service
public class StuUserServiceImpl implements StuUserService {

	@Autowired
	private StuUserInfoMapper stuUserInfoMapper;

	@Override
	public StuUserInfo selectByUserName(String userName) {
		return stuUserInfoMapper.selectByUserName(userName);
	}

	@Transactional
	@Override
	public boolean addUser(StuUserInfo student) {
		student.preInsert();
		student.setPassword(MD5Util.md5(student.getPassword(), student.getUserName()));
		student.setIsAvailable(0);
		return stuUserInfoMapper.insert(student) == 1;
	}

}
