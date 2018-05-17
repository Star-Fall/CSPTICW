<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>企业信息认证</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/company-center-certi.css">
</head>
<style>
	.table-list th{
    text-align: center;
}
.table-list td{
    text-align: center;
    vertical-align: middle!important;
}
</style>
<body ng-app="companyCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="jobListController">
<!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <span>上海站</span><a href="#">【切换城市】</a>
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
        <div class="nav-path col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
            用户中心
        </div>
    </div>
<!--主体-->
    <div class="center-body row container" >
        <!--菜单-->
        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!--信息-->
            <a href="/to_user_center" class="left-nav-one list-group-item ">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业认证
            </a>
            <div class="left-nav-zhe " >
                <a href="/to_user_center" class="left-nav-module-child list-group-item <!--active-->">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    认证信息
                </a>
            </div>
            <!--简历-->
            <a href="/to_comp_job_list" class="left-nav-one list-group-item active">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的岗位
            </a>
            <div class="left-nav-zhe" style="display: block;">
                <a href="/to_comp_job" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布岗位
                </a>
                <a href="/to_comp_job_list" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    岗位列表
                </a>
            </div>
            <!--简历投递-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历应聘
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    简历列表
                </a>
            </div>
            <!--主动招聘-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的招聘
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    招聘记录
                </a>
            </div>
            <!--收藏-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的收藏
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收藏记录
                </a>
            </div>
            <!--投诉记录-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的投诉
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投诉记录
                </a>
            </div>
        </div>

        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            
            <!--认证表单-->
            <div class="row sch-cert-form">
                <!--面板-->
                <div class="sch-cert-form-panel panel panel-default" >
                    <div class="panel-heading">
                        请填写认证信息
                    </div>
                    <div class="panel-body">

                    </div>
                    <table class="table table-hover table-list" >
                        <tr>
	                       <th class="col-xs-3 col-sm-3 col-md-3 col-lg-3">岗位名称</th>
	                       <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">发布时间</th>
	                       <th class="col-xs-1 col-sm-1 col-md-1 col-lg-1">热度</th>
	                       <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">启用</th>
	                       <th class="col-xs-4 col-sm-4 col-md-4 col-lg-4">操作</th>
                        </tr>
                        <tr ng-repeat="x in jobList" >
                            <td class="ng-cloak">{{x.jobTitle}}</td>
                            <td class="ng-cloak">{{x.createTime | date:"yyyy-MM-dd HH:mm:ss"}}</td>
                            <td class="ng-cloak">{{x.resuHot}}</td>
                            <td class="ng-cloak">
                                <label class="radio-inline">
                                    <input type="radio"  name="{{x.id+ 'isAvailable'}}" ng-checked="x.isAvailable == 0" ng-click="changeRadio(0,x.id)">
                                    公开
                                </label>
                                <label class="radio-inline">
                                    <input type="radio"  name="{{x.id+ 'isAvailable'}}" ng-checked="x.isAvailable == 1" ng-click="changeRadio(1,x.id)">
                                    保密
                                </label>
                            </td>
                            <td class="ng-cloak">
                                <a class="btn btn-link" ng-click="modify(x.id)">
                                    <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                    修改
                                </a>
                                <a class="btn btn-link" ng-click="delete(x.id)">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    删除
                                </a>
                                <a class="btn btn-link" ng-click="detail(x.id)" type="button" data-toggle="modal" data-target="#myModal">
                                    <span class=" glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                                    预览
                                </a>
                            </td>
                        </tr>
                    </table>

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

    var app=angular.module('companyCenter',[]);
    app.controller('jobListController',function ($scope,$http) {
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
    	
    	//岗位列表
    	$scope.jobList=[];
    	//请求数据
    	$http({
        	url:'/get_comp_job_list',
    	   	method:'get'    		
    	}).success(function(response, status, headers, config){
    		$scope.jobList=response.data;
    	});  
    	//单个详情
    	$scope.jobDetail={};
    })
</script>
</body>
</html>