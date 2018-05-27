package com.cspticw.entity;

import java.math.BigDecimal;
import java.util.List;

public class JobListParams extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 8670110608860781736L;

	private List<String> jobCateList;
	private String province;
	private String city;
	private List<String> jobPlaceList;
	private BigDecimal start;
	private BigDecimal end;
	private List<String> treatMethodList;
	private List<String> payMethodList;

	public List<String> getJobCateList() {
		return jobCateList;
	}

	public void setJobCateList(List<String> jobCateList) {
		this.jobCateList = jobCateList;
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

	public List<String> getJobPlaceList() {
		return jobPlaceList;
	}

	public void setJobPlaceList(List<String> jobPlaceList) {
		this.jobPlaceList = jobPlaceList;
	}

	public BigDecimal getStart() {
		return start;
	}

	public void setStart(BigDecimal start) {
		this.start = start;
	}

	public BigDecimal getEnd() {
		return end;
	}

	public void setEnd(BigDecimal end) {
		this.end = end;
	}

	public List<String> getTreatMethodList() {
		return treatMethodList;
	}

	public void setTreatMethodList(List<String> treatMethodList) {
		this.treatMethodList = treatMethodList;
	}

	public List<String> getPayMethodList() {
		return payMethodList;
	}

	public void setPayMethodList(List<String> payMethodList) {
		this.payMethodList = payMethodList;
	}

	@Override
	public String toString() {
		return "JobListParams [jobCateList=" + jobCateList + ", city=" + city + ", jobPlaceList="
				+ jobPlaceList + ", start=" + start + ", end=" + end + ", treatMethodList="
				+ treatMethodList + ", payMethodList=" + payMethodList + "]";
	}

}
