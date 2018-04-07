package com.cspticw.entity;

/**
 * @ClassName: Province
 * @author: StarFall
 * @date: 2018年4月7日 下午10:43:58
 * @Description:省级实体
 */
public class Province extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 2532500747643189612L;

	private String provinceId;

	private String province;

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