<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>企业用户中心</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/company-center-certi.css">
</head>
<body ng-app="companyCenter" class="body container-fluid">
<div id="container-fluid" ng-controller="companyCenterCertiController">
<!--登录条-->
    <div class="nav_log row">
        <div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!-- <span>上海站</span><a href="">【切换城市】</a> -->
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
            <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href="/to_user_center">用户中心</a>
        </div>
    </div>
    
    
	<!--主体-->
    <div class="center-body row container">
        <%@include file="center-menu-company.jsp" %>
        <!--内容-->
        <div class="center-content col-xs-9 col-sm-9 col-md-9 col-lg-9">
            
            <!--认证表单-->
            <div class="row sch-cert-form">
                <!--面板-->
                <div class="sch-cert-form-panel panel panel-default ">
                    <div class="panel-heading">
                        请填写认证信息
                    </div>
                    <div class="panel-body">
                        <!---->
                        <form name="certiForm" novalidate class="cert-form form-horizontal">
                            <!--企业名称-->
                            <div class="form-group">
                                <label for="comp_name" class="control-label col-md-2">公司名称：</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" id="comp_name" placeholder="企业全名"
                                           name="comp_name" required="required" ng-model="comp_name">
                                    <span class="input-error ng-cloak" ng-show="certiForm.comp_name.$error.required">
                                       * 必填
                                    </span>
                                </div>
                                <label for="comp_home" class="control-label col-md-2">公司主页：</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" id="comp_home" placeholder="公司主页"
                                           ng-model="comp_home"  name="comp_home">
                                </div>
                            </div>

                            <!--成立时间-->
                            <div class="form-group">
                                <label for="comp_establish_time" class="control-label col-md-2">成立时间：</label>
                                <div class="col-md-4">
                                    <input type="date" class="form-control" id="comp_establish_time" placeholder="成立时间"
                                           ng-model="comp_establish_time" required="required" name="comp_establish_time">
                                    <span class="input-error ng-cloak" ng-show="certiForm.comp_establish_time.$error.required">
                                       * 必填
                                    </span>
                                </div>

                                <label for="comp_size" class="control-label col-md-2">公司规模：</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" id="comp_size" placeholder="公司规模"
                                           ng-model="comp_size" name="comp_size">
                                </div>
                            </div>

                            <!--企业规模-->
                            <div class="form-group">
                                <label for="comp_nature" class="control-label col-md-2">公司性质：</label>
                                <div class="col-md-4">
                                    <select class="form-control" id="comp_nature" ng-model="comp_nature" name="comp_nature">
                                        <option value="民营">民营</option>
                                        <option value="国营">国营</option>
                                        <option value="外企">外企</option>
                                        <option value="合资">合资</option>
                                    </select>
                                </div>
                                <label for="comp_industry" class="control-label col-md-2">所属行业：</label>
                                <div class="col-md-4">
                                	<select class="form-control" id="select_parent" ng-model="select_parent"
                                                        ng-options="x.categoryNameParent for x in selectParent">
                                    </select>

                                </div>
                            </div>

                            <!--企业地址-->
                            <div class="form-group">
                                <label for="comp_address" class="col-md-2 control-label">公司地址：</label>
                                <div class="col-md-5" id="comp_address">
                                
                                	<select class="form-control" id="select_province" ng-model="select_province"
                                            ng-options="x1.province for x1 in selectProvince" ng-change="changeProvince()">
                                    </select>

                                </div>
                                <div class="col-md-5">
                                
                                	<select class="form-control" id="select_city" ng-model="select_city" 
                                            ng-options="x2.city for x2 in selectCity" >
                                    </select>

                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-10 col-md-offset-2">
                                    <input type="text" id="detail_address" class="form-control" placeholder="详细地址"
                                           name="detail_address" ng-model="detail_address" required="required">
                                    <span class="input-error ng-cloak" ng-show="certiForm.detail_address.$error.required">
                                       * 必填
                                    </span>
                                </div>
                            </div>
                            <!--企业简介-->
                            <div class="form-group">
                                <label for="comp_introduction" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">公司简介：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <textarea class="form-control" rows="5" id="comp_introduction"  placeholder="公司简介"
                                              name="comp_introduction" ng-model="comp_introduction" required="required">
                                    </textarea>
                                    <span class="input-error ng-cloak" ng-show="certiForm.comp_introduction.$error.required">
                                       * 必填
                                    </span>
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
                                            <label for="business_license" class="btn">
                                                <img  id="image_img" src="../../resource/images/default-image-user.png"
                                                      class="img-thumbnail" style="height: 110px;">
                                            </label>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <input class="form-control"  style="position:absolute;clip:rect(0 0 0 0);"
                                               type="file" name="business_license" id="business_license">
                                    </div>
                                </div>
                            </div>
                            <!--联系人姓名-->
                            <div class="form-group">
                                <label for="contact_name" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">联系人：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_name" placeholder="联系人姓名"
                                           name="contact_name" required="required" ng-model="contact_name">
                                    <span class="input-error ng-cloak" ng-show="certiForm.contact_name.$error.required">
                                       * 必填
                                </span>
                                </div>

                            </div>
                            <!--联系电话-->
                            <div class="form-group">
                                <label for="contact_phone" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">联系电话：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_phone" placeholder="联系电话"
                                           name="contact_phone" required="required" ng-model="contact_phone">
                                    <span class="input-error ng-cloak" ng-show="certiForm.contact_phone.$error.required">
                                       * 必填
                                </span>
                                </div>

                            </div>
                            <!--公司邮箱-->
                            <div class="form-group">
                                <label for="contact_email" class="control-label col-xs-2 col-sm-2 col-md-2 col-lg-2">公司邮箱：</label>
                                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                                    <input type="text" class="form-control" id="contact_email" placeholder="公司邮箱"
                                           name="contact_email"  ng-model="contact_email">
                                </div>
                            </div>
                            <!--提交-->
                            <div class="form-group">
                                <div class="col-xs-offset-4 col-sm-offset-4 col-md-offset-4 col-lg-offset-4
                                col-xs-5 col-sm-5 col-md-5 col-lg-5">
                                    <button type="button" class="btn btn-success input-lg btn-lg col-xs-12 col-sm-12 col-md-12 col-lg-12"
                                            ng-disabled="!certiForm.$valid" ng-click="submitCerti()">提交认证</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            
            
            <!--认证信息-->
            <div class="row sch-cert-info">
                <div class="panel panel-default">
                    <div class="panel-heading">
                      	 认证信息
                        <span class="label label-success" ng-show="isCertified==0">认证</span>
                        <span class="label label-danger" ng-show="isCertified==1">认证失败</span>
                        <span class="label label-danger" ng-show="isCertified==2">待审查</span>
                        
                        <button class="btn btn-default" ng-click="modifyCerti()">修改</button>
                    </div>

                    <table class="table table-hover ">
                        <tr>
                           <th class="col-md-2">公司名称：</th>
                            <td class="col-md-4" ng-bind="compName"></td>
                           <th class="col-md-2">公司主页：</th>
                            <td class="col-md-4" >
                            	<a href="{{compHome}}" class="ng-cloak" target="_blank">{{compHome}}</a>
                            </td>
                        </tr>
                        <tr>
                            <th>成立时间：</th><td ng-bind="compEstablishTime"></td>
                            <th>公司规模：</th><td ng-bind="compSize"></td>
                        </tr>
                        <tr>
                            <th>公司性质：</th><td ng-bind="compNature"></td>
                            <th>所属行业：</th><td ng-bind="compIndustry"></td>
                        </tr>
                        <tr>
                            <th class="col-md-2">公司地址：</th>
                            <td colspan="3" class="col-md-10" ng-bind="detailAddress"></td>
                        </tr>
                        <tr>
                            <th >营业执照：</th>
                            <td >
                                <img  id="image_img1" ng-src="{{businessLicenseImg}}"
                                      class="img-thumbnail ng-cloak" style="height: 110px;">
                            </td>
                            <th >公司简介：</th>
                            <td  ng-bind="compIntroduction">

                            </td>
                        </tr>
                        <tr>
                            <th>联系人：</th><td ng-bind="contactName"></td>
                            <th>联系电话：</th><td ng-bind="contactPhone"></td>
                        </tr>
                        <tr>
                            <th>公司邮箱：</th><td ng-bind="contactEmail"></td>
                        </tr>

                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript" src="../../resource/js/company-center-certi.js"></script>
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
    /**读取图片**/
	$('#business_license').bind('change',function (e) {
	    e = e || window.event;
	    var file = e.target.files[0];
	    if (!/image\/\w+/.test(file.type)) {
	        alert("此处需要的是图片文件！");
	        //清空选择的文件
	        var obj = document.getElementById('business_license') ;
	        obj.select();
	        document.selection.clear();
	        return;
	    }
	    var reader = new FileReader();
	    reader.readAsDataURL(file);
	    reader.onload = function (f) {
	        $('#image_img').attr('src',this.result);
	    }
	})
</script>
</body>
</html>