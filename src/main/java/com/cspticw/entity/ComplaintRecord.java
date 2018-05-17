package com.cspticw.entity;

public class ComplaintRecord extends BaseEntity {
    private Long resumeId;

    private Long compId;

    private Long jobId;

    private Long stuId;

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

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
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