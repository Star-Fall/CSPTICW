<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--菜单-->
        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">

            <!--简历-->
            <a href="/to_my_resume_list" class="left-nav-one list-group-item"
            	ng-class="{'1':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历中心
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==1">
                <a href="/to_student_center_resume" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布简历
                </a>
                <a href="/to_my_resume_list" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    我的简历
                </a>
            </div>
            <!--投递-->
            <a href="/to_student_apply_record" class="left-nav-one list-group-item" 
            	ng-class="{'2':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历投递
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==2">
                <a href="/to_student_apply_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投递记录
                </a>
            </div>
            <!--邀请-->
            <a href="/to_student_recruit_record" class="left-nav-one list-group-item"
            	ng-class="{'3':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                兼职邀请
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==3">
                <a href="/to_student_recruit_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收到的邀请
                </a>
            </div>
            <a href="/to_student_collect_record" class="left-nav-one list-group-item"
            	ng-class="{'4':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的收藏
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==4">
                <a href="/to_student_collect_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收藏的岗位
                </a>
            </div>
            <a href="/to_student_complaint_record" class="left-nav-one list-group-item"
            	ng-class="{'5':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的投诉
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==5">
                <a href="/to_student_complaint_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投诉记录
                </a>
            </div>
        </div>
        