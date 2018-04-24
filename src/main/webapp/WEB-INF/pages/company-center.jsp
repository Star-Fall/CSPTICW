<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>企业用户中心</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/company-center.css">
</head>
<body ng-app="" class="body container-fluid">
<div id="container-fluid">
<!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <span>上海站</span><a href="#">【切换城市】</a>
        </div>
        <!--登录注册部分-->
        <div class="login_out col-xs-offset-8 col-sm-offset-8 col-md-offset-8  col-md-offset-8 col-xs-2 col-sm-2 col-md-2 col-lg-2">

            用户信息
        </div>
    </div>
<!--log条-->
    <div class="nav_head row">
        <!--log图片-->
        <a href="#">
            <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
        </a>
        <div class="nav-path col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <a href="#">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;
            用户中心
        </div>
    </div>
<!--主体-->
    <div class="center-body row container">
        <!--菜单-->
        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!--信息-->
            <a href="#" class="left-nav-one list-group-item ">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                账号信息
            </a>
            <div class="left-nav-zhe ">
                <a href="" class="left-nav-module-child list-group-item <!--active-->">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    修改手机
                </a>
                <a href="" class="left-nav-module-child list-group-item <!--active-->">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    修改密码
                </a>
                <a href="" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    企业认证
                </a>
            </div>
            <!--简历-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业岗位
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布岗位
                </a>
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    岗位管理
                </a>
            </div>
            <!--邀请-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                收到简历
            </a>
            <!--投递-->
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业招聘
            </a>
            <div class="left-nav-zhe">
                <a href="#" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    招聘记录
                </a>
            </div>

            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业收藏
            </a>
            <a href="#" class="left-nav-one list-group-item">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业投诉
            </a>
        </div>

        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">

            <!--修改手机号-->
            <div class="row modify-phone">

            </div>

            <!--修改密码-->
            <div class="row modify-password">

            </div>

            <!--企业认证-->
            <!--暂未认证-->
            <div class="row sch-cert-no">
                暂无认证信息，<a href="">立即认证？</a>
            </div>
            <!--认证表单-->
            <div class="row sch-cert-form">
                <!--面板-->
                <div class="sch-cert-form-panel panel panel-default ">
                    <div class="panel-heading">
                        请填写认证信息
                    </div>
                    <div class="panel-body">
                        <!---->
                        <form name="cert-form" novalidate class="cert-form form-horizontal
                        col-xs-9 col-sm-9 col-md-9 col-lg-9 col-xs-offset-1 col-sm-offset-1 col-md-offset-1 col-lg-offset-1">
                            <!--企业名称-->
                            <div class="form-group">
                                <label for="school-name" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">企业名称：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="school-name" placeholder="企业全名">
                                </div>
                            </div>
                            <!--成立时间-->
                            <div class="form-group">
                                <label for="comp_establish_time" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">成立时间：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="comp_establish_time" placeholder="成立时间">
                                </div>
                            </div>
                            <!--企业法人-->
                            <div class="form-group">
                                <label for="legal_person" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">企业法人：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="legal_person" placeholder="企业法人">
                                </div>
                            </div>
                            <!--企业规模-->
                            <div class="form-group">
                                <label for="comp_size" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">企业规模：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="comp_size" placeholder="企业规模">
                                </div>
                            </div>
                            <!--企业性质-->
                            <div class="form-group">
                                <label for="comp_nature" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label">企业性质：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <select class="form-control" id="comp_nature">
                                        <option value="0">选择企业性质</option>
                                        <option value="民营">民营</option>
                                        <option value="国营">国营</option>
                                        <option value="外企">外企</option>
                                        <option value="合资">合资</option>
                                    </select>
                                </div>
                            </div>
                           <!--所属行业-->
                            <div class="form-group">
                                <label for="comp_industry" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label">所属行业：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <select class="form-control" id="comp_industry">
                                        <option value="0">选择所属行业</option>
                                        <option value="计算机">计算机</option>
                                        <option value="制造">制造</option>
                                        <option value="艺术">艺术</option>
                                        <option value="金融">金融</option>
                                    </select>
                                </div>
                            </div>
                            <!--企业性质-->
                            <div class="form-group">
                                <label for="comp_address" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label">企业地址：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10" id="comp_address">
                                    <select class="form-control">
                                        <option value="0">选择省份</option>
                                        <option value="民营">江苏</option>
                                    </select>
                                    <select class="form-control">
                                        <option value="0">选择市区</option>
                                        <option value="民营">苏州</option>
                                    </select>
                                </div>
                            </div>
                            <!--企业简介-->
                            <div class="form-group">
                                <label for="comp_introduction" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">企业简介：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <textarea class="form-control" rows="5" id="comp_introduction"  placeholder="企业简介"></textarea>
                                </div>
                            </div>
                            <!--营业执照-->
                            <div class="form-group">
                                <label for="card-picture" class="col-xs-2 col-sm-2 col-md-2 col-lg-2 control-label">营业执照：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10" id="card-picture">
                                    <div class="row">
                                        <!--照片1-->
                                        <div class="col-xs-offset-3 col-sm-offset-3 col-md-offset-3 col-lg-offset-3
                                         col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                            <div class="img-thumbnail card-pic-01 col-xs-9 col-sm-9 col-md-9 col-lg-9"></div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <input type="file" class="col-xs-offset-3 col-sm-offset-3 col-md-offset-3 col-lg-offset-3
                                         col-xs-5 col-sm-5 col-md-5 col-lg-5" name="" >
                                    </div>
                                </div>
                            </div>
                            <!--联系人姓名-->
                            <div class="form-group">
                                <label for="contact_name" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">联系人：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_name" placeholder="联系人姓名">
                                </div>
                            </div>
                            <!--联系电话-->
                            <div class="form-group">
                                <label for="contact_phone" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">联系电话：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_phone" placeholder="联系电话">
                                </div>
                            </div>
                            <!--企业邮箱-->
                            <div class="form-group">
                                <label for="contact_email" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">企业邮箱：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_email" placeholder="企业邮箱">
                                </div>
                            </div>
                            <!--提交-->
                            <div class="form-group">
                                <div class="col-xs-offset-4 col-sm-offset-4 col-md-offset-4 col-lg-offset-4
                                col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                    <button type="button" class="btn btn-success input-lg btn-lg form-control">提交认证</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!--认证信息-->
            <div class="row sch-cert-info">

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
</script>
</body>
</html>