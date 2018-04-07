package com.cspticw.entity;

/**
 * @ClassName: ResumeJob
 * @author: StarFall
 * @date: 2018年4月7日 下午10:44:40
 * @Description:求职意向实体
 */
public class ResumeJob extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -5805965791935716108L;

	private Long resuId;

	private Long jobCateId;

	public Long getResuId() {
		return resuId;
	}

	public void setResuId(Long resuId) {
		this.resuId = resuId;
	}

	public Long getJobCateId() {
		return jobCateId;
	}

	public void setJobCateId(Long jobCateId) {
		this.jobCateId = jobCateId;
	}
}