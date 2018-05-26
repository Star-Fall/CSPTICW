<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
	<meta charset="utf-8">
	<link href="../../resource/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../resource/css/common.css">
    <link rel="stylesheet" type="text/css" href="../../resource/css/main-job.css">
</head>
<body ng-app="main" class="body container-fluid">
	<div id="container-fluid" ng-controller="mainJobController">
		<div class="nav_log row">
			<div class="change_city  col-xs-2 col-sm-2 col-md-2 col-lg-2">
				<span>上海站</span><a href="#">【切换城市】</a>
			</div>
			
			<div class="login_out col-xs-offset-7 col-sm-offset-7 col-md-offset-7 col-md-offset-7 
				col-xs-3 col-sm-3 col-md-3 col-lg-3 row" >
				<div class="login col-xs-offset-6 col-sm-offset-6 col-md-offset-6 
					col-md-offset-6 col-xs-2 col-sm-2 col-md-2 col-lg-2">
					<a 	href="/to_login">
						<span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;登录
					</a>
				</div>
				<div class="logout col-xs-2 col-sm-2 col-md-2 col-lg-2">
					<a  href="/to_regist">
						<span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;注册
					</a>
				</div>
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
			<!--网站导航-->
			<div class="nav-4 col-xs-5 col-sm-5 col-md-5 col-lg-5">
				<ul class="nav nav-tabs nav-justified">
					<li role="presentation" ><a href="/to_main">首页</a></li>
					<li role="presentation"><a href="/to_main_job">兼职招聘</a></li>
					<li role="presentation"><a href="/to_main_resume">求职简历</a></li>
					<li role="presentation" class="active"><a href="/to_main_news">网站资讯</a></li>
				</ul>
			</div>
			
		</div>
		

		<div class="next row">
			<div class="col-md-offset-1 col-md-3" style="margin-top: 20px;">
				<table class="table">
				  <tr>
				 	<td><a href="" ng-click="showP=1">兼职从业过程该如何把握？</a></td> 
				  </tr>
				  <tr>
				 	<td><a href="" ng-click="showP=2">适合企业内员工的兼职有哪些？</a></td> 
				  </tr>
				  <tr>
				 	<td><a href="" ng-click="showP=3">影响兼职工资的共性点包含哪些？</a></td> 
				  </tr>
				  <tr>
				 	<td><a href="" ng-click="showP=4">如何快速高效撰写兼职简历？</a></td> 
				  </tr>

				</table>
			</div>
            <div class="col-md-7" style="margin-top: 20px;">
				<div class="textP" style="font-size: 15px;" ng-show="showP==1">
				<h3>兼职从业过程该如何把握？</h3>
					<p>
						虽然说目前国内的兼职行业发展十分迅猛，但是有很多人加入兼职行业并不代表着每一个加入兼职行列的人都对于这个行业有深刻的认知。而这也是为什么个人想要围绕兼职从业过程该如何把握这个话题做分析做分享的根本性原因所在。  
					</p>
					<p>
						不同的兼职类型本身对应的从业难度，工资高低以及未来的发展潜力等等都存在着很大的不同，所以建议大家可以结合着比较常见的网络、实体类型和自己的实际情况，去进一步锁定。另外，关于兼职挑选有一个很重要的原则，尽可能选择自己百分百可以做好的工资不那么高的，不要选择那些工资很高自己只有50%概率能做好的。					
					</p>
					<p>
						从业过程中最应该注意的就是将每一个工作过程中自己曾做对的、做错的内容都详细记录下来，这样过一段时间之后你再回过头来，翻出那些记录的内容看你会发现，其实自己真的积累到了一定的经验，将这部分的经验提炼出来，会成为你以后的财富。					
					</p>
					<p>
						这里的同事，不仅仅包含跟自己一样来做兼职的人员，也包含那些在企业内部做全职工作岗位的人士，如果能跟他们多沟通多交流，确实有大概可以获得一些从业技能技巧，避免后期的工作展开遇到各种各样的突发事件，手足无措。					
					</p>
				</div>
				
				<div class="textP" style="font-size: 15px;"ng-show="showP==2">
				<h3>适合企业内员工的兼职有哪些？</h3>
					<p>
						1、编辑  <br>
						这类兼职其实并没有太大的从业难度，只要你愿意花时间在网上泡着，每天多到一些QQ群到一些写手贴吧内发布一下自己正在招募写手的信息，只要条件足够好，只要这一个网站确实有一定的名气，应该会有不少人慕名而来。					
					</p>
					<p>
						2、微商<br>  
						之所以微商会比较适合，主要是因为微商从业者每天都需要在朋友圈内更新一些商品的相关信息，特别是在节假日的时候还会有促销信息，而这样的工作不需要太高的强度，只需要你将企业内部的其他员工都建一个特别分组，每次发布这些信息的时候将他们屏蔽起来，白天也可以工作，白天也可以接单，也可以发货，确实不错。					
					</p>
					<p>
						3、写文  <br>
						这类兼职工作不仅仅在非上班时间可以操作，而且在上班时间内同样可以操作，特别是从事客服或者是人事专员岗位的员工，反正你每天都对着电脑展开工作，所以就算你对着电脑敲敲打打写文也没有关系，推荐大家可以尝试一下，如果文笔能力确实比较不错的，一天两三百的工资很轻松。					
					</p>
					<p>
						4、刷单   <br>
						需要提醒的是，这个兼职有很多的骗局存在，所以在从业过程中有很多讲究，比如说绝对不刷虚拟物品，比如说绝对不能垫付等等，这些把握好了，一般没有太多问题。通常来说，刷一单的佣金抽成为5元起步，也有比较高额佣金的类型，按照抽成算工资的，抽成为成交价格5%到10%。  					
					</p>
				</div>
				
				<div class="textP" style="font-size: 15px;"ng-show="showP==3">
					<h3>影响兼职工资的共性点包含哪些？</h3>
					<p>
						工作能力高低  <br>
						同样一种兼职工作类型，如果你的工作能力较强，在更短时间内就可以快速完成工作，按照计量方式来计算薪酬的话，每一个月的工资薪酬会比别人高很多。举个简单的例子，写文案，撰写一篇文章5元的费用来算，如果别人一个小时只能写5篇，你每个小时能写10篇，当然你的工资就会是别人的两倍。					
					</p>
					<p>
						时间的安排<br>  
						虽然只是兼职，但是如果你做的是促销，这样一整天都需要在店铺内的兼职类型，如何有效安排早上下午乃至晚上的工作，将会直接影响到你的工作效率。举个简单的例子，周六在商场卖手机，早上的时候，你可多花一些时间去背熟这些电子类产品的优势部分，并且多观摩周围柜台人员他们是如何展开工作执行的，如此就能获得一定的技巧，毕竟早上人并没有那么多，这时候用于学习确实不错。下午等到人流量多的时候，不需要再去学习了，多吆喝，多吸引一些潜在客户，跟他们沟通和交流，可以有效促成成交，工资当然会高。					
					</p>
					<p>
						整个人的状态情况  <br>
							人们常常在说，相由心生，如果你的心态非常好，而且是以一种积极向上的想法来面对后期工作展开的，甚至于脸上常常挂着淡淡的微笑，那么就意味着，你有更高的概率和可能性可吸引到别人的注意力，甚至于因为别人会因为你的服务标准比较好，优先找你购买。					
					</p>
					<p>
						企业的选择<br>
						相较而言，大型企业可给出的兼职底薪水平会比小型企业给出的兼职工资水平更高，不过相对而言，大型企业一般来说是按照月结方式来支付佣金的。
					</p>
					<p>
						上述这部分内容就是个人关于影响兼职工资的共性点包含哪些这个话题的全部解释。需要提醒的是，现在有很多人他们总是抱怨自己兼职工作的锁定不到位，所以才没办法获得高额的工资，但是小编想说的是，其实即便工作的起点差异很大，但是如果你的态度很好，按照以上这些坚守去提升，工资还是会很不错的。
					</p>					
				</div>
				<div class="textP" style="font-size: 15px;"ng-show="showP==4">
					<h3>如何快速高效撰写兼职简历？</h3>
					<p>
						高效参考模板  <br>
						所谓的模板，并不是说在网络渠道上随意搜索简历范文而得到的模板，而是说大家可结合自己未来的求职方向，自己大学所学专业，以及兴趣所在作为主要关键词去搜索简历模板，这样所得到的模板参考效果更大，而且后期不需要大量改动，你就能轻松设计出一个比较好的框架。					
					</p>
					<p>
						自我的相关资讯解读要全方位<br>  
						怎么理解？比如说你之前有什么样的工作经验，你未来的发展方向想要朝着哪个方向去？这些如果能在自我介绍的模块中展现清楚，让对方了解到自己的实力，让对方了解到自己跟这一个岗位之间的配合度，确实有更大概率和可能性能够通过简历筛选环节，进入面试。					
					</p>
					<p>
						意向薪酬这一栏最好放空 <br>
						跟全职求职不一样，兼职从业者他们如果将意向薪酬写得非常死，在后期有可能错过很多的发展机会，为什么这么说？毕竟全职员工他们在求职的时候有更高起点，更高的稳定性，所以他们有资格提出自己想要获得的薪酬水平标准，但是在招聘兼职岗位的时候，因为企业的选择性更多，所以这时候如果求职者还非常硬性的写出自己想要的工资标准，会给人一种不好的印象。					
					</p>
					<p>
					以上这部分内容就是个人关于如何快速高效撰写兼职简历这个话题的全部解释。其实以上这四种方式已经得到了诸多求职人员的共性认可，是有一定参考价值和意义的，建议大家可以多花一些时间，先将上面这些理论层面的内容弄清楚，之后再去撰写简历，如此会事半功倍。
					</p>
				</div>
			</div>			
		</div>
	</div>

<script type="text/javascript" src="../../resource/js/jquery-3.2.1.min.js"></script>
<script src="../../resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resource/js/angular.js"></script>
<script type="text/javascript">
    var app=angular.module('main',[]);
    app.controller('mainJobController',function ($scope,$http) {
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
        $scope.showP=1;
        
    })
</script>
</body>
</html>