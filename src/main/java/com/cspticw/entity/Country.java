package com.cspticw.entity;

/**
 * @ClassName: Country
 * @author: StarFall
 * @date: 2018年4月7日 下午10:43:19
 * @Description:县级实体
 */
public class Country extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -1348028814562055232L;

	private String countryId;

	private String country;

	private String cityId;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId == null ? null : countryId.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId == null ? null : cityId.trim();
	}
}