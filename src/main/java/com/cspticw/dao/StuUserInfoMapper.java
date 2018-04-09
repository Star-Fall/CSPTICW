package com.cspticw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cspticw.entity.StuUserInfo;
import com.cspticw.entity.StuUserInfoExample;

/**
 * @ClassName: StuUserInfoMapper
 * @author: StarFall
 * @date: 2018年4月9日 下午10:02:31
 * @Description:学生用户Mapper
 */
@Mapper
public interface StuUserInfoMapper {

	long countByExample(StuUserInfoExample example);

	int deleteByExample(StuUserInfoExample example);

	int deleteByPrimaryKey(Long id);

	int insert(StuUserInfo record);

	int insertSelective(StuUserInfo record);

	List<StuUserInfo> selectByExample(StuUserInfoExample example);

	StuUserInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") StuUserInfo record,
			@Param("example") StuUserInfoExample example);

	int updateByExample(@Param("record") StuUserInfo record,
			@Param("example") StuUserInfoExample example);

	int updateByPrimaryKeySelective(StuUserInfo record);

	int updateByPrimaryKey(StuUserInfo record);

	/**
	 * 新增的方法
	 */
	/**
	 * 根据userName查询学生用户
	 * 
	 * @param userName
	 * @return
	 */
	StuUserInfo selectByUserName(@Param("userName") String userName);
}