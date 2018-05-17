package com.cspticw.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cspticw.util.tools.Constants;

@Controller
public class FileDownloadController extends BaseController {

	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/down_resume_file")
	public ResponseEntity<byte[]> downloadResumeFile(String fileName, String stuId)
			throws Exception {
		fileName = new String(fileName.getBytes("ISO-8859-1"), "utf-8");

		ServletContext servletContext = request.getServletContext();

		// String fileName = "JAVA开发工程师-邵赫.html";
		// 得到文件所在位置
		// 父路径/upfile/student(company)/1
		String upfilePath = getUpFilePath(Constants.STUDENT_USER);
		String realPath = upfilePath + File.separator + stuId + File.separator + fileName;
		// 如果获取到stuId
		if (getStuUserInfo() != null || getCompUserInfo() != null) {
			// 去除uerId
			int indexOf = upfilePath.lastIndexOf(File.separator);
			upfilePath = upfilePath.substring(0, indexOf + 1);
			realPath = upfilePath + stuId + File.separator + fileName;
		}
		// "C:\\apache-tomcat-7.0.86\\webapps\\upfile\\student\\2\\JAVA开发工程师-邵赫.html";
		InputStream in = new FileInputStream(new File(realPath));// 将该文件加入到输入流之中
		byte[] body = null;
		body = new byte[in.available()];// 返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取（或跳过）的估计剩余字节数
		in.read(body);// 读入到输入流里面

		fileName = new String(fileName.getBytes("gbk"), "iso8859-1");// 防止中文乱码
		HttpHeaders headers = new HttpHeaders();// 设置响应头
		headers.add("Content-Disposition", "attachment;filename=" + fileName);
		HttpStatus statusCode = HttpStatus.OK;// 设置响应吗
		ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
		return response;
	}
}
