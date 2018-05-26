package com.cspticw.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.dao.ResumeJobMapper;
import com.cspticw.dao.StuResumeInfoMapper;
import com.cspticw.dao.WorkExperienceMapper;
import com.cspticw.entity.ResumeJob;
import com.cspticw.entity.ResumeJobExample;
import com.cspticw.entity.ResumeJobExample.Criteria;
import com.cspticw.entity.ResumeListParams;
import com.cspticw.entity.ResumeModel;
import com.cspticw.entity.StuResumeInfo;
import com.cspticw.entity.StuResumeInfoExample;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.entity.WorkExperience;
import com.cspticw.entity.WorkExperienceExample;
import com.cspticw.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	private StuResumeInfoMapper stuResumeInfoMapper;
	@Autowired
	private ResumeJobMapper resumeJobMapper;
	@Autowired
	private WorkExperienceMapper workExperienceMapper;

	@Transactional
	@Override
	public boolean addResume(Long stuId, String imageFileName, String annexResumeName,
			String jsonData) {
		ResumeModel model = JSONObject.parseObject(jsonData, ResumeModel.class);
		StuResumeInfo studentResume = model;
		// 初始化简历
		studentResume.preInsert();
		studentResume.setStuId(stuId);
		studentResume.setStatus(0);
		studentResume.setResuHot(0);
		// 赋值文件名
		if (imageFileName != null) {
			studentResume.setIdPhoto(stuId + File.separator + imageFileName);
		}
		if (annexResumeName != null) {
			studentResume.setAnnexResume(stuId + File.separator + annexResumeName);

		}

		// 插入 获取主键
		stuResumeInfoMapper.insert(studentResume);
		Long resumeId = studentResume.getId();

		List<ResumeJob> resumeJobs = model.getResumeJobs();
		if (resumeJobs != null && resumeJobs.size() > 0) {
			for (ResumeJob resumeJob : resumeJobs) {
				resumeJob.preInsert();
				resumeJob.setResuId(resumeId);
				resumeJobMapper.insert(resumeJob);
			}
		}
		List<WorkExperience> workExperiences = model.getWorkExperiences();
		if (workExperiences != null && workExperiences.size() > 0) {
			for (WorkExperience workExperience : workExperiences) {
				workExperience.preInsert();
				workExperience.setResuId(resumeId);
				workExperienceMapper.insert(workExperience);
			}
		}
		return true;
	}

	@Override
	public List<JSONObject> getMyResumeDetailList(StuUserInfo student) {
		return stuResumeInfoMapper.getMyResumeDetailList(student.getId());
	}

	@Override
	public JSONObject getResumeDetail(Long id) {
		return stuResumeInfoMapper.getResumeDetail(id);
	}

	@Transactional
	@Override
	public boolean updateResume(String imageFileName, String annexResumeName, String jsonData) {
		// 转换成ResumeModel
		ResumeModel model = JSONObject.parseObject(jsonData, ResumeModel.class);
		/**
		 * 提取简历信息
		 */
		StuResumeInfo studentResume = model;
		studentResume.preUpdate();
		// 赋值文件名
		if (imageFileName != null) {
			// 删除旧文件 TODO
			studentResume.setIdPhoto(studentResume.getStuId() + File.separator + imageFileName);
		}
		if (annexResumeName != null) {
			// 删除旧文件 TODO
			studentResume
					.setAnnexResume(studentResume.getStuId() + File.separator + annexResumeName);
		}
		stuResumeInfoMapper.updateByPrimaryKeySelective(studentResume);
		/**
		 * 提取求职意向
		 */
		List<ResumeJob> resumeJobs = model.getResumeJobs();
		// 先根据简历Id删除
		ResumeJobExample resumeJobExample = new ResumeJobExample();
		Criteria createCriteriaJob = resumeJobExample.createCriteria();
		// 设置简历Id
		createCriteriaJob.andResuIdEqualTo(studentResume.getId());
		resumeJobMapper.deleteByExample(resumeJobExample);
		// 再插入
		if (resumeJobs != null && resumeJobs.size() > 0) {
			for (ResumeJob resumeJob : resumeJobs) {
				resumeJob.preInsert();
				resumeJob.setResuId(studentResume.getId());
				resumeJobMapper.insert(resumeJob);
			}
		}
		/**
		 * 提取工作经验
		 */
		List<WorkExperience> workExperiences = model.getWorkExperiences();
		// 先删除
		WorkExperienceExample workExperienceExample = new WorkExperienceExample();
		com.cspticw.entity.WorkExperienceExample.Criteria createCriteria = workExperienceExample
				.createCriteria();
		createCriteria.andResuIdEqualTo(studentResume.getId());
		workExperienceMapper.deleteByExample(workExperienceExample);
		// 再插入
		if (workExperiences != null && workExperiences.size() > 0) {
			for (WorkExperience workExperience : workExperiences) {
				workExperience.preInsert();
				workExperience.setResuId(studentResume.getId());
				workExperienceMapper.insert(workExperience);
			}
		}
		return true;
	}

	@Transactional
	@Override
	public boolean deleteResume(Long id) {
		// 删除工作经验
		WorkExperienceExample workExperienceExample = new WorkExperienceExample();
		com.cspticw.entity.WorkExperienceExample.Criteria createCriteria = workExperienceExample
				.createCriteria();
		createCriteria.andResuIdEqualTo(id);
		workExperienceMapper.deleteByExample(workExperienceExample);
		// 删除求职意向
		ResumeJobExample resumeJobExample = new ResumeJobExample();
		Criteria createCriteriaJob = resumeJobExample.createCriteria();
		createCriteriaJob.andResuIdEqualTo(id);
		resumeJobMapper.deleteByExample(resumeJobExample);
		// 更改状态2设为删除
		StuResumeInfo resume = new StuResumeInfo();
		resume.setId(id);
		resume.setStatus(2);
		resume.preUpdate();
		stuResumeInfoMapper.updateByPrimaryKeySelective(resume);
		return true;
	}

	@Transactional
	@Override
	public List<JSONObject> getResumeTop10(String province, String city) {
		if (province != null) {
			province = "%" + province + "%";
		}
		if (city != null) {
			city = "%" + city + "%";
		}
		List<JSONObject> list = stuResumeInfoMapper.getResumeTop10(province, city);
		List<JSONObject> newList = new ArrayList<>();
		if (list == null) {
			newList = list;
		} else if (list.size() <= 10) {
			newList = list;
		} else {
			for (int i = 9; i >= 0; i--) {
				newList.add(list.get(i));
			}
			Collections.reverse(newList);
		}
		return newList;
	}

	@Override
	public List<JSONObject> getResumeListByParams() {
		List<JSONObject> list = stuResumeInfoMapper.getResumeTop10(null, null);
		return list;
	}

	@Override
	public List<StuResumeInfo> getMyResumeList(Long stuId) {
		StuResumeInfoExample example = new StuResumeInfoExample();
		com.cspticw.entity.StuResumeInfoExample.Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuId);
		criteria.andStatusEqualTo(0);
		List<StuResumeInfo> list = stuResumeInfoMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<JSONObject> getList(ResumeListParams params) {
		return stuResumeInfoMapper.getList(params.getProvince(), params.getCity(),
				params.getResumeJobList(), params.getEducationList(), params.getGender());
	}

}
