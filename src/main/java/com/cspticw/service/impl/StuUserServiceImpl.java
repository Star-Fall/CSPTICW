package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cspticw.dao.StuUserInfoMapper;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.service.StuUserService;

@Service
public class StuUserServiceImpl implements StuUserService {

	@Autowired
	private StuUserInfoMapper stuUserInfoMapper;

	@Override
	public StuUserInfo selectByUserName(String userName) {
		return stuUserInfoMapper.selectByUserName(userName);
	}

}
