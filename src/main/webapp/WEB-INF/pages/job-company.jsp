<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>岗位公司详情</title>
    <link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/main.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/job-company.css">
</head>
<body ng-app="jobCompany" class="body container-fluid">
    <div id="container-fluid" ng-controller="jobCompanyController">
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
        <div class="nav_head row">
            <a href="/to_main">
                <div class="log_img col-xs-3 col-sm-3 col-md-3 col-lg-3 "></div>
            </a>
            <div class="nav-path col-xs-3 col-sm-3 col-md-3 col-lg-3">
                <a href="/to_main">首页</a>&nbsp;&nbsp;/&nbsp;&nbsp;岗位详情
            </div>
        </div>

        <div class="next row">
            <div class="panel-main panel panel-default col-sm-6 col-md-offset-2">
                <div class="panel-body">
                    <div class="panel-job-1 panel panel-warning">
                        
                        <div class="panel-body">
                            <div class="job-title col-md-12">
                                <h2>{{details.jobTitle}}</h2>
                            </div>
                            <div class="salary col-md-2">
                                <span class="fl salary-num">
                                    <b>{{details.jobTreat}}</b> 元/{{details.treatMethod}}
                                </span>

                            </div>
                            <div class="salary-tips col-md-10">
                                <span class="col-md-2">{{details.payMethod}}</span>

                                <span class="col-md-6">{{details.personNum}} 人</span>
                            </div>
                            <div class="button-groups col-md-12">
                                <div class="col-md-3">
                                    <button class="btn btn-danger col-md-12" 
                                    ng-click="chooseResume()"> 投递简历</button>
                                </div>
                                <div class="col-md-3">
                                    <button class="btn btn-default col-md-12"
                                    ng-click="collectJob()"> 收藏岗位</button>
                                </div>
                                <div class="col-md-3">
                                    <button class="btn btn-default col-md-12"
                                    ng-click="complainJob()"> 投诉</button>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                    <div class="panel-job-2 panel panel-default">
                        <div class="panel-heading"><h4>岗位详情</h4></div>
                        <table class="table">
                            <tr>
                                <th class="col-md-2">工作地点:</th>
                                <td class="col-md-10"><p>{{details.jobPlace}}</p></td>
                            </tr>
                            <tr>
                                <th>岗位类别:</th>
                                <td><p>{{details.jobCate}}</p></td>
                            </tr>
                            <tr>
                                <th>工作要求:</th>
                                <td><p>{{details.jobRequire}}</p></td>
                            </tr>
                            <tr>
                                <th>工作内容:</th>
                                <td><p>{{details.jobContent}}</p></td>
                            </tr>
                            <tr>
                                <th>联系方式:</th>
                                <td>
                                    <footer>
                                        <strong>{{details.contactName}}：</strong>
                                        <cite title="手机号码">
                                            {{details.contactPhone}}
                                        </cite>
                                    </footer>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <!--广告-->
            <a href="https://www.baidu.com/" target="_blank"><div class="panel-left ad col-sm-3"></div></a>

            <div class="panel-main panel panel-default col-sm-8 col-md-offset-2 ">
                <div class="panel-body ">
                    <div class="padding0 col-md-12">
                        <h4 ><strong>{{details.compName}}</strong> </h4>
                    </div>
                    <div class="comp-detailss">
                        <div class="padding0 col-md-2">
                            {{details.compEstablishTime | date:'yyyy-MM-dd'}}成立
                        </div>
                        <div class="padding0 col-md-1">{{details.compNature}}</div>
                        <div class="padding0 col-md-1">{{details.compSize}}人</div>
                        <div class="padding0 col-md-8">{{details.compIndustry}}</div>

                    </div>
                    <div class="padding0 col-md-12 comp-address">
                        <strong>地址： </strong>{{details.province}}&nbsp;&nbsp;{{details.city}}&nbsp;&nbsp;{{details.detailAddress}}
                    </div>
                    <div class="padding0 col-md-12 comp-introductions">
                        <strong>简介： </strong>
                        <p>{{details.compIntroduction}}</p>
                    </div>
                    <div class="padding0 col-md-12">
                        <footer>
                            <strong>{{details.compContactName}}：</strong>
                            <cite title="手机号码">
                                <strong>
                                {{details.compContactPhone}}
                                </strong>
                            </cite>

                            <cite title="邮箱">
                                {{details.compContactEmail}}
                            </cite>
                        </footer>
                    </div>
                </div>
            </div>
        </div>

        <!--chooseResumeModal-->
        <div class="modal fade" id="chooseResumeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">选择简历</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label for="select_resume" class="col-sm-3 control-label">选择简历：</label>
							    <div class="col-sm-9">
							   	 <!-- 简历选择框 -->
							      <select class="form-control" id="select_resume" ng-model="select_resume"
	                                      ng-options="x.resuName for x in resumeList">
	                              </select>
							    </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" ng-click="resumeToJob()">投递</button>
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
	var jobId="${requestScope.jobId }"
    var app=angular.module('jobCompany',[]);
    app.controller('jobCompanyController',function ($scope,$http) {
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
        	获取岗位初始化信息
        **/
        $http({
    		 url:'/get_company_job_id',
    		 method:'get',
    		 params:{"jobId":jobId}
   	    }).success(function(response, status, headers, config){
   	    	$scope.details=response.data;
   	   		
   	    });

        /**
         * 选择简历
         */
        $scope.chooseResume=function () {
            //判断用户
			//先获取我的简历
			$http({
				url:'/get_myresume_list',
	    	   	method:'get'
			}).success(function(response, status, headers, config){
				if(response.error){
					alert("请登录大学生用户！")
					return;
				}				
				$scope.resumeList=response.data;				
				if($.isEmptyObject($scope.resumeList)){
					alert("先去填写简历吧！");
					return;
				}else{
					$scope.select_resume=$scope.resumeList[0];
					$("#chooseResumeModal").modal("show")
				}				
			})
        }
        /**
         * 投递
         */
        $scope.resumeToJob=function () {        	
        	var jsonData={};
			jsonData.resumeId=$scope.select_resume.id;
			jsonData.jobId=jobId;
			$http({
				url:'/resume_to_job',
	    	   	method:'post',
	    	   	data:JSON.stringify(jsonData)
			}).success(function(response, status, headers, config){
				if(response.msg){
					alert("投递成功！");
		            $("#chooseResumeModal").modal("hide")
				}else if(response.error){
					if("5003"==response.error){
						alert("十天内不可重复投递,重新选择一份吧");
					}				
				}else{
					alert("系统错误");
		            $("#chooseResumeModal").modal("hide");					
				}
			})			
        }
        
        /**
        	收藏
        **/
		$scope.collectJob=function(){
			//先判断是否是企业用户
   	 		//如果没有登录
   	 		if($.isEmptyObject($scope.userRole)){
   	 			alert("请登录大学生用户！");
   	 			return;
   	 		} 
   	 		if($scope.userRole!="student"){
   	 			alert("请登录大学生用户！");
   	 			return;
   	 		}
	   	 	$http({
				url:'/add_record_student',
	    	   	method:'post',
	    	   	data:{"jobId":jobId}
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
        	投诉
        **/
        $scope.complainJob=function(){
        	//先判断是否是企业用户
   	 		//如果没有登录
   	 		if($.isEmptyObject($scope.userRole)){
   	 			alert("请登录大学生用户！");
   	 			return;
   	 		}
   	 		if($scope.userRole!="student"){
   	 			alert("请登录大学生用户！");
   	 			return;
   	 		}
   	 		$("#myModal2").modal("show");
        }
        
        $scope.applyComplain=function(){
   	 		var jsonData1={};
		   	jsonData1.complaintTitle=$scope.complaintTitle;
		   	jsonData1.complaintContent=$scope.complaintContent;
		   	jsonData1.jobId=jobId;
	   	 	$http({
				url:'/add_complaint_record_student',
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

</script>
</html>