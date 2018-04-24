<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>用户注册</title>
    <link href="../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../resource/css/regist.css">
</head>
<body ng-app="regist" class="body container-fluid">
<div id="container-fluid">
    <!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <span>上海站</span><a href="#">【切换城市】</a>
        </div>
        <!--登录注册部分-->
        <div class="login_out col-xs-offset-8 col-sm-offset-8 col-md-offset-8 col-md-offset-8
            col-xs-2 col-sm-2 col-md-2 col-lg-2">
            用户信息
        </div>
    </div>
    <!--导航条-->
    <div class="nav_head row">
        <!--log图片-->
        <a href="to_main">
            <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
        </a>
        <div class="nav-path col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <a href="to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
            用户注册
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container" ng-controller="ChangeRegist">
        <!--面板-->
        <div class="panel panel-default col-xs-offset-2 col-sm-offset-2 col-md-offset-2
                    col-lg-offset-2 col-xs-8 col-sm-8 col-md-8 col-lg-8">
            <div class="panel-heading regist-head" >
                <ul class="nav nav-pills  nav-justified">
                    <li ng-class="{'student':'active'}[regist]" ng-click="regist='student'">
                        <a href="">大学生用户注册</a>
                    </li>
                    <li ng-class="{'company':'active'}[regist]" ng-click="regist='company'">
                        <a href="">企业用户注册</a>
                    </li>
                </ul>
            </div>
            <!--注册体-->
            <div class="panel-body regist-body">
                <form name="angularForm" novalidate>
                    <input type="hidden" id="regist" name="regist" ng-model="regist">
                    <div class="form-horizontal regist-form">
                        <!--手机号-->
                        <div class="form-group" ng-class="{true:'has-error'}[userNameErr]" ng-click="userNameErr = false">
                            <label for="userName" class="control-label col-xs-offset-2 col-sm-offset-2 col-md-offset-2 col-lg-offset-2
                                col-xs-2 col-sm-2 col-md-2 col-lg-2">手机号：</label>
                            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                                <input type="text" class="form-control" required="required" id="userName"
                                       placeholder="请输入手机号码" name="userName"  ng-model="userName" ng-pattern="/^1[3|4|5|7|8]\d{9}$/" 
                                       check-phone="">
                                <span class="input-error ng-cloak" ng-show="angularForm.userName.$dirty && angularForm.userName.$error.pattern">
                                   * 手机号格式错误</span>
                                <span class="input-error ng-cloak" ng-show="angularForm.userName.$dirty && angularForm.userName.$error.repeatphone">
                                * 手机号已被注册</span>
                                   
                            </div>
                        </div>
                        <!--密码-->
                        <div class="form-group">
                            <label for="password" class="control-label col-xs-offset-2 col-sm-offset-2 col-md-offset-2 col-lg-offset-2
                                col-xs-2 col-sm-2 col-md-2 col-lg-2">密码：</label>
                            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                                <input type="password" class="form-control" id="password" placeholder="请输入密码"
                                       name="password" ng-model="password" required="required" ng-pattern="/^\d{6}$/">
                                <span class="input-error ng-cloak" ng-show="angularForm.password.$dirty && angularForm.password.$error.pattern">
                                    *密码格式错误
                                </span>
                            </div>
                        </div>
                        <!--重复密码-->
                        <div class="form-group">
                            <label for="repassword" class="control-label col-xs-offset-2 col-sm-offset-2 col-md-offset-2 col-lg-offset-2
                                col-xs-2 col-sm-2 col-md-2 col-lg-2">确认密码：</label>
                            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                                <input type="password" class="form-control" id="repassword" placeholder="请再次输入密码"
                                       name="repassword"  ng-model="repassword" required="required" compare-pwd="password">
                                <span class="input-error ng-cloak" ng-show="angularForm.repassword.$dirty && angularForm.repassword.$error.pwdmatch">两次密码输入不一致</span>
                            </div>
                        </div>
                        <!--短信验证码-->
                        <div class="form-group" ng-class="{true:'has-error'}[validateCodeErr]" ng-click="validateCodeErr = false">
                            <div class="col-xs-offset-2 col-sm-offset-2 col-md-offset-3 col-lg-offset-3
                                col-xs-4 col-sm-4 col-md-4 col-lg-4 ">
                                <input type="text" class="form-control" id="validateCode" placeholder="请输入短信验证码"
                                       name="validateCode" ng-model="validateCode" maxlength="6">
                            </div>
                            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 ">
                                <button id="send_msg_btn" type="submit"  class="btn btn-success" ng-click="sendMessage()" 
                                	ng-disabled="!angularForm.$valid||!agreement">
                                	免费获取验证码
                                </button>
                            </div>
                        </div>
                        <!--同意协议-->
                        <div class="form-group">
                            <div class="col-xs-offset-5 col-sm-offset-5 col-md-offset-5 col-lg-offset-5
                                col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"  ng-model="agreement"> 同意 <a href="#" >《兼职网站协议》</a>
                                        <span class="input-error ng-cloak" ng-show="!agreement"><br>* 注册需要同意此协议</span>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <!--注册按钮-->
                        <div class="form-group">
                            <div class="col-xs-offset-5 col-sm-offset-5 col-md-offset-5 col-lg-offset-5">
                                <button type="submit" class="btn btn-lg btn-success col-xs-5 col-sm-5 col-md-5 col-lg-5"
                                        ng-click="submitRegist()" ng-disabled="!angularForm.$valid||!agreement">注册</button>
                            </div>
                        </div>
                        <!--已有账号-->
                        <div class="login-url col-xs-offset-5 col-sm-offset-5 col-md-offset-5 col-lg-offset-5
                            col-xs-5 col-sm-5 col-md-5 col-lg-5">
                            已有账号？<a href="/to_login">去登陆</a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../resource/js/jquery-3.2.1.min.js"></script>
