<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <div class="center-menu list-group col-xs-2 col-sm-2 col-md-2 col-lg-2">
            <!--信息-->
            <a href="/to_user_center" class="left-nav-one list-group-item"
            ng-class="{'1':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                企业认证
            </a>
            <div class="left-nav-zhe " ng-show="centerMenu==1">
                <a href="/to_user_center" class="left-nav-module-child list-group-item <!--active-->">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    认证信息
                </a>
            </div>
            <!--简历-->
            <a href="/to_comp_job_list" class="left-nav-one list-group-item"
            ng-class="{'2':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的岗位
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==2">
                <a href="/to_comp_job" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    发布岗位
                </a>
                <a href="/to_comp_job_list" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    岗位列表
                </a>
            </div>
            <!--简历投递-->
            <a href="/to_company_apply_record" class="left-nav-one list-group-item"
            ng-class="{'3':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                简历应聘
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==3">
                <a href="/to_company_apply_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    简历列表
                </a>
            </div>
            <!--主动招聘-->
            <a href="/to_company_recruit_record" class="left-nav-one list-group-item"
            ng-class="{'4':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的招聘
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==4">
                <a href="/to_company_recruit_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    招聘记录
                </a>
            </div>
            <!--收藏-->
            <a href="/to_company_collect_record" class="left-nav-one list-group-item"
            ng-class="{'5':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的收藏
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==5">
                <a href="/to_company_collect_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    收藏记录
                </a>
            </div>
            <!--投诉记录-->
            <a href="/to_company_complaint_record" class="left-nav-one list-group-item"
            ng-class="{'6':'active'}[centerMenu]">
                <span class="glyphicon glyphicon-expand">&nbsp;</span>
                我的投诉
            </a>
            <div class="left-nav-zhe" ng-show="centerMenu==6">
                <a href="/to_company_complaint_record" class="left-nav-module-child list-group-item">
                    <span class="glyphicon glyphicon-hand-right">&nbsp;</span>
                    投诉记录
                </a>
            </div>
        </div>
