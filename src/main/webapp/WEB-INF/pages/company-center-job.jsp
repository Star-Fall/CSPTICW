<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>发布岗位</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/company-center-certi.css">
</head>
<body ng-app="companyCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="companyJobController">
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
        <!--菜单-->
        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!--信息-->
            <a href="#" class="left-nav-one list-group-item ">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业认证
            </a>
            <div class="left-nav-zhe ">
                <a href="" class="left-nav-module-child list-group-item <!--active-->">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    认证信息
                </a>
            </div>
            <!--简历-->
            <a href="/to_comp_job_list" class="left-nav-one list-group-item active">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的岗位
            </a>
            <div class="left-nav-zhe"  style="display: block;">
                <a href="/to_comp_job" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布岗位
                </a>
                <a href="/to_comp_job_list" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    岗位列表
                </a>
            </div>
            <!--简历投递-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历应聘
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    简历列表
                </a>
            </div>
            <!--主动招聘-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的招聘
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    招聘记录
                </a>
            </div>
            <!--收藏-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的收藏
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收藏记录
                </a>
            </div>
            <!--投诉记录-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的投诉
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投诉记录
                </a>
            </div>
        </div>

        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            
            <!--认证表单-->
            <div class="row sch-cert-form">
                <!--面板-->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        发布岗位
                    </div>
                    <div class="panel-body">
                        <form novalidate name="jobForm" class="form-horizontal">
                            <!--标题和人数-->
                            <div class="form-group">
                                <label for="job_title" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label ">岗位名称：</label>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <input type="text" class="form-control" id="job_title" placeholder="岗位名称"
                                           name="job_title" required="required" ng-model="job_title">
                                    <span class="input-error ng-cloak" ng-show="jobForm.job_title.$error.required">
                                       * 必填
                                    </span>
                                </div>
                                <label for="person_num" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">招聘人数：</label>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <div class="input-group">
                                        <input type="number" class="form-control" id="person_num"
                                               name="person_num"  ng-model="person_num">
                                        <span class="input-group-addon">人</span>
                                    </div>

                                </div>
                            </div>
                            <!--兼职类别-->
                            <div class="form-group">
                                <label for="job_cate_id" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label ">类别：</label>
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5" id="job_cate_id">

                                    <select class="form-control" id="select_parent" ng-model="select_parent"
                                            ng-options="x.categoryNameParent for x in selectParent" ng-change="changeParent()">
                                    </select>
                                </div>
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5" >

                                    <select class="form-control" id="select_child" ng-model="select_child"
	                                        ng-options="x.categoryName for x in selectChild">
	                                </select>
                                </div>
                            </div>
                            <!--工作地点-->
                            <div class="form-group">
                                <label for="job_address" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label">工作地点：</label>
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5" id="job_address">
                                    
                                    <select class="form-control" id="select_province" ng-model="select_province"
                                            ng-options="x1.province for x1 in selectProvince" ng-change="changeProvince()">
                                    </select>
                                </div>
                                <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                    <select class="form-control" id="select_city" ng-model="select_city" 
                                            ng-options="x2.city for x2 in selectCity" >
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10
                                    col-xs-offset-2 col-sm-offset-2 col-md-offset-2 col-lg-offset-2">
                                    <input type="text" id="detail_address" class="form-control" placeholder="详细地址"
                                           name="detail_address" ng-model="detail_address" required="required">
                                    <span class="input-error ng-cloak" ng-show="jobForm.detail_address.$error.required">
                                       * 必填
                                    </span>
                                </div>
                            </div>
                            <!--待遇-->
                            <div class="form-group">
                                <label for="job_treat" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2 ">工作待遇：</label>
                                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 ">
                                    <div class="input-group">
                                        <input type="number" class="form-control" id="job_treat"
                                               name="job_treat"  ng-model="job_treat" required="required">
                                        <span class="input-group-addon">￥</span>
                                    </div>
                                    <span class="input-error ng-cloak" ng-show="jobForm.job_treat.$error.required">
                                       * 必填
                                    </span>
                                </div>

                                <label for="treat_method" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2 ">待遇方式：</label>
                                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 ">
                                    <select name="treat_method" id="treat_method" class="form-control" ng-model="treat_method">
                                        <option value="小时">/小时</option>
                                        <option value="天">/天</option>
                                        <option value="月">/月</option>
                                    </select>
                                </div>

                                <label for="pay_method" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2 ">结算方式：</label>
                                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 ">
                                    <select name="pay_method" id="pay_method" class="form-control" ng-model="pay_method">
                                        <option value="当日结">当日结</option>
                                        <option value="次日结">次日结</option>
                                        <option value="月结">月结</option>
                                        <option value="完工结">完工结</option>
                                    </select>
                                </div>
                            </div>
                            <!--工作内容-->
                            <div class="form-group">
                                <label for="job_content" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">工作内容：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <textarea class="form-control" rows="3" id="job_content"  placeholder="工作内容"
                                              name="job_content" ng-model="job_content" >
                                    </textarea>
                                </div>
                            </div>
                            <!--工作要求-->
                            <div class="form-group">
                                <label for="job_require" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">工作要求：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <textarea class="form-control" rows="3" id="job_require"  placeholder="工作要求"
                                              name="job_require" ng-model="job_require" >
                                    </textarea>
                                </div>
                            </div>
                            <!--联系方式-->
                            <div class="form-group">
                                <label for="contact_name" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2 ">联系人：</label>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <input type="text" class="form-control" id="contact_name" placeholder="联系人"
                                           name="contact_name" required="required" ng-model="contact_name">
                                    <span class="input-error ng-cloak" ng-show="jobForm.contact_name.$error.required">
                                       * 必填
                                    </span>
                                </div>
                                <label for="contact_phone" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2 ">联系电话：</label>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <input type="text" class="form-control" id="contact_phone" placeholder="联系电话"
                                           name="contact_phone" required="required" ng-model="contact_phone">
                                    <span class="input-error ng-cloak" ng-show="jobForm.contact_phone.$error.required">
                                       * 必填
                                    </span>
                                </div>
                            </div>
                            <!--发布-->
                            <div class="form-group">
                                <div class="col-xs-offset-4 col-sm-offset-4 col-md-offset-4 col-lg-offset-4
                                col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                    <button type="button" class="btn btn-success input-lg btn-lg col-xs-12 col-sm-12 col-md-12 col-lg-12"
                                            ng-disabled="!jobForm.$valid" ng-click="submitJob()" >发布</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript" src="../../resource/js/company-center-job.js"></script>

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
</script>
</body>
</html>