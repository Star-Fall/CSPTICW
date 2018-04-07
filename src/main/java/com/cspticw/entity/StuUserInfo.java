package com.cspticw.entity;

/**
 * @ClassName: StuUserInfo
 * @author: StarFall
 * @date: 2018年4月7日 下午10:46:24
 * @Description:学生用户实体
 */
public class StuUserInfo extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 7464990901428131198L;

	private String userName;

	private String password;

	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}
}