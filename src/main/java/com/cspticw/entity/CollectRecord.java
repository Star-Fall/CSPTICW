package com.cspticw.entity;

import java.util.Date;

public class CollectRecord extends BaseEntity {
    private Date createTime;

    private Date modifyTime;

    private Long stuId;

    private Long compId;

    private Integer collectUser;

    private Integer isDelete;

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

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
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