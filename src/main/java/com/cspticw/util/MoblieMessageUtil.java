package com.cspticw.util;

import java.util.HashMap;
import java.util.Map;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @ClassName: MoblieMessageUtil
 * @author: StarFall
 * @date: 2018年4月17日 下午10:06:01
 * @Description:手机短信发送工具类
 */
public class MoblieMessageUtil {

	// 短信API产品名称（短信产品名固定，无需修改）
	private static final String PRODUCT = "Dysmsapi";
	// 短信API产品域名（接口地址固定，无需修改）
	private static final String DOMAIN = "dysmsapi.aliyuncs.com";
	// 你的accessKeyId
	private static final String ACCESS_KEY_ID = "LTAILjrOJCstkF71";
	// 你的accessKeySecret
	private static final String ACCESS_KEY_SECRET = "okMHlPYlzZWUJYghdx9NJzl0CJiVcI";
	// 短信签名
	private static final String SING_NAME = "CSPTIC网";
	// 短信模版Code(一般都是SMS_********格式)
	private static final String TEMPLETE_CODE = "SMS_132400004";

	/**
	 * 发送短信的方法
	 * 
	 * @param phoneNumber
	 *            手机号码
	 * @param code
	 *            验证码
	 * @return 发送参数
	 * @throws ClientException
	 */
	public static SendSmsResponse sendSms(String phoneNumber, String code) throws ClientException {
		// 设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "50000");
		System.setProperty("sun.net.client.defaultReadTimeout", "50000");
		// 初始化ascClient,暂时不支持多region（请勿修改）
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", ACCESS_KEY_ID,
				ACCESS_KEY_SECRET);
		DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", PRODUCT, DOMAIN);
		IAcsClient acsClient = new DefaultAcsClient(profile);
		// 组装请求对象
		SendSmsRequest request = new SendSmsRequest();
		// 使用post提交
		request.setMethod(MethodType.POST);
		// 必填:待发送手机号。
		request.setPhoneNumbers(phoneNumber);
		// 必填:短信签名-可在短信控制台中找到
		request.setSignName(SING_NAME);
		// 必填:短信模板-可在短信控制台中找到
		request.setTemplateCode(TEMPLETE_CODE);
		// 可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		// 友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,
		// 比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
		request.setTemplateParam("{\"code\":\"" + code + "\"}");
		SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
		return sendSmsResponse;
	}

	/**
	 * 发送短信回调函数，获取发送结果
	 * 
	 * @param response
	 *            发送参数
	 * @return map结果集合
	 */
	public static Map<String, Object> callBackMessage(SendSmsResponse sendSmsResponse) {
		Map<String, Object> map = null;
		if (sendSmsResponse != null) {
			map = new HashMap<>();
			map.put("Code", sendSmsResponse.getCode());
			map.put("Message", sendSmsResponse.getMessage());
			map.put("RequestId", sendSmsResponse.getRequestId());
			map.put("BizId", sendSmsResponse.getBizId());
		}
		return map;
	}

	// public static void main(String[] args) throws ClientException {
	// Map<String, Object> map = callBackMessage(sendSms("18362202126",
	// "661102"));
	// if (map != null) {
	// System.out.println(map.get("Code").toString());
	// System.out.println(map.get("Message").toString());
	// System.out.println(map.get("RequestId").toString());
	// System.out.println(map.get("BizId").toString());
	// }
	// }

}
