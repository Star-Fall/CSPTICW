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
        <%@include file="center-menu-company.jsp" %>
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            
            <!--认证表单-->
            <div class="row sch-cert-form">
                <!--面板-->
                <div class="sch-cert-form-panel panel panel-default" >
                    <div class="panel-heading">
                        	岗位列表
                    </div>
                    <div class="panel-body">

                    </div>
                    <table class="table table-hover table-list" >
                        <tr>
	                       <th class="col-md-3 ">岗位名称</th>
	                       <th class="col-md-2 ">发布时间</th>
	                       <th class="ol-md-1 ">热度</th>
	                       <th class="col-md-2 ">启用</th>
	                       <th class="col-md-4 ">操作</th>
                        </tr>
                        <tr ng-repeat="x in jobList | orderBy: x.createTime:'desc'" >
                            <td class="ng-cloak">{{x.jobTitle}}</td>
                            <td class="ng-cloak" style="padding: 0px">{{x.createTime | date:"yyyy-MM-dd HH:mm:ss"}}</td>
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
                                <a class="btn btn-link" ng-click="deleteJob(x.id)">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                   	 删除
                                </a>
                                <a class="btn btn-link" ng-click="detail(x.id)" type="button" data-toggle="modal" 
                                data-target="#myModal">
                                    <span class=" glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                                    	详情
                                </a>
                            </td>
                        </tr>
                    </table>

                </div>
            </div>

        </div>
        <!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		    <div class="modal-dialog modal-lg" role="document">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		                    <span aria-hidden="true">&times;</span>
		                </button>
		                <h4 class="modal-title" style="text-align: center; font-weight: bold;" id="myModalLabel">
		                	岗位详情
		                </h4>
		            </div>
		            <div class="modal-body">
		            	<table class="table" style="word-wrap:break-word;word-break:break-all;">
		            		<tr>
		            			<th class="col-md-3">岗位名称</th>
		            			<td class="col-md-3">{{jobDetail.jobTitle}}</td>
		            			<th class="col-md-3">岗位类别</th>
		            			<td class="col-md-3">{{jobDetail.jobCate}}</td>
		            		</tr>
		            		<tr>
		            			<th>待遇额度</th>
		            			<td>{{jobDetail.jobTreat}}元</td>
		            			<th>待遇方式</th>
		            			<td>{{jobDetail.treatMethod}}</td>
		            		</tr>
		            		<tr>
		            			<th>结算方式</th>
		            			<td>{{jobDetail.payMethod}}</td>
		            			<th>招聘人数</th>
		            			<td>{{jobDetail.personNum}}人</td>
		            		</tr>
		            		<tr>
		            			<th class="col-md-3">工作地点</th>
		            			<td colspan="3" class="col-md-9">{{jobDetail.jobPlace}}</td>
		            		</tr>
		            		<tr>
		            			<th>工作内容</th>
		            			<td colspan="3">{{jobDetail.jobContent}}</td>
		            		</tr>
		            		<tr>
		            			<th>工作要求</th>
		            			<td colspan="3">{{jobDetail.jobRequire}}</td>
		            		</tr>
		            		<tr>
		            			<th>联系人</th>
		            			<td>{{jobDetail.contactName}}</td>
		            			<th>手机号</th>
		            			<td>{{jobDetail.contactPhone}}人</td>
		            		</tr>
						</table>		                
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
		            </div>
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
    	$scope.centerMenu=2;
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
    	
    	//改变公开
		$scope.changeRadio=function (val,id) {
        	//找到该简历
        	var jobItem={};
        	for(var i=0;i<$scope.jobList.length;i++){
                if($scope.jobList[i].id==id){
                	jobItem=$scope.jobList[i];
                	if(jobItem.isAvailable!=val){
                		$scope.jobList[i].isAvailable=val;
                		//请求更新
                		$http({
                			url:'/update_company_job',
                			method:'post',
                			data: JSON.stringify($scope.jobList[i])
                		}).success(function(response, status, headers, config){

                		})              		
                	}else{
                		return;
                	}
                	
                }
            }
        };
        
        //删除
        $scope.deleteJob=function(id){
        	if(!window.confirm("确定删除吗?")){
    			return;
    		}
        	$http({
    			url:'/delete_company_job',
    			method:'post',
    			data: id
    		}).success(function(response, status, headers, config){
				if(response.msg){
					$http({
			        	url:'/get_comp_job_list',
			    	   	method:'get'    		
			    	}).success(function(response, status, headers, config){
			    		$scope.jobList=response.data;
			    	});
				}else{
					alert("删除失败");
				}
    		})
        }
    	
    	//详情
    	$scope.detail=function(id){
    		for(var i=0;i<$scope.jobList.length;i++){
                if($scope.jobList[i].id==id){
                    $scope.jobDetail=$scope.jobList[i];
                    return;
                }
            }
    	}
    	
    })
</script>
</body>
</html>