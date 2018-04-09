package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.CompUserInfoExample;

/**
 * @ClassName: CompUserInfoMapper
 * @author: StarFall
 * @date: 2018年4月9日 下午10:02:59
 * @Description:
 */
@Mapper
public interface CompUserInfoMapper {

	long countByExample(CompUserInfoExample example);

	int deleteByExample(CompUserInfoExample example);

	int deleteByPrimaryKey(Long id);

	int insert(CompUserInfo record);

	int insertSelective(CompUserInfo record);

	List<CompUserInfo> selectByExample(CompUserInfoExample example);

	CompUserInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CompUserInfo record,
			@Param("example") CompUserInfoExample example);

	int updateByExample(@Param("record") CompUserInfo record,
			@Param("example") CompUserInfoExample example);

	int updateByPrimaryKeySelective(CompUserInfo record);

	int updateByPrimaryKey(CompUserInfo record);

	/**
	 * 新增的方法
	 */
	/**
	 * 根据userName查询企业用户
	 * 
	 * @param userName
	 * @return
	 */
	CompUserInfo selectByUserName(@Param("userName") String userName);
}