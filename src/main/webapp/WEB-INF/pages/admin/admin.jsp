<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
    <link href="../../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../../resource/css/admin.css">
</head>
<body ng-app="admin" class="body container-fluid">
<div id="container-fluid" ng-controller="adminController">
<form name="angularForm">
    <div class="center-body row container" >
	
        <!--新增行业-->
        <div class="panel panel-default">
            <div class="panel-heading">新增行业</div>
            <div class="form-horizontal panel-body">
                <!--先选择主行业-->
                <div class="form-group">
                    <label for="select_main" class="col-sm-2 control-label">主行业：</label>
                    <div class="col-sm-8">
                        <select class="form-control" id="select_main" ng-model="parent_category"
                                ng-options="x.categoryName for x in categoryArray">
                        </select>
                    </div>
                </div>
                <!--填写子行业-->
                <div class="form-group">
                    <label for="second_cate" class="col-sm-2 control-label">子行业：</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="second_cate" placeholder="子行业"
                               ng-model="categoryName" name="categoryName">
                    </div>
                </div>
                <!--提交-->
                <div class="form-group">
                    <div class="col-sm-8 col-sm-offset-2">
                        <input class="btn btn-success form-control" type="button" value="提交"
                               ng-click="submitAdd()" >
                    </div>
                </div>
            </div>
        </div>
        
    </div>
    </form>
</div>
</body>
<script type="text/javascript" src="../../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../../resource/js/angular.js"></script>
<script type="text/javascript">
    var app=angular.module('admin',[]);
    app.controller('adminController',function ($scope,$http) {
    	//主行业
        $scope.categoryArray=null;
    	//发请求
    	$http({
    		url:'/find_main_category',
    		method:'get'
    	}).success(function(response, status, headers, config){
    		$scope.categoryArray=response.data;
    		$scope.parent_category=response.data[0];
    	}).error(function(response, status, headers, config){
    	});
    	
        

        //发起请求
        //子行业
        $scope.categoryName="";
        
        $scope.submitAdd=function () {
        	$scope.formData={'parentId':$scope.parent_category.id,'categoryName':$scope.categoryName};
        	$http({
        		url:'/add_job_category',
        		method:'post',
        	   	data:$scope.formData
        	}).success(function(response, status, headers, config){
        		if(response.msg){
        			if(response.msg=='success'){
        				alert("新增成功！")
        			}
        		}else{
        			alert("新增失败！请稍后重试")
        		}
        	}).error(function(response, status, headers, config){
        		alert(status)
        	});
			console.log($scope.formData)
        }
    });
</script>
</html>