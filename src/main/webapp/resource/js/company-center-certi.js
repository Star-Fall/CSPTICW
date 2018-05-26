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
    
    $scope.modifyCerti=function(){
		if(!window.confirm("修改会重新认证，确定修改吗?")){
			return;
		}
		window.location.href="to_company_certi_modify";
	}
	
    //请求数据
	$http({
        url:'/get_comp_certi',
        method:'get'
    }).success(function(response, status, headers, config){
    	$scope.compInfoCerti=response.data;
    	
    	 if($.isEmptyObject($scope.compInfoCerti)){
    		 
    		 $('.sch-cert-form').css('display','block');
    		 $('.sch-cert-info').css('display','none');
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
			});    

    		 $scope.comp_name="";
    		 $scope.comp_home="";
	 	     $scope.comp_establish_time="";
	 	     $scope.comp_size="";
	 	     $scope.comp_nature="民营";
	 	     $scope.detail_address="";
	 	     $scope.comp_introduction="";
	 	     $scope.contact_name="";
	 	     $scope.contact_phone="";
	 	     $scope.contact_email="";
	 	     
	 	    $scope.submitCerti=function(){
	 	    	var formData= new FormData();
	 	    	var jsonData={};
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
	 	        	url:'/add_comp_certi',
	 	    	   	method:'post',
	 	    	   	data: formData,
	 	            headers: {'Content-Type': undefined},
	 	            transformRequest: angular.identity
	 	        }).success(function(response, status, headers, config){
	 	        	//成功
	 	        	if(response.msg){
	 	        		alert("提交成功")
	 	        		//跳转
	 	                window.location.href="/to_user_center";
	 	        	}else if(response.error){
	 	        		if(response.error=='3000'){
	 	                    alert("文件上传错误")
	 	                }else if(response.error=='4001'){
	 	                    alert("认证信息上传错误")
	 	                }else{
	 	                    alert("系统错误！")
	 	                }
	 	        	}
	 	    	});
	 	    }
	 	     
    	 }else{
    		 
    		 $('.sch-cert-form').css('display','none');
    		 $('.sch-cert-info').css('display','block');
    		 $scope.compName=$scope.compInfoCerti.compName;
    		 $scope.compHome=$scope.compInfoCerti.compHome;
	 	     $scope.compEstablishTime=$scope.compInfoCerti.compEstablishTime;
	 	     $scope.compSize=$scope.compInfoCerti.compSize;
	 	     $scope.compNature=$scope.compInfoCerti.compNature;
	 	     $scope.compIndustry=$scope.compInfoCerti.compIndustry;
	 	     $scope.Province=$scope.compInfoCerti.province;
	 	     $scope.City=$scope.compInfoCerti.city;
	 	     $scope.detailAddress=$scope.Province+'  '+ $scope.City+'  '+$scope.compInfoCerti.detailAddress;
	 	     $scope.compIntroduction=$scope.compInfoCerti.compIntroduction;
	 	     $scope.contactName=$scope.compInfoCerti.contactName;
	 	     $scope.contactPhone=$scope.compInfoCerti.contactPhone;
	 	     $scope.contactEmail=$scope.compInfoCerti.contactEmail;
	 	    $scope.isCertified=$scope.compInfoCerti.isCertified;
	 	     $scope.businessLicenseImg="";
	 	     //处理图像
	 	     if($scope.compInfoCerti.businessLicense){
	 	    	//赋值为真是路径
	 	    	//处理文件路径问题
	 	        $scope.businessLicenseImg="../../../upfile/company/"+$scope.compInfoCerti.businessLicense;
	 	     }else{
	 	    	//默认路径
	 	        $scope.businessLicenseImg="../../resource/images/default-image-user.png";
	 	     }
    	 }
    	 
    })
    //。。。。。
    //接受的认证信息
    
    //无数据

})