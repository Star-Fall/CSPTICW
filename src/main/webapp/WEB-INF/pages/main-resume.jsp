<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>首页</title>
	<meta charset="utf-8">
	<link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/main-resume.css">
</head>
<body ng-app="main" class="body container-fluid">
	<div id="container-fluid" ng-controller="mainResumeController">
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
					<li role="presentation" ><a href="/to_main_job">兼职招聘</a></li>
					<li role="presentation"class="active"><a href="/to_main_resume">求职简历</a></li>
					<li role="presentation"><a href="/to_main_news">网站资讯</a></li>
				</ul>
			</div>
			
		</div>
		

		<div class="next row">
            <div class="resume-row col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                col-xs-9 col-sm-9 col-md-9 col-lg-9">
				<!--筛选-->
                <div class="panel panel-default">
                    <div class="panel-body">
						<div class="panel panel-default">
							<table class="table">
								<tr>
									<th class="col-md-1">
										意向
									</th>
									<td class="col-md-11">
										<ul class="list-inline nav nav-pills " style="border-bottom: 1px solid black">
											<li ng-repeat="x in parentCate" role="presentation"
												ng-class="{active: parentCateSelect.categoryNameParent == x.categoryNameParent}">
												<a href="" ng-cloak ng-click="changeParentCate(x.categoryNameParent)">
													{{x.categoryNameParent}}
												</a>
											</li>
										</ul>
										<ul class="list-inline" style="margin-top: 10px;">
											<li ng-repeat="x in childCate" >
												<label class="checkbox-inline">
													<input type="checkbox" ng-click="updateJobCateList($event, x.categoryName)">
													{{x.categoryName}}
												</label>
											</li>
										</ul>
									</td>
								</tr>								
								<tr>
									<th class="col-md-1">学历</th>
									<td class="col-md-11">
										<ul class="list-inline" style="margin-top: 10px;">
											<li>
												<label class="checkbox-inline">
													<input type="checkbox" value="专科" ng-click="updateTreatMethod($event, '专科')">专科
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="本科" ng-click="updateTreatMethod($event, '本科')">本科
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="硕士" ng-click="updateTreatMethod($event, '硕士')">硕士
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="博士及其以上" ng-click="updateTreatMethod($event, '博士及其以上')">博士及其以上
												</label>
											</li>
										</ul>
										
									</td>
									
								</tr>
								<tr>
									<th class="col-md-1">性别</th>
									<td class="col-md-11">
										<ul class="list-inline">
											<li>
												<label class="checkbox-inline">
													<input type="radio" name="gender" value="" ng-model="gender">不限
												</label>
												<label class="checkbox-inline">
													<input type="radio" name="gender" value="男" ng-model="gender">男
												</label>
												<label class="checkbox-inline">
													<input type="radio" name="gender" value="女" ng-model="gender">女
												</label>
												
											</li>
										</ul>
									</td>
								</tr>
								
							</table>
						</div>
						<!--按钮-->
						<div class="panel panel-default">
							<div class="panel-body">
								<button ng-click="submit()" class="btn btn-success">按条件筛选</button>
							</div>
						</div>

                    </div>
                </div>
				<!-- 数据展示 -->
                <div class="resume-panel panel panel-default" ng-repeat="x in resumeList">
                    <div class="panel-body">
                        <!--第一列-->
						<div class="col-md-2">
							<img	ng-src="{{ x.idPhoto?'../../../upfile/student/' + x.idPhoto:'../../resource/images/default-image-user.png'}}"
								 class="img-thumbnail" style="height: 90px;">
						</div>
						<!--第二列-->
						<div class="col-md-6">
							<div class="resu-name col-md-12">
								<a href="to_resume_preview?id={{x.id}}" target="_blank" 
									type="button"> <!-- data-toggle="modal" data-target="#myModal" -->
									{{x.resuName}}
								</a>
							</div>

							<div class="resume-gender col-md-2">性别：</div>
								<div class="resume-gender col-md-1">{{x.gender}}</div>
							<div class="resume-age col-md-2">年龄：</div>
								<div class="resume-age col-md-6">{{x.age}}</div>

							<div class="resume-age col-md-2">学校：</div>
								<div class="resume-age col-md-4">{{x.school}}</div>
							<div class="resume-age col-md-2">专业：</div>
								<div class="resume-age col-md-4">{{x.major}}</div>

							<div class="resume-age col-md-2">求职意向：</div>
								<div class="resume-age col-md-10">
									<span ng-repeat="y in x.resumeJobs">{{y.categoryName}}、</span>
								</div>
						</div>
						<!--第三列-->
						<div class="resume-education col-md-2">
							{{x.education}}
						</div>
						<!--第四列-->
						<div class="resume-time col-md-2">
							{{x.createTime| date:"yyyy-MM-dd"}}
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
    app.controller('mainResumeController',function ($scope,$http) {
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
        	 }else{
        		 $(".login_out").css("display","block");
        		 $(".login_info").css("display","none");
        	 }
        	 
        })
        //初始化数据
        var jsonData={};
    	$scope.gender="";
    	$http({
			url:'/get_resume_list_params2',
    	   	method:'get',
    	   	params:{'jsonData':jsonData}
		}).success(function(response, status, headers, config){
			$scope.resumeList=response.data;
		})
        // //先行业
        $http({
	    	url:'/get_job_category',
		   	method:'get'
	    }).success(function(response, status, headers, config){
	    	//所有主行业
			$scope.parentCate=response.data;
	        //选中的主行业
			$scope.parentCateSelect=$scope.parentCate[0];
	        //主行业的子行业
			$scope.childCate=$scope.parentCateSelect.jobCategoryList;

			$scope.changeParentCate=function (categoryNameParent) {
				for(var i=0;i<$scope.parentCate.length;i++){
				    //主行业里有一样的
				    if($scope.parentCate[i].categoryNameParent==categoryNameParent){
				        //赋值选中的
	                    $scope.parentCateSelect=$scope.parentCate[i];
	                    $scope.childCate=$scope.parentCateSelect.jobCategoryList;
					}
				}
	        }
		});
    	
    	//获取jobCateList
		$scope.resumeJobList=[];
		$scope.updateJobCateList=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.resumeJobList.indexOf(id) == -1)
                $scope.resumeJobList.push(id);
            if(action == 'remove' && $scope.resumeJobList.indexOf(id) != -1)
                $scope.resumeJobList.splice($scope.resumeJobList.indexOf(id), 1);
        }
		
    	//treatMethodList
		$scope.educationList=[];
		$scope.updateTreatMethod=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.educationList.indexOf(id) == -1)
                $scope.educationList.push(id);
            if(action == 'remove' && $scope.educationList.indexOf(id) != -1)
                $scope.educationList.splice($scope.educationList.indexOf(id), 1);
        }
		
		//筛选
        $scope.submit=function () {
        	jsonData={};
            if($scope.resumeJobList.length>0){
                jsonData.resumeJobList=$scope.resumeJobList;
			}
            if($scope.educationList.length>0){
                jsonData.educationList=$scope.educationList;
            }
            if($scope.gender.length>0){
                jsonData.gender=$scope.gender;
            }
            jsonData.province='江苏省';
            jsonData.city='苏州市';
            
            //发请求
            $http({
    			url:'/get_resume_list_params2',
        	   	method:'get',
        	   	params:{'jsonData':jsonData}
    		}).success(function(response, status, headers, config){
    			$scope.resumeList=response.data;
    		})
        }
		
		
    	
		
    })
</script>
</body>
</html>