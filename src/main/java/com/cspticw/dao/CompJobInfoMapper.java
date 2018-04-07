package com.cspticw.dao;

import com.cspticw.entity.CompJobInfo;
import com.cspticw.entity.CompJobInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompJobInfoMapper {
    long countByExample(CompJobInfoExample example);

    int deleteByExample(CompJobInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompJobInfo record);

    int insertSelective(CompJobInfo record);

    List<CompJobInfo> selectByExample(CompJobInfoExample example);

    CompJobInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompJobInfo record, @Param("example") CompJobInfoExample example);

    int updateByExample(@Param("record") CompJobInfo record, @Param("example") CompJobInfoExample example);

    int updateByPrimaryKeySelective(CompJobInfo record);

    int updateByPrimaryKey(CompJobInfo record);
}