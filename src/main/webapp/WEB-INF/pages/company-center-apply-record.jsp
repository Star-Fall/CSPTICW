<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>简历应聘</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/student-center-apply-record.css">
</head>
<body ng-app="companyCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="applyRecordController">
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
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href="/to_user_center">用户中心</a>&nbsp;&nbsp;/&nbsp;&nbsp;简历应聘
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container">
       
       <%@include file="center-menu-company.jsp" %>
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <div class="panel panel-default" >
                <div class="panel-heading">
                    <!--选择岗位-->
                    <div class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-12">
                                <!--ng-options="x.jobTitle for x in jobList" ng-change="changeJob(x.id)"-->
                                <select class="form-control" id="select_job" ng-model="select_job" ng-change="changeJob()">
                                    <option value="">——所有岗位——</option>
                                    <option ng-repeat="x in jobList" value="{{x.id}}">{{x.jobTitle}}</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <!--整体body-->
                <div class="panel-body">

                    <ul class="nav nav-pills nav-justified">

                        <li role="presentation" ng-click="changeStatus(0)" ng-class="{'0':'active'}[statusGlobal]">
                            <a  href="">未处理</a>
                        </li>
                        <li role="presentation" ng-click="changeStatus(1)" ng-class="{'1':'active'}[statusGlobal]">
                            <a href="">已接收</a>
                        </li>
                        <li role="presentation" ng-click="changeStatus(2)" ng-class="{'2':'active'}[statusGlobal]">
                            <a href="#">不合适</a>
                        </li>
                        <li role="presentation" ng-click="changeStatus(-1)" ng-class="{'-1':'active'}[statusGlobal]" >
                            <a  href="">全部</a>
                        </li>
                    </ul>
                </div>
                <table class="table table-hover table-list" >
                   <tr>
                       <th class="col-md-4">简历名称</th>
                       <th class="col-md-4">投递的岗位</th>
                       <th class="col-md-2">时间</th>
                       <th class="col-md-2">状态</th>
                   </tr>
                    <tr ng-repeat="x in applyRecord" >
                        <td class="col-md-4">
                            <a href="to_resume_preview?id={{x.resumeId}}" class="btn" target="_blank" 
                               ng-class="{'2':'disabled','1':'disabled'}[x.resumeStatus]">
                                <span class="badge" ng-show="x.resumeStatus==2">已删除</span>
                               	<span class="badge" ng-show="x.resumeStatus==1">未公开</span>
                                {{x.resuName}}
                            </a>
                        </td>
                        <td class="col-md-4">
                            <a href="to_job_company?id={{x.compJobId}}" class="btn" target="_blank" 
                               ng-class="{'2':'disabled','1':'disabled'}[x.isAvailable]" >
                                <span class="badge" ng-show="x.isAvailable==2">已删除</span>
                                <span class="badge" ng-show="x.isAvailable==1">暂不启用</span>
                                {{x.jobTitle}}
                            </a>
                        </td>
                        <td class="col-md-2">{{x.createTime | date:'yyyy-MM-dd'}}</td>
                        <td class="col-md-2">
                            <div ng-show="x.status==0">
                                <button class="btn btn-success" ng-click="updateStatus(x.id,1)">同意</button>
                                <button class="btn btn-danger" ng-click="updateStatus(x.id,2)">拒绝</button>
                            </div>
                            <span class="label label-success" ng-show="x.status==1">已接收</span>
                            <span class="label label-danger" ng-show="x.status==2">不合适</span>
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
    var app=angular.module('companyCenter',[]);
    app.controller('applyRecordController',function ($scope,$http) {
    	$scope.centerMenu=3;
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
        //定义全局status
        $scope.statusGlobal=0;
        //请求我的所有可用岗位
		$http({
			url:'/get_mycomp_job_list',
    	   	method:'get'
		}).success(function(response, status, headers, config){
			$scope.jobList=response.data;				
			if($.isEmptyObject($scope.jobList)){
				alert("先去发布岗位吧！");
				return;
			}				
		})
		
		//根据 岗位和状态查找数据
		//所有岗位的未处理
		$http({
            url:'/get_company_apply_record',
            method:'get',
            params:{'status':$scope.statusGlobal}
        }).success(function(response, status, headers, config){
        	$scope.applyRecord=response.data;
        })
        /**
         * 改变岗位
         */
        $scope.changeJob=function () {
			var jsonData1={};
            //状态
            if($scope.statusGlobal!=-1){
            	jsonData1.status=$scope.statusGlobal;
            }
			if($scope.select_job){
				jsonData1.jobId=$scope.select_job;
			}
			//发请求
            $http({
                url:'/get_company_apply_record',
                method:'get',
                params:jsonData1
            }).success(function(response, status, headers, config){
            	$scope.applyRecord=response.data;
            })
        }

        /**
         * 改变状态
         */
        $scope.changeStatus=function (status) {
            $scope.statusGlobal=status;
            var jsonData={};
            //状态
            if($scope.statusGlobal!=-1){
                jsonData.status=$scope.statusGlobal;
            }
			if($scope.select_job){
				jsonData.jobId=$scope.select_job;
			}
			//发请求
            $http({
                url:'/get_company_apply_record',
                method:'get',
                params:jsonData
            }).success(function(response, status, headers, config){
            	$scope.applyRecord=response.data;
            })
        }

        /**
         * 操作
         */
        $scope.updateStatus=function (id,status) {
        	//
    		if(!window.confirm("确认操作?")){
    			return;
    		}
        	var jsonData2={};
        	jsonData2.recordId=id;
        	jsonData2.status=status;
        	$http({
                url:'/update_apply_record',
                method:'post',
                data:JSON.stringify(jsonData2)
            }).success(function(response, status, headers, config){
            	if(response.msg){
            		var jsonData3={};
                    //状态
                    if($scope.statusGlobal!=-1){
                    	jsonData3.status=$scope.statusGlobal;
                    }
        			if($scope.select_job){
        				jsonData3.jobId=$scope.select_job;
        			}
        			//发请求
                    $http({
                        url:'/get_company_apply_record',
                        method:'get',
                        params:jsonData3
                    }).success(function(response, status, headers, config){
                    	$scope.applyRecord=response.data;
                    })
            	}else{
            		alert("操作未成功");
            	}
            })
        }

    });

</script>
</body>
</html>