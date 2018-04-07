package com.cspticw.entity;

/**
 * @ClassName: City
 * @author: StarFall
 * @date: 2018年4月7日 下午10:39:50
 * @Description:城市实体类
 */
public class City extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 8723232819814866975L;

	private String cityId;

	private String city;

	private String provinceId;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId == null ? null : cityId.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId == null ? null : provinceId.trim();
	}
}