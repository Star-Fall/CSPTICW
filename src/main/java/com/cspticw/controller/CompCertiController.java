package com.cspticw.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
		} else {
			returnMap.put(Constants.ERROR, ErrorCode.ERROR_ADD_CERTI);
		}
		returnMap.put(Constants.MSG, Constants.SUCCESS);
		return returnMap;

	}
}
