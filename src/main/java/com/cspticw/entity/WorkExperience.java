package com.cspticw.entity;

/**
 * @ClassName: WorkExperience
 * @author: StarFall
 * @date: 2018年4月30日 上午10:17:12
 * @Description:工作经验
 */
public class WorkExperience extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -1604922263753160751L;

	private Long resuId;

	private String workTitle;

	private String workContent;

	public Long getResuId() {
		return resuId;
	}

	public void setResuId(Long resuId) {
		this.resuId = resuId;
	}

	public String getWorkTitle() {
		return workTitle;
	}

	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle == null ? null : workTitle.trim();
	}

	public String getWorkContent() {
		return workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent == null ? null : workContent.trim();
	}
}