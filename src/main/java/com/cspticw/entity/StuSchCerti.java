package com.cspticw.entity;

/**
 * @ClassName: StuSchCerti
 * @author: StarFall
 * @date: 2018年4月7日 下午10:46:01
 * @Description:学生学校认证实体
 */
public class StuSchCerti extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 8621894323629720879L;

	private Long stuId;

	private String school;

	private String major;

	private String education;

	private String stuCardPic;

	private Integer isGraduate;

	private Integer isCertified;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major == null ? null : major.trim();
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education == null ? null : education.trim();
	}

	public String getStuCardPic() {
		return stuCardPic;
	}

	public void setStuCardPic(String stuCardPic) {
		this.stuCardPic = stuCardPic == null ? null : stuCardPic.trim();
	}

	public Integer getIsGraduate() {
		return isGraduate;
	}

	public void setIsGraduate(Integer isGraduate) {
		this.isGraduate = isGraduate;
	}

	public Integer getIsCertified() {
		return isCertified;
	}

	public void setIsCertified(Integer isCertified) {
		this.isCertified = isCertified;
	}
}