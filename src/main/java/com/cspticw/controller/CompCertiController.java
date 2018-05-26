package com.cspticw.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.cspticw.entity.CompInfoCerti;
import com.cspticw.service.CompCertiService;
import com.cspticw.util.CommonUtils;
import com.cspticw.util.tools.Constants;
import com.cspticw.util.tools.ErrorCode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @ClassName: CompCertiController
 * @author: StarFall
 * @date: 2018年5月14日 下午10:41:57
 * @Description:企业认证信息Controller
 */
@RestController
public class CompCertiController extends BaseController {

	@Autowired
	private CompCertiService compCertiService;

	/**
	 * 根据公司Id查认证信息
	 * 
	 * @return
	 */
	@RequestMapping("/get_comp_certi")
	public Map<String, Object> getCompCertiInfoSingle() {
		Map<String, Object> returnMap = new HashMap<>();
		CompInfoCerti compInfoCerti = compCertiService
				.findCertiInfobyCompId(getCompUserInfo().getId());
		returnMap.put("data", compInfoCerti);
		return returnMap;
	}

	/**
	 * 新增认证信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/add_comp_certi", method = RequestMethod.POST)
	public Map<String, Object> addCompCertiInfoSingle(
			@RequestParam(value = "businessLicense", required = false) MultipartFile businessLicense,
			@RequestParam(value = "jsonData") String jsonData) {
		Map<String, Object> returnMap = new HashMap<>();
		CompInfoCerti compCerti = JSONObject.parseObject(jsonData, CompInfoCerti.class);
		// 父路径/upfile/student/1
		String path = getUpFilePath(Constants.COMPANY_USER);
		String businessLicenseName = null;
		try {
			// 图片文件
			if (businessLicense != null && !businessLicense.isEmpty()) {
				businessLicenseName = CommonUtils.getUUID();
				String fileName = businessLicense.getOriginalFilename();
				if (fileName.indexOf(".") >= 0) {
					// 后缀
					businessLicenseName = businessLicenseName
							+ fileName.substring(fileName.lastIndexOf("."));
				}
				businessLicense.transferTo(new File(path + File.separator + businessLicenseName));
			}

		} catch (Exception e) {
			// 上传文件错误
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_UP_FILE);
			return returnMap;
		}
		Long compId = getCompUserInfo().getId();
		compCerti.setCompId(compId);
		if (businessLicenseName != null) {
			compCerti.setBusinessLicense(compId + File.separator + businessLicenseName);

		}
		boolean flag = compCertiService.addCompCertiInfo(compCerti);
		if (flag) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;

		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_CERTI);
		return returnMap;
	}

	/**
	 * 更新企业认证信息
	 * 
	 * @param businessLicense
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "/update_company_certi", method = RequestMethod.POST)
	public Map<String, Object> updateCompCertiInfo(
			@RequestParam(value = "businessLicense", required = false) MultipartFile businessLicense,
			@RequestParam(value = "jsonData") String jsonData) {
		Map<String, Object> returnMap = new HashMap<>();
		CompInfoCerti compCerti = JSONObject.parseObject(jsonData, CompInfoCerti.class);

		String path = getUpFilePath(Constants.COMPANY_USER);
		String businessLicenseName = null;
		try {
			// 图片文件
			if (businessLicense != null && !businessLicense.isEmpty()) {
				businessLicenseName = CommonUtils.getUUID();
				String fileName = businessLicense.getOriginalFilename();
				if (fileName.indexOf(".") >= 0) {
					// 后缀
					businessLicenseName = businessLicenseName
							+ fileName.substring(fileName.lastIndexOf("."));
				}
				businessLicense.transferTo(new File(path + File.separator + businessLicenseName));
			}

		} catch (Exception e) {
			// 上传文件错误
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_UP_FILE);
			return returnMap;
		}
		Long compId = getCompUserInfo().getId();
		compCerti.setCompId(compId);
		if (businessLicenseName != null) {
			compCerti.setBusinessLicense(compId + File.separator + businessLicenseName);
		}
		// 执行更新
		boolean flag = compCertiService.updateCompCertiInfo(compCerti);
		if (flag) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, ErrorCode.ERROR_UPDATE_CERTI);
		return returnMap;
	}

	/**
	 * 管理员根据状态查看认证列表
	 * 
	 * @param isCertified
	 * @return
	 */
	@RequestMapping("/get_compcerti_admin")
	public Map<String, Object> getCompCertiInfoAdmin(
			@RequestParam(value = "isCertified", required = false) String isCertified,
			@RequestParam(value = "pageNum", required = false) String pageNum) {
		Map<String, Object> returnMap = new HashMap<>();
		if (pageNum == null)
			pageNum = 1 + "";
		Integer isCertifiedInt = null;
		if (isCertified != null) {
			isCertifiedInt = Integer.valueOf(isCertified);
		}
		PageHelper.startPage(Integer.valueOf(pageNum), 10);
		List<CompInfoCerti> list = compCertiService.getCompCertiInfoAdmin(isCertifiedInt);
		PageInfo<CompInfoCerti> pageInfo = new PageInfo<>(list, 5);
		returnMap.put("data", pageInfo);
		return returnMap;

	}

	/**
	 * 管理员认证
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/update_company_certi_admin", method = RequestMethod.POST)
	public Map<String, Object> updateCompCertiInfoAdmin(@RequestBody Map<String, Object> map) {
		Map<String, Object> returnMap = new HashMap<>();
		Long recordId = Long.valueOf(map.get("recordId").toString());
		Integer isCertified = Integer.valueOf(map.get("isCertified").toString());
		boolean result = compCertiService.updateCompCertiInfoAdmin(recordId, isCertified);
		if (result) {
			returnMap.put(Constants.MSG, Constants.SUCCESS);
			return returnMap;
		}
		returnMap.put(Constants.ERROR, "error");
		return returnMap;
	}
}
