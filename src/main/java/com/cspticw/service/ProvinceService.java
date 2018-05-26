package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.ProvinceCityModel;

public interface ProvinceService {

	public List<ProvinceCityModel> getProvinceCity();

	public List<JSONObject> getCountryByCity(String province, String city);
}
