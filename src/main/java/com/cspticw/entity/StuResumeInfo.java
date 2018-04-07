package com.cspticw.entity;

/**
 * @ClassName: StuResumeInfo
 * @author: StarFall
 * @date: 2018年4月7日 下午10:45:38
 * @Description:学生简历信息实体
 */
public class StuResumeInfo extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -1936898041190217698L;

	private Long stuId;

	private String resuName;

	private String realName;

	private String idPhoto;

	private String gender;

	private Integer age;

	private String province;

	private String city;

	private String jobPosition;

	private String selfDescription;

	private String qq;

	private String wechat;

	private String annexResume;

	private Integer status;

	private Integer resuHot;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getResuName() {
		return resuName;
	}

	public void setResuName(String resuName) {
		this.resuName = resuName == null ? null : resuName.trim();
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(String idPhoto) {
		this.idPhoto = idPhoto == null ? null : idPhoto.trim();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition == null ? null : jobPosition.trim();
	}

	public String getSelfDescription() {
		return selfDescription;
	}

	public void setSelfDescription(String selfDescription) {
		this.selfDescription = selfDescription == null ? null : selfDescription.trim();
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat == null ? null : wechat.trim();
	}

	public String getAnnexResume() {
		return annexResume;
	}

	public void setAnnexResume(String annexResume) {
		this.annexResume = annexResume == null ? null : annexResume.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getResuHot() {
		return resuHot;
	}

	public void setResuHot(Integer resuHot) {
		this.resuHot = resuHot;
	}
}