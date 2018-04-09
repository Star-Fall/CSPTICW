package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cspticw.dao.CompUserInfoMapper;
import com.cspticw.entity.CompUserInfo;
import com.cspticw.service.CompUserService;

@Service
public class CompUserServiceImpl implements CompUserService {

	@Autowired
	private CompUserInfoMapper compUserInfoMapper;

	@Override
	public CompUserInfo selectByUserName(String userName) {
		return compUserInfoMapper.selectByUserName(userName);
	}

}
