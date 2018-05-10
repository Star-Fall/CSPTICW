package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.ResumeJob;
import com.cspticw.entity.ResumeJobExample;

public interface ResumeJobMapper {

	long countByExample(ResumeJobExample example);

	int deleteByExample(ResumeJobExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ResumeJob record);

	int insertSelective(ResumeJob record);

	List<ResumeJob> selectByExample(ResumeJobExample example);

	ResumeJob selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ResumeJob record,
			@Param("example") ResumeJobExample example);

	int updateByExample(@Param("record") ResumeJob record,
			@Param("example") ResumeJobExample example);

	int updateByPrimaryKeySelective(ResumeJob record);

	int updateByPrimaryKey(ResumeJob record);
}