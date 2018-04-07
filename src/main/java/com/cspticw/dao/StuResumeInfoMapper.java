package com.cspticw.dao;

import com.cspticw.entity.StuResumeInfo;
import com.cspticw.entity.StuResumeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuResumeInfoMapper {
    long countByExample(StuResumeInfoExample example);

    int deleteByExample(StuResumeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StuResumeInfo record);

    int insertSelective(StuResumeInfo record);

    List<StuResumeInfo> selectByExample(StuResumeInfoExample example);

    StuResumeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StuResumeInfo record, @Param("example") StuResumeInfoExample example);

    int updateByExample(@Param("record") StuResumeInfo record, @Param("example") StuResumeInfoExample example);

    int updateByPrimaryKeySelective(StuResumeInfo record);

    int updateByPrimaryKey(StuResumeInfo record);
}