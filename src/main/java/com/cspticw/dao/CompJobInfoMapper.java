package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.CompJobInfo;
import com.cspticw.entity.CompJobInfoExample;

public interface CompJobInfoMapper {

	long countByExample(CompJobInfoExample example);

	int deleteByExample(CompJobInfoExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CompJobInfo record);

	int insertSelective(CompJobInfo record);

	List<CompJobInfo> selectByExample(CompJobInfoExample example);

	CompJobInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CompJobInfo record,
			@Param("example") CompJobInfoExample example);

	int updateByExample(@Param("record") CompJobInfo record,
			@Param("example") CompJobInfoExample example);

	int updateByPrimaryKeySelective(CompJobInfo record);

	int updateByPrimaryKey(CompJobInfo record);

	/**
	 * 新增
	 */
	List<CompJobInfo> getCompJobTop10(@Param("province") String province,
			@Param("city") String city);

	/**
	 * 根据id查看工作公司
	 * 
	 * @param jobId
	 * @return
	 */
	JSONObject getCompanyJobDetailById(@Param("jobId") Long jobId);
}