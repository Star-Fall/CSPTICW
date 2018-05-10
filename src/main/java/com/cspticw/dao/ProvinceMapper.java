package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.Province;
import com.cspticw.entity.ProvinceCityModel;
import com.cspticw.entity.ProvinceExample;

public interface ProvinceMapper {
	long countByExample(ProvinceExample example);

	int deleteByExample(ProvinceExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Province record);

	int insertSelective(Province record);

	List<Province> selectByExample(ProvinceExample example);

	Province selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Province record,
			@Param("example") ProvinceExample example);

	int updateByExample(@Param("record") Province record,
			@Param("example") ProvinceExample example);

	int updateByPrimaryKeySelective(Province record);

	int updateByPrimaryKey(Province record);

	/**
	 * 新增
	 */
	List<ProvinceCityModel> getProvinceCity();
}