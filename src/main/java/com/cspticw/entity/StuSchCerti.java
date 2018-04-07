package com.cspticw.entity;

import java.util.Date;

public class StuSchCerti extends BaseEntity {
    private Date createTime;

    private Date modifyTime;

    private Long stuId;

    private String school;

    private String major;

    private String education;

    private String stuCardPic;

    private Integer isGraduate;

    private Integer isCertified;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getStuCardPic() {
        return stuCardPic;
    }

    public void setStuCardPic(String stuCardPic) {
        this.stuCardPic = stuCardPic == null ? null : stuCardPic.trim();
    }

    public Integer getIsGraduate() {
        return isGraduate;
    }

    public void setIsGraduate(Integer isGraduate) {
        this.isGraduate = isGraduate;
    }

    public Integer getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(Integer isCertified) {
        this.isCertified = isCertified;
    }
}