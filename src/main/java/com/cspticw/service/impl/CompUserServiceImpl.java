package com.cspticw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.CompUserInfoMapper;
import com.cspticw.entity.CompUserInfo;
import com.cspticw.service.CompUserService;
import com.cspticw.util.MD5Util;

@Service
public class CompUserServiceImpl implements CompUserService {

	@Autowired
	private CompUserInfoMapper compUserInfoMapper;

	@Override
	public CompUserInfo selectByUserName(String userName) {
		return compUserInfoMapper.selectByUserName(userName);
	}

	@Transactional
	@Override
	public boolean addUser(CompUserInfo company) {
		company.preInsert();
		company.setPassword(MD5Util.md5(company.getPassword(), company.getUserName()));
		company.setIsAvailable(0);
		return compUserInfoMapper.insert(company) == 1;
	}

}
