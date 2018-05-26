package com.cspticw.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.StuUserInfo;

/**
 * @ClassName: ForwardController
 * @author: StarFall
 * @date: 2018年4月16日 下午8:12:11
 * @Description:请求转发controller
 */
@Controller
public class ForwardController {

	/**
	 * 跳转至首页
	 * 
	 * @return
	 */
	@RequestMapping("/to_main")
	public String toMainView() {
		return "main";
	}

	/**
	 * 跳转到主页-兼职
	 * 
	 * @return
	 */
	@RequestMapping("/to_main_job")
	public String toMainJob() {
		return "main-job";
	}

	/**
	 * 跳转到主页-简历
	 * 
	 * @return
	 */
	@RequestMapping("/to_main_resume")
	public String toMainResume() {
		return "main-resume";
	}

	/**
	 * 跳转至注册页面
	 * 
	 * @return
	 */
	@RequestMapping("/to_regist")
	public String toRegistView() {
		return "regist";
	}

	/**
	 * 跳转至登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/to_login")
	public String toLoginView() {
		return "login";
	}

	/**
	 * 跳转至用户中心
	 * 
	 * @return
	 */
	@RequestMapping("/to_user_center")
	public String toUserCenter() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.getPrincipal() instanceof StuUserInfo) {
			return "student-center-resume-list";
		} else if (subject.getPrincipal() instanceof CompUserInfo) {
			return "company-center";
		}
		return "main";
	}

	// 大学生
	/**
	 * 发布简历页面
	 * 
	 * @return
	 */
	@RequestMapping("/to_student_center_resume")
	public String toStudentCenterResume() {
		return "student-center-resume";
	}

	/**
	 * 我的简历页面
	 * 
	 * @return
	 */
	@RequestMapping("/to_my_resume_list")
	public String toMyResumeList() {
		return "student-center-resume-list";
	}

	/**
	 * 跳转到简历修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/to_resume_modify")
	public String toModifyResume() {
		return "student-center-resume-modify";
	}

	/**
	 * 跳转学生简历投递记录
	 * 
	 * @return
	 */
	@RequestMapping("/to_student_apply_record")
	public String toStudentApplyRecord() {
		return "student-center-apply-record";
	}

	/**
	 * 跳转到简历详细的页面 转发简历ID
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping("/to_resume_preview")
	public String toResumePreview(@RequestParam("id") String id, ModelMap map) {
		map.put("resumeId", id);
		return "resume-preview";
	}

	/**
	 * 跳转学生收到的岗位邀请
	 * 
	 * @return
	 */
	@RequestMapping("/to_student_recruit_record")
	public String toStudentRecruitRecord() {
		return "student-center-recruit-record";
	}

	/**
	 * 跳转学生收藏记录
	 * 
	 * @return
	 */
	@RequestMapping("/to_student_collect_record")
	public String toStudentCollectRecord() {
		return "student-center-collect-record";
	}

	/**
	 * 跳转我的投诉
	 * 
	 * @return
	 */
	@RequestMapping("/to_student_complaint_record")
	public String toComplaintRecordStudent() {
		return "student-center-complaint-record";
	}

	// 企业
	/**
	 * 企业认证修改
	 * 
	 * @return
	 */
	@RequestMapping("/to_company_certi_modify")
	public String toCompanyCertiModify() {
		return "company-center-modify";
	}

	/**
	 * 跳转至岗位-公司界面 转发岗位id
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping("/to_job_company")
	public String tojobCompany(@RequestParam("id") String id, ModelMap map) {
		map.put("jobId", id);
		return "job-company";
	}

	/**
	 * 跳转岗位发布界面
	 */
	@RequestMapping("/to_comp_job")
	public String toCompJob() {
		return "company-center-job";
	}

	/**
	 * 跳转公司岗位列表
	 * 
	 * @return
	 */
	@RequestMapping("/to_comp_job_list")
	public String toMyCompJobList() {
		return "company-center-job-list";
	}

	/**
	 * 跳转公司简历应聘
	 * 
	 * @return
	 */
	@RequestMapping("/to_company_apply_record")
	public String toCompanyApplyRecord() {
		return "company-center-apply-record";
	}

	/**
	 * 跳转公司的招聘记录
	 */
	@RequestMapping("/to_company_recruit_record")
	public String toCompanyRecruitRecord() {
		return "company-center-recruit-record";
	}

	/**
	 * 跳转公司收藏记录
	 * 
	 * @return
	 */
	@RequestMapping("/to_company_collect_record")
	public String toCompanyCollectRecord() {
		return "company-center-collect-record";
	}

	/**
	 * 跳转我的投诉
	 * 
	 * @return
	 */
	@RequestMapping("/to_company_complaint_record")
	public String toComplaintRecordCompany() {
		return "company-center-complaint-record";
	}

	// 网站咨询
	@RequestMapping("/to_main_news")
	public String toMainNews() {
		return "main-news";
	}
	// 管理员

	/**
	 * 跳转至管理员
	 * 
	 * @return
	 */
	@RequestMapping("/to_admin")
	public String toAdmin() {
		return "admin/admin";
	}

	@RequestMapping("/to_testDown")
	public String toTest() {
		return "/testUpLoad";
	}
}
