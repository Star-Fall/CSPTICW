package com.cspticw.entity;

import java.util.Date;

public class ComplaintRecord extends BaseEntity {
    private Date createTime;

    private Date modifyTime;

    private Long resumeId;

    private Long compJobId;

    private Integer complaintMode;

    private String complaintTitle;

    private String complaintContent;

    private String handleResult;

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