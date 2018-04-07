package com.cspticw.dao;

import com.cspticw.entity.WebsiteNews;
import com.cspticw.entity.WebsiteNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteNewsMapper {
    long countByExample(WebsiteNewsExample example);

    int deleteByExample(WebsiteNewsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WebsiteNews record);

    int insertSelective(WebsiteNews record);

    List<WebsiteNews> selectByExample(WebsiteNewsExample example);

    WebsiteNews selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WebsiteNews record, @Param("example") WebsiteNewsExample example);

    int updateByExample(@Param("record") WebsiteNews record, @Param("example") WebsiteNewsExample example);

    int updateByPrimaryKeySelective(WebsiteNews record);

    int updateByPrimaryKey(WebsiteNews record);
}