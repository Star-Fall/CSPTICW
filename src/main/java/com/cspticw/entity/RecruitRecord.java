package com.cspticw.entity;

public class RecruitRecord extends BaseEntity {
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