<script src="../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../resource/js/angular.js"></script>
<script type="text/javascript">
    var app=angular.module('regist',[]);
    app.controller('ChangeRegist',function ($scope,$http,$location) {
    	console.log( $location.absUrl());
        $scope.regist="student";
        $scope.validateCode="";
        //手机号错误
        $scope.userNameErr=false;
        //验证码错误
        $scope.validateCodeErr=false;
        //同意协议
        $scope.agreement=true;
        //发送短信
        $scope.sendMessage=function(){
      	   	$http({
        		url:'/regist/send_message',
        		method:'post',
        		data:{'userName':$scope.userName}
        	}).success(function(response, status, headers, config){
        		if(response.error){
        			alert("验证码发送失败，请稍后再试！");
        			return;
        		}
        		//返回的msg
        		var msgCode=response.msg.Code;
        		if(msgCode=="OK"){
        			//发送成功
        			//倒计时
        			var count=60;
              	 	var timeout = false; //启动及关闭按钮 
              	   	function set_msg_time(){
              		   	if(count==0){
              			   	if(timeout)return;
              			   	$('#send_msg_btn').attr("disabled", false);
              			   	$('#send_msg_btn').html("免费获取验证码");
              			 	timeout=true;
              		   	}else{
              			   	$("#send_msg_btn").attr("disabled", true);
              			   	$("#send_msg_btn").html("重新发送(" + count + "s)");
              			   	count--;  
              			 	timeout=false;
              		   	}
              		   	window.setTimeout(set_msg_time, 1000);
              	   	}
              	   	set_msg_time();
        		}else{
        			//发送失败，更换手机号
        			alert("验证码发送失败，尝试更换手机号");
        			$scope.userNameErr=true;
        			//重新发送
        		}
        	});
        }
        //提交表单
        $scope.submitRegist=function () {
        	//提交的表单信息
        	$scope.formData ={'regist':$scope.regist,'userName':$scope.userName,'password':$scope.password,'validateCode':$scope.validateCode};
           	$http({
        	   	url:'/regist',
        	   	method:'post',
        	   	data:$scope.formData
           	}).success(function(response, status, headers, config){
        	   	/*response   -- 成功返回的数据 
	               status     -- 状态码 
	               headers    -- 头信息 
	               config     -- 其他信息 
	             */
        	   	if(response.msg){
        	   		//注册成功
        	   		//跳转至主页
        	   		//$location.path("to_main");
        	   		window.location.href="/to_main";
        	   	}else if(response.error){
        	   		//验证码错误
        	   		if(response.error='1002'){
        	   			alert("验证码错误");
        	   			$scope.validateCodeErr=true;
        	   		}
        	   		else{
        	   			alert("注册失败");
        	   		}
        	   	}
           	}).error(function(response, status, headers, config){
           	});  
        }
    });
    //自定义验证两次密码不一致
    app.directive('comparePwd',function () {
        return{
            require:'ngModel',
            link : function(scope,elem,attrs,c){
                var firstPwdIdObj = "#" + attrs.comparePwd;
                $(elem).add(firstPwdIdObj).on('keyup',function(){
                    scope.$apply(function(){
                        var flag = elem.val() === $(firstPwdIdObj).val();
                        c.$setValidity("pwdmatch",flag);
                    });
                });
            }
        }
    });
    //手机号重复验证
    app.directive('checkPhone',function ($http) {
    	return{
    		require:'ngModel',
    		link : function(scope,elem,attrs,c){
    			scope.$watch(attrs.ngModel+' + regist', function(n){
   					if(!elem.val()) return;
    				$http({
    					url:'/regist/check_username',
    	        	   	method:'get',
    	        	   	params:{'userName':elem.val(),'regist': scope.regist}
    				}).success(function(response, status, headers, config){
    					if(response.msg){
    						c.$setValidity("repeatphone",true);
    					}else if(!response.msg && response.error=='2002'){
    						c.$setValidity("repeatphone",false);
    					}
    				})
    			})
    		}
    	}
    });
  
</script>
</body>
</html>
