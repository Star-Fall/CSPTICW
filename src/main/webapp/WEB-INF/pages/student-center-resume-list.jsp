<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>简历中心</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/student-center-resume-list.css">
</head>
<body ng-app="studentCenter" class="body container-fluid">
<div id="container-fluid" >
    <!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <span>上海站</span><a href="">【切换城市】</a>
        </div>
        <!--登录注册部分-->
        <div class="login_out col-xs-offset-8 col-sm-offset-8 col-md-offset-8  col-lg-offset-8
            col-xs-2 col-sm-2 col-md-2 col-lg-2">
            用户信息
        </div>
    </div>
    <!--log条-->
    <div class="nav_head row">
        <!--log图片-->
        <a href="/to_main">
            <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
        </a>
        <div class="nav-path col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href="/to_my_resume_list">简历中心</a>&nbsp;&nbsp;/&nbsp;&nbsp;我的简历
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container">
        <!--菜单-->
        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!--信息-->
            <a href="" class="left-nav-one list-group-item ">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                账户管理
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item ">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    修改手机
                </a>
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    修改密码
                </a>
            </div>
            <!--简历-->
            <a href="/to_my_resume_list" class="left-nav-one list-group-item active">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历中心
            </a>
            <div class="left-nav-zhe" style="display: block;">
                <a href="/to_student_center_resume" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布简历
                </a>
                <a href="/to_my_resume_list" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    我的简历
                </a>
            </div>
            <!--投递-->
            <a href="" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历投递
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投递记录
                </a>
            </div>
            <!--邀请-->
            <a href="" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                兼职邀请
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收到的邀请
                </a>
            </div>
            <a href="" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的收藏
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收藏的企业
                </a>
            </div>
            <a href="" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的投诉
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投诉记录
                </a>
            </div>
            <a href="" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                系统消息
            </a>
            <div class="left-nav-zhe">
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收到的消息
                </a>
            </div>
        </div>
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <div class="panel panel-default" ng-controller="resumeListController">
                <div class="panel-heading">
                    我的简历
                </div>
                <!--整体body-->
                <div class="panel-body">
                    <dl>
                        <dt>* 热度：</dt><dd>简历被查看次数</dd>
                        <dt>* 公开：</dt><dd>设为保密后其他人不可见</dd>
                    </dl>
                </div>
                <table class="table table-hover table-list" >
                   <tr>
                       <th class="col-xs-3 col-sm-3 col-md-3 col-lg-3">简历名称</th>
                       <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">发布时间</th>
                       <th class="col-xs-1 col-sm-1 col-md-1 col-lg-1">热度</th>
                       <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">公开</th>
                       <th class="col-xs-4 col-sm-4 col-md-4 col-lg-4">操作</th>
                   </tr>
                    <tr ng-repeat="x in resumeList" >
                        <td class="ng-cloak">{{x.resuName}}</td>
                        <td class="ng-cloak">{{x.createTime | date:"yyyy-MM-dd HH:mm:ss"}}</td>
                        <td class="ng-cloak">{{x.resuHot}}</td>
                        <td class="ng-cloak">
                            <label class="radio-inline">
                                <input type="radio"  name="{{x.id+ 'status'}}" ng-checked="x.status == 0" ng-click="changeRadio(0,x.id)">
                                公开
                            </label>
                            <label class="radio-inline">
                                <input type="radio"  name="{{x.id+ 'status'}}" ng-checked="x.status == 1" ng-click="changeRadio(1,x.id)">
                                保密
                            </label>
                        </td>
                        <td class="ng-cloak">
                            <a class="btn btn-link" ng-click="modifyResume(x.id)">
                                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
                                修改
                            </a>
                            <a class="btn btn-link" ng-click="deleteResume(x.id)">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                删除
                            </a>
                            <a class="btn btn-link" ng-click="detailResume(x.id)" type="button" data-toggle="modal" data-target="#myModal">
                                <span class=" glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                                预览
                            </a>
                        </td>
                    </tr>
                </table>

                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog modal-lg" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <h4 class="modal-title" style="text-align: center; font-weight: bold;" id="myModalLabel">{{resumeDetail.resuName}}</h4>
                            </div>
                            <div class="modal-body">

                                <div class="row">

                                    <div class="rusume-title col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <span class="glyphicon glyphicon-user"></span>
                                        基本信息
                                    </div>
                                    <!--基本信息-->
                                    <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <table class="table table-hover">
                                            <tr>
                                                <th>姓名:</th>
                                                <td>{{resumeDetail.realName}}</td>

                                            </tr>
                                            <tr>
                                                <th>年龄:</th>
                                                <td>{{resumeDetail.age}}岁</td>
                                            </tr>
                                            <tr>
                                                <th>性别:</th>
                                                <td>{{resumeDetail.gender}}</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div class="col-md-3 col-md-offset-2">
                                    <!-- src="../../resource/images/default-image-user.png" -->
                                        <img  ng-src="{{ resumeDetail.idPhoto?'../../../upfile/student/' + resumeDetail.idPhoto:'../../resource/images/default-image-user.png'}}"
                                         class="img-thumbnail" style="height: 120px;" >
                                    </div>
                                    <!--求职信息-->
                                    <div class="rusume-title col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <span class="glyphicon glyphicon-th-list"></span>
                                        求职信息
                                    </div>
                                    <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <table class="table table-hover">
                                            <tr>
                                                <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">求职地点:</th>
                                                <td class="col-xs-10 col-sm-10 col-md-10 col-lg-10 ">
                                                    {{resumeDetail.province}}
                                                    {{resumeDetail.city}}
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>求职意向:</th>
                                                <td>
                                                    <ul class="list-inline">
                                                        <li ng-repeat="x in resumeDetail.resumeJobs">
                                                            {{x.categoryName}}&nbsp;
                                                        </li>

                                                    </ul>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>

                                    <!--工作经验-->
                                    <div class="rusume-title col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <span class="glyphicon  glyphicon-align-left"></span>
                                        工作经验
                                    </div>
                                    <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <table class="table table-hover">
                                            <tr ng-repeat-start="y in resumeDetail.workExperiences"
                                                class="info"><th colspan="2" >工作{{$index+1}}</th></tr>
                                            <tr>
                                                <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">岗位:</th>
                                                <td class="col-xs-10 col-sm-10 col-md-10 col-lg-10 ">{{y.workTitle}}</td>
                                            </tr>
                                            <tr ng-repeat-end="" >
                                                <th>工作内容:</th>
                                                <td>{{y.workContent}}</td>
                                            </tr>
                                        </table>
                                    </div>
                                    <!--学校信息-->
                                    <div class="rusume-title col-md-10 col-md-offset-1">
                                        <span class="glyphicon  glyphicon-align-center"></span>
                                        学校信息
                                    </div>
                                    <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <table class="table table-hover">
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">学校名称:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.school}}</td>
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">专业名称:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.major}}</td>
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">学历:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.education}}</td>
                                        </table>
                                    </div>

                                    <!--通讯方式-->
                                    <div class="rusume-title col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <span class="glyphicon  glyphicon-earphone"></span>
                                        通讯方式
                                    </div>
                                    <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <table class="table table-hover">
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">手机号码:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.phone}}</td>
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">QQ:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.qq}}</td>
                                            <th class="col-xs-2 col-sm-2 col-md-2 col-lg-2">微信:</th>
                                            <td class="col-xs-2 col-sm-2 col-md-2 col-lg-2">{{resumeDetail.wechat}}</td>
                                        </table>
                                    </div>
                                    <!--其他-->
                                    <div class="rusume-title col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        <span class="glyphicon  glyphicon-asterisk"></span>
                                        其他（自我介绍/兴趣爱好）
                                    </div>
                                    <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10 
                                    	col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                        {{resumeDetail.selfDescription}}
                                    </div>

                                </div>
                            </div>
                            <div class="modal-footer">
                                <a id="down_file_a" role="button" class="btn btn-info" 
                                	ng-show="resumeDetail.annexResume"
                                	href="">
                                	下载附件
                                </a>
                                <button type="button" class="btn btn-success " >导出Word</button>
                                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                            </div>
                        </div>
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
    var app=angular.module('studentCenter',[]);
    app.controller('resumeListController',function ($scope,$http) {

    	//简历列表
    	$scope.resumeList=[];
    	//请求数据
    	$http({
        	url:'/get_myresume_detail_list',
    	   	method:'get'    		
    	}).success(function(response, status, headers, config){
    		$scope.resumeList=response.data;
    	});  
		//单个详情
    	$scope.resumeDetail={};
		//改变公开
		$scope.changeRadio=function (val,id) {
        	//找到该简历
        	var resumeItem={};
        	for(var i=0;i<$scope.resumeList.length;i++){
                if($scope.resumeList[i].id==id){
                	resumeItem=$scope.resumeList[i];
                	if(resumeItem.status!=val){
                		$scope.resumeList[i].status=val;
                		//请求更新
                		var formData=new FormData();
                		formData.append('jsonData',JSON.stringify($scope.resumeList[i]));
                		$http({
                			url:'/update_resume',
                			method:'post',
                			data: formData,
                            headers: {'Content-Type': undefined},
                            transformRequest: angular.identity
                		}).success(function(response, status, headers, config){
                			
                		})                		
                	}else{
                		return;
                	}
                	
                }
            }           
        };
        /**
         * 修改
         * */
        $scope.modifyResume=function (id) {
        	//先存放要修改的简历Id 
        	$http({
	        	url:'/save_resume_id',
	    	   	method:'post',
	    	   	data:id
	    	}).success(function(response, status, headers, config){
	    		window.location.href="/to_resume_modify";
	    	}); 
        	
        };
        $scope.deleteResume=function (id) {
        	$http({
	        	url:'/delete_resume',
	    	   	method:'post',
	    	   	data:id
	    	}).success(function(response, status, headers, config){
	    		if(response.msg){
	    			alert("删除成功");
	    			//删除$scope.resumeList
	    			window.location.href="/to_my_resume_list";
	    		}
	    	}); 
        };
        /**
         * 预览
         * */
        $scope.detailResume=function (id) {
            for(var i=0;i<$scope.resumeList.length;i++){
                if($scope.resumeList[i].id==id){
                    $scope.resumeDetail=$scope.resumeList[i];
                    //为下载链接赋值
                    //down_resume_file
                    if($scope.resumeDetail.annexResume){
                    	var fileName=$scope.resumeDetail.annexResume;
            			fileName=fileName.slice(fileName.indexOf('\\')+1);
            			$("#down_file_a").html(fileName)
            			var href="/down_resume_file?fileName=";
            			href+=fileName;
            			href+="&stuId=";
            			href+=$scope.resumeDetail.stuId;
            			$("#down_file_a").attr('href',href);
                    }
                    
                    return;
                }
            }
        };
    });
    
</script>
</body>
</html>