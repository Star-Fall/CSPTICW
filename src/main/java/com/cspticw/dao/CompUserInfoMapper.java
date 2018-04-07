package com.cspticw.dao;

import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.CompUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompUserInfoMapper {
    long countByExample(CompUserInfoExample example);

    int deleteByExample(CompUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompUserInfo record);

    int insertSelective(CompUserInfo record);

    List<CompUserInfo> selectByExample(CompUserInfoExample example);

    CompUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompUserInfo record, @Param("example") CompUserInfoExample example);

    int updateByExample(@Param("record") CompUserInfo record, @Param("example") CompUserInfoExample example);

    int updateByPrimaryKeySelective(CompUserInfo record);

    int updateByPrimaryKey(CompUserInfo record);
}