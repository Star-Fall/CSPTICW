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
					<li role="presentation"><a href="/to_main_news">网站资讯</a></li>
				</ul>
			</div>
			
		</div>
		

		<div class="next row">
            <div class="job-row col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                col-xs-9 col-sm-9 col-md-9 col-lg-9">
				<!--筛选-->
                <div class="panel panel-default">
                    <div class="panel-body">
						<div class="panel panel-default">
							<table class="table">
								<tr>
									<th class="col-md-1">
										行业：
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
									<th class="col-md-1">地区</th>
									<td class="col-md-11">
										<ul class="list-inline" style="margin-top: 10px;">
											<li ng-repeat="x in placeDate" >
												<label class="checkbox-inline">
													<input type="checkbox" ng-click="updateJobPlaceList($event, x.country)">
													{{x.country}}
												</label>
											</li>
										</ul>
									</td>
								</tr>

								<tr>
									<th class="col-md-1">待遇</th>
									<td class="col-md-11">
										<div class="col-md-12" style="padding: 0px;">
											<div class="form-group">
												<div class="col-md-2">
													<input type="number" class="form-control" id="start" ng-model="start">
												</div>
												<div class="col-md-1">
													<label class="control-label">——</label>
												</div>
												<div class="col-md-2">
													<input type="number" class="form-control" id="end" ng-model="end">
												</div>
											</div>
										</div>

										<ul class="list-inline" style="margin-top: 50px;">
											<li>
												<label class="checkbox-inline">
													<input type="checkbox" value="小时" ng-click="updateTreatMethod($event, '小时')">小时
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="天" ng-click="updateTreatMethod($event, '天')">天
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="月" ng-click="updateTreatMethod($event, '月')">月
												</label>
											</li>
										</ul>
										<ul class="list-inline">
											<li>
												<label class="checkbox-inline">
													<input type="checkbox" value="当日结" ng-click="updatePayMethod($event, '当日结')">当日结
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="次日结" ng-click="updatePayMethod($event, '次日结')">次日结
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="月结" ng-click="updatePayMethod($event, '月结')">月结
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="完工结" ng-click="updatePayMethod($event, '完工结')">完工结
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
                            <div class="job-company col-md-6">
                            	{{x.compName}}
                            	<span class="label label-danger" 
                            	data-toggle="tooltip" data-placement="right" title="公司经过网站认证"
                            		ng-show="x.isCertified == 0">认</span>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="job-treat col-md-2">{{x.jobTreat}}</div>
                            <div class="job-treatMethod col-md-4">元/{{x.treatMethod}}</div>
                            <div class="job-payMethod col-md-4">{{x.payMethod}}</div>
                        </div>
                    </div>
                </div>
                
                <!--分页-->
				<nav aria-label="Page navigation" >
					<ul class="pagination">
						<li ng-class="{false:'disabled'}[hasPreviousPage]">
							<a href="" aria-label="Previous" ng-click="previousPage()">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>

						<li ng-repeat="x in navigatepageNums" ng-class="{'active':x == pageNum}">
							<a href="" ng-bind="x" ng-click="changePage(x)"></a>
						</li>

						<li ng-class="{false:'disabled'}[hasNextPage]">
							<a href="" aria-label="Next" ng-click="nextPage()">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</ul>
				</nav>
				
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
        	 }else{
        		 $(".login_out").css("display","block");
        		 $(".login_info").css("display","none");
        	 }
        })
        //初始化数据
        var jsonData={};
        $http({
			url:'/get_comp_job_params',
    	   	method:'get',
    	   	params:{'jsonData':jsonData}
		}).success(function(response, status, headers, config){
			var globalData=response.data;
			$scope.jobList=globalData.list;
			//所有页码
			$scope.navigatepageNums=globalData.navigatepageNums;
			$scope.hasPreviousPage=globalData.hasPreviousPage;
	        $scope.hasNextPage=globalData.hasNextPage;
	        $scope.pageNum=globalData.pageNum;
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
    	//地区
        $http({
	    	url:'/get_country_by_city',
		   	method:'get',
		   	params:{'province':'江苏省','city':'苏州市'}
	    }).success(function(response, status, headers, config){
	    	$scope.placeDate=response.data;
		});  
      	//获取jobCateList
		$scope.jobCateList=[];
		$scope.updateJobCateList=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.jobCateList.indexOf(id) == -1)
                $scope.jobCateList.push(id);
            if(action == 'remove' && $scope.jobCateList.indexOf(id) != -1)
                $scope.jobCateList.splice($scope.jobCateList.indexOf(id), 1);
        }
		//获取jobPlaceList
        $scope.jobPlaceList=[];
		$scope.updateJobPlaceList=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.jobPlaceList.indexOf(id) == -1)
                $scope.jobPlaceList.push(id);
            if(action == 'remove' && $scope.jobPlaceList.indexOf(id) != -1)
                $scope.jobPlaceList.splice($scope.jobPlaceList.indexOf(id), 1);
        }
		//待遇
		//金额
		$scope.start=0;
        $scope.end=100;
        //treatMethodList
		$scope.treatMethodList=[];
		$scope.updateTreatMethod=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.treatMethodList.indexOf(id) == -1)
                $scope.treatMethodList.push(id);
            if(action == 'remove' && $scope.treatMethodList.indexOf(id) != -1)
                $scope.treatMethodList.splice($scope.treatMethodList.indexOf(id), 1);
        }
		//payMethodList
		$scope.payMethodList=[];
        $scope.updatePayMethod=function ($event, id) {
            var checkbox = $event.target;
            var action = (checkbox.checked ? 'add' : 'remove');
            if(action == 'add' & $scope.payMethodList.indexOf(id) == -1)
                $scope.payMethodList.push(id);
            if(action == 'remove' && $scope.payMethodList.indexOf(id) != -1)
                $scope.payMethodList.splice($scope.payMethodList.indexOf(id), 1);
        }
        //筛选
        $scope.submit=function () {
        	jsonData={};
            if($scope.jobCateList.length>0){
                jsonData.jobCateList=$scope.jobCateList;
			}
            if($scope.jobPlaceList.length>0){
                jsonData.jobPlaceList=$scope.jobPlaceList;
            }
            if($scope.treatMethodList.length>0){
                jsonData.treatMethodList=$scope.treatMethodList;
            }
            if($scope.payMethodList.length>0){
                jsonData.payMethodList=$scope.payMethodList;
            }
            jsonData.start=$scope.start;
            jsonData.end=$scope.end;
            //发请求
            $http({
    			url:'/get_comp_job_params',
        	   	method:'get',
        	   	params:{'jsonData':jsonData}
    		}).success(function(response, status, headers, config){
    			globalData=response.data;
    			$scope.jobList=globalData.list;
    			//所有页码
    			$scope.navigatepageNums=globalData.navigatepageNums;
    			$scope.hasPreviousPage=globalData.hasPreviousPage;
    	        $scope.hasNextPage=globalData.hasNextPage;
    	        $scope.pageNum=globalData.pageNum;
    		}) 
        }
       //分页
        $scope.previousPage=function () {
    	   if(!$scope.hasPreviousPage)return;
    	   //发请求
	   	   $http({
	   			url:'/get_comp_job_params',
	       	   	method:'get',
	       	   	params:{'jsonData':jsonData,'pageNum':$scope.pageNum-1}
	   		}).success(function(response, status, headers, config){
	   			globalData=response.data;
	   			$scope.jobList=globalData.list;
	   			//所有页码
	   			$scope.navigatepageNums=globalData.navigatepageNums;
	   			$scope.hasPreviousPage=globalData.hasPreviousPage;
	   	        $scope.hasNextPage=globalData.hasNextPage;
	   	        $scope.pageNum=globalData.pageNum;
	   		}) 
        }
        $scope.changePage=function (x) {
        	//发请求
        	$http({
	   			url:'/get_comp_job_params',
	       	   	method:'get',
	       	   	params:{'jsonData':jsonData,'pageNum':x}
	   		}).success(function(response, status, headers, config){
	   			globalData=response.data;
	   			$scope.jobList=globalData.list;
	   			//所有页码
	   			$scope.navigatepageNums=globalData.navigatepageNums;
	   			$scope.hasPreviousPage=globalData.hasPreviousPage;
	   	        $scope.hasNextPage=globalData.hasNextPage;
	   	        $scope.pageNum=globalData.pageNum;
	   		}) 
        }
        $scope.nextPage=function () {
        	 if(!$scope.hasNextPage)return;
        	//发请求
        	$http({
	   			url:'/get_comp_job_params',
	       	   	method:'get',
	       	   	params:{'jsonData':jsonData,'pageNum':$scope.pageNum+1}
	   		}).success(function(response, status, headers, config){
	   			globalData=response.data;
	   			$scope.jobList=globalData.list;
	   			//所有页码
	   			$scope.navigatepageNums=globalData.navigatepageNums;
	   			$scope.hasPreviousPage=globalData.hasPreviousPage;
	   	        $scope.hasNextPage=globalData.hasNextPage;
	   	        $scope.pageNum=globalData.pageNum;
	   		}) 
        }
    })
</script>
</body>
</html>