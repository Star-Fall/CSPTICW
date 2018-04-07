package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cspticw.dao.CityMapper;
import com.cspticw.entity.City;
import com.cspticw.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;

	@Override
	public List<City> findAllCities() {

		return cityMapper.selectByExample(null);
	}
}
