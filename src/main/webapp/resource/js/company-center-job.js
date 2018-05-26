var app=angular.module('companyCenter',[]);
app.controller('companyJobController',function ($scope,$http) {
	$scope.centerMenu=2;
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
	
    //初始化城市
    $http({
    	url:'/get_province_city',
	   	method:'get'
    }).success(function(response, status, headers, config){
    	//填充到selectProvince 数据源
    	$scope.selectProvince=response.data;
    	//初始化第一个
    	$scope.select_province=$scope.selectProvince[0];
    	//填充到selectCity 数据源
    	$scope.selectCity=$scope.select_province.cityList;
    	//初始化第一个
    	$scope.select_city=$scope.select_province.cityList[0];
	});  
    $scope.changeProvince=function(){
    	$scope.selectCity=$scope.select_province.cityList;
    	$scope.select_city=$scope.selectCity[0];
    }
    //初始化行业
    $http({
    	url:'/get_job_category',
	   	method:'get'
    }).success(function(response, status, headers, config){
    	//填充到selectParent 数据源
    	$scope.selectParent=response.data;
    	//初始化第一个
    	$scope.select_parent=$scope.selectParent[0];
    	//填充到selectChild 数据源
    	$scope.selectChild=$scope.select_parent.jobCategoryList;
       	//初始化第一个
    	$scope.select_child=$scope.selectChild[0];
	});    
    $scope.changeParent=function(){
    	$scope.selectChild=$scope.select_parent.jobCategoryList;
    	$scope.select_child=$scope.selectChild[0];
    }
    //
    $scope.job_title="";
    $scope.person_num=0;

    $scope.job_treat=0;
    $scope.treat_method="小时";
    $scope.pay_method="当日结";
    $scope.job_content="";
    $scope.job_require="";
    $scope.contact_name="";
    $scope.contact_phone="";
    
    $scope.submitJob=function(){
    	var jsonData={};
    	jsonData.jobCate=$scope.select_child.categoryName;
    	jsonData.jobPlace=$scope.select_province.province+' '+$scope.select_city.city+' '+$scope.detail_address;
    	jsonData.jobTreat=$scope.job_treat;
    	jsonData.treatMethod=$scope.treat_method;
    	jsonData.payMethod=$scope.pay_method;
    	jsonData.jobTitle=$scope.job_title;
    	jsonData.jobContent=$scope.job_content;
    	jsonData.jobRequire=$scope.job_require;
    	jsonData.personNum=$scope.person_num;
    	jsonData.contactName=$scope.contact_name;
    	jsonData.contactPhone=$scope.contact_phone;
    	$http({
        	url:'/add_comp_job',
    	   	method:'post',
    	   	data: JSON.stringify(jsonData)            
        }).success(function(response, status, headers, config){
        	//成功
        	if(response.msg){
        		alert("发布成功") ;
        		window.location.href="/to_comp_job_list";
        	}else if(response.error){
        		if(response.error=='4002'){
        			alert("发布岗位错误！")
        		}else{
        			alert("系统错误！")
        		}
        	}
    	});
    }
})