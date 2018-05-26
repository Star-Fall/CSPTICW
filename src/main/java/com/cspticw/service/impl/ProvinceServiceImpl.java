package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
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

	@Override
	public List<JSONObject> getCountryByCity(String province, String city) {

		return provinceMapper.getCountryByCity(province, city);
	}

}
