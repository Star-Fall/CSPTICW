package com.cspticw.dao;

import com.cspticw.entity.ComplaintRecord;
import com.cspticw.entity.ComplaintRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintRecordMapper {
    long countByExample(ComplaintRecordExample example);

    int deleteByExample(ComplaintRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ComplaintRecord record);

    int insertSelective(ComplaintRecord record);

    List<ComplaintRecord> selectByExample(ComplaintRecordExample example);

    ComplaintRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ComplaintRecord record, @Param("example") ComplaintRecordExample example);

    int updateByExample(@Param("record") ComplaintRecord record, @Param("example") ComplaintRecordExample example);

    int updateByPrimaryKeySelective(ComplaintRecord record);

    int updateByPrimaryKey(ComplaintRecord record);
}