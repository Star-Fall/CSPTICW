package com.cspticw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StuResumeInfoExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public StuResumeInfoExample() {
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

		public Criteria andResuNameIsNull() {
			addCriterion("resu_name is null");
			return (Criteria) this;
		}

		public Criteria andResuNameIsNotNull() {
			addCriterion("resu_name is not null");
			return (Criteria) this;
		}

		public Criteria andResuNameEqualTo(String value) {
			addCriterion("resu_name =", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameNotEqualTo(String value) {
			addCriterion("resu_name <>", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameGreaterThan(String value) {
			addCriterion("resu_name >", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameGreaterThanOrEqualTo(String value) {
			addCriterion("resu_name >=", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameLessThan(String value) {
			addCriterion("resu_name <", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameLessThanOrEqualTo(String value) {
			addCriterion("resu_name <=", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameLike(String value) {
			addCriterion("resu_name like", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameNotLike(String value) {
			addCriterion("resu_name not like", value, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameIn(List<String> values) {
			addCriterion("resu_name in", values, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameNotIn(List<String> values) {
			addCriterion("resu_name not in", values, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameBetween(String value1, String value2) {
			addCriterion("resu_name between", value1, value2, "resuName");
			return (Criteria) this;
		}

		public Criteria andResuNameNotBetween(String value1, String value2) {
			addCriterion("resu_name not between", value1, value2, "resuName");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andIdPhotoIsNull() {
			addCriterion("id_photo is null");
			return (Criteria) this;
		}

		public Criteria andIdPhotoIsNotNull() {
			addCriterion("id_photo is not null");
			return (Criteria) this;
		}

		public Criteria andIdPhotoEqualTo(String value) {
			addCriterion("id_photo =", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoNotEqualTo(String value) {
			addCriterion("id_photo <>", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoGreaterThan(String value) {
			addCriterion("id_photo >", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoGreaterThanOrEqualTo(String value) {
			addCriterion("id_photo >=", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoLessThan(String value) {
			addCriterion("id_photo <", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoLessThanOrEqualTo(String value) {
			addCriterion("id_photo <=", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoLike(String value) {
			addCriterion("id_photo like", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoNotLike(String value) {
			addCriterion("id_photo not like", value, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoIn(List<String> values) {
			addCriterion("id_photo in", values, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoNotIn(List<String> values) {
			addCriterion("id_photo not in", values, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoBetween(String value1, String value2) {
			addCriterion("id_photo between", value1, value2, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andIdPhotoNotBetween(String value1, String value2) {
			addCriterion("id_photo not between", value1, value2, "idPhoto");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andAgeIsNull() {
			addCriterion("age is null");
			return (Criteria) this;
		}

		public Criteria andAgeIsNotNull() {
			addCriterion("age is not null");
			return (Criteria) this;
		}

		public Criteria andAgeEqualTo(Integer value) {
			addCriterion("age =", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotEqualTo(Integer value) {
			addCriterion("age <>", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThan(Integer value) {
			addCriterion("age >", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
			addCriterion("age >=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThan(Integer value) {
			addCriterion("age <", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThanOrEqualTo(Integer value) {
			addCriterion("age <=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeIn(List<Integer> values) {
			addCriterion("age in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotIn(List<Integer> values) {
			addCriterion("age not in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeBetween(Integer value1, Integer value2) {
			addCriterion("age between", value1, value2, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotBetween(Integer value1, Integer value2) {
			addCriterion("age not between", value1, value2, "age");
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

		public Criteria andJobPositionIsNull() {
			addCriterion("\"job_ position\" is null");
			return (Criteria) this;
		}

		public Criteria andJobPositionIsNotNull() {
			addCriterion("\"job_ position\" is not null");
			return (Criteria) this;
		}

		public Criteria andJobPositionEqualTo(String value) {
			addCriterion("\"job_ position\" =", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionNotEqualTo(String value) {
			addCriterion("\"job_ position\" <>", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionGreaterThan(String value) {
			addCriterion("\"job_ position\" >", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionGreaterThanOrEqualTo(String value) {
			addCriterion("\"job_ position\" >=", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionLessThan(String value) {
			addCriterion("\"job_ position\" <", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionLessThanOrEqualTo(String value) {
			addCriterion("\"job_ position\" <=", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionLike(String value) {
			addCriterion("\"job_ position\" like", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionNotLike(String value) {
			addCriterion("\"job_ position\" not like", value, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionIn(List<String> values) {
			addCriterion("\"job_ position\" in", values, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionNotIn(List<String> values) {
			addCriterion("\"job_ position\" not in", values, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionBetween(String value1, String value2) {
			addCriterion("\"job_ position\" between", value1, value2, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andJobPositionNotBetween(String value1, String value2) {
			addCriterion("\"job_ position\" not between", value1, value2, "jobPosition");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionIsNull() {
			addCriterion("self_description is null");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionIsNotNull() {
			addCriterion("self_description is not null");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionEqualTo(String value) {
			addCriterion("self_description =", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionNotEqualTo(String value) {
			addCriterion("self_description <>", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionGreaterThan(String value) {
			addCriterion("self_description >", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("self_description >=", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionLessThan(String value) {
			addCriterion("self_description <", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionLessThanOrEqualTo(String value) {
			addCriterion("self_description <=", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionLike(String value) {
			addCriterion("self_description like", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionNotLike(String value) {
			addCriterion("self_description not like", value, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionIn(List<String> values) {
			addCriterion("self_description in", values, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionNotIn(List<String> values) {
			addCriterion("self_description not in", values, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionBetween(String value1, String value2) {
			addCriterion("self_description between", value1, value2, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andSelfDescriptionNotBetween(String value1, String value2) {
			addCriterion("self_description not between", value1, value2, "selfDescription");
			return (Criteria) this;
		}

		public Criteria andQqIsNull() {
			addCriterion("qq is null");
			return (Criteria) this;
		}

		public Criteria andQqIsNotNull() {
			addCriterion("qq is not null");
			return (Criteria) this;
		}

		public Criteria andQqEqualTo(String value) {
			addCriterion("qq =", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotEqualTo(String value) {
			addCriterion("qq <>", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThan(String value) {
			addCriterion("qq >", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThanOrEqualTo(String value) {
			addCriterion("qq >=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThan(String value) {
			addCriterion("qq <", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThanOrEqualTo(String value) {
			addCriterion("qq <=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLike(String value) {
			addCriterion("qq like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotLike(String value) {
			addCriterion("qq not like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqIn(List<String> values) {
			addCriterion("qq in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotIn(List<String> values) {
			addCriterion("qq not in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqBetween(String value1, String value2) {
			addCriterion("qq between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotBetween(String value1, String value2) {
			addCriterion("qq not between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andWechatIsNull() {
			addCriterion("wechat is null");
			return (Criteria) this;
		}

		public Criteria andWechatIsNotNull() {
			addCriterion("wechat is not null");
			return (Criteria) this;
		}

		public Criteria andWechatEqualTo(String value) {
			addCriterion("wechat =", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotEqualTo(String value) {
			addCriterion("wechat <>", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatGreaterThan(String value) {
			addCriterion("wechat >", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatGreaterThanOrEqualTo(String value) {
			addCriterion("wechat >=", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLessThan(String value) {
			addCriterion("wechat <", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLessThanOrEqualTo(String value) {
			addCriterion("wechat <=", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLike(String value) {
			addCriterion("wechat like", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotLike(String value) {
			addCriterion("wechat not like", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatIn(List<String> values) {
			addCriterion("wechat in", values, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotIn(List<String> values) {
			addCriterion("wechat not in", values, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatBetween(String value1, String value2) {
			addCriterion("wechat between", value1, value2, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotBetween(String value1, String value2) {
			addCriterion("wechat not between", value1, value2, "wechat");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeIsNull() {
			addCriterion("annex_resume is null");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeIsNotNull() {
			addCriterion("annex_resume is not null");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeEqualTo(String value) {
			addCriterion("annex_resume =", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeNotEqualTo(String value) {
			addCriterion("annex_resume <>", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeGreaterThan(String value) {
			addCriterion("annex_resume >", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeGreaterThanOrEqualTo(String value) {
			addCriterion("annex_resume >=", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeLessThan(String value) {
			addCriterion("annex_resume <", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeLessThanOrEqualTo(String value) {
			addCriterion("annex_resume <=", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeLike(String value) {
			addCriterion("annex_resume like", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeNotLike(String value) {
			addCriterion("annex_resume not like", value, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeIn(List<String> values) {
			addCriterion("annex_resume in", values, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeNotIn(List<String> values) {
			addCriterion("annex_resume not in", values, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeBetween(String value1, String value2) {
			addCriterion("annex_resume between", value1, value2, "annexResume");
			return (Criteria) this;
		}

		public Criteria andAnnexResumeNotBetween(String value1, String value2) {
			addCriterion("annex_resume not between", value1, value2, "annexResume");
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