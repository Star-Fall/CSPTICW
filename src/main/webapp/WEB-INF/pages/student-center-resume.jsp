<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>简历发布</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/student-center-resume.css">
</head>
<body ng-app="studentCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="resumeController" >
    <!--登录条-->
    <div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<!-- <span>上海站</span><a href="">【切换城市】</a> -->
			</div>
			
			<!-- 登录的信息-->
			<div class="login_info dropdown col-xs-offset-8 col-sm-offset-8 col-md-offset-8 col-md-offset-8 
				col-xs-2 col-sm-2 col-md-2 col-lg-2 row" >
			  	<a class="dropdown-toggle" data-toggle="dropdown"  id="dropdownMenu2" role="button" aria-haspopup="true" aria-expanded="false">
			     {{loginUser.userName}}<span class="caret"></span>
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
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href="/to_my_resume_list">简历中心</a>&nbsp;&nbsp;/&nbsp;&nbsp;发布简历
        </div>
    </div>
    <!--主体-->
    <div class="center-body row container">
     	 <%@include file="center-menu-student.jsp" %>
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <!--发布简历-->
            <div class="row resume-div panel panel-default" >
                <form name="resumeForm" novalidate class="resume-form panel-body">
                    <!--简历信息-->
                    <div class="panel panel-default">
                        <div class="panel-heading form-inline">                          
                             <div class="form-group">
                                <label for="resu_name" class="control-label ">简历名称：</label>
								<input type="text" class="form-control" id="resu_name" name="resu_name" placeholder="简历名称"
                                       ng-model="resu_name" required="required">
                                <span class="input-error ng-cloak" ng-show="!resumeForm.resu_name.$dirty">
                                   * 必填
                            	</span>
                            </div>                           
                        </div>
                    </div>

                    <!--基本信息-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           基本信息
                            <span class="input-error ng-cloak" ng-show="!resumeForm.real_name.$dirty">
                                   * 姓名必填
                            </span>
                            <span class="input-error ng-cloak" ng-show="!resumeForm.age.$dirty">
                                   * 年龄必填
                            </span>
                        </div>
                        <div class="panel-body form-inline">
                            <div class="form-group ">
                                <label for="real_name">姓名：</label>
                                <input type="text" class="form-control" id="real_name" name="real_name" placeholder="姓名"
                                       ng-model="real_name" required="required">
                            </div>
                            <div class="form-group col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                <label for="age">年龄：</label>
                                <input type="number" class="form-control" id="age" name="age" placeholder="年龄"
                                       ng-model="age" required="required">
                            </div>
                            <div class="form-group col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                <label for="gender_select">性别：</label>
                                <select class="form-control" id="gender_select" name="gender" ng-model="gender">
                                    <option>男</option>
                                    <option>女</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <!--求职信息-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            求职信息
                            <span class="input-error ng-cloak" ng-show="resume_jobs.length<=0">
                                   * 求职意向必选
                            </span>
                        </div>
                        <div class="panel-body ">
                            <!--地点-->
                            <div class="form-inline">
                                <div class="form-group">
                                    <label for="select_province" class=" control-label">求职地点：</label>
                                </div>
                                <div class="form-group col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                    <label for="select_province" class="control-label ">省份：</label>
                                    <select class="form-control" id="select_province" ng-model="select_province"
                                            ng-options="x1.province for x1 in selectProvince" ng-change="changeProvince()">
                                    </select>
                                </div>
                                <div class="form-group col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                    <label for="select_city" class="control-label">城市：</label>
                                    <select class="form-control" id="select_city" ng-model="select_city" 
                                            ng-options="x2.city for x2 in selectCity" >
                                    </select>
                                </div>
                            </div>
                            <!--求职意向-->
                            <label class=" control-label">求职意向：</label>
                            <!--展示已选择的意向-->
                            <ul class="list-group">
                                <li class="list-group-item ng-cloak" ng-repeat="x  in resume_jobs">
                                    {{x.categoryName}}
                                    <button type="button" class="close" ng-click="deleteResumeJob(x.jobCateId)">
                                        <span  style="color: red" class="glyphicon glyphicon-remove"></span>
                                    </button>
                                </li>
                            </ul>
                            <button class="btn btn-success form-control" id="add_resume_job"
                                    data-toggle="modal" data-target="#resume_job_modal">
                                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增意向
                            </button>
                            <!-- 意向Modal -->
                            <div class="modal fade" id="resume_job_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                            选择意向
                                        </div>
                                        <div class="modal-body form-inline">
                                            <div class="form-group ">
                                                <label for="select_parent">主行业：</label>
                                                <select class="form-control" id="select_parent" ng-model="select_parent"
                                                        ng-options="x.categoryNameParent for x in selectParent" ng-change="changeParent()">
                                                </select>
                                            </div>
                                            <div class="form-group col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                                <label for="select_child">工作：</label>
                                                <select class="form-control" id="select_child" ng-model="select_child"
                                                        ng-options="x.categoryName for x in selectChild">
                                                </select>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                            <button type="button" class="btn btn-primary"  ng-click="addResumeJob()">添加</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--工作经验-->
                    <div class="panel panel-default">
                        <div class="panel-heading">工作经验</div>
                        <div class="panel-body">
                            <!--展示已选择的意向-->
                            <ul class="list-group">
                                <li class="list-group-item ng-cloak" ng-repeat="y  in work_experience" >
                                    <button type="button" class="close" ng-click="deleteWorkExperience(y.workTitle,y.workContent)">
                                        <span  style="color: red" class="glyphicon glyphicon-remove"></span>
                                    </button>
                                    <div class="clearfix"></div>
                                    <!--静态的表单-->
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <label class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">岗位：</label>
                                            <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                                <p class="form-control-static" ng-bind="y.workTitle"></p>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">工作内容：</label>
                                            <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                                <p class="form-control-static" ng-bind="y.workContent"></p>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                            <!--新增按钮-->
                            <button class="btn btn-success form-control" id="add_work_experience"
                                    data-toggle="modal" data-target="#work_experience_modal">
                                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增工作经验
                            </button>

                            <!--工作经验modal-->
                            <div class="modal fade" id="work_experience_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                            填写工作经验
                                        </div>
                                        <div class="modal-body form-horizontal">
                                            <div class="form-group">
                                                <label for="work_title_input" class="control-label
                                                col-xs-3 col-sm-3 col-md-3 col-lg-3 ">岗位：</label>
                                                <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
                                                    <input type="text" class="form-control" name="work_title" id="work_title_input"
                                                        ng-model="work_title">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="work_content_area" class="control-label
                                                col-xs-3 col-sm-3 col-md-3 col-lg-3 ">工作内容：</label>
                                                <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
                                                    <textarea class="form-control" id="work_content_area" rows="5"
                                                        ng-model="work_content"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                                            <button type="button" class="btn btn-primary"  ng-click="addWorkExperience()">添加</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--学校信息-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            学校信息
                            <span class="input-error ng-cloak" ng-show="!resumeForm.school.$dirty">
                                   * 学校名称必填
                            </span>
                            <span class="input-error ng-cloak" ng-show="!resumeForm.major.$dirty">
                                   * 专业名称必填
                            </span>
                        </div>
                        <div class="panel-body">
                            <div class="form-inline">
                                <div class="form-group ">
                                    <label for="school">学校名称：</label>
                                    <input type="text" class="form-control" id="school" name="school" placeholder="学校名称"
                                           ng-model="school" required="required">
                                </div>
                                <div class="form-group ">
                                    <label for="major">专业名称：</label>
                                    <input type="text" class="form-control" id="major" name="major" placeholder="专业名称"
                                           ng-model="major" required="required">
                                </div>
                                <div class="form-group ">
                                    <label for="education">学历：</label>
                                    <select class="form-control" id="education" name="education" ng-model="education">
                                        <option>专科</option>
                                        <option>本科</option>
                                        <option>硕士</option>
                                        <option>博士及其以上</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--联系方式-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            联系方式
                            <span class="input-error ng-cloak" ng-show="!resumeForm.phone.$dirty">
                                   * 手机号必填
                            </span>
                        </div>
                        <div class="panel-body">
                            <div class="form-inline">
                                <div class="form-group ">
                                    <label for="phone">手机号：</label>
                                    <input type="text" class="form-control" id="phone" name="phone" placeholder="手机号"
                                           ng-model="phone" required="required">
                                </div>
                                <div class="form-group ">
                                    <label for="qq">QQ：</label>
                                    <input type="text" class="form-control" id="qq" name="qq" placeholder="QQ"
                                           ng-model="qq">
                                </div>
                                <div class="form-group ">
                                    <label for="wechat">微信：</label>
                                    <input type="text" class="form-control" id="wechat" name="wechat" placeholder="微信"
                                           ng-model="wechat">
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--其他-->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            其他（自我介绍/兴趣爱好）
                            <span class="input-error ng-cloak" ng-show="!resumeForm.self_description.$dirty">
                                   * 必填
                            </span>
                        </div>
                        <div class="panel-body">
                            <textarea class="form-control" name="self_description" id="self_description" rows="6"
                                      ng-model="self_description" required="required"></textarea>
                        </div>
                    </div>

                    <!--附加-->
                    <div class="panel panel-default">
                        <div class="panel-heading">附加</div>
                        <div class="panel-body ">
                            <div class="row">
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                    <!--上传-->
                                    <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8
                                        col-xs-offset-4 col-sm-offset-4 col-md-offset-4 col-lg-offset-4">
                                        <label  class="control-label">上传照片</label>
                                    </div>
                                    <!--图片-->
                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                        <label for="image_file" class="btn col-xs-6 col-sm-6 col-md-6 col-lg-6
                                            col-xs-offset-3 col-sm-offset-3 col-md-offset-3 col-lg-offset-3">
                                            <img class="img-thumbnail "
                                             id="image_img" src="../../resource/images/default-image-user.png"
                                                 style="width: 140px;height: 100px;">
                                        </label>
                                    </div>
                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                        <!--照片-->
                                        <input class="form-control"  style="position:absolute;clip:rect(0 0 0 0);"
                                                type="file" name="image_file" id="image_file">
                                    </div>
                                </div>
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5
                                col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                                    <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8
                                            col-xs-offset-4 col-sm-offset-4 col-md-offset-4 col-lg-offset-4">
                                        <label  class="control-label" style="margin-bottom: 50px;">添加附件</label>
                                    </div>
                                    <!--合同附件-->
                                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                        <label class="btn-primary btn form-control" for="annex_resume" id="annex_resume_label">
                                            上传文件
                                        </label>
                                        <input class="form-control" type="file" name="annex_resume"
                                               style="position:absolute;clip:rect(0 0 0 0);" id="annex_resume">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--提交按钮-->
                    <div class="panel panel-default">
                        <div class="panel-heading col-xs-12 col-sm-12 col-md-12 col-lg-12">
                           <button type="submit" class="btn btn-danger col-xs-12 col-sm-12 col-md-12 col-lg-12"
                                   ng-click="submitResume()" ng-disabled="!resumeForm.$valid || resume_jobs.length<=0">提交简历</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript" src="../../resource/js/student-center-resume.js"></script>

</body>
</html>