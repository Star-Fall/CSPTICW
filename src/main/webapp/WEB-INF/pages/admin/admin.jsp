<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
    <link href="../../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../../resource/css/admin.css">
</head>
<body ng-app="admin" class="body container-fluid">
<div id="container-fluid" ng-controller="adminController">
<form name="angularForm">
    <div class="center-body row container" >
	
        <!--新增行业-->
        <div class="panel panel-default">
            <div class="panel-heading">新增行业</div>
            <div class="form-horizontal panel-body">
                <!--先选择主行业-->
                <div class="form-group">
                    <label for="select_main" class="col-sm-2 control-label">主行业：</label>
                    <div class="col-sm-8">
                        <select class="form-control" id="select_main" ng-model="parent_category"
                                ng-options="x.categoryName for x in categoryArray">
                        </select>
                    </div>
                </div>
                <!--填写子行业-->
                <div class="form-group">
                    <label for="second_cate" class="col-sm-2 control-label">子行业：</label>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" id="second_cate" placeholder="子行业"
                               ng-model="categoryName" name="categoryName">
                    </div>
                </div>
                <!--提交-->
                <div class="form-group">
                    <div class="col-sm-8 col-sm-offset-2">
                        <input class="btn btn-success form-control" type="button" value="提交"
                               ng-click="submitAdd()" >
                    </div>
                </div>
            </div>
        </div>
        <!-- 企业认证 -->
        <div class="panel panel-default">
            <div class="panel-heading">企业信息审核认证</div>
            <table class="table">
				<tr>
					<th class="col-md-4">企业名称</th>
					<th class="col-md-2">时间</th>
					<th class="col-md-2">状态</th>
					<th class="col-md-4">操作</th>
				</tr>
				<tr ng-repeat="x in certiInfoList">
					<td ng-cloak><a href="" ng-click="detailCerti(x)">{{x.compName}}</a></td>
					<td ng-bind="x.createTime | date:'yyyy-MM-dd hh:mm:ss'"></td>
					<td>
						<span class="label label-default" ng-show="x.isCertified == 2">未审核</span>
                        <span class="label label-success" ng-show="x.isCertified == 0">已认证</span>
                        <span class="label label-danger" ng-show="x.isCertified == 1">认证失败</span>
					</td>
					<td>
						<button class="btn btn-success" ng-click="updateCerti(x.id,0,x.isCertified)" ng-class="{disabled : x.isCertified != 2}">认证通过</button>
						<button class="btn btn-danger" ng-click="updateCerti(x.id,1,x.isCertified)"  ng-class="{disabled : x.isCertified != 2}">不通过</button>
					</td>
				</tr>
			</table>
			<!-- 认证分页 -->
            <div class="panel-body" style="padding: 0px;padding-left: 10px">
            	<nav aria-label="Page navigation" >
					<ul class="pagination">
						<li ng-class="{false:'disabled'}[hasPreviousPage]">
							<a href="" aria-label="Previous" ng-click="previousPage()">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
						<li ng-repeat="x in navigatepageNums" ng-class="{'active':x == pageNum}">
							<a href="" ng-bind="x" ng-click="changePage(x)"></a>
						</li>
						<li ng-class="{false:'disabled'}[hasNextPage]">
							<a href="" aria-label="Next" ng-click="nextPage()">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</ul>
				</nav>
           	</div>
           	<!-- xiangxi -->
           	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog modal-lg" role="document">
				    <div class="modal-content">
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					        <h4 class="modal-title" id="myModalLabel">详情</h4>
					      </div>
					      <div class="modal-body">
					      	<table class="table table-hover ">
		                        <tr>
		                           <th class="col-md-2">公司名称：</th>
		                            <td class="col-md-4" ng-bind="compName"></td>
		                           <th class="col-md-2">公司主页：</th>
		                            <td class="col-md-4" >
		                            	<a href="{{compHome}}" class="ng-cloak">{{compHome}}</a>
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
					      <div class="modal-footer">
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					      </div>
				    </div>
			  </div>
			</div>
        </div>
        <!--投诉  -->
        <div class="panel panel-default">
            <div class="panel-heading">投诉处理</div>
            
            <div class="panel-body">
            	<ul class="nav nav-pills nav-justified">
	                <li role="presentation" ng-click="changecomplaintMode(0)"
	                	 ng-class="{'0':'active'}[complaintModeGlobal]" >
	                    <a  href="">投诉岗位</a>
	                </li>
	                <li role="presentation" ng-click="changecomplaintMode(1)" 
	                	ng-class="{'1':'active'}[complaintModeGlobal]">
	                    <a  href="">投诉简历</a>
	                </li>
                </ul>
         	</div>
         	<!--投诉列表  -->
         	<table class="table">
				<tr>
					<th class="col-md-4">
						<div ng-show="complaintModeGlobal==0">投诉的岗位</div>
						<div ng-show="complaintModeGlobal==1">投诉的简历</div>
					</th>
					<th class="col-md-2">时间</th>
					<th class="col-md-2">状态</th>
					<th class="col-md-4">操作</th>
				</tr>
				<tr ng-repeat="x in complaintRecordList">
					<td ng-cloak>
						<div ng-show="complaintModeGlobal==0" ng-cloak="">
							<a href="to_job_company?id={{x.jobId}}" target="_blank" >
							{{x.jobTitle}}
							</a>
						</div>
						<div ng-show="complaintModeGlobal==1" ng-cloak="">
							<a href="to_resume_preview?id={{x.resumeId}}"  target="_blank" >
							{{x.resuName}}
							</a>
						</div>
						
					</td>
					<td ng-bind="x.createTime | date:'yyyy-MM-dd hh:mm:ss'"></td>
					<td>
						<span class="label label-default" ng-show="x.status == 0">未处理</span>
                        <span class="label label-success" ng-show="x.status == 1">已处理</span>
					</td>
					<td>
						<button class="btn btn-success" ng-click="handleRecord(x)" ng-show="x.status == 0">处理</button>
						<button class="btn btn-danger" ng-click="handleRecord(x)"  ng-show="x.status == 1">重新处理</button>
					</td>
				</tr>
			</table>
			<!-- 分页 -->
			<div class="panel-body" style="padding: 0px;padding-left: 10px">
				<nav aria-label="Page navigation" >
					<ul class="pagination">
						<li ng-class="{false:'disabled'}[hasPreviousPage2]">
							<a href="" aria-label="Previous" ng-click="previousPage2()">
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
						<li ng-repeat="x in navigatepageNums2" ng-class="{'active':x == pageNum2}">
							<a href="" ng-bind="x" ng-click="changePage2(x)"></a>
						</li>
						<li ng-class="{false:'disabled'}[hasNextPage]">
							<a href="" aria-label="Next" ng-click="nextPage2()">
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</ul>
				</nav>
			</div>
			<!-- 投诉详情 -->
			<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				  <div class="modal-dialog" role="document">
					    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						        <h4 class="modal-title" id="myModalLabel">详情</h4>
						      </div>
						      <div class="modal-body">
						      	<table class="table" style="text-align: center;" >
						      		<tr>
						      			<td ng-bind="complaintRecordDetail.complaintTitle"></td>
						      		</tr>
						      		<tr>
						      			<td ng-bind="complaintRecordDetail.complaintContent"></td>
						      		</tr>
						      		<tr style="color: red"style="color: red">
						      			<td >
						      			<!-- 处理结果 -->
						      				<textarea  id="handleResult" class="form-control" rows="3" 
						      				ng-model="savehandleResultText"></textarea>
						      			</td>
						      		</tr>
								</table>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						        <button type="button" class="btn btn-primary" ng-click="saveHandleResult()">确定</button>
						      </div>
					    </div>
				  </div>
			</div>
        </div>
    </div>
    </form>
