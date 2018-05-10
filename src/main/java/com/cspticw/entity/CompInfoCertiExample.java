package com.cspticw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompInfoCertiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompInfoCertiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("comp_id is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("comp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(Long value) {
            addCriterion("comp_id =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(Long value) {
            addCriterion("comp_id <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(Long value) {
            addCriterion("comp_id >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comp_id >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(Long value) {
            addCriterion("comp_id <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(Long value) {
            addCriterion("comp_id <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<Long> values) {
            addCriterion("comp_id in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<Long> values) {
            addCriterion("comp_id not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(Long value1, Long value2) {
            addCriterion("comp_id between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(Long value1, Long value2) {
            addCriterion("comp_id not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNull() {
            addCriterion("comp_name is null");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNotNull() {
            addCriterion("comp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompNameEqualTo(String value) {
            addCriterion("comp_name =", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotEqualTo(String value) {
            addCriterion("comp_name <>", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThan(String value) {
            addCriterion("comp_name >", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThanOrEqualTo(String value) {
            addCriterion("comp_name >=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThan(String value) {
            addCriterion("comp_name <", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThanOrEqualTo(String value) {
            addCriterion("comp_name <=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLike(String value) {
            addCriterion("comp_name like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotLike(String value) {
            addCriterion("comp_name not like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameIn(List<String> values) {
            addCriterion("comp_name in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotIn(List<String> values) {
            addCriterion("comp_name not in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameBetween(String value1, String value2) {
            addCriterion("comp_name between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotBetween(String value1, String value2) {
            addCriterion("comp_name not between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompHomeIsNull() {
            addCriterion("comp_home is null");
            return (Criteria) this;
        }

        public Criteria andCompHomeIsNotNull() {
            addCriterion("comp_home is not null");
            return (Criteria) this;
        }

        public Criteria andCompHomeEqualTo(String value) {
            addCriterion("comp_home =", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeNotEqualTo(String value) {
            addCriterion("comp_home <>", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeGreaterThan(String value) {
            addCriterion("comp_home >", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_home >=", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeLessThan(String value) {
            addCriterion("comp_home <", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeLessThanOrEqualTo(String value) {
            addCriterion("comp_home <=", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeLike(String value) {
            addCriterion("comp_home like", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeNotLike(String value) {
            addCriterion("comp_home not like", value, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeIn(List<String> values) {
            addCriterion("comp_home in", values, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeNotIn(List<String> values) {
            addCriterion("comp_home not in", values, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeBetween(String value1, String value2) {
            addCriterion("comp_home between", value1, value2, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompHomeNotBetween(String value1, String value2) {
            addCriterion("comp_home not between", value1, value2, "compHome");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeIsNull() {
            addCriterion("comp_establish_time is null");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeIsNotNull() {
            addCriterion("comp_establish_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeEqualTo(Date value) {
            addCriterion("comp_establish_time =", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeNotEqualTo(Date value) {
            addCriterion("comp_establish_time <>", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeGreaterThan(Date value) {
            addCriterion("comp_establish_time >", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comp_establish_time >=", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeLessThan(Date value) {
            addCriterion("comp_establish_time <", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeLessThanOrEqualTo(Date value) {
            addCriterion("comp_establish_time <=", value, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeIn(List<Date> values) {
            addCriterion("comp_establish_time in", values, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeNotIn(List<Date> values) {
            addCriterion("comp_establish_time not in", values, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeBetween(Date value1, Date value2) {
            addCriterion("comp_establish_time between", value1, value2, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompEstablishTimeNotBetween(Date value1, Date value2) {
            addCriterion("comp_establish_time not between", value1, value2, "compEstablishTime");
            return (Criteria) this;
        }

        public Criteria andCompSizeIsNull() {
            addCriterion("comp_size is null");
            return (Criteria) this;
        }

        public Criteria andCompSizeIsNotNull() {
            addCriterion("comp_size is not null");
            return (Criteria) this;
        }

        public Criteria andCompSizeEqualTo(String value) {
            addCriterion("comp_size =", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeNotEqualTo(String value) {
            addCriterion("comp_size <>", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeGreaterThan(String value) {
            addCriterion("comp_size >", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_size >=", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeLessThan(String value) {
            addCriterion("comp_size <", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeLessThanOrEqualTo(String value) {
            addCriterion("comp_size <=", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeLike(String value) {
            addCriterion("comp_size like", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeNotLike(String value) {
            addCriterion("comp_size not like", value, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeIn(List<String> values) {
            addCriterion("comp_size in", values, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeNotIn(List<String> values) {
            addCriterion("comp_size not in", values, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeBetween(String value1, String value2) {
            addCriterion("comp_size between", value1, value2, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompSizeNotBetween(String value1, String value2) {
            addCriterion("comp_size not between", value1, value2, "compSize");
            return (Criteria) this;
        }

        public Criteria andCompNatureIsNull() {
            addCriterion("comp_nature is null");
            return (Criteria) this;
        }

        public Criteria andCompNatureIsNotNull() {
            addCriterion("comp_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCompNatureEqualTo(String value) {
            addCriterion("comp_nature =", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureNotEqualTo(String value) {
            addCriterion("comp_nature <>", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureGreaterThan(String value) {
            addCriterion("comp_nature >", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureGreaterThanOrEqualTo(String value) {
            addCriterion("comp_nature >=", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureLessThan(String value) {
            addCriterion("comp_nature <", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureLessThanOrEqualTo(String value) {
            addCriterion("comp_nature <=", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureLike(String value) {
            addCriterion("comp_nature like", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureNotLike(String value) {
            addCriterion("comp_nature not like", value, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureIn(List<String> values) {
            addCriterion("comp_nature in", values, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureNotIn(List<String> values) {
            addCriterion("comp_nature not in", values, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureBetween(String value1, String value2) {
            addCriterion("comp_nature between", value1, value2, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompNatureNotBetween(String value1, String value2) {
            addCriterion("comp_nature not between", value1, value2, "compNature");
            return (Criteria) this;
        }

        public Criteria andCompIndustryIsNull() {
            addCriterion("comp_industry is null");
            return (Criteria) this;
        }

        public Criteria andCompIndustryIsNotNull() {
            addCriterion("comp_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCompIndustryEqualTo(String value) {
            addCriterion("comp_industry =", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryNotEqualTo(String value) {
            addCriterion("comp_industry <>", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryGreaterThan(String value) {
            addCriterion("comp_industry >", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("comp_industry >=", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryLessThan(String value) {
            addCriterion("comp_industry <", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryLessThanOrEqualTo(String value) {
            addCriterion("comp_industry <=", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryLike(String value) {
            addCriterion("comp_industry like", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryNotLike(String value) {
            addCriterion("comp_industry not like", value, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryIn(List<String> values) {
            addCriterion("comp_industry in", values, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryNotIn(List<String> values) {
            addCriterion("comp_industry not in", values, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryBetween(String value1, String value2) {
            addCriterion("comp_industry between", value1, value2, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andCompIndustryNotBetween(String value1, String value2) {
            addCriterion("comp_industry not between", value1, value2, "compIndustry");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("detail_address =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("detail_address <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("detail_address like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("detail_address not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("detail_address in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionIsNull() {
            addCriterion("\"comp_ introduction\" is null");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionIsNotNull() {
            addCriterion("\"comp_ introduction\" is not null");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionEqualTo(String value) {
            addCriterion("\"comp_ introduction\" =", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionNotEqualTo(String value) {
            addCriterion("\"comp_ introduction\" <>", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionGreaterThan(String value) {
            addCriterion("\"comp_ introduction\" >", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("\"comp_ introduction\" >=", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionLessThan(String value) {
            addCriterion("\"comp_ introduction\" <", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionLessThanOrEqualTo(String value) {
            addCriterion("\"comp_ introduction\" <=", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionLike(String value) {
            addCriterion("\"comp_ introduction\" like", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionNotLike(String value) {
            addCriterion("\"comp_ introduction\" not like", value, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionIn(List<String> values) {
            addCriterion("\"comp_ introduction\" in", values, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionNotIn(List<String> values) {
            addCriterion("\"comp_ introduction\" not in", values, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionBetween(String value1, String value2) {
            addCriterion("\"comp_ introduction\" between", value1, value2, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompIntroductionNotBetween(String value1, String value2) {
            addCriterion("\"comp_ introduction\" not between", value1, value2, "compIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedIsNull() {
            addCriterion("is_certified is null");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedIsNotNull() {
            addCriterion("is_certified is not null");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedEqualTo(Integer value) {
            addCriterion("is_certified =", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedNotEqualTo(Integer value) {
            addCriterion("is_certified <>", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedGreaterThan(Integer value) {
            addCriterion("is_certified >", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_certified >=", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedLessThan(Integer value) {
            addCriterion("is_certified <", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedLessThanOrEqualTo(Integer value) {
            addCriterion("is_certified <=", value, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedIn(List<Integer> values) {
            addCriterion("is_certified in", values, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedNotIn(List<Integer> values) {
            addCriterion("is_certified not in", values, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedBetween(Integer value1, Integer value2) {
            addCriterion("is_certified between", value1, value2, "isCertified");
            return (Criteria) this;
        }

        public Criteria andIsCertifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_certified not between", value1, value2, "isCertified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}