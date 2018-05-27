var app=angular.module('main',[]);
app.controller('mainController',function ($scope,$http) {
	////初始化城市
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
    //省份
    $scope.province="江苏省";
    //城市
	$scope.city="苏州市";
    //先查询 
    $http({
        url:'/get_province_city_session',
        method:'get',
    }).success(function(response, status, headers, config){
    	if(response.error){
    	}else{
    		$scope.province=response.province;
    		$scope.city=response.city;
    	}
    	//请求数据
    	$http({
            url:'/get_comp_job_top10',
            method:'get',
            params:{'province':$scope.province,'city':$scope.city}
        }).success(function(response, status, headers, config){
        	$scope.jobList=response.data;    	 
        })
        
        //请求数据
    	$http({
            url:'/get_resume_top10',
            method:'get',
            params:{'province':$scope.province,'city':$scope.city}
        }).success(function(response, status, headers, config){
        	$scope.resumeList=response.data;
        	 
        })
    })
    //保存城市
    $scope.saveProvinceCity=function(){
    	$http({
            url:'/save_province_city_session',
            method:'post',
            data:{'province':$scope.select_province.province,'city':$scope.select_city.city}
        }).success(function(response, status, headers, config){
        	if(response.msg){
        		$scope.province=$scope.select_province.province;
        		$scope.city=$scope.select_city.city
        	}
        	//请求数据
        	$http({
                url:'/get_comp_job_top10',
                method:'get',
                params:{'province':$scope.province,'city':$scope.city}
            }).success(function(response, status, headers, config){
            	$scope.jobList=response.data;    	 
            })
            
            //请求数据
        	$http({
                url:'/get_resume_top10',
                method:'get',
                params:{'province':$scope.province,'city':$scope.city}
            }).success(function(response, status, headers, config){
            	$scope.resumeList=response.data;
            	 
            })
        })
    }
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
	
    
})