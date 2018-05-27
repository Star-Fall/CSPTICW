package com.cspticw.controller;

import java.io.UnsupportedEncodingException;
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
import com.cspticw.entity.JobListParams;
import com.cspticw.service.CompJobService;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	 * 更新公司岗位
	 * 
	 * @return
	 */
	@RequestMapping(value = "/update_company_job", method = RequestMethod.POST)
	public Map<String, Object> updateCompanyJob(@RequestBody String jsonData) {
		Map<String, Object> returnMap = new HashMap<>();
		CompJobInfo record = JSONObject.parseObject(jsonData, CompJobInfo.class);
		boolean result = compJobService.updateCompanyJob(record);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
		} else {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_UPDATE_JOB);
		}
		return returnMap;
	}

	/**
	 * 删除公司岗位
	 * 
	 * @return
	 */
	@RequestMapping(value = "/delete_company_job", method = RequestMethod.POST)
	public Map<String, Object> deleteCompanyJob(@RequestBody String id) {
		Map<String, Object> returnMap = new HashMap<>();
		Long jobId = Long.valueOf(id);
		boolean result = compJobService.deleteCompanyJob(jobId);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
		} else {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_DELETE_JOB);
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
	public Map<String, Object> getCompJobTop10(
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city) {
		Map<String, Object> returnMap = new HashMap<>();
		try {
			if (province != null) {
				province = new String(province.getBytes("iso-8859-1"), "utf-8");
			}
			if (city != null) {
				city = new String(city.getBytes("iso-8859-1"), "utf-8");
			}
		} catch (UnsupportedEncodingException e) {
			returnMap.put(Constants.ERROR, "error");
			return returnMap;
		}

		List<CompJobInfo> list = compJobService.getCompJobTop10(province, city);
		returnMap.put("data", list);
		return returnMap;
	}

	/**
	 * 根据参数筛选岗位<br>
	 * 类别 list<br>
	 * 地点 list<br>
	 * 金额 开始 和 结束<br>
	 * 方式 list<br>
	 * 结算方式 list<br>
	 * 
	 * @return
	 */
	@RequestMapping("/get_comp_job_params")
	public Map<String, Object> getCompJobListByParam(@RequestParam("jsonData") String jsonData,
			@RequestParam(value = "pageNum", required = false) String pageNum) {
		Map<String, Object> returnMap = new HashMap<>();
		try {
			jsonData = new String(jsonData.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			returnMap.put(Constants.ERROR, "error");
			return returnMap;
		}
		JobListParams params = JSONObject.parseObject(jsonData, JobListParams.class);
		if (pageNum == null)
			pageNum = 1 + "";
		PageHelper.startPage(Integer.valueOf(pageNum), 10);
		List<JSONObject> list = compJobService.getList(params);
		PageInfo<JSONObject> pageInfo = new PageInfo<>(list, 5);
		returnMap.put("data", pageInfo);
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
