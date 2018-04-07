package com.cspticw.dao;

import com.cspticw.entity.RecruitRecord;
import com.cspticw.entity.RecruitRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitRecordMapper {
    long countByExample(RecruitRecordExample example);

    int deleteByExample(RecruitRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecruitRecord record);

    int insertSelective(RecruitRecord record);

    List<RecruitRecord> selectByExample(RecruitRecordExample example);

    RecruitRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecruitRecord record, @Param("example") RecruitRecordExample example);

    int updateByExample(@Param("record") RecruitRecord record, @Param("example") RecruitRecordExample example);

    int updateByPrimaryKeySelective(RecruitRecord record);

    int updateByPrimaryKey(RecruitRecord record);
}