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
var app=angular.module('studentCenter',[]);
//简历Controller
app.controller('resumeController',function ($scope,$http) {
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
    		 console.log($scope.loginUser);
    	 }else{
    		 $(".login_info").css("display","none");
    	 }
    	 
    })
    //基本信息
    $scope.real_name="";
    $scope.age="";
    $scope.gender="男";
    $scope.resu_name="";
    //求职地点
    /**
     * 初始化省份城市select 
     */
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

    /**
     * 初始化行业工作select
     */
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

    //求职意向
    $scope.resume_jobs=[];
    //添加意向方法
    $scope.addResumeJob=function () {
        //新建一个意向对象
        var job={};
        //赋值选中的
        job.jobCateId=$scope.select_child.id;
        job.categoryName=$scope.select_child.categoryName;
        //添加到数组中
        $scope.resume_jobs.push(job);
        //去除重复
        $scope.resume_jobs=removeRepeatResumeJob($scope.resume_jobs)
        //关闭modal
        $('#resume_job_modal').modal('hide');
    }
    //删除意向方法
    $scope.deleteResumeJob=function (id) {
        var newArray=[];
        for(var i=0;i<$scope.resume_jobs.length;i++){
            if($scope.resume_jobs[i].jobCateId!=id){
                newArray.push($scope.resume_jobs[i])
            }
        }
        $scope.resume_jobs=newArray;
    }


    /***工作经验**/
    //工作经验
    $scope.work_experience=[];

    //添加工作经验
    $scope.addWorkExperience=function () {
        var work={};
        work.workTitle=$scope.work_title;
        work.workContent=$scope.work_content;
        $scope.work_experience.push(work);
        //去除重复
        $scope.work_experience=removeRepeatWorkExperience($scope.work_experience);
        //关闭modal
        $('#work_experience_modal').modal('hide');
        //清空模态框
        $scope.work_title="";
        $scope.work_content="";
    }
    //删除工作经验
    $scope.deleteWorkExperience=function (work_title,work_content) {
        var newArray=[];
        for(var i=0;i<$scope.work_experience.length;i++){
            if($scope.work_experience[i].workTitle!=work_title||$scope.work_experience[i].workContent!=work_content){
                newArray.push($scope.work_experience[i])
            }
        }
        $scope.work_experience=newArray;
    }
    //学校信息
    $scope.school="";
    $scope.major="";
    $scope.education="专科";
    //联系方式
    $scope.phone="";
    $scope.qq="";
    $scope.wechat="";
    //其他（自我介绍/兴趣爱好）
    $scope.self_description="";

    //提交
    $scope.submitResume=function () {
        var formData= new FormData();

        var jsonData={};
        jsonData.resuName=$scope.resu_name;
        jsonData.realName=$scope.real_name;
        jsonData.age=$scope.age;
        jsonData.gender=$scope.gender;
        jsonData.province=$scope.select_province.province;
        jsonData.city=$scope.select_city.city;
        jsonData.resumeJobs=$scope.resume_jobs;
        jsonData.workExperiences=$scope.work_experience;
        jsonData.school=$scope.school;
        jsonData.major=$scope.major;
        jsonData.education=$scope.education;
        jsonData.phone=$scope.phone;
        jsonData.qq=$scope.qq;
        jsonData.wechat=$scope.wechat;
        jsonData.selfDescription=$scope.self_description;

        var image_file=document.getElementById("image_file").files[0];
        var annex_resume=document.getElementById("annex_resume").files[0];

        formData.append('image_file',image_file);
        formData.append('annex_resume',annex_resume);
        formData.append('jsonData',JSON.stringify(jsonData));
        $http({
        	url:'/add_resume',
    	   	method:'post',
    	   	data: formData,
            headers: {'Content-Type': undefined},
            transformRequest: angular.identity
        }).success(function(response, status, headers, config){
        	//成功
        	if(response.msg){
        		alert("发布成功")
        		//跳转
        		window.location.href="/to_my_resume_list";
        	}else if(response.error){
        		if(response.error=='3000'){
        			alert("文件上传错误")
        		}else if(response.error=='3001'){
        			alert("简历发布错误")
        		}else{
        			alert("系统错误！")
        		}        		
        	}
    	});
    }
})
/**去除工作意向重复元素**/
function removeRepeatResumeJob(array) {
    var r = [];
    for(var i = 0, l = array.length; i<l; i++){
        for(var j = i + 1; j < l; j++)
            if(array[i].jobCateId == array[j].jobCateId) j == ++i;
        r.push(array[i]);
    }
    return r;
}
/**去除工作经验重复元素**/
function removeRepeatWorkExperience(array) {
    var r = [];
    for(var i = 0, l = array.length; i<l; i++){
        for(var j = i + 1; j < l; j++)
            if(array[i].workTitle == array[j].work_title && array[i].workContent == array[j].work_content )
                j == ++i;
        r.push(array[i]);
    }
    return r;
}
/**读取图片**/
$('#image_file').bind('change',function (e) {
    e = e || window.event;
    var file = e.target.files[0];
    if (!/image\/\w+/.test(file.type)) {
        alert("此处需要的是图片文件！");
        //清空选择的文件
        var obj = document.getElementById('image_btn') ;
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
/**读取文件**/
$('#annex_resume').bind('change',function (e) {
    e = e || window.event;
    var file = e.target.files[0];
    var reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = function (f) {
        //文件名称
        $('#annex_resume_label').html(file.name);
    }
})