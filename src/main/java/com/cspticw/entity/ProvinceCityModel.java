package com.cspticw.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @ClassName: ProvinceCity
 * @author: StarFall
 * @date: 2018年5月5日 下午9:04:04
 * @Description:ProvinceCity
 */
@JsonInclude(Include.NON_NULL)
public class ProvinceCityModel extends BaseEntity {

	private static final long serialVersionUID = -4009808101985580109L;

	private String provinceId;

	private String province;

	private List<City> cityList;

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId == null ? null : provinceId.trim();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}
}
