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
	 * 跳转我的简历
	 * 
	 * @return
	 */
	@RequestMapping("/to_comp_job_list")
	public String toMyCompJobList() {
		return "company-center-job-list";
	}

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
