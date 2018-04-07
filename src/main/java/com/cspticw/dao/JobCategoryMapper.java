package com.cspticw.dao;

import com.cspticw.entity.JobCategory;
import com.cspticw.entity.JobCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCategoryMapper {
    long countByExample(JobCategoryExample example);

    int deleteByExample(JobCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobCategory record);

    int insertSelective(JobCategory record);

    List<JobCategory> selectByExample(JobCategoryExample example);

    JobCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobCategory record, @Param("example") JobCategoryExample example);

    int updateByExample(@Param("record") JobCategory record, @Param("example") JobCategoryExample example);

    int updateByPrimaryKeySelective(JobCategory record);

    int updateByPrimaryKey(JobCategory record);
}