</div>
</body>
<script type="text/javascript" src="../../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../../resource/js/angular.js"></script>
<script type="text/javascript">
    var app=angular.module('admin',[]);
    app.controller('adminController',function ($scope,$http) {
    	//主行业
        $scope.categoryArray=null;
    	//发请求
    	$http({
    		url:'/find_main_category',
    		method:'get'
    	}).success(function(response, status, headers, config){
    		$scope.categoryArray=response.data;
    		$scope.parent_category=response.data[0];
    	}).error(function(response, status, headers, config){
    	});
    	
        

        //发起请求
        //子行业
        $scope.categoryName="";
        
        $scope.submitAdd=function () {
        	$scope.formData={'parentId':$scope.parent_category.id,'categoryName':$scope.categoryName};
        	$http({
        		url:'/add_job_category',
        		method:'post',
        	   	data:$scope.formData
        	}).success(function(response, status, headers, config){
        		if(response.msg){
        			if(response.msg=='success'){
        				alert("新增成功！")
        			}
        		}else{
        			alert("新增失败！请稍后重试")
        		}
        	}).error(function(response, status, headers, config){
        		alert(status)
        	});
        }
        
        //请求企业认证列表
        $http({
    		url:'/get_compcerti_admin',
    		method:'get'
    	}).success(function(response, status, headers, config){
    		var certiInfoData=response.data;
    		$scope.certiInfoList=certiInfoData.list;
    		//所有页码
			$scope.navigatepageNums=certiInfoData.navigatepageNums;
			$scope.hasPreviousPage=certiInfoData.hasPreviousPage;
	        $scope.hasNextPage=certiInfoData.hasNextPage;
	        $scope.pageNum=certiInfoData.pageNum;
    	})
    	//详情
    	$scope.detailCerti=function(item){
        	 $scope.compName=item.compName;
    		 $scope.compHome=item.compHome;
	 	     $scope.compEstablishTime=item.compEstablishTime;
	 	     $scope.compSize=item.compSize;
	 	     $scope.compNature=item.compNature;
	 	     $scope.compIndustry=item.compIndustry;
	 	     $scope.Province=item.province;
	 	     $scope.City=item.city;
	 	     $scope.detailAddress=item.Province+'  '+ item.City+'  '+item.detailAddress;
	 	     $scope.compIntroduction=item.compIntroduction;
	 	     $scope.contactName=item.contactName;
	 	     $scope.contactPhone=item.contactPhone;
	 	     $scope.contactEmail=item.contactEmail;
	 	     $scope.businessLicenseImg="";
	 	     //处理图像
	 	     if(item.businessLicense){
	 	    	//赋值为真是路径
	 	    	//处理文件路径问题
	 	        $scope.businessLicenseImg="../../../upfile/company/"+item.businessLicense;
	 	     }else{
	 	    	//默认路径
	 	        $scope.businessLicenseImg="../../resource/images/default-image-user.png";
	 	     }
        	//显示
    		$('#myModal').modal('show')
        }
    	//更新
    	$scope.updateCerti=function(id,val,isCertified){
        	if(isCertified!=2){
        		return;
        	}
        	if(!window.confirm("确认操作吗?")){
    			return;
    		}
        	$http({
	    		url:'/update_company_certi_admin',
	    		method:'post',
	    		data:{'recordId':id,'isCertified':val}
	    	}).success(function(response, status, headers, config){
	    		$http({
	        		url:'/get_compcerti_admin',
	        		method:'get',
	        		params:{'pageNum':$scope.pageNum}
	        	}).success(function(response, status, headers, config){
	        		var certiInfoData=response.data;
	        		$scope.certiInfoList=certiInfoData.list;
	        		//所有页码
	    			$scope.navigatepageNums=certiInfoData.navigatepageNums;
	    			$scope.hasPreviousPage=certiInfoData.hasPreviousPage;
	    	        $scope.hasNextPage=certiInfoData.hasNextPage;
	    	        $scope.pageNum=certiInfoData.pageNum;
	        	})
	    	})
        }
    	//分页
        $scope.previousPage=function () {
    	   if(!$scope.hasPreviousPage)return;
    	   //发请求
    	   $http({
	    		url:'/get_compcerti_admin',
	    		method:'get',
	    		params:{'pageNum':$scope.pageNum-1}
	    	}).success(function(response, status, headers, config){
	    		var certiInfoData=response.data;
	    		$scope.certiInfoList=certiInfoData.list;
	    		//所有页码
				$scope.navigatepageNums=certiInfoData.navigatepageNums;
				$scope.hasPreviousPage=certiInfoData.hasPreviousPage;
		        $scope.hasNextPage=certiInfoData.hasNextPage;
		        $scope.pageNum=certiInfoData.pageNum;
	    	})
        }
        $scope.changePage=function (x) {
	   		$http({
	    		url:'/get_compcerti_admin',
	    		method:'get',
	    		params:{'pageNum':x}
	    	}).success(function(response, status, headers, config){
	    		var certiInfoData=response.data;
	    		$scope.certiInfoList=certiInfoData.list;
	    		//所有页码
				$scope.navigatepageNums=certiInfoData.navigatepageNums;
				$scope.hasPreviousPage=certiInfoData.hasPreviousPage;
		        $scope.hasNextPage=certiInfoData.hasNextPage;
		        $scope.pageNum=certiInfoData.pageNum;
	    	})
        }
        $scope.nextPage=function () {
        	 if(!$scope.hasNextPage)return;
        	//发请求
        	$http({
	    		url:'/get_compcerti_admin',
	    		method:'get',
	    		params:{'pageNum':$scope.pageNum+1}
	    	}).success(function(response, status, headers, config){
	    		var certiInfoData=response.data;
	    		$scope.certiInfoList=certiInfoData.list;
	    		//所有页码
				$scope.navigatepageNums=certiInfoData.navigatepageNums;
				$scope.hasPreviousPage=certiInfoData.hasPreviousPage;
		        $scope.hasNextPage=certiInfoData.hasNextPage;
		        $scope.pageNum=certiInfoData.pageNum;
	    	})
        }
        
        /**
        *投诉
        */
        $scope.complaintModeGlobal=0;
        //发请求
        $http({
    		url:'/get_complaint_record_admin',
    		method:'get',
    		params:{'complaintMode':$scope.complaintModeGlobal}
    	}).success(function(response, status, headers, config){
    		var complaintData=response.data;
    		$scope.complaintRecordList=complaintData.list;
    		//所有页码
			$scope.navigatepageNums2=complaintData.navigatepageNums;
			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
	        $scope.hasNextPage2=complaintData.hasNextPage;
	        $scope.pageNum2=complaintData.pageNum;
    	})
    	//改变changecomplaintMode
    	$scope.changecomplaintMode=function(val){
        	$scope.complaintModeGlobal=val;
        	$http({
        		url:'/get_complaint_record_admin',
        		method:'get',
        		params:{'complaintMode':$scope.complaintModeGlobal}
        	}).success(function(response, status, headers, config){
        		var complaintData=response.data;
        		$scope.complaintRecordList=complaintData.list;
        		//所有页码
    			$scope.navigatepageNums2=complaintData.navigatepageNums;
    			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
    	        $scope.hasNextPage2=complaintData.hasNextPage;
    	        $scope.pageNum2=complaintData.pageNum;
        	})
        }
        //弹出模态框
    	$scope.handleRecord=function(item){
    		$scope.complaintRecordDetail={};
    		$scope.complaintRecordDetail.id=item.id;
    		$scope.complaintRecordDetail.complaintTitle=item.complaintTitle;
    		$scope.complaintRecordDetail.complaintContent=item.complaintContent;
    		if(item.handleResult){
    			$scope.savehandleResultText=item.handleResult;
    		}else{
    			$scope.savehandleResultText="";
    		}
    		$('#myModal2').modal('show')
    	}
        //保存处理结果	
    	$scope.saveHandleResult=function(){
        	var jsonDataUpdate={};
        	jsonDataUpdate.recordId=$scope.complaintRecordDetail.id;
        	jsonDataUpdate.handleResult=$scope.savehandleResultText;
        	$http({
        		url:'/update_complaint_record_admin',
        		method:'post',
        		data:jsonDataUpdate
        	}).success(function(response, status, headers, config){
        		if(response.msg){
        			$('#myModal2').modal('hide')
        			$http({
      	        		url:'/get_complaint_record_admin',
      	        		method:'get',
      	        		params:{'complaintMode':$scope.complaintModeGlobal,'pageNum':$scope.pageNum}
      	        	}).success(function(response, status, headers, config){
      	        		var complaintData=response.data;
      	        		$scope.complaintRecordList=complaintData.list;
      	        		//所有页码
      	    			$scope.navigatepageNums2=complaintData.navigatepageNums;
      	    			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
      	    	        $scope.hasNextPage2=complaintData.hasNextPage;
      	    	        $scope.pageNum2=complaintData.pageNum;
      	        	})
        		}
        	})
        }
    	$scope.previousPage2=function () {
     	   if(!$scope.hasPreviousPage2)return;
     	   //发请求
     	   $http({
     		   url:'/get_complaint_record_admin',
     		   method:'get',
     		   params:{'complaintMode':$scope.complaintModeGlobal,'pageNum':$scope.pageNum-1}
	       }).success(function(response, status, headers, config){
	    	   var complaintData=response.data;
	    	   $scope.complaintRecordList=complaintData.list;
	       		//所有页码
	   			$scope.navigatepageNums2=complaintData.navigatepageNums;
	   			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
	   	        $scope.hasNextPage2=complaintData.hasNextPage;
   	        	$scope.pageNum2=complaintData.pageNum;
	       })
         }
         $scope.changePage2=function (x) {
        	$http({
       		   url:'/get_complaint_record_admin',
       		   method:'get',
       		   params:{'complaintMode':$scope.complaintModeGlobal,'pageNum':x}
  	       }).success(function(response, status, headers, config){
  	    	   var complaintData=response.data;
  	    	   $scope.complaintRecordList=complaintData.list;
  	       		//所有页码
  	   			$scope.navigatepageNums2=complaintData.navigatepageNums;
  	   			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
  	   	        $scope.hasNextPage2=complaintData.hasNextPage;
     	        	$scope.pageNum2=complaintData.pageNum;
  	       })
         }
         $scope.nextPage2=function () {
         	 if(!$scope.hasNextPage2)return;
         	//发请求
         	$http({
     		   url:'/get_complaint_record_admin',
     		   method:'get',
     		   params:{'complaintMode':$scope.complaintModeGlobal,'pageNum':$scope.pageNum+1}
	       }).success(function(response, status, headers, config){
	    	   var complaintData=response.data;
	    	   $scope.complaintRecordList=complaintData.list;
	       		//所有页码
	   			$scope.navigatepageNums2=complaintData.navigatepageNums;
	   			$scope.hasPreviousPage2=complaintData.hasPreviousPage;
	   	        $scope.hasNextPage2=complaintData.hasNextPage;
   	        	$scope.pageNum2=complaintData.pageNum;
	       })
         }
    	
    });
</script>
</html>