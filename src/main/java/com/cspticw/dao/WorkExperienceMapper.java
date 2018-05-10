package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.WorkExperience;
import com.cspticw.entity.WorkExperienceExample;

public interface WorkExperienceMapper {

	long countByExample(WorkExperienceExample example);

	int deleteByExample(WorkExperienceExample example);

	int deleteByPrimaryKey(Long id);

	int insert(WorkExperience record);

	int insertSelective(WorkExperience record);

	List<WorkExperience> selectByExample(WorkExperienceExample example);

	WorkExperience selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") WorkExperience record,
			@Param("example") WorkExperienceExample example);

	int updateByExample(@Param("record") WorkExperience record,
			@Param("example") WorkExperienceExample example);

	int updateByPrimaryKeySelective(WorkExperience record);

	int updateByPrimaryKey(WorkExperience record);
}