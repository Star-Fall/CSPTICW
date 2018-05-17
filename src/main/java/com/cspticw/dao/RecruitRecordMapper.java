package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.RecruitRecord;
import com.cspticw.entity.RecruitRecordExample;

public interface RecruitRecordMapper {

	long countByExample(RecruitRecordExample example);

	int deleteByExample(RecruitRecordExample example);

	int deleteByPrimaryKey(Long id);

	int insert(RecruitRecord record);

	int insertSelective(RecruitRecord record);

	List<RecruitRecord> selectByExample(RecruitRecordExample example);

	RecruitRecord selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") RecruitRecord record,
			@Param("example") RecruitRecordExample example);

	int updateByExample(@Param("record") RecruitRecord record,
			@Param("example") RecruitRecordExample example);

	int updateByPrimaryKeySelective(RecruitRecord record);

	int updateByPrimaryKey(RecruitRecord record);

	/**
	 * 查询上一记录的间隔天数
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	Integer selectDayById2(@Param("resumeId") Long resumeId, @Param("jobId") Long jobId);
}