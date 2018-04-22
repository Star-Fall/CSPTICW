package com.cspticw.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.cspticw.entity.CompUserInfo;
import com.cspticw.entity.StuUserInfo;
import com.cspticw.service.CompUserService;
import com.cspticw.service.StuUserService;
import com.cspticw.util.tools.Constants;

/**
 * @ClassName: CompoundRealm
 * @author: StarFall
 * @date: 2018年4月22日 下午7:53:25
 * @Description:复合Realm
 */
public class CompoundRealm extends AuthorizingRealm {

	@Override
	public String getName() {
		return "CompoundRealm";
	}

	@Autowired
	private CompUserService compUserService;
	@Autowired
	private StuUserService stuUserService;

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		// 1. 把 AuthenticationToken 转换为 UsernamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String newUserName = upToken.getUsername();
		String userName = newUserName.split("-")[0];
		String loginRole = newUserName.split("-")[1];
		SimpleAuthenticationInfo simpleAuthenticationInfo = null;
		if (Constants.STUDENT_USER.equals(loginRole)) {
			// 学生用户
			StuUserInfo stuUser = stuUserService.selectByUserName(userName);
			if (stuUser == null) {
				throw new UnknownAccountException("用户不存在!");
			}
			String password = stuUser.getPassword();
			String salt = userName;
			simpleAuthenticationInfo = new SimpleAuthenticationInfo(stuUser, password,
					ByteSource.Util.bytes(salt), this.getName());
		} else if (Constants.COMPANY_USER.equals(loginRole)) {
			// 企业用户
			CompUserInfo compUser = compUserService.selectByUserName(userName);
			if (compUser == null) {
				throw new UnknownAccountException("用户不存在!");
			}
			String password = compUser.getPassword();
			String salt = userName;
			simpleAuthenticationInfo = new SimpleAuthenticationInfo(compUser, password,
					ByteSource.Util.bytes(salt), this.getName());
		}

		return simpleAuthenticationInfo;
	}

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}
}
