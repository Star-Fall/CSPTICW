package com.cspticw.entity;

/**
 * @ClassName: ComplaintRecord
 * @author: StarFall
 * @date: 2018年4月7日 下午10:42:14
 * @Description:投诉记录实体
 */
public class ComplaintRecord extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -4569045833108295249L;

	private Long resumeId;

	private Long compJobId;

	private Integer complaintMode;

	private String complaintTitle;

	private String complaintContent;

	private String handleResult;

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

	public Integer getComplaintMode() {
		return complaintMode;
	}

	public void setComplaintMode(Integer complaintMode) {
		this.complaintMode = complaintMode;
	}

	public String getComplaintTitle() {
		return complaintTitle;
	}

	public void setComplaintTitle(String complaintTitle) {
		this.complaintTitle = complaintTitle == null ? null : complaintTitle.trim();
	}

	public String getComplaintContent() {
		return complaintContent;
	}

	public void setComplaintContent(String complaintContent) {
		this.complaintContent = complaintContent == null ? null : complaintContent.trim();
	}

	public String getHandleResult() {
		return handleResult;
	}

	public void setHandleResult(String handleResult) {
		this.handleResult = handleResult == null ? null : handleResult.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}