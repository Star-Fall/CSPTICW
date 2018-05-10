package com.cspticw.entity;

import java.util.Date;

public class CompInfoCerti extends BaseEntity {
    private Long compId;

    private String compName;

    private String compHome;

    private Date compEstablishTime;

    private String compSize;

    private String compNature;

    private String compIndustry;

    private String province;

    private String city;

    private String detailAddress;

    private String compIntroduction;

    private String businessLicense;

    private String contactName;

    private String contactPhone;

    private String contactEmail;

    private Integer isCertified;

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    public String getCompHome() {
        return compHome;
    }

    public void setCompHome(String compHome) {
        this.compHome = compHome == null ? null : compHome.trim();
    }

    public Date getCompEstablishTime() {
        return compEstablishTime;
    }

    public void setCompEstablishTime(Date compEstablishTime) {
        this.compEstablishTime = compEstablishTime;
    }

    public String getCompSize() {
        return compSize;
    }

    public void setCompSize(String compSize) {
        this.compSize = compSize == null ? null : compSize.trim();
    }

    public String getCompNature() {
        return compNature;
    }

    public void setCompNature(String compNature) {
        this.compNature = compNature == null ? null : compNature.trim();
    }

    public String getCompIndustry() {
        return compIndustry;
    }

    public void setCompIndustry(String compIndustry) {
        this.compIndustry = compIndustry == null ? null : compIndustry.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public String getCompIntroduction() {
        return compIntroduction;
    }

    public void setCompIntroduction(String compIntroduction) {
        this.compIntroduction = compIntroduction == null ? null : compIntroduction.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public Integer getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(Integer isCertified) {
        this.isCertified = isCertified;
    }
}