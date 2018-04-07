package com.cspticw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectRecordExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CollectRecordExample() {
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

		public Criteria andCollectUserIsNull() {
			addCriterion("\"collect _user\" is null");
			return (Criteria) this;
		}

		public Criteria andCollectUserIsNotNull() {
			addCriterion("\"collect _user\" is not null");
			return (Criteria) this;
		}

		public Criteria andCollectUserEqualTo(Integer value) {
			addCriterion("\"collect _user\" =", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserNotEqualTo(Integer value) {
			addCriterion("\"collect _user\" <>", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserGreaterThan(Integer value) {
			addCriterion("\"collect _user\" >", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserGreaterThanOrEqualTo(Integer value) {
			addCriterion("\"collect _user\" >=", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserLessThan(Integer value) {
			addCriterion("\"collect _user\" <", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserLessThanOrEqualTo(Integer value) {
			addCriterion("\"collect _user\" <=", value, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserIn(List<Integer> values) {
			addCriterion("\"collect _user\" in", values, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserNotIn(List<Integer> values) {
			addCriterion("\"collect _user\" not in", values, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserBetween(Integer value1, Integer value2) {
			addCriterion("\"collect _user\" between", value1, value2, "collectUser");
			return (Criteria) this;
		}

		public Criteria andCollectUserNotBetween(Integer value1, Integer value2) {
			addCriterion("\"collect _user\" not between", value1, value2, "collectUser");
			return (Criteria) this;
		}

		public Criteria andIsDeleteIsNull() {
			addCriterion("is_delete is null");
			return (Criteria) this;
		}

		public Criteria andIsDeleteIsNotNull() {
			addCriterion("is_delete is not null");
			return (Criteria) this;
		}

		public Criteria andIsDeleteEqualTo(Integer value) {
			addCriterion("is_delete =", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotEqualTo(Integer value) {
			addCriterion("is_delete <>", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteGreaterThan(Integer value) {
			addCriterion("is_delete >", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_delete >=", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteLessThan(Integer value) {
			addCriterion("is_delete <", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
			addCriterion("is_delete <=", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteIn(List<Integer> values) {
			addCriterion("is_delete in", values, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotIn(List<Integer> values) {
			addCriterion("is_delete not in", values, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
			addCriterion("is_delete between", value1, value2, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
			addCriterion("is_delete not between", value1, value2, "isDelete");
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