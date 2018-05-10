package com.cspticw.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.util.tools.Constants;

/**
 * @ClassName: BaseController
 * @author: StarFall
 * @date: 2018年4月7日 下午10:58:14
 * @Description:Controller基类
 */
public class BaseController {

	@Autowired
	private HttpServletRequest request;

	public StuUserInfo getStuUserInfo() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.getPrincipal() instanceof StuUserInfo) {
			StuUserInfo student = (StuUserInfo) subject.getPrincipal();
			return student;
		}
		return null;
	}

	public CompUserInfo getCompUserInfo() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.getPrincipal() instanceof CompUserInfo) {
			CompUserInfo company = (CompUserInfo) subject.getPrincipal();
			return company;
		}
		return null;
	}

	/**
	 * 获取上传文件根路径
	 * 
	 * @return
	 */
	public String getUpFilePath(String pattern) {
		String realPath = request.getServletContext().getRealPath("");
		File file = new File(realPath);
		String parent = file.getParent();
		File upFile = null;
		// 获取用户id
		CompUserInfo compUserInfo = getCompUserInfo();
		StuUserInfo stuUserInfo = getStuUserInfo();
		String userId = "";
		if (compUserInfo != null) {
			userId = File.separator + compUserInfo.getId();
		} else if (stuUserInfo != null) {
			userId = File.separator + stuUserInfo.getId();
		}
		// 父路径/upfile/student(company)/1
		if (pattern.equals(Constants.STUDENT_USER)) {
			upFile = new File(parent + File.separator + Constants.UP_FILE_PATH + File.separator
					+ Constants.STUDENT_USER + userId);
		} else {
			upFile = new File(parent + File.separator + Constants.UP_FILE_PATH + File.separator
					+ Constants.COMPANY_USER + userId);
		}
		if (!upFile.exists()) {
			upFile.mkdirs();
		}
		return upFile.getPath();
	}
}
