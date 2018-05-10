package com.cspticw.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.StuUserInfo;

/**
 * @ClassName: ResumeService
 * @author: StarFall
 * @date: 2018年5月6日 上午10:09:47
 * @Description:简历服务接口
 */
public interface ResumeService {

	/**
	 * 添加简历
	 * 
	 * @param stuId
	 * @param imageFileName
	 * @param annexResumeName
	 * @param jsonData
	 * @return
	 */
	public boolean addResume(Long stuId, String imageFileName, String annexResumeName,
			String jsonData);

	/**
	 * 获取我的所有简历详细
	 * 
	 * @param student
	 * @return
	 */
	public List<JSONObject> getMyResumeDetailList(StuUserInfo student);

	/**
	 * 获取指定简历详细
	 * 
	 * @param id
	 *            简历id
	 * @return
	 */
	public JSONObject getResumeDetail(Long id);

	/**
	 * 更新简历
	 * 
	 * @param jsonData
	 *            简历数据
	 */
	boolean updateResume(String imageFileName, String annexResumeName, String jsonData);

	/**
	 * 删除简历
	 * 
	 * @param id
	 *            简历id
	 * @return
	 */
	boolean deleteResume(Long id);
}
