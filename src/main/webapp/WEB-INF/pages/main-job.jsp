<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
	<meta charset="utf-8">
	<link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/main-job.css">
</head>
<body ng-app="main" class="body container-fluid">
	<div id="container-fluid" ng-controller="mainJobController">
		<div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<span>上海站</span><a href="#">【切换城市】</a>
			</div>
			
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
			<a href="/to_main">
				<div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
			</a>
			<!--网站导航-->
			<div class="nav-4 col-xs-5 col-sm-5 col-md-5 col-lg-5">
				<ul class="nav nav-tabs nav-justified">
					<li role="presentation" ><a href="/to_main">首页</a></li>
					<li role="presentation" class="active"><a href="/to_main_job">兼职招聘</a></li>
					<li role="presentation"><a href="/to_main_resume">求职简历</a></li>
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
            <div class="job-row col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                col-xs-9 col-sm-9 col-md-9 col-lg-9">
                <div class="panel panel-default">
                    <div class="panel-body">
                        筛选条件
                    </div>
                </div>

                <div class="job-panel panel panel-default" ng-repeat="x in jobList">
                    <div class="panel-body">
                        <!--第一行-->
                        <div class="job-title col-md-10">
                            <a href="to_job_company?id={{x.id}}" target="_blank"  
                            >{{x.jobTitle}} </a>
                            <!--ng-click="detailJob(x.id)"  data-toggle="modal" data-target="#myModal"  -->
                        </div>
                        <div class="col-md-2">{{x.createTime | date:"yyyy-MM-dd"}}</div>
                        <!--第二行-->
                        <div class=" col-md-7">
                            <div class="job-personNum col-md-2">招聘人数：</div>
                            <div class="job-personNum col-md-2">{{x.personNum}}人</div>

                            <div class="job-cate col-md-2">兼职类别：</div>
                            <div class="job-cate col-md-6">{{x.jobCate}}</div>

                            <div class="job-company col-md-2">公司：</div>
                            <div class="job-companycol-md-6">{{x.company}}</div>
                        </div>
                        <div class="col-md-3">
                            <div class="job-treat col-md-2">{{x.jobTreat}}</div>
                            <div class="job-treatMethod col-md-4">元/{{x.treatMethod}}</div>
                            <div class="job-payMethod col-md-4">{{x.payMethod}}</div>
                        </div>
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
							<h4 class="modal-title" id="myModalLabel">岗位详情</h4>
						</div>
						<div class="modal-body row">
							<div class=" job-modal-body col-md-8 col-md-offset-2">

								<div class="modal-jobTitle col-md-12">{{jobDetail.jobTitle}}</div>
								<div class="col-md-12">
									<div class="modal-jobTreat col-md-2">{{jobDetail.jobTreat}}￥</div>
									<div class="modal-treatMethod col-md-2">/{{jobDetail.treatMethod}}</div>
									<div class="modal-payMethod col-md-2">{{jobDetail.payMethod}}</div>
									<div class="modal-personNum col-md-2">招{{jobDetail.personNum}}人</div>
								</div>
								<div class="col-md-12">
									<div class="modal-jobPlace-l col-md-3">工作地点：</div>
									<div class="modal-jobPlace col-md-9">
										{{jobDetail.jobPlace}}
									</div>
								</div>
								<div class="col-md-12">
									<div class="modal-jobCate-l col-md-3">岗位类别：</div>
									<div class="modal-jobCate col-md-9">
										{{jobDetail.jobCate}}
									</div>
								</div>
								<div class="col-md-12">
									<div class="modal-jobRequire-l col-md-3">
										工作要求：
									</div>

									<div class="modal-jobRequire col-md-9 ">
										{{jobDetail.jobRequire}}
									</div>
								</div>
								<div class="col-md-12">
									<div class="modal-jobContent-l col-md-3">
										工作内容：
									</div>
									<div class="modal-jobContent col-md-9 ">
										{{jobDetail.jobContent}}
									</div>
								</div>

								<div class="col-md-12">
									<div class="modal-jobRequire-l col-md-3">联系方式：</div>
									<div class="modal-jobRequire col-md-9 ">
										<footer>
											<strong>{{jobDetail.contactName}}：</strong>
											<cite title="手机号码">
												{{jobDetail.contactPhone}}
											</cite>
										</footer>
									</div>

								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-info" ng-click="chooseResume(jobDetail.id)" 
								data-toggle="modal" >投递简历</button>
							<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>


			<!-- Modal -->
			<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">选择简历</h4>
			      </div>
			      <div class="modal-body">
			        	<form class="form-horizontal">
			        	<div class="form-group">
						    <label for="select_resume" class="col-sm-3 control-label">选择简历：</label>
						    <div class="col-sm-9">
						   	 <!-- 简历选择框 -->
						      <select class="form-control" id="select_resume" ng-model="select_resume"
                                      ng-options="x.resuName for x in resumeList">
                              </select>
						    </div>
						  </div>
			        	</form>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			        <button type="button" class="btn btn-primary" ng-click="resumeToJob()">确定</button>
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
    var app=angular.module('main',[]);
    app.controller('mainJobController',function ($scope,$http) {
    	//首先请求用户的数据
    	$http({
            url:'/get_login_user',
            method:'get'
        }).success(function(response, status, headers, config){
        	//已登录
        	 if(response.data){
        		 $(".login_out").css("display","none");
        		 $(".login_info").css("display","block");
        		 
        		 $scope.loginUser=response.data;
        		 console.log($scope.loginUser)
        	 }else{
        		 $(".login_out").css("display","block");
        		 $(".login_info").css("display","none");
        	 }
        	 
        })
    	$scope.chooseJobId="";
    	$http({
			url:'/get_comp_job_params',
    	   	method:'get'
		}).success(function(response, status, headers, config){
			$scope.jobList=response.data;
		})
		
		$scope.jobDetail={};
		$scope.detailJob=function (id) {
            for(var i=0;i<$scope.jobList.length;i++){
                if($scope.jobList[i].id==id){
                    $scope.jobDetail=$scope.jobList[i];
					return;
                }
            }
        }
		//选择简历
		$scope.chooseResume=function(id){
			$scope.chooseJobId=id;
			//先获取我的简历
			$http({
				url:'/get_myresume_list',
	    	   	method:'get'
			}).success(function(response, status, headers, config){
				if(response.error){
					alert("请登录大学生用户！")
					return;
				}				
				$scope.resumeList=response.data;				
				if($.isEmptyObject($scope.resumeList)){
					alert("先去填写简历吧！");
					return;
				}else{
					$scope.select_resume=$scope.resumeList[0];
					$("#myModal1").modal('show');
				}				
			})
		}
		//投递
		$scope.resumeToJob=function(){
			var jsonData={};
			jsonData.resumeId=$scope.select_resume.id;
			jsonData.jobId=$scope.chooseJobId;
			$http({
				url:'/resume_to_job',
	    	   	method:'post',
	    	   	data:JSON.stringify(jsonData)
			}).success(function(response, status, headers, config){
				if(response.msg){
					alert("投递成功！");
					$("#myModal1").modal('hide');
					$("#myModal").modal('hide');
				}else if(response.error){
					if("5003"==response.error){
						alert("十天内不可重复投递");
						$("#myModal1").modal('hide');
						$("#myModal").modal('hide');
					}				
				}else{
					alert("系统错误");
					$("#myModal1").modal('hide');
					$("#myModal").modal('hide');
				}
			})
			
		}
        
    })
</script>
</body>
</html>