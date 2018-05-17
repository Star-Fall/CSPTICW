package com.cspticw.entity;

public class ApplyRecord extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -8254857540156879643L;

	private Long resumeId;

	private Long compJobId;

	private Integer isCheck;

	private Integer status;

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