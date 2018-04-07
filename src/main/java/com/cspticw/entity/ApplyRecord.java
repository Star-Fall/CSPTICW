package com.cspticw.entity;

import java.util.Date;

public class ApplyRecord extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 2884387605453228019L;

	private Date createTime;

	private Date modifyTime;

	private Long resumeId;

	private Long compJobId;

	private Integer isCheck;

	private Integer status;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getResumeId() {
		return resumeId;
	}

	public void setResumeId(Long resumeId) {
		this.resumeId = resumeId;
	}

	public Long getCompJobId() {
		return compJobId;
	}

	public void setCompJobId(Long compJobId) {
		this.compJobId = compJobId;
	}

	public Integer getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}