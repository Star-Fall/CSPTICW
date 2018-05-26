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
                                                <img  id="image_img" ng-src="{{business_license}}"
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
                                            ng-disabled="!certiForm.$valid" ng-click="submitCerti()">提交修改</button>
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
    var app=angular.module('companyCenter',[]);
    app.controller('companyCenterCertiController',function ($scope,$http) {
    	$scope.centerMenu=1;
    	//首先请求用户的数据
    	$http({
            url:'/get_login_user',
            method:'get'
        }).success(function(response, status, headers, config){
        	//已登录
        	 if(response.data){
        		 $(".login_info").css("display","block");
        		 $scope.loginUser=response.data;
        	 }else{
        		 $(".login_info").css("display","none");
        	 }
        	 
        })
        //获取认证信息
        $http({
	        url:'/get_comp_certi',
	        method:'get'
	    }).success(function(response, status, headers, config){
	    	
	    	var compInfoCerti=response.data;
	    	$scope.comp_name=compInfoCerti.compName;
	    	$scope.comp_home=compInfoCerti.compHome;
	    	$scope.comp_establish_time=new Date(compInfoCerti.compEstablishTime);
	    	$scope.comp_size=compInfoCerti.compSize;
	    	$scope.comp_nature=compInfoCerti.compNature;
	    	
	    	
	    	//初始化行业
		    $http({
		    	url:'/get_job_category',
			   	method:'get'
		    }).success(function(response, status, headers, config){
		    	//填充到selectParent 数据源
		    	$scope.selectParent=response.data;
		    	//赋值
		    	for(var i=0;i<$scope.selectParent.length;i++){
		            if($scope.selectParent[i].categoryNameParent==compInfoCerti.compIndustry){
		                $scope.select_parent=$scope.selectParent[i];
		            }
		        }
			});
		  	//初始化城市
			$http({
				url:'/get_province_city',
				method:'get'
			}).success(function(response, status, headers, config){
				//填充到selectProvince 数据源
				$scope.selectProvince=response.data;
				//初始化第一个
		        for(var i=0;i<$scope.selectProvince.length;i++){
		            if($scope.selectProvince[i].province==compInfoCerti.province){
		                $scope.select_province=$scope.selectProvince[i];
		            }
		        }
		      	//填充到selectCity 数据源
		        $scope.selectCity=$scope.select_province.cityList;
		        //初始化第一个
		        for(var i=0;i<$scope.select_province.cityList.length;i++){
		            if($scope.select_province.cityList[i].city==compInfoCerti.city){
		                $scope.select_city=$scope.select_province.cityList[i];
		            }
		        }
			});  
			$scope.changeProvince=function(){
				$scope.selectCity=$scope.select_province.cityList;
				$scope.select_city=$scope.selectCity[0];
			}
	    	
	    	$scope.detail_address=compInfoCerti.detailAddress;
	    	$scope.comp_introduction=compInfoCerti.compIntroduction;
	    	$scope.contact_name=compInfoCerti.contactName;
	    	$scope.contact_phone=compInfoCerti.contactPhone;
	    	$scope.contact_email=compInfoCerti.contactEmail;
	    	
	    	//头像
	        $scope.business_license="";
	        if(compInfoCerti.businessLicense){
	            //赋值为真是路径
	        	//处理文件路径问题
	            $scope.business_license="../../../upfile/company/"+compInfoCerti.businessLicense;
	        }else{
	            //默认路径
	            $scope.business_license="../../resource/images/default-image-user.png";
	        }
	        
	        
	      	//提交
	        $scope.submitCerti=function () {
	            var formData= new FormData();
	            var jsonData={};
	            jsonData.id=compInfoCerti.id;
	            jsonData.createTime=compInfoCerti.createTime;
	            jsonData.compId=compInfoCerti.compId;
	            jsonData.compName=$scope.comp_name;
	 	    	jsonData.compHome=$scope.comp_home;
	 	    	jsonData.compEstablishTime=$scope.comp_establish_time;
	 	    	jsonData.compSize=$scope.comp_size;
	 	    	jsonData.compNature=$scope.comp_nature;
	 	    	jsonData.compIndustry=$scope.select_parent.categoryNameParent;
	 	    	jsonData.province=$scope.select_province.province;
	 	    	jsonData.city=$scope.select_city.city;
	 	    	jsonData.detailAddress=$scope.detail_address;
	 	    	jsonData.compIntroduction=$scope.comp_introduction;
	 	    	jsonData.contactName=$scope.contact_name;
	 	    	jsonData.contactPhone=$scope.contact_phone;
	 	    	jsonData.contactEmail=$scope.contact_email;
	 	    	
	 	    	var businessLicense=document.getElementById("business_license").files[0];
	 	        formData.append('businessLicense',businessLicense);
	 	        formData.append('jsonData',JSON.stringify(jsonData));
	            
	 	       	$http({
	 	        	url:'/update_company_certi',
	 	    	   	method:'post',
	 	    	   	data: formData,
	 	            headers: {'Content-Type': undefined},
	 	            transformRequest: angular.identity
	 	        }).success(function(response, status, headers, config){
	 	        	//成功
	 	        	if(response.msg){
	 	        		alert("修改成功，等待审核")
	 	        		//跳转
	 	                window.location.href="/to_user_center";
	 	        	}else if(response.error){
	 	        		if(response.error=='3000'){
	 	                    alert("文件上传错误")
	 	                }else if(response.error=='4003'){
	 	                    alert("认证信息修改错误")
	 	                }else{
	 	                    alert("系统错误！")
	 	                }
	 	        	}
	 	    	});
	        }
	    })    	
    })
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