package com.cspticw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintRecordExample() {
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

        public Criteria andResumeIdIsNull() {
            addCriterion("\"resume _id\" is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("\"resume _id\" is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Long value) {
            addCriterion("\"resume _id\" =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Long value) {
            addCriterion("\"resume _id\" <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Long value) {
            addCriterion("\"resume _id\" >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"resume _id\" >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Long value) {
            addCriterion("\"resume _id\" <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Long value) {
            addCriterion("\"resume _id\" <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Long> values) {
            addCriterion("\"resume _id\" in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Long> values) {
            addCriterion("\"resume _id\" not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Long value1, Long value2) {
            addCriterion("\"resume _id\" between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Long value1, Long value2) {
            addCriterion("\"resume _id\" not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdIsNull() {
            addCriterion("comp_job_id is null");
            return (Criteria) this;
        }

        public Criteria andCompJobIdIsNotNull() {
            addCriterion("comp_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompJobIdEqualTo(Long value) {
            addCriterion("comp_job_id =", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdNotEqualTo(Long value) {
            addCriterion("comp_job_id <>", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdGreaterThan(Long value) {
            addCriterion("comp_job_id >", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comp_job_id >=", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdLessThan(Long value) {
            addCriterion("comp_job_id <", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdLessThanOrEqualTo(Long value) {
            addCriterion("comp_job_id <=", value, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdIn(List<Long> values) {
            addCriterion("comp_job_id in", values, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdNotIn(List<Long> values) {
            addCriterion("comp_job_id not in", values, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdBetween(Long value1, Long value2) {
            addCriterion("comp_job_id between", value1, value2, "compJobId");
            return (Criteria) this;
        }

        public Criteria andCompJobIdNotBetween(Long value1, Long value2) {
            addCriterion("comp_job_id not between", value1, value2, "compJobId");
            return (Criteria) this;
        }

        public Criteria andComplaintModeIsNull() {
            addCriterion("\"complaint _mode\" is null");
            return (Criteria) this;
        }

        public Criteria andComplaintModeIsNotNull() {
            addCriterion("\"complaint _mode\" is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintModeEqualTo(Integer value) {
            addCriterion("\"complaint _mode\" =", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeNotEqualTo(Integer value) {
            addCriterion("\"complaint _mode\" <>", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeGreaterThan(Integer value) {
            addCriterion("\"complaint _mode\" >", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"complaint _mode\" >=", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeLessThan(Integer value) {
            addCriterion("\"complaint _mode\" <", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeLessThanOrEqualTo(Integer value) {
            addCriterion("\"complaint _mode\" <=", value, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeIn(List<Integer> values) {
            addCriterion("\"complaint _mode\" in", values, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeNotIn(List<Integer> values) {
            addCriterion("\"complaint _mode\" not in", values, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeBetween(Integer value1, Integer value2) {
            addCriterion("\"complaint _mode\" between", value1, value2, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintModeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"complaint _mode\" not between", value1, value2, "complaintMode");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleIsNull() {
            addCriterion("complaint_title is null");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleIsNotNull() {
            addCriterion("complaint_title is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleEqualTo(String value) {
            addCriterion("complaint_title =", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleNotEqualTo(String value) {
            addCriterion("complaint_title <>", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleGreaterThan(String value) {
            addCriterion("complaint_title >", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_title >=", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleLessThan(String value) {
            addCriterion("complaint_title <", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleLessThanOrEqualTo(String value) {
            addCriterion("complaint_title <=", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleLike(String value) {
            addCriterion("complaint_title like", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleNotLike(String value) {
            addCriterion("complaint_title not like", value, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleIn(List<String> values) {
            addCriterion("complaint_title in", values, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleNotIn(List<String> values) {
            addCriterion("complaint_title not in", values, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleBetween(String value1, String value2) {
            addCriterion("complaint_title between", value1, value2, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintTitleNotBetween(String value1, String value2) {
            addCriterion("complaint_title not between", value1, value2, "complaintTitle");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNull() {
            addCriterion("complaint_content is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNotNull() {
            addCriterion("complaint_content is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentEqualTo(String value) {
            addCriterion("complaint_content =", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotEqualTo(String value) {
            addCriterion("complaint_content <>", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThan(String value) {
            addCriterion("complaint_content >", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content >=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThan(String value) {
            addCriterion("complaint_content <", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThanOrEqualTo(String value) {
            addCriterion("complaint_content <=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLike(String value) {
            addCriterion("complaint_content like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotLike(String value) {
            addCriterion("complaint_content not like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIn(List<String> values) {
            addCriterion("complaint_content in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotIn(List<String> values) {
            addCriterion("complaint_content not in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentBetween(String value1, String value2) {
            addCriterion("complaint_content between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotBetween(String value1, String value2) {
            addCriterion("complaint_content not between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNull() {
            addCriterion("handle_result is null");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNotNull() {
            addCriterion("handle_result is not null");
            return (Criteria) this;
        }

        public Criteria andHandleResultEqualTo(String value) {
            addCriterion("handle_result =", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualTo(String value) {
            addCriterion("handle_result <>", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThan(String value) {
            addCriterion("handle_result >", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualTo(String value) {
            addCriterion("handle_result >=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThan(String value) {
            addCriterion("handle_result <", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualTo(String value) {
            addCriterion("handle_result <=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLike(String value) {
            addCriterion("handle_result like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotLike(String value) {
            addCriterion("handle_result not like", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultIn(List<String> values) {
            addCriterion("handle_result in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotIn(List<String> values) {
            addCriterion("handle_result not in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultBetween(String value1, String value2) {
            addCriterion("handle_result between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotBetween(String value1, String value2) {
            addCriterion("handle_result not between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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