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
<body ng-app="main" class="body container-fluid">
	<div id="container-fluid" ng-controller="mainController">
	
		<div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<span ng-bind="city"></span><a href="" data-toggle="modal" data-target="#myModal0">【切换城市】</a>
			</div>
			<!-- 选择城市 -->
			<div class="modal fade" id="myModal0" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">选择城市</h4>
			      </div>
			      <div class="modal-body ">
			       	<div class="form-inline row">
				      	<div class="form-group col-md-6">
					    	<label for="select_province" >省份：</label>
					    	<select class="form-control" id="select_province" ng-model="select_province" 
					      		ng-options="x1.province for x1 in selectProvince" ng-change="changeProvince()">
		                    </select>
					  	</div>
					  	<div class="form-group col-md-6">
					    	<label for="select_city">城市：</label>
					    	<select class="form-control" id="select_city" ng-model="select_city" 
		                    	ng-options="x2.city for x2 in selectCity" >
		                    </select>
					  	</div>
				  	</div>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			        <button type="button" class="btn btn-primary" data-dismiss="modal" ng-click="saveProvinceCity()">保存</button>
			      </div>
			    </div>
			  </div>
			</div>
			
			<!-- 未登录 -->
			<div class="login_out col-xs-offset-7 col-sm-offset-7 col-md-offset-7 col-md-offset-7 
				col-xs-3 col-sm-3 col-md-3 col-lg-3 row" >
				<div class="login col-xs-offset-6 col-sm-offset-6 col-md-offset-6 
					col-md-offset-6 col-xs-2 col-sm-2 col-md-2 col-lg-2">
					<a 	href="/to_login">
						<span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;登录
					</a>
				</div>
				<div class="logout col-xs-2 col-sm-2 col-md-2 col-lg-2">
					<a  href="/to_regist">
						<span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;注册
					</a>
				</div>
			</div>
			<!-- 登录的信息 -->
			<div class="login_info dropdown col-xs-offset-8 col-sm-offset-8 col-md-offset-8 col-md-offset-8 
				col-xs-2 col-sm-2 col-md-2 col-lg-2 row" >
			  	<a class="dropdown-toggle" data-toggle="dropdown"  id="dropdownMenu2" role="button" aria-haspopup="true" aria-expanded="false">
			      {{loginUser.userName}}
			      <span class="caret"></span>
			    </a>
				<ul class="dropdown-menu " aria-labelledby="dropdownMenu2">
					<li><a href="/to_user_center">个人中心</a></li>
				    <li role="separator" class="divider"></li>
				    <li><a href="/logout">退出</a></li>
				</ul>
			</div>
		</div>
		
		<div class="nav_head row">
			<a href="/to_main" >
				<div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
			</a>
			<!--网站导航-->
			<div class="nav-4 col-xs-5 col-sm-5 col-md-5 col-lg-5">
				<ul class="nav nav-tabs nav-justified">
					<li role="presentation" class="active"><a href="/to_main">首页</a></li>
					<li role="presentation"><a href="/to_main_job">兼职招聘</a></li>
					<li role="presentation"><a href="/to_main_resume">求职简历</a></li>
					<li role="presentation"><a href="/to_main_news">网站资讯</a></li>
				</ul>
			</div>
		</div>
		<div class="next row">
			<!--岗位-->
            <div class="top-job col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                col-xs-10 col-sm-10 col-md-10 col-lg-10">
                <div class="panel panel-default">
                    <div class="panel-heading">
                    	热门岗位Top10
                    </div>
                    <table class="table table-job">
                    	<tr ng-repeat="x in jobList">
                    		<td class="ng-cloak col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    			<a href="to_job_company?id={{x.id}}" target="_blank">{{x.jobTitle}}</a>
                    		</td>
                    		<td class="ng-cloak col-xs-4 col-sm-4 col-md-4 col-lg-4">{{x.jobCate}}</td>
                    		<td class="ng-cloak col-xs-2 col-sm-2 col-md-2 col-lg-2">{{x.jobTreat}}元/{{x.treatMethod}}</td>
                    		<td class="ng-cloak col-xs-2 col-sm-2 col-md-2 col-lg-2">{{x.createTime | date:"yyyy-MM-dd"}}</td>
                    	</tr>
					</table>
                </div>
            </div>
            <!--简历-->
            <div class="top-resume col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                col-xs-10 col-sm-10 col-md-10 col-lg-10">
                <div class="panel panel-default">
                    <div class="panel-heading">
                    	热门简历Top10
                    </div>
                    <table class="table table-resume">
                    	<tr ng-repeat="x in resumeList" >
                    		<td class="ng-cloak col-xs-2 col-sm-2 col-md-2 col-lg-2">
                    			<a href="to_resume_preview?id={{x.id}}" target="_blank">{{x.resuName}}</a>
                    		</td>
                    		<td class="ng-cloak col-xs-6 col-sm-6 col-md-6 col-lg-6">
                    			<span ng-repeat="y in x.resumeJobs">{{y.categoryName}}、</span>
                    		</td>
                    		<td class="ng-cloak col-xs-2 col-sm-2 col-md-2 col-lg-2">{{x.education}}</td>
                    		
                    		<td class="ng-cloak col-xs-2 col-sm-2 col-md-2 col-lg-2">{{x.createTime | date:"yyyy-MM-dd"}}</td>
                    	</tr>
					</table>
                </div>
            </div>
		</div>
	</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript" src="../../resource/js/main.js"></script>


</body>
</html>