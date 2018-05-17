<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>简历预览</title>
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/resume-preview.css">
</head>
<body ng-app="resume" class="body container-fluid">

    <div class="panel-container col-md-10 col-md-offset-1" ng-controller="resumePreviewController">
        <div class="row">
            <a href="/to_main">
                <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
            </a>
            <div class="col-md-2">
                <button class="btn btn-default col-md-12" 
                ng-click="chooseJob()">兼职邀请</button>
            </div>
            <div class="col-md-2">
                <button class="btn btn-default col-md-12"
                ng-click="collectResume()">收藏简历</button>
            </div>
            <div class="col-md-1">
                <button class="btn btn-default col-md-12"
                ng-click="complainResume()">投诉</button>
            </div>
            <div class="col-md-4">
                <a class=" btn btn-link col-md-12 ng-cloak" id="down_file_a"  
                	ng-cloak type="button" ng-show="resumeDetail.annexResume"></a>
            </div>
        </div>

        <div class="panel ">
            <div class="panel-heading">
                <div class="resume-name col-md-12 ">
                    <h3 class="ng-cloak" ng-cloak ng-bind="resumeDetail.resuName"></h3>
                </div>
            </div>
            <div class="panel-body" ng-cloak>
                <div class="row">
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon glyphicon-user"></span>
                        基本信息
                    </div>
                    <!--基本信息-->
                    <div class="col-md-5 col-md-offset-1">
                        <table class="table table-hover" ng-cloak>
                            <tr>
                                <th>姓名:</th>
                                <td class="ng-cloak" ng-bind="resumeDetail.realName"></td>
                            </tr>
                            <tr>
                                <th>年龄:</th>
                                <td class="ng-cloak" ng-bind="resumeDetail.age + '岁'"></td>
                            </tr>
                            <tr>
                                <th>性别:</th>
                                <td class="ng-cloak" ng-bind="resumeDetail.gender"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="col-md-3 col-md-offset-2">
                        <img ng-src="{{resumeDetail.idPhoto}}"
                             class="img-thumbnail" style="height: 120px;">
                    </div>
                    <!--求职信息-->
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon glyphicon-th-list"></span>
                        求职信息
                    </div>
                    <div class="col-md-10 col-md-offset-1">
                        <table class="table table-hover ng-cloak" ng-cloak>
                            <tr>
                                <th class="col-md-2">求职地点:</th>
                                <td class="col-md-10 ng-cloak" ng-bind="resumeDetail.province +' '+ resumeDetail.city">
                                </td>
                            </tr>
                            <tr>
                                <th>求职意向:</th>
                                <td>
                                    <ul class="list-inline">
                                        <li ng-repeat="x in resumeDetail.resumeJobs" class="ng-cloak" ng-bind="x.categoryName">
                                        </li>
                                    </ul>
                                </td>
                            </tr>
                        </table>
                    </div>

                    <!--工作经验-->
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon  glyphicon-align-left"></span>
                        工作经验
                    </div>
                    <div class="col-md-10 col-md-offset-1">
                        <table class="table table-hover ng-cloak" ng-cloak>
                            <tr ng-repeat-start="y in resumeDetail.workExperiences"
                                class="info"><th colspan="2" class="ng-cloak" >工作{{$index+1}}</th></tr>
                            <tr>
                                <th class="col-md-2">岗位:</th>
                                <td class="col-md-10 ng-cloak">{{y.workTitle}}</td>
                            </tr>
                            <tr ng-repeat-end="" >
                                <th>工作内容:</th>
                                <td class="ng-cloak">{{y.workContent}}</td>
                            </tr>
                        </table>
                    </div>
                    <!--学校信息-->
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon  glyphicon-align-center"></span>
                        学校信息
                    </div>
                    <div class="col-md-10 col-md-offset-1">
                        <table class="table table-hover ">
                            <th class="col-md-2 ng-cloak">学校名称:</th>
                            <td class="col-md-2 ng-cloak">{{resumeDetail.school}}</td>
                            <th class="col-md-2 ng-cloak">专业名称:</th>
                            <td class="col-md-2 ng-cloak">{{resumeDetail.major}}</td>
                            <th class="col-md-2 ng-cloak">学历:</th>
                            <td class="col-md-2 ng-cloak">{{resumeDetail.education}}</td>
                        </table>
                    </div>

                    <!--通讯方式-->
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon  glyphicon-earphone"></span>
                        通讯方式
                    </div>
                    <div class="col-md-10 col-md-offset-1">
                        <table class="table table-hover ng-cloak">
                            <th class="col-md-2">手机号码:</th>
                            <td class="col-md-2">{{resumeDetail.phone}}</td>
                            <th class="col-md-2">QQ:</th>
                            <td class="col-md-2">{{resumeDetail.qq}}</td>
                            <th class="col-md-2">微信:</th>
                            <td class="col-md-2">{{resumeDetail.wechat}}</td>
                        </table>
                    </div>
                    <!--其他-->
                    <div class="rusume-title col-md-10 col-md-offset-1">
                        <span class="glyphicon  glyphicon-asterisk"></span>
                        其他（自我介绍/兴趣爱好）
                    </div>
                    <div class="col-md-10 col-md-offset-1 ng-cloak">
                        {{resumeDetail.selfDescription}}
                    </div>
                </div>
            </div>
        </div>
    
    	<!-- Modal -->
			<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">选择岗位</h4>
			      </div>
			      <div class="modal-body">
			        	<form class="form-horizontal">
			        	<div class="form-group">
						    <label for="select_job" class="col-sm-3 control-label">选择岗位：</label>
						    <div class="col-sm-9">
						   	 <!-- 简历选择框 -->
						      <select class="form-control" id="select_job" ng-model="select_job"
                                      ng-options="x.jobTitle for x in jobList">
                              </select>
						    </div>
						  </div>
			        	</form>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			        <button type="button" class="btn btn-primary" ng-click="jobToResume()">确定</button>
			      </div>
			    </div>
			  </div>
			</div>
			
			
			<!-- 投诉Modal -->
			<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">填写投诉</h4>
			      </div>
			      <div class="modal-body">
			        <form class="form-horizontal">
			        	<div class="form-group">
						    <label for="complaintTitle" class="col-sm-2 control-label" style="padding: 0px">投诉标题：</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" ng-model="complaintTitle" id="complaintTitle" placeholder="标题">
						    </div>
						</div>
					  	<div class="form-group">
						    <label for="complaintContent" class="col-sm-2 control-label" style="padding: 0px">投诉内容：</label>
						    <div class="col-sm-9">
						   	 	<textarea class="form-control" rows="6" ng-model="complaintContent"  id="complaintContent" placeholder="内容"></textarea>
						    </div>
					  	</div>
			        </form>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			        <button type="button" class="btn btn-primary" ng-click="applyComplain()">确定</button>
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
	var resumeId="${requestScope.resumeId }";
    var app=angular.module('resume',[]);
    app.controller('resumePreviewController',function ($scope,$http) {
    	
    	//首先请求用户的数据
    	$http({
            url:'/get_login_user',
            method:'get'
        }).success(function(response, status, headers, config){
        	//已登录
        	 if(response.data){
        		 $scope.loginUser=response.data;
        		 $scope.userRole=response.userRole;
        	 }else{
        	 }
        })
    	
        /**
        	获取简历详细信息
        **/
    	$http({
    		 url:'/get_resume_detail_id',
    		 method:'get',
    		 params:{"resumeId":resumeId}
   	    }).success(function(response, status, headers, config){
   	    	$scope.resumeDetail=response.data;
   	   		//头像
	   	     if($scope.resumeDetail.idPhoto){
	   	         //赋值为真是路径
	   	     	//处理文件路径问题
	   	         $scope.resumeDetail.idPhoto="../../../upfile/student/"+$scope.resumeDetail.idPhoto;
	   	     }else{
	   	         //默认路径
	   	         $scope.resumeDetail.idPhoto="../../resource/images/default-image-user.png";
	   	     }
	   	     //文件名
	   	     if($scope.resumeDetail.annexResume){
	   	    	var fileName=$scope.resumeDetail.annexResume;
    			fileName=fileName.slice(fileName.indexOf('\\')+1);
    			$("#down_file_a").html(textLengthSet(fileName,true,15,'...'))
    			var href="/down_resume_file?fileName=";
    			href+=fileName;
    			href+="&stuId=";
    			href+=$scope.resumeDetail.stuId;
    			$("#down_file_a").attr('href',href);
	   	     }
   	    });
    	 //先选择岗位
   	 	$scope.chooseJob=function(){
   	 		//先获取我的简历
			$http({
				url:'/get_mycomp_job_list',
	    	   	method:'get'
			}).success(function(response, status, headers, config){
				if(response.error){
					alert("请登录企业用户！")
					return;
				}				
				$scope.jobList=response.data;				
				if($.isEmptyObject($scope.jobList)){
					alert("先去填写简历吧！");
					return;
				}else{
					$scope.select_job=$scope.jobList[0];
					$("#myModal1").modal('show');
				}				
			})
    	}
   	 	//兼职邀请
   	 	$scope.jobToResume=function(){
   	 		var jsonData={};
			jsonData.resumeId=resumeId;
			jsonData.jobId=$scope.select_job.id;
			$http({
				url:'/job_to_resume',
	    	   	method:'post',
	    	   	data:JSON.stringify(jsonData)
			}).success(function(response, status, headers, config){
				if(response.msg){
					alert("邀请成功！");
					$("#myModal1").modal('hide');
				}else if(response.error){
					if("5004"==response.error){
						alert("十天内不可重复邀请");
						$("#myModal1").modal('hide');
					}				
				}else{
					alert("系统错误");
					$("#myModal1").modal('hide');
				}
			})
 		}
   	 	/**
   	 	收藏
   	 	**/
   	 	$scope.collectResume=function(){
   	 		//先判断是否是企业用户
   	 		//如果没有登录
   	 		if($.isEmptyObject($scope.userRole)){
   	 			alert("请登录企业用户！");
   	 			return;
   	 		} 
   	 		if($scope.userRole!="company"){
   	 			alert("请登录企业用户！");
   	 			return;
   	 		}
   	 		//
	   	 	$http({
				url:'/add_record_company',
	    	   	method:'post',
	    	   	data:{"resumeId":resumeId}
			}).success(function(response, status, headers, config){
				if(response.msg){
					alert("收藏成功！");
				}else if(response.error){
					if("6002"==response.error){
						alert("已经收藏过了");
					}else if("6001"==response.error){
						alert("收藏失败");
					}
				}else{
					alert("系统错误");
				}
			})
   	 	}
   	 	/**
   	 	投诉简历
   	 	**/
   	 	$scope.complainResume=function(){
   	 	//先判断是否是企业用户
   	 		//如果没有登录
   	 		if($.isEmptyObject($scope.userRole)){
   	 			alert("请登录企业用户！");
   	 			return;
   	 		}
   	 		if($scope.userRole!="company"){
   	 			alert("请登录企业用户！");
   	 			return;
   	 		}
   	 		$("#myModal2").modal("show");
   	 	}
   	 	
   	 	$scope.applyComplain=function(){
   	 		var jsonData1={};
		   	jsonData1.complaintTitle=$scope.complaintTitle;
		   	jsonData1.complaintContent=$scope.complaintContent;
		   	jsonData1.resumeId=resumeId;
	   	 	$http({
				url:'/add_complaint_record_company',
	    	   	method:'post',
	    	   	data:JSON.stringify(jsonData1)
			}).success(function(response, status, headers, config){
				if(response.msg){
					alert("投诉成功！");
				}else if(response.error){
					if("6003"==response.error){
						alert("投诉失败");
					}
				}else{
					alert("系统错误");
				}
				$("#myModal2").modal("hide");
			})
   	 	}
    });
    
    /**
    	截取超出的长度
    **/
    function textLengthSet(value, wordwise, max, tail){
    	if (!value) return '';
        max = parseInt(max, 10);
        if (!max) return value;
        if (value.length <= max) return value;
        value = value.substr(0, max);
        if (wordwise) {
            var lastspace = value.lastIndexOf(' ');
            if (lastspace != -1) {
                value = value.substr(0, lastspace);
            }
        }
        return value + (tail || ' …');//'...'可以换成其它文字
    }
    /* ng-bind="resumeDetail.annexResume | textLengthSet:true:15:'...'"
    app.filter('textLengthSet', function() {
        return function(value, wordwise, max, tail) {
            if (!value) return '';
            max = parseInt(max, 10);
            if (!max) return value;
            if (value.length <= max) return value;
            value = value.substr(0, max);
            if (wordwise) {
                var lastspace = value.lastIndexOf(' ');
                if (lastspace != -1) {
                    value = value.substr(0, lastspace);
                }
            }
            return value + (tail || ' …');//'...'可以换成其它文字
        };
    }); */
</script>
</html>