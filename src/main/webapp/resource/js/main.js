var app=angular.module('main',[]);
app.controller('mainController',function ($scope,$http) {
	//首先请求用户的数据
	$http({
        url:'/get_login_user',
        method:'get'
    }).success(function(response, status, headers, config){
    	//已登录
    	 if(response.data){
    		 $(".login_out").css("display","none");
    		 $(".login_info").css("display","block");
    		 $scope.loginUser=response.data;
    	 }else{
    		 $(".login_out").css("display","block");
    		 $(".login_info").css("display","none");
    	 }
    	 
    })
	
    //请求数据
	$http({
        url:'/get_comp_job_top10',
        method:'get'
    }).success(function(response, status, headers, config){
    	$scope.jobList=response.data;    	 
    })
    
    //请求数据
	$http({
        url:'/get_resume_top10',
        method:'get'
    }).success(function(response, status, headers, config){
    	$scope.resumeList=response.data;
    	 
    })
})