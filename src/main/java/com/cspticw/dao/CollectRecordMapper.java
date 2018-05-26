package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.CollectRecord;
import com.cspticw.entity.CollectRecordExample;

public interface CollectRecordMapper {
	long countByExample(CollectRecordExample example);

	int deleteByExample(CollectRecordExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CollectRecord record);

	int insertSelective(CollectRecord record);

	List<CollectRecord> selectByExample(CollectRecordExample example);

	CollectRecord selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CollectRecord record,
			@Param("example") CollectRecordExample example);

	int updateByExample(@Param("record") CollectRecord record,
			@Param("example") CollectRecordExample example);

	int updateByPrimaryKeySelective(CollectRecord record);

	int updateByPrimaryKey(CollectRecord record);

	List<JSONObject> getCollectRecord(@Param("stuId") Long stuId, @Param("compId") Long compId,
			@Param("collectUser") Integer collectUser);
}