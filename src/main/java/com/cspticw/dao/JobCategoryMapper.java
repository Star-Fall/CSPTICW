package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.JobCategory;
import com.cspticw.entity.JobCategoryAllModel;
import com.cspticw.entity.JobCategoryExample;

/**
 * @ClassName: JobCategoryMapper
 * @author: StarFall
 * @date: 2018年4月30日 下午7:10:28
 * @Description:行业分类
 */
public interface JobCategoryMapper {

	long countByExample(JobCategoryExample example);

	int deleteByExample(JobCategoryExample example);

	int deleteByPrimaryKey(Long id);

	int insert(JobCategory record);

	int insertSelective(JobCategory record);

	List<JobCategory> selectByExample(JobCategoryExample example);

	JobCategory selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") JobCategory record,
			@Param("example") JobCategoryExample example);

	int updateByExample(@Param("record") JobCategory record,
			@Param("example") JobCategoryExample example);

	int updateByPrimaryKeySelective(JobCategory record);

	int updateByPrimaryKey(JobCategory record);

	/**
	 * 新增
	 */
	List<JobCategoryAllModel> getJobCategoryAll();
}