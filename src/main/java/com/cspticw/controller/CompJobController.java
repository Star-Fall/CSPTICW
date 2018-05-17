package com.cspticw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.CompJobInfo;
import com.cspticw.entity.CompUserInfo;
import com.cspticw.service.CompJobService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;

/**
 * @ClassName: CompJobController
 * @author: StarFall
 * @date: 2018年5月15日 上午10:56:52
 * @Description:企业岗位controller
 */
@RestController
public class CompJobController extends BaseController {

	@Autowired
	private CompJobService compJobService;

	/**
	 * 发布职位
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "/add_comp_job", method = RequestMethod.POST)
	public Map<String, Object> addCompJob(@RequestBody String jsonData) {
		Map<String, Object> returnMap = new HashMap<>();
		CompJobInfo record = JSONObject.parseObject(jsonData, CompJobInfo.class);
		record.setCompId(getCompUserInfo().getId());
		boolean flag = compJobService.addCompJob(record);
		if (flag) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
		} else {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_JOB);
		}
		return returnMap;
	}

	/**
	 * 获取公司的所有岗位
	 * 
	 * @return
	 */
	@RequestMapping("/get_comp_job_list")
	public Map<String, Object> getCompJobList() {
		Map<String, Object> returnMap = new HashMap<>();
		List<CompJobInfo> list = compJobService.getCompJobList(getCompUserInfo().getId());
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 根据id 获取岗位和公司信息
	 * 
	 * @return
	 */
	@RequestMapping("/get_company_job_id")
	public Map<String, Object> getCompanyJobDetailById(@RequestParam("jobId") String id) {
		Map<String, Object> returnMap = new HashMap<>();
		Long jobId = Long.valueOf(id);
		JSONObject jsonObject = compJobService.getCompanyJobDetailById(jobId);
		returnMap.put("data", jsonObject);
		return returnMap;
	}

	/**
	 * 热度top10
	 * 
	 * @return
	 */
	@RequestMapping("/get_comp_job_top10")
	public Map<String, Object> getCompJobTop10(String province, String city) {
		Map<String, Object> returnMap = new HashMap<>();
		List<CompJobInfo> list = compJobService.getCompJobTop10(province, city);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 根据参数查找工作
	 * 
	 * @return
	 */
	@RequestMapping("/get_comp_job_params")
	public Map<String, Object> getCompJobListByParam() {
		Map<String, Object> returnMap = new HashMap<>();
		List<CompJobInfo> list = compJobService.getCompJobByParams();
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 获取我的岗位列表-用于岗位邀请
	 * 
	 * @return
	 */
	@RequestMapping("/get_mycomp_job_list")
	public Map<String, Object> getMyCompJobList() {
		Map<String, Object> returnMap = new HashMap<>();
		CompUserInfo company = getCompUserInfo();
		if (company == null) {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_COMPANY_LOGIN);
			return returnMap;
		}
		List<CompJobInfo> list = compJobService.getMyCompJobList(company.getId());
		returnMap.put("data", list);
		return returnMap;
	}

}
