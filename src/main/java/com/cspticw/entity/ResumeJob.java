package com.cspticw.entity;

import java.util.Date;

public class ResumeJob extends BaseEntity {
    private Date createTime;

    private Date modifyTime;

    private Long resuId;

    private Long jobCateId;

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