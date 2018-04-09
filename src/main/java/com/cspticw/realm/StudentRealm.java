package com.cspticw.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.cspticw.entity.StuUserInfo;
import com.cspticw.service.StuUserService;

/**
 * @ClassName: StudentRealm
 * @author: StarFall
 * @date: 2018年4月9日 下午9:56:37
 * @Description:
 */
public class StudentRealm extends AuthorizingRealm {

	@Autowired
	private StuUserService stuUserService;

	@Override
	public String getName() {
		return "StudentRealm";
	}

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		// 1. 把 AuthenticationToken 转换为 UsernamePasswordToken
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String userName = upToken.getUsername();
		StuUserInfo stuUser = stuUserService.selectByUserName(userName);
		if (stuUser == null) {
			return null;
			// throw new UnknownAccountException("用户不存在!");
		}
		String password = stuUser.getPassword();
		String salt = userName;
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(stuUser,
				password, ByteSource.Util.bytes(salt), this.getName());
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
