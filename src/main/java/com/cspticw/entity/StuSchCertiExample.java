package com.cspticw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StuSchCertiExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public StuSchCertiExample() {
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

		protected void addCriterion(String condition, Object value1, Object value2,
				String property) {
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

		public Criteria andStuIdIsNull() {
			addCriterion("stu_id is null");
			return (Criteria) this;
		}

		public Criteria andStuIdIsNotNull() {
			addCriterion("stu_id is not null");
			return (Criteria) this;
		}

		public Criteria andStuIdEqualTo(Long value) {
			addCriterion("stu_id =", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotEqualTo(Long value) {
			addCriterion("stu_id <>", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdGreaterThan(Long value) {
			addCriterion("stu_id >", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
			addCriterion("stu_id >=", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdLessThan(Long value) {
			addCriterion("stu_id <", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdLessThanOrEqualTo(Long value) {
			addCriterion("stu_id <=", value, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdIn(List<Long> values) {
			addCriterion("stu_id in", values, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotIn(List<Long> values) {
			addCriterion("stu_id not in", values, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdBetween(Long value1, Long value2) {
			addCriterion("stu_id between", value1, value2, "stuId");
			return (Criteria) this;
		}

		public Criteria andStuIdNotBetween(Long value1, Long value2) {
			addCriterion("stu_id not between", value1, value2, "stuId");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNull() {
			addCriterion("school is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNotNull() {
			addCriterion("school is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolEqualTo(String value) {
			addCriterion("school =", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotEqualTo(String value) {
			addCriterion("school <>", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThan(String value) {
			addCriterion("school >", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThanOrEqualTo(String value) {
			addCriterion("school >=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThan(String value) {
			addCriterion("school <", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThanOrEqualTo(String value) {
			addCriterion("school <=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLike(String value) {
			addCriterion("school like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotLike(String value) {
			addCriterion("school not like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolIn(List<String> values) {
			addCriterion("school in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotIn(List<String> values) {
			addCriterion("school not in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolBetween(String value1, String value2) {
			addCriterion("school between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotBetween(String value1, String value2) {
			addCriterion("school not between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andMajorIsNull() {
			addCriterion("major is null");
			return (Criteria) this;
		}

		public Criteria andMajorIsNotNull() {
			addCriterion("major is not null");
			return (Criteria) this;
		}

		public Criteria andMajorEqualTo(String value) {
			addCriterion("major =", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorNotEqualTo(String value) {
			addCriterion("major <>", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorGreaterThan(String value) {
			addCriterion("major >", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorGreaterThanOrEqualTo(String value) {
			addCriterion("major >=", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorLessThan(String value) {
			addCriterion("major <", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorLessThanOrEqualTo(String value) {
			addCriterion("major <=", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorLike(String value) {
			addCriterion("major like", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorNotLike(String value) {
			addCriterion("major not like", value, "major");
			return (Criteria) this;
		}

		public Criteria andMajorIn(List<String> values) {
			addCriterion("major in", values, "major");
			return (Criteria) this;
		}

		public Criteria andMajorNotIn(List<String> values) {
			addCriterion("major not in", values, "major");
			return (Criteria) this;
		}

		public Criteria andMajorBetween(String value1, String value2) {
			addCriterion("major between", value1, value2, "major");
			return (Criteria) this;
		}

		public Criteria andMajorNotBetween(String value1, String value2) {
			addCriterion("major not between", value1, value2, "major");
			return (Criteria) this;
		}

		public Criteria andEducationIsNull() {
			addCriterion("education is null");
			return (Criteria) this;
		}

		public Criteria andEducationIsNotNull() {
			addCriterion("education is not null");
			return (Criteria) this;
		}

		public Criteria andEducationEqualTo(String value) {
			addCriterion("education =", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotEqualTo(String value) {
			addCriterion("education <>", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationGreaterThan(String value) {
			addCriterion("education >", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationGreaterThanOrEqualTo(String value) {
			addCriterion("education >=", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLessThan(String value) {
			addCriterion("education <", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLessThanOrEqualTo(String value) {
			addCriterion("education <=", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLike(String value) {
			addCriterion("education like", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotLike(String value) {
			addCriterion("education not like", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationIn(List<String> values) {
			addCriterion("education in", values, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotIn(List<String> values) {
			addCriterion("education not in", values, "education");
			return (Criteria) this;
		}

		public Criteria andEducationBetween(String value1, String value2) {
			addCriterion("education between", value1, value2, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotBetween(String value1, String value2) {
			addCriterion("education not between", value1, value2, "education");
			return (Criteria) this;
		}

		public Criteria andStuCardPicIsNull() {
			addCriterion("stu_card_pic is null");
			return (Criteria) this;
		}

		public Criteria andStuCardPicIsNotNull() {
			addCriterion("stu_card_pic is not null");
			return (Criteria) this;
		}

		public Criteria andStuCardPicEqualTo(String value) {
			addCriterion("stu_card_pic =", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicNotEqualTo(String value) {
			addCriterion("stu_card_pic <>", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicGreaterThan(String value) {
			addCriterion("stu_card_pic >", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicGreaterThanOrEqualTo(String value) {
			addCriterion("stu_card_pic >=", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicLessThan(String value) {
			addCriterion("stu_card_pic <", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicLessThanOrEqualTo(String value) {
			addCriterion("stu_card_pic <=", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicLike(String value) {
			addCriterion("stu_card_pic like", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicNotLike(String value) {
			addCriterion("stu_card_pic not like", value, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicIn(List<String> values) {
			addCriterion("stu_card_pic in", values, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicNotIn(List<String> values) {
			addCriterion("stu_card_pic not in", values, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicBetween(String value1, String value2) {
			addCriterion("stu_card_pic between", value1, value2, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andStuCardPicNotBetween(String value1, String value2) {
			addCriterion("stu_card_pic not between", value1, value2, "stuCardPic");
			return (Criteria) this;
		}

		public Criteria andIsGraduateIsNull() {
			addCriterion("is_graduate is null");
			return (Criteria) this;
		}

		public Criteria andIsGraduateIsNotNull() {
			addCriterion("is_graduate is not null");
			return (Criteria) this;
		}

		public Criteria andIsGraduateEqualTo(Integer value) {
			addCriterion("is_graduate =", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateNotEqualTo(Integer value) {
			addCriterion("is_graduate <>", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateGreaterThan(Integer value) {
			addCriterion("is_graduate >", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_graduate >=", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateLessThan(Integer value) {
			addCriterion("is_graduate <", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateLessThanOrEqualTo(Integer value) {
			addCriterion("is_graduate <=", value, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateIn(List<Integer> values) {
			addCriterion("is_graduate in", values, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateNotIn(List<Integer> values) {
			addCriterion("is_graduate not in", values, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateBetween(Integer value1, Integer value2) {
			addCriterion("is_graduate between", value1, value2, "isGraduate");
			return (Criteria) this;
		}

		public Criteria andIsGraduateNotBetween(Integer value1, Integer value2) {
			addCriterion("is_graduate not between", value1, value2, "isGraduate");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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