package com.cspticw.dao;

import com.cspticw.entity.CompInfoCerti;
import com.cspticw.entity.CompInfoCertiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompInfoCertiMapper {
    long countByExample(CompInfoCertiExample example);

    int deleteByExample(CompInfoCertiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompInfoCerti record);

    int insertSelective(CompInfoCerti record);

    List<CompInfoCerti> selectByExample(CompInfoCertiExample example);

    CompInfoCerti selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompInfoCerti record, @Param("example") CompInfoCertiExample example);

    int updateByExample(@Param("record") CompInfoCerti record, @Param("example") CompInfoCertiExample example);

    int updateByPrimaryKeySelective(CompInfoCerti record);

    int updateByPrimaryKey(CompInfoCerti record);
}