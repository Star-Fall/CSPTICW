<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>我的收藏</title>
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/student-center-apply-record.css">
</head>
<body ng-app="studentCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="collectRecordController">
    <!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
           <!-- <span>上海站</span><a href="">【切换城市】</a> -->
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
    <!--log条-->
    <div class="nav_head row">
        <!--log图片-->
        <a href="/to_main">
            <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
        </a>
        <div class="nav-path col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href="/to_my_resume_list">简历中心</a>&nbsp;&nbsp;/&nbsp;&nbsp;我的收藏 
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container">
    	<%@include file="center-menu-student.jsp" %>
  
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <div class="panel panel-default" >
                <div class="panel-heading">
                  	 收藏记录 
                </div>
                
                <table class="table table-hover table-list" style="word-break:break-all; word-wrap:break-all;">
                   <tr>
                       <th class="col-md-6">收藏的岗位</th>
                       <th class="col-md-3">时间</th>
                       <th class="col-md-3">删除</th>
                   </tr>
                   <tr ng-repeat="x in collectRecord" >
                       <td class="col-md-4 ">
                           <a href="to_job_company?id={{x.jobId}}" class="btn" target="_blank" 
                              ng-class="{'2':'disabled','1':'disabled'}[x.isAvailable]" >
                               <span class="badge" ng-show="x.isAvailable==2">已删除</span>
                               <span class="badge" ng-show="x.isAvailable==1">暂不启用</span>
                               {{x.jobTitle}}
                           </a>
                       </td>
                       <td>{{x.createTime | date:'yyyy-MM-dd'}}</td>
                       <td>
                       		<a href="" class="btn" ng-click="deleteRecord(x.id)">取消收藏</a>
                       </td>
                   </tr>
                </table>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript">
    $(function () {
        $('.left-nav-one').bind('click', function () {
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
    var app=angular.module('studentCenter',[]);
    app.controller('collectRecordController',function ($scope,$http) {
    	$scope.centerMenu=4;
    	//首先请求用户的数据
    	$http({
            url:'/get_login_user',
            method:'get'
        }).success(function(response, status, headers, config){
        	//已登录
        	 if(response.data){
        		 $(".login_info").css("display","block");
        		 $scope.loginUser=response.data;
        	 }else{
        		 $(".login_info").css("display","none");
        	 }
        	 
        })
    	//发请求 所有数据
    	$http({
            url:'/get_student_collect_record',
            method:'get'
        }).success(function(response, status, headers, config){
        	$scope.collectRecord=response.data;
        })
        //删除
        $scope.deleteRecord=function(id){
    		if(!window.confirm("确认取消收藏?")){
    			return;
    		}
    		$http({
                url:'/delete_collect_record',
                method:'post',
                data:{'recordId':id}
            }).success(function(response, status, headers, config){
            	if(response.msg){
            		//重新发请求
            		$http({
                        url:'/get_student_collect_record',
                        method:'get'
                    }).success(function(response, status, headers, config){
                    	$scope.collectRecord=response.data;
                    })
            	}else{
            		alert("操作失败")
            	}
            })
    	}        
    });
</script>
</body>
</html>