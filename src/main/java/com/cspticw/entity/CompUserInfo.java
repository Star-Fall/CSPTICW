package com.cspticw.entity;

/**
 * @ClassName: CompUserInfo
 * @author: StarFall
 * @date: 2018年4月7日 下午10:42:57
 * @Description:企业用户实体
 */
public class CompUserInfo extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 45268788287230116L;

	private String userName;

	private String password;

	private Integer isAvailable;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}
}