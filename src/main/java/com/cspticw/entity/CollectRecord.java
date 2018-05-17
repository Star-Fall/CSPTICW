package com.cspticw.entity;

public class CollectRecord extends BaseEntity {
    private Long stuId;

    private Long jobId;

    private Long compId;

    private Long resumeId;

    private Integer collectUser;

    private Integer isDelete;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    public Long getResumeId() {
        return resumeId;
    }

    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getCollectUser() {
        return collectUser;
    }

    public void setCollectUser(Integer collectUser) {
        this.collectUser = collectUser;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}