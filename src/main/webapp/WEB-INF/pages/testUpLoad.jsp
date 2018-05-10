<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <style>
        .center-body{
            margin: auto;
            margin-top: 20px;
        }
    </style>
</head>
<body ng-app="upload" class="body container-fluid">
<div id="container-fluid" ng-controller="uploadController">

    <div class="center-body row container" >

        <!--新增行业-->
        <div class="panel panel-default">
            <div class="panel-heading">上传</div>
            <div class="form-horizontal panel-body">
                <div class="form-group">
                    <input class="form-control" type="file" name="file_image" id="file_image"
                           ng-model="file_image">
                </div>
                <div class="form-group">
                    <input class="form-control" type="file" name="file" id="file"
                           ng-model="file">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="userName" id="userName"
                           ng-model="userName">
                </div>
                <div class="form-group">
                    <input class="form-control" type="password" name="password" id="password"
                           ng-model="password">
                </div>
                <!--提交-->
                <div class="form-group">
                    <input class="btn btn-success form-control" type="button" value="提交"
                               ng-click="upFile()" >
                               <a href="/down_resume_file?fileNames=aaa&stuId=2">测试下载</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript">

    var app=angular.module('upload',[]);
    app.controller('uploadController',function ($scope,$http) {
    	$scope.userName="";
    	$scope.password="";
    	$scope.upFile=function () {
            var formData=new FormData();
            var file_image = document.getElementById("file_image").files[0];
            var file = document.getElementById("file").files[0];
            var data_={};
            data_.userName=$scope.userName;
            data_.password=$scope.password;
            formData.append('file_image', file_image);
            formData.append('file', file);
            formData.append('data',JSON.stringify(data_));
            
            
            console.log(formData);
            
            $http({
                method: 'POST',
                url: '/test_upload',
                data: formData,
                headers: {'Content-Type': undefined},
                transformRequest: angular.identity
            }).success(function (data) {
                console.log('operation success');
            }).error(function (data) {
                console.log('operation fail');
            })
        }
    });
</script>
</html>