<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/login.css">
</head>
<body class="body container-fluid" ng-app="login">
<div id="container-fluid">
    <!--导航条-->
    <div class="nav_head row">
        <!--log图片-->
        <a href="/to_main">
            <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
        </a>
        <div class="nav-path col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
            登录
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container">
        <!--登录的图片-->
        <div class="login-img-container col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
            col-xs-5 col-sm-5 col-md-5 col-lg-5">

        </div>
        <!--登录主体-->
        <div ng-controller="LoginController"
                class="login-body-container col-xs-5 col-sm-5 col-md-5 col-lg-5 ">
            <form name="angularForm" novalidate>
                <div class="login-form form-horizontal col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <!--登录方式-->
                    <div class="form-group">
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1">
                            <label >
                                <a href="" >账号登录</a>
                            </label>
                        </div>
                        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1">
                            <label >
                                <a href="">手机登录</a>
                            </label>
                        </div>
                    </div>
                    <!--身份选择-->
                    <div class="form-group" >
                        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1">
                            <label class="radio-inline">
                                <input type="radio" ng-model="loginRole" id="student-role" value="student" > 大学生用户
                            </label>
                            <label class="radio-inline">
                                <input type="radio" ng-model="loginRole" id="company-role" value="company"> 企业用户
                            </label>
                        </div>
                    </div>
                    <!--手机号-->
                    <div class="form-group" ng-class="{true:'has-error'}[userNameErr]" ng-click="userNameErr = false">
                        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1">
                            <input type="text" class="form-control" id="userName" name="userName" placeholder="手机号"
                                   ng-model="userName" ng-pattern="/^1[3|4|5|7|8]\d{9}$/" required="required">
                            <span class="input-error ng-cloak" ng-show="angularForm.userName.$dirty && angularForm.userName.$error.pattern">
                                   * 手机号格式错误
                            </span>
                        </div>
                    </div>
                    <!--密码-->
                    <div class="form-group" ng-class="{true:'has-error'}[passwordErr]" ng-click="passwordErr = false">
                        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1">
                            <input type="password" id="password" class="form-control" name="password" placeholder="密码"
                                   ng-model="password" required="required" ng-pattern="/^\d{6}$/">
                            <span class="input-error ng-cloak" ng-show="angularForm.password.$dirty && angularForm.password.$error.pattern">
                                    *密码格式错误
                            </span>
                        </div>
                    </div>
                    <!--记住我-->
                    <div class="form-group">
                        <div class="col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1
                            col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <label>
                                <input type="checkbox" ng-model="rememberMe">下次自动登录
                            </label>
                        </div>
                        <a href="" class="col-xs-4 col-sm-4 col-md-4 col-lg-4">忘记密码？</a>
                    </div>
                    <!--登录按钮-->
                    <div class="form-group">
                            <button type="button" class="login-btn btn btn-danger btn-lg input-lg
                            col-xs-9 col-sm-9 col-md-9 col-lg-9
                            col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-md-offset-1"
                                    ng-disabled="!angularForm.$valid" ng-click="loginClick()">登录</button>
                    </div>
                    <div class="form-group">                        
                        <div class="col-xs-offset-5 col-sm-offset-5 col-md-offset-5 col-md-offset-5
                            col-xs-6 col-sm-6 col-md-6 col-lg-6">
                             	还没有账号？<a href="/to_regist" >免费注册</a>
                        </div>
                        
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript">
    var app=angular.module('login',[]);
    app.controller("LoginController",function ($scope,$http) {
        //登录的用户
        $scope.loginRole="student";
        $scope.rememberMe=true;
        //用户名错误标志
        $scope.userNameErr=false;
        //密码错误标志
        $scope.passwordErr=false;
        $scope.loginClick=function () {
            $http({
                url:'/login',
                method:'post',
                data:{'loginRole':$scope.loginRole,'rememberMe':$scope.rememberMe,'userName':$scope.userName,'password':$scope.password}
            }).success(function(response, status, headers, config){
            	if(response.msg){
            		window.location.href="/to_main";
            	}else if(response.error){
            		if(response.error=='2003'){
            			//手机号未注册
            			alert("手机号未注册");
            			$scope.userNameErr=true;
            		}else if(response.error=='2004'){
            			//密码错误
            			alert("密码错误");
            			$scope.passwordErr=true;
            		}
            	}                
            }).error(function(response, status, headers, config){
                //do  anything what you want;
            });
        }
    });
</script>
</body>
</html>
