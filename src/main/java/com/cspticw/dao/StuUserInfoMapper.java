package com.cspticw.dao;

import com.cspticw.entity.StuUserInfo;
import com.cspticw.entity.StuUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuUserInfoMapper {
    long countByExample(StuUserInfoExample example);

    int deleteByExample(StuUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StuUserInfo record);

    int insertSelective(StuUserInfo record);

    List<StuUserInfo> selectByExample(StuUserInfoExample example);

    StuUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StuUserInfo record, @Param("example") StuUserInfoExample example);

    int updateByExample(@Param("record") StuUserInfo record, @Param("example") StuUserInfoExample example);

    int updateByPrimaryKeySelective(StuUserInfo record);

    int updateByPrimaryKey(StuUserInfo record);
}