package com.cspticw.entity;

import java.math.BigDecimal;

public class CompJobInfo extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -5007724312963008801L;

	private Long compId;

	private String jobCate;

	private String jobPlace;

	private BigDecimal jobTreat;

	private String treatMethod;

	private String payMethod;

	private String jobTitle;

	private String jobContent;

	private String jobRequire;

	private String personNum;

	private String contactName;

	private String contactPhone;

	private Integer isAvailable;

	private Integer resuHot;

	public Long getCompId() {
		return compId;
	}

	public void setCompId(Long compId) {
		this.compId = compId;
	}

	public String getJobCate() {
		return jobCate;
	}

	public void setJobCate(String jobCate) {
		this.jobCate = jobCate == null ? null : jobCate.trim();
	}

	public String getJobPlace() {
		return jobPlace;
	}

	public void setJobPlace(String jobPlace) {
		this.jobPlace = jobPlace == null ? null : jobPlace.trim();
	}

	public BigDecimal getJobTreat() {
		return jobTreat;
	}

	public void setJobTreat(BigDecimal jobTreat) {
		this.jobTreat = jobTreat;
	}

	public String getTreatMethod() {
		return treatMethod;
	}

	public void setTreatMethod(String treatMethod) {
		this.treatMethod = treatMethod == null ? null : treatMethod.trim();
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod == null ? null : payMethod.trim();
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle == null ? null : jobTitle.trim();
	}

	public String getJobContent() {
		return jobContent;
	}

	public void setJobContent(String jobContent) {
		this.jobContent = jobContent == null ? null : jobContent.trim();
	}

	public String getJobRequire() {
		return jobRequire;
	}

	public void setJobRequire(String jobRequire) {
		this.jobRequire = jobRequire == null ? null : jobRequire.trim();
	}

	public String getPersonNum() {
		return personNum;
	}

	public void setPersonNum(String personNum) {
		this.personNum = personNum == null ? null : personNum.trim();
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName == null ? null : contactName.trim();
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone == null ? null : contactPhone.trim();
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Integer getResuHot() {
		return resuHot;
	}

	public void setResuHot(Integer resuHot) {
		this.resuHot = resuHot;
	}

	@Override
	public String toString() {
		return "CompJobInfo [compId=" + compId + ", jobCate=" + jobCate + ", jobPlace=" + jobPlace
				+ ", jobTreat=" + jobTreat + ", treatMethod=" + treatMethod + ", payMethod="
				+ payMethod + ", jobTitle=" + jobTitle + ", jobContent=" + jobContent
				+ ", jobRequire=" + jobRequire + ", personNum=" + personNum + ", contactName="
				+ contactName + ", contactPhone=" + contactPhone + ", isAvailable=" + isAvailable
				+ ", resuHot=" + resuHot + "]";
	}

}