package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.ApplyRecord;
import com.cspticw.entity.ApplyRecordExample;

public interface ApplyRecordMapper {

	long countByExample(ApplyRecordExample example);

	int deleteByExample(ApplyRecordExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ApplyRecord record);

	int insertSelective(ApplyRecord record);

	List<ApplyRecord> selectByExample(ApplyRecordExample example);

	ApplyRecord selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ApplyRecord record,
			@Param("example") ApplyRecordExample example);

	int updateByExample(@Param("record") ApplyRecord record,
			@Param("example") ApplyRecordExample example);

	int updateByPrimaryKeySelective(ApplyRecord record);

	int updateByPrimaryKey(ApplyRecord record);

	/**
	 * 新增
	 */

	/**
	 * 查询简历投递天数
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	Integer selectDayById(@Param("resumeId") Long resumeId, @Param("jobId") Long jobId);

}