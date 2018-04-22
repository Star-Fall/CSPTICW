<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
	<meta charset="utf-8">
	<link href="../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/main.css">
</head>
<body ng-app="" class="body container-fluid">
	<div id="container-fluid">
		<div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<span>上海站</span><a href="#">【切换城市】</a>
			</div>
			<c:if test="${empty loginUser }">
				<div class="login_out col-xs-offset-7 col-sm-offset-7 col-md-offset-7 col-md-offset-7 col-xs-3 col-sm-3 col-md-3 col-lg-3 row">
					<div class="login col-xs-offset-6 col-sm-offset-6 col-md-offset-6 col-md-offset-6 col-xs-2 col-sm-2 col-md-2 col-lg-2">
						<a 	href="/to_login"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;登录</a>
					</div>
					<div class="logout col-xs-2 col-sm-2 col-md-2 col-lg-2">
						<a  href="/to_regist"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;注册</a>
					</div>
				</div>
			</c:if> 
			<c:if test="${not empty loginUser }">
				<!-- 登录的信息 -->
				<div class="login_info dropdown col-xs-offset-8 col-sm-offset-8 col-md-offset-8 col-md-offset-8 
						col-xs-2 col-sm-2 col-md-2 col-lg-2 row">
				  	<a class="dropdown-toggle" data-toggle="dropdown"  id="dropdownMenu2" role="button" aria-haspopup="true" aria-expanded="false">
				      ${loginUser.userName }
				      <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu " aria-labelledby="dropdownMenu2">
						<li><a href="/to_user_center">个人中心</a></li>
					    <li role="separator" class="divider"></li>
					    <li><a href="/logout">退出</a></li>
					</ul>
				</div>
			</c:if>
			
		</div>
		<div class="nav_head row">
			<a href="to_main">
				<div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
			</a>
			<!--网站导航-->
			<div class="nav-4 col-xs-5 col-sm-5 col-md-5 col-lg-5">
				<ul class="nav nav-tabs nav-justified">
					<li role="presentation" class="active"><a href="to_main">首页</a></li>
					<li role="presentation"><a href="#">兼职招聘</a></li>
					<li role="presentation"><a href="#">求职简历</a></li>
					<li role="presentation"><a href="#">网站资讯</a></li>
				</ul>
			</div>
			<!--搜索框-->
			<div class="search form-inline col-xs-3 col-sm-3 col-md-3 col-lg-3">
				<div class="form-group">
					<input type="text" name="job" class="form-control">
					<button type="button" class="btn btn-primary">搜索</button>
				</div>						
			</div>
		</div>
		

		<div class="next row">
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
			  <div class="col-md-1">.col-md-1</div>
		</div>
	</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
</body>
</html>