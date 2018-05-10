<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>学生用户中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="../../resource/css/common.css">
<link rel="stylesheet" type="text/css"
	href="../../resource/css/student-center.css">
</head>
<body ng-app="" class="body container-fluid">
	<div id="container-fluid">
		<!--登录条-->
		<div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<span>上海站</span><a href="#">【切换城市】</a>
			</div>
			<!--登录注册部分-->
			<div
				class="login_out col-xs-offset-8 col-sm-offset-8 col-md-offset-8  col-md-offset-8 col-xs-2 col-sm-2 col-md-2 col-lg-2">

				用户信息</div>
		</div>
		<!--log条-->
		<div class="nav_head row">
			<!--log图片-->
			<a href="#">
				<div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
			</a>
			<div class="nav-path col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<a href="#">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp; 用户中心
			</div>
		</div>
		<!--主体-->
		<div class="center-body row container">
			<!--菜单-->
			<div
				class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<!--信息-->
				<a href="" class="left-nav-one list-group-item active"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 账户管理
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item "> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 修改手机
					</a> <a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 修改密码
					</a>
				</div>
				<!--简历-->
				<a href="/to_my_resume_list" class="left-nav-one list-group-item "> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 简历中心
				</a>
				<div class="left-nav-zhe">
					<a href="/to_student_center_resume" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 发布简历
					</a> <a href="/to_my_resume_list" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 我的简历
					</a>
				</div>
				<!--投递-->
				<a href="" class="left-nav-one list-group-item"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 简历投递
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 投递记录
					</a>
				</div>
				<!--邀请-->
				<a href="" class="left-nav-one list-group-item"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 兼职邀请
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 收到的邀请
					</a>
				</div>
				<a href="" class="left-nav-one list-group-item"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 我的收藏
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 收藏的企业
					</a>
				</div>
				<a href="" class="left-nav-one list-group-item"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 我的投诉
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 投诉记录
					</a>
				</div>
				<a href="" class="left-nav-one list-group-item"> <span
					class="glyphicon glyphicon-expand">&nbsp;</span> 系统消息
				</a>
				<div class="left-nav-zhe">
					<a href="" class="left-nav-module-child list-group-item"> <span
						class="glyphicon glyphicon-hand-right">&nbsp;</span> 收到的消息
					</a>
				</div>
			</div>

			<!--内容-->
			<div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">

			</div>
		</div>
	</div>

	<script type="text/javascript"	src="../../resource/js/jquery-3.2.1.min.js"></script>
	<script src="../../resource/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../../resource/js/angular.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.left-nav-one').bind('click', function() {
				$('.left-nav-one').removeClass('active');
				$(this).addClass('active');
				if ($(this).next('.left-nav-zhe').css('display') == 'none') {
					$('.left-nav-zhe').slideUp(200);
					$(this).next('.left-nav-zhe').slideDown(200);
				} else {
					$(this).next('.left-nav-zhe').slideUp(200);
				}
			});
		});
	</script>
</body>
</html>