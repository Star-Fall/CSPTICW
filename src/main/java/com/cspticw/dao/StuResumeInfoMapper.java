package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.StuResumeInfo;
import com.cspticw.entity.StuResumeInfoExample;

public interface StuResumeInfoMapper {

	long countByExample(StuResumeInfoExample example);

	int deleteByExample(StuResumeInfoExample example);

	int deleteByPrimaryKey(Long id);

	Long insert(StuResumeInfo record);

	int insertSelective(StuResumeInfo record);

	List<StuResumeInfo> selectByExample(StuResumeInfoExample example);

	StuResumeInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") StuResumeInfo record,
			@Param("example") StuResumeInfoExample example);

	int updateByExample(@Param("record") StuResumeInfo record,
			@Param("example") StuResumeInfoExample example);

	int updateByPrimaryKeySelective(StuResumeInfo record);

	int updateByPrimaryKey(StuResumeInfo record);

	/**
	 * 新增
	 */
	/**
	 * 我的所有简历详细
	 * 
	 * @param studentId
	 * @return
	 */
	List<JSONObject> getMyResumeDetailList(@Param("studentId") Long studentId);

	/**
	 * 指定简历详细
	 * 
	 * @param id
	 * @return
	 */
	JSONObject getResumeDetail(@Param("id") Long id);

	/**
	 * 热门top10
	 * 
	 * @param province
	 * @param city
	 * @return
	 */
	List<JSONObject> getResumeTop10(@Param("province") String province, @Param("city") String city);

}