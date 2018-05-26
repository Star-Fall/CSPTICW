package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.ComplaintRecord;
import com.cspticw.entity.ComplaintRecordExample;

public interface ComplaintRecordMapper {
	long countByExample(ComplaintRecordExample example);

	int deleteByExample(ComplaintRecordExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ComplaintRecord record);

	int insertSelective(ComplaintRecord record);

	List<ComplaintRecord> selectByExample(ComplaintRecordExample example);

	ComplaintRecord selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") ComplaintRecord record,
			@Param("example") ComplaintRecordExample example);

	int updateByExample(@Param("record") ComplaintRecord record,
			@Param("example") ComplaintRecordExample example);

	int updateByPrimaryKeySelective(ComplaintRecord record);

	int updateByPrimaryKey(ComplaintRecord record);

	/**
	 * 新增
	 */
	/**
	 * 查找记录
	 * 
	 * @param resumeId
	 * @param jobId
	 * @return
	 */
	List<JSONObject> getComplaintRecord(@Param("stuId") Long stuId, @Param("compId") Long compId,
			@Param("complaintMode") Integer complaintMode);

	/**
	 * 管理员获取
	 * 
	 * @param complaintMode
	 * @param status
	 * @return
	 */
	List<JSONObject> getComplaintRecordAmdin(@Param("complaintMode") Integer complaintMode,
			@Param("status") Integer status);
}