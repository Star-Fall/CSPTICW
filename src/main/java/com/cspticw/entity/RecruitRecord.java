package com.cspticw.entity;

/**
 * @ClassName: RecruitRecord
 * @author: StarFall
 * @date: 2018年4月7日 下午10:44:26
 * @Description:招聘记录实体
 */
public class RecruitRecord extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -3261785594767475593L;

	private Long resumeId;

	private Long compJobId;

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}