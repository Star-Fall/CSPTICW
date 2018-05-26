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
<div id="container-fluid" ng-controller="complaintRecordController">
    <!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <span>上海站</span><a href="">【切换城市】</a>
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
                       <th class="col-md-6">投诉的岗位</th>
                       <th class="col-md-2">时间</th>
                       <th class="col-md-2">状态</th>
                       <th class="col-md-2">详情</th>
                   </tr>
                   <tr ng-repeat="x in complaintRecord" >
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
                       		<span class="label label-default" ng-show="x.status==0">未处理</span>
                           <span class="label label-success" ng-show="x.status==1">已处理</span>
                       </td>
                       <td>
                       		<a href="" class="btn" ng-click="detailRecord(x)">详情</a>
                       </td>
                   </tr>
                </table>
            </div>
        </div>
    </div>
	<!-- modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
			    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">详情</h4>
				      </div>
				      <div class="modal-body">
				      	<table class="table" style="text-align: center;" >
				      		<tr>
				      			<td ng-bind="complaintRecordDetail.complaintTitle"></td>
				      		</tr>
				      		<tr>
				      			<td ng-bind="complaintRecordDetail.complaintContent"></td>
				      		</tr>
				      		<tr style="color: red"style="color: red">
				      			<td  ng-bind="complaintRecordDetail.handleResult"></td>
				      		</tr>
						</table>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				      </div>
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
    app.controller('complaintRecordController',function ($scope,$http) {
    	$scope.centerMenu=5;
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
            url:'/get_complaint_record_student',
            method:'get'
        }).success(function(response, status, headers, config){
        	$scope.complaintRecord=response.data;
        })
        
        $scope.detailRecord=function(item){
    		$scope.complaintRecordDetail={};
    		$scope.complaintRecordDetail.complaintTitle=item.complaintTitle;
    		$scope.complaintRecordDetail.complaintContent=item.complaintContent;
    		if(item.handleResult){
    			$scope.complaintRecordDetail.handleResult=item.handleResult;
    		}else{
    			$scope.complaintRecordDetail.handleResult="";
    		}
    		$scope.complaintRecordDetail.status=item.status;
    		//显示
    		$('#myModal').modal('show')
    	}
    	
    });
</script>
</body>
</html>