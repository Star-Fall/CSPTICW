// package com.cspticw.realm;
//
// import org.apache.shiro.authc.AuthenticationException;
// import org.apache.shiro.authc.AuthenticationInfo;
// import org.apache.shiro.authc.AuthenticationToken;
// import org.apache.shiro.authc.SimpleAuthenticationInfo;
// import org.apache.shiro.authc.UsernamePasswordToken;
// import org.apache.shiro.authz.AuthorizationInfo;
// import org.apache.shiro.realm.AuthorizingRealm;
// import org.apache.shiro.subject.PrincipalCollection;
// import org.apache.shiro.util.ByteSource;
// import org.springframework.beans.factory.annotation.Autowired;
//
// import com.cspticw.entity.CompUserInfo;
// import com.cspticw.service.CompUserService;
//
/// **
// * @ClassName: CompanyRealm
// * @author: StarFall
// * @date: 2018年4月9日 下午9:56:18
// * @Description:企业Realm
// */
// public class CompanyRealm extends AuthorizingRealm {
// @Override
// public String getName() {
// return "CompanyRealm";
// }
//
// @Autowired
// private CompUserService compUserService;
//
// /**
// * 认证
// */
// @Override
// protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken
// token)
// throws AuthenticationException {
// // 1. 把 AuthenticationToken 转换为 UsernamePasswordToken
// UsernamePasswordToken upToken = (UsernamePasswordToken) token;
// String userName = upToken.getUsername();
// CompUserInfo compUser = compUserService.selectByUserName(userName);
// if (compUser == null) {
// return null;
// // throw new UnknownAccountException("用户不存在!");
// }
// String password = compUser.getPassword();
// String salt = userName;
// SimpleAuthenticationInfo simpleAuthenticationInfo = new
// SimpleAuthenticationInfo(compUser,
// password, ByteSource.Util.bytes(salt), this.getName());
// return simpleAuthenticationInfo;
// }
//
// /**
// * 授权
// */
// @Override
// protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection
// principals) {
// // TODO Auto-generated method stub
// return null;
// }
//
// }
