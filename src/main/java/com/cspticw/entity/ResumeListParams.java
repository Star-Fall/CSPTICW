package com.cspticw.entity;

import java.util.List;

public class ResumeListParams extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -8097575595865041132L;

	private List<String> resumeJobList;
	private List<String> educationList;
	private String gender;
	private String province;
	private String city;

	public List<String> getResumeJobList() {
		return resumeJobList;
	}

	public void setResumeJobList(List<String> resumeJobList) {
		this.resumeJobList = resumeJobList;
	}

	public List<String> getEducationList() {
		return educationList;
	}

	public void setEducationList(List<String> educationList) {
		this.educationList = educationList;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
