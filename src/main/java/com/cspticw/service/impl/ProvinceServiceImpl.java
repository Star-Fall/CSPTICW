package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cspticw.dao.ProvinceMapper;
import com.cspticw.entity.ProvinceCityModel;
import com.cspticw.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceMapper provinceMapper;

	@Override
	public List<ProvinceCityModel> getProvinceCity() {
		return provinceMapper.getProvinceCity();
	}

}
