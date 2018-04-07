package com.cspticw.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompJobInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompJobInfoExample() {
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

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobCateIdIsNull() {
            addCriterion("job_cate_id is null");
            return (Criteria) this;
        }

        public Criteria andJobCateIdIsNotNull() {
            addCriterion("job_cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobCateIdEqualTo(Long value) {
            addCriterion("job_cate_id =", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdNotEqualTo(Long value) {
            addCriterion("job_cate_id <>", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdGreaterThan(Long value) {
            addCriterion("job_cate_id >", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_cate_id >=", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdLessThan(Long value) {
            addCriterion("job_cate_id <", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdLessThanOrEqualTo(Long value) {
            addCriterion("job_cate_id <=", value, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdIn(List<Long> values) {
            addCriterion("job_cate_id in", values, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdNotIn(List<Long> values) {
            addCriterion("job_cate_id not in", values, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdBetween(Long value1, Long value2) {
            addCriterion("job_cate_id between", value1, value2, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobCateIdNotBetween(Long value1, Long value2) {
            addCriterion("job_cate_id not between", value1, value2, "jobCateId");
            return (Criteria) this;
        }

        public Criteria andJobPlaceIsNull() {
            addCriterion("job_place is null");
            return (Criteria) this;
        }

        public Criteria andJobPlaceIsNotNull() {
            addCriterion("job_place is not null");
            return (Criteria) this;
        }

        public Criteria andJobPlaceEqualTo(String value) {
            addCriterion("job_place =", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceNotEqualTo(String value) {
            addCriterion("job_place <>", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceGreaterThan(String value) {
            addCriterion("job_place >", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("job_place >=", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceLessThan(String value) {
            addCriterion("job_place <", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceLessThanOrEqualTo(String value) {
            addCriterion("job_place <=", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceLike(String value) {
            addCriterion("job_place like", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceNotLike(String value) {
            addCriterion("job_place not like", value, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceIn(List<String> values) {
            addCriterion("job_place in", values, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceNotIn(List<String> values) {
            addCriterion("job_place not in", values, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceBetween(String value1, String value2) {
            addCriterion("job_place between", value1, value2, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobPlaceNotBetween(String value1, String value2) {
            addCriterion("job_place not between", value1, value2, "jobPlace");
            return (Criteria) this;
        }

        public Criteria andJobTreatIsNull() {
            addCriterion("job_treat is null");
            return (Criteria) this;
        }

        public Criteria andJobTreatIsNotNull() {
            addCriterion("job_treat is not null");
            return (Criteria) this;
        }

        public Criteria andJobTreatEqualTo(BigDecimal value) {
            addCriterion("job_treat =", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatNotEqualTo(BigDecimal value) {
            addCriterion("job_treat <>", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatGreaterThan(BigDecimal value) {
            addCriterion("job_treat >", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("job_treat >=", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatLessThan(BigDecimal value) {
            addCriterion("job_treat <", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("job_treat <=", value, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatIn(List<BigDecimal> values) {
            addCriterion("job_treat in", values, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatNotIn(List<BigDecimal> values) {
            addCriterion("job_treat not in", values, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("job_treat between", value1, value2, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andJobTreatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("job_treat not between", value1, value2, "jobTreat");
            return (Criteria) this;
        }

        public Criteria andTreatMethodIsNull() {
            addCriterion("treat_method is null");
            return (Criteria) this;
        }

        public Criteria andTreatMethodIsNotNull() {
            addCriterion("treat_method is not null");
            return (Criteria) this;
        }

        public Criteria andTreatMethodEqualTo(String value) {
            addCriterion("treat_method =", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodNotEqualTo(String value) {
            addCriterion("treat_method <>", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodGreaterThan(String value) {
            addCriterion("treat_method >", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodGreaterThanOrEqualTo(String value) {
            addCriterion("treat_method >=", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodLessThan(String value) {
            addCriterion("treat_method <", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodLessThanOrEqualTo(String value) {
            addCriterion("treat_method <=", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodLike(String value) {
            addCriterion("treat_method like", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodNotLike(String value) {
            addCriterion("treat_method not like", value, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodIn(List<String> values) {
            addCriterion("treat_method in", values, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodNotIn(List<String> values) {
            addCriterion("treat_method not in", values, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodBetween(String value1, String value2) {
            addCriterion("treat_method between", value1, value2, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andTreatMethodNotBetween(String value1, String value2) {
            addCriterion("treat_method not between", value1, value2, "treatMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andJobRequireIsNull() {
            addCriterion("job_require is null");
            return (Criteria) this;
        }

        public Criteria andJobRequireIsNotNull() {
            addCriterion("job_require is not null");
            return (Criteria) this;
        }

        public Criteria andJobRequireEqualTo(String value) {
            addCriterion("job_require =", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireNotEqualTo(String value) {
            addCriterion("job_require <>", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireGreaterThan(String value) {
            addCriterion("job_require >", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireGreaterThanOrEqualTo(String value) {
            addCriterion("job_require >=", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireLessThan(String value) {
            addCriterion("job_require <", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireLessThanOrEqualTo(String value) {
            addCriterion("job_require <=", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireLike(String value) {
            addCriterion("job_require like", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireNotLike(String value) {
            addCriterion("job_require not like", value, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireIn(List<String> values) {
            addCriterion("job_require in", values, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireNotIn(List<String> values) {
            addCriterion("job_require not in", values, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireBetween(String value1, String value2) {
            addCriterion("job_require between", value1, value2, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobRequireNotBetween(String value1, String value2) {
            addCriterion("job_require not between", value1, value2, "jobRequire");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNull() {
            addCriterion("job_content is null");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNotNull() {
            addCriterion("job_content is not null");
            return (Criteria) this;
        }

        public Criteria andJobContentEqualTo(String value) {
            addCriterion("job_content =", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotEqualTo(String value) {
            addCriterion("job_content <>", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThan(String value) {
            addCriterion("job_content >", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThanOrEqualTo(String value) {
            addCriterion("job_content >=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThan(String value) {
            addCriterion("job_content <", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThanOrEqualTo(String value) {
            addCriterion("job_content <=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLike(String value) {
            addCriterion("job_content like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotLike(String value) {
            addCriterion("job_content not like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentIn(List<String> values) {
            addCriterion("job_content in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotIn(List<String> values) {
            addCriterion("job_content not in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentBetween(String value1, String value2) {
            addCriterion("job_content between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotBetween(String value1, String value2) {
            addCriterion("job_content not between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobTimeIsNull() {
            addCriterion("job_time is null");
            return (Criteria) this;
        }

        public Criteria andJobTimeIsNotNull() {
            addCriterion("job_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobTimeEqualTo(String value) {
            addCriterion("job_time =", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeNotEqualTo(String value) {
            addCriterion("job_time <>", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeGreaterThan(String value) {
            addCriterion("job_time >", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_time >=", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeLessThan(String value) {
            addCriterion("job_time <", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeLessThanOrEqualTo(String value) {
            addCriterion("job_time <=", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeLike(String value) {
            addCriterion("job_time like", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeNotLike(String value) {
            addCriterion("job_time not like", value, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeIn(List<String> values) {
            addCriterion("job_time in", values, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeNotIn(List<String> values) {
            addCriterion("job_time not in", values, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeBetween(String value1, String value2) {
            addCriterion("job_time between", value1, value2, "jobTime");
            return (Criteria) this;
        }

        public Criteria andJobTimeNotBetween(String value1, String value2) {
            addCriterion("job_time not between", value1, value2, "jobTime");
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

        public Criteria andPersonNumIsNull() {
            addCriterion("person_num is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNotNull() {
            addCriterion("person_num is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumEqualTo(String value) {
            addCriterion("person_num =", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotEqualTo(String value) {
            addCriterion("person_num <>", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThan(String value) {
            addCriterion("person_num >", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThanOrEqualTo(String value) {
            addCriterion("person_num >=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThan(String value) {
            addCriterion("person_num <", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThanOrEqualTo(String value) {
            addCriterion("person_num <=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLike(String value) {
            addCriterion("person_num like", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotLike(String value) {
            addCriterion("person_num not like", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumIn(List<String> values) {
            addCriterion("person_num in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotIn(List<String> values) {
            addCriterion("person_num not in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumBetween(String value1, String value2) {
            addCriterion("person_num between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotBetween(String value1, String value2) {
            addCriterion("person_num not between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNull() {
            addCriterion("is_available is null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIsNotNull() {
            addCriterion("is_available is not null");
            return (Criteria) this;
        }

        public Criteria andIsAvailableEqualTo(Integer value) {
            addCriterion("is_available =", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotEqualTo(Integer value) {
            addCriterion("is_available <>", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThan(Integer value) {
            addCriterion("is_available >", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_available >=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThan(Integer value) {
            addCriterion("is_available <", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("is_available <=", value, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableIn(List<Integer> values) {
            addCriterion("is_available in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotIn(List<Integer> values) {
            addCriterion("is_available not in", values, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableBetween(Integer value1, Integer value2) {
            addCriterion("is_available between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andIsAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_available not between", value1, value2, "isAvailable");
            return (Criteria) this;
        }

        public Criteria andResuHotIsNull() {
            addCriterion("resu_hot is null");
            return (Criteria) this;
        }

        public Criteria andResuHotIsNotNull() {
            addCriterion("resu_hot is not null");
            return (Criteria) this;
        }

        public Criteria andResuHotEqualTo(Integer value) {
            addCriterion("resu_hot =", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotNotEqualTo(Integer value) {
            addCriterion("resu_hot <>", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotGreaterThan(Integer value) {
            addCriterion("resu_hot >", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("resu_hot >=", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotLessThan(Integer value) {
            addCriterion("resu_hot <", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotLessThanOrEqualTo(Integer value) {
            addCriterion("resu_hot <=", value, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotIn(List<Integer> values) {
            addCriterion("resu_hot in", values, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotNotIn(List<Integer> values) {
            addCriterion("resu_hot not in", values, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotBetween(Integer value1, Integer value2) {
            addCriterion("resu_hot between", value1, value2, "resuHot");
            return (Criteria) this;
        }

        public Criteria andResuHotNotBetween(Integer value1, Integer value2) {
            addCriterion("resu_hot not between", value1, value2, "resuHot");
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