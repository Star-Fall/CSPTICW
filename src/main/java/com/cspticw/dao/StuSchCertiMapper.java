package com.cspticw.dao;

import com.cspticw.entity.StuSchCerti;
import com.cspticw.entity.StuSchCertiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuSchCertiMapper {
    long countByExample(StuSchCertiExample example);

    int deleteByExample(StuSchCertiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StuSchCerti record);

    int insertSelective(StuSchCerti record);

    List<StuSchCerti> selectByExample(StuSchCertiExample example);

    StuSchCerti selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StuSchCerti record, @Param("example") StuSchCertiExample example);

    int updateByExample(@Param("record") StuSchCerti record, @Param("example") StuSchCertiExample example);

    int updateByPrimaryKeySelective(StuSchCerti record);

    int updateByPrimaryKey(StuSchCerti record);
}