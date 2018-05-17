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
    
    $http({
        url:'/get_resume_detail',
        method:'get'
    }).success(function(response, status, headers, config){
    	var resumeDetail=response.data;
    
    //头像
    $scope.id_photo="";
    if(resumeDetail.idPhoto){
        //赋值为真是路径
    	//处理文件路径问题
        $scope.id_photo="../../../upfile/student/"+resumeDetail.idPhoto;
    }else{
        //默认路径
        $scope.id_photo="../../resource/images/default-image-user.png";
    }
    //文件名
    if(resumeDetail.annexResume){
        var fileName=resumeDetail.annexResume;
        fileName=fileName.slice(fileName.indexOf('\\')+1);
        $('#annex_resume_label').html(fileName);
    }
    //基本信息
    $scope.real_name=resumeDetail.realName;
    $scope.age=resumeDetail.age;
    $scope.gender=resumeDetail.gender;
    $scope.resu_name=resumeDetail.resuName;
    //求职地点
    /**
     * 初始化省份城市select
     */
    //var pcData=[{"provinceId":"110000","province":"北京市","cityList":[{"cityId":"110100","city":"市辖区"},{"cityId":"110200","city":"县"}]},{"provinceId":"120000","province":"天津市","cityList":[{"cityId":"120100","city":"市辖区"},{"cityId":"120200","city":"县"}]},{"provinceId":"130000","province":"河北省","cityList":[{"cityId":"130100","city":"石家庄市"},{"cityId":"130200","city":"唐山市"},{"cityId":"130300","city":"秦皇岛市"},{"cityId":"130400","city":"邯郸市"},{"cityId":"130500","city":"邢台市"},{"cityId":"130600","city":"保定市"},{"cityId":"130700","city":"张家口市"},{"cityId":"130800","city":"承德市"},{"cityId":"130900","city":"沧州市"},{"cityId":"131000","city":"廊坊市"},{"cityId":"131100","city":"衡水市"}]},{"provinceId":"140000","province":"山西省","cityList":[{"cityId":"140100","city":"太原市"},{"cityId":"140200","city":"大同市"},{"cityId":"140300","city":"阳泉市"},{"cityId":"140400","city":"长治市"},{"cityId":"140500","city":"晋城市"},{"cityId":"140600","city":"朔州市"},{"cityId":"140700","city":"晋中市"},{"cityId":"140800","city":"运城市"},{"cityId":"140900","city":"忻州市"},{"cityId":"141000","city":"临汾市"},{"cityId":"141100","city":"吕梁市"}]},{"provinceId":"150000","province":"内蒙古自治区","cityList":[{"cityId":"150100","city":"呼和浩特市"},{"cityId":"150200","city":"包头市"},{"cityId":"150300","city":"乌海市"},{"cityId":"150400","city":"赤峰市"},{"cityId":"150500","city":"通辽市"},{"cityId":"150600","city":"鄂尔多斯市"},{"cityId":"150700","city":"呼伦贝尔市"},{"cityId":"150800","city":"巴彦淖尔市"},{"cityId":"150900","city":"乌兰察布市"},{"cityId":"152200","city":"兴安盟"},{"cityId":"152500","city":"锡林郭勒盟"},{"cityId":"152900","city":"阿拉善盟"}]},{"provinceId":"210000","province":"辽宁省","cityList":[{"cityId":"210100","city":"沈阳市"},{"cityId":"210200","city":"大连市"},{"cityId":"210300","city":"鞍山市"},{"cityId":"210400","city":"抚顺市"},{"cityId":"210500","city":"本溪市"},{"cityId":"210600","city":"丹东市"},{"cityId":"210700","city":"锦州市"},{"cityId":"210800","city":"营口市"},{"cityId":"210900","city":"阜新市"},{"cityId":"211000","city":"辽阳市"},{"cityId":"211100","city":"盘锦市"},{"cityId":"211200","city":"铁岭市"},{"cityId":"211300","city":"朝阳市"},{"cityId":"211400","city":"葫芦岛市"}]},{"provinceId":"220000","province":"吉林省","cityList":[{"cityId":"220100","city":"长春市"},{"cityId":"220200","city":"吉林市"},{"cityId":"220300","city":"四平市"},{"cityId":"220400","city":"辽源市"},{"cityId":"220500","city":"通化市"},{"cityId":"220600","city":"白山市"},{"cityId":"220700","city":"松原市"},{"cityId":"220800","city":"白城市"},{"cityId":"222400","city":"延边朝鲜族自治州"}]},{"provinceId":"230000","province":"黑龙江省","cityList":[{"cityId":"230100","city":"哈尔滨市"},{"cityId":"230200","city":"齐齐哈尔市"},{"cityId":"230300","city":"鸡西市"},{"cityId":"230400","city":"鹤岗市"},{"cityId":"230500","city":"双鸭山市"},{"cityId":"230600","city":"大庆市"},{"cityId":"230700","city":"伊春市"},{"cityId":"230800","city":"佳木斯市"},{"cityId":"230900","city":"七台河市"},{"cityId":"231000","city":"牡丹江市"},{"cityId":"231100","city":"黑河市"},{"cityId":"231200","city":"绥化市"},{"cityId":"232700","city":"大兴安岭地区"}]},{"provinceId":"310000","province":"上海市","cityList":[{"cityId":"310100","city":"市辖区"},{"cityId":"310200","city":"县"}]},{"provinceId":"320000","province":"江苏省","cityList":[{"cityId":"320100","city":"南京市"},{"cityId":"320200","city":"无锡市"},{"cityId":"320300","city":"徐州市"},{"cityId":"320400","city":"常州市"},{"cityId":"320500","city":"苏州市"},{"cityId":"320600","city":"南通市"},{"cityId":"320700","city":"连云港市"},{"cityId":"320800","city":"淮安市"},{"cityId":"320900","city":"盐城市"},{"cityId":"321000","city":"扬州市"},{"cityId":"321100","city":"镇江市"},{"cityId":"321200","city":"泰州市"},{"cityId":"321300","city":"宿迁市"}]},{"provinceId":"330000","province":"浙江省","cityList":[{"cityId":"330100","city":"杭州市"},{"cityId":"330200","city":"宁波市"},{"cityId":"330300","city":"温州市"},{"cityId":"330400","city":"嘉兴市"},{"cityId":"330500","city":"湖州市"},{"cityId":"330600","city":"绍兴市"},{"cityId":"330700","city":"金华市"},{"cityId":"330800","city":"衢州市"},{"cityId":"330900","city":"舟山市"},{"cityId":"331000","city":"台州市"},{"cityId":"331100","city":"丽水市"}]},{"provinceId":"340000","province":"安徽省","cityList":[{"cityId":"340100","city":"合肥市"},{"cityId":"340200","city":"芜湖市"},{"cityId":"340300","city":"蚌埠市"},{"cityId":"340400","city":"淮南市"},{"cityId":"340500","city":"马鞍山市"},{"cityId":"340600","city":"淮北市"},{"cityId":"340700","city":"铜陵市"},{"cityId":"340800","city":"安庆市"},{"cityId":"341000","city":"黄山市"},{"cityId":"341100","city":"滁州市"},{"cityId":"341200","city":"阜阳市"},{"cityId":"341300","city":"宿州市"},{"cityId":"341400","city":"巢湖市"},{"cityId":"341500","city":"六安市"},{"cityId":"341600","city":"亳州市"},{"cityId":"341700","city":"池州市"},{"cityId":"341800","city":"宣城市"}]},{"provinceId":"350000","province":"福建省","cityList":[{"cityId":"350100","city":"福州市"},{"cityId":"350200","city":"厦门市"},{"cityId":"350300","city":"莆田市"},{"cityId":"350400","city":"三明市"},{"cityId":"350500","city":"泉州市"},{"cityId":"350600","city":"漳州市"},{"cityId":"350700","city":"南平市"},{"cityId":"350800","city":"龙岩市"},{"cityId":"350900","city":"宁德市"}]},{"provinceId":"360000","province":"江西省","cityList":[{"cityId":"360100","city":"南昌市"},{"cityId":"360200","city":"景德镇市"},{"cityId":"360300","city":"萍乡市"},{"cityId":"360400","city":"九江市"},{"cityId":"360500","city":"新余市"},{"cityId":"360600","city":"鹰潭市"},{"cityId":"360700","city":"赣州市"},{"cityId":"360800","city":"吉安市"},{"cityId":"360900","city":"宜春市"},{"cityId":"361000","city":"抚州市"},{"cityId":"361100","city":"上饶市"}]},{"provinceId":"370000","province":"山东省","cityList":[{"cityId":"370100","city":"济南市"},{"cityId":"370200","city":"青岛市"},{"cityId":"370300","city":"淄博市"},{"cityId":"370400","city":"枣庄市"},{"cityId":"370500","city":"东营市"},{"cityId":"370600","city":"烟台市"},{"cityId":"370700","city":"潍坊市"},{"cityId":"370800","city":"济宁市"},{"cityId":"370900","city":"泰安市"},{"cityId":"371000","city":"威海市"},{"cityId":"371100","city":"日照市"},{"cityId":"371200","city":"莱芜市"},{"cityId":"371300","city":"临沂市"},{"cityId":"371400","city":"德州市"},{"cityId":"371500","city":"聊城市"},{"cityId":"371600","city":"滨州市"},{"cityId":"371700","city":"荷泽市"}]},{"provinceId":"410000","province":"河南省","cityList":[{"cityId":"410100","city":"郑州市"},{"cityId":"410200","city":"开封市"},{"cityId":"410300","city":"洛阳市"},{"cityId":"410400","city":"平顶山市"},{"cityId":"410500","city":"安阳市"},{"cityId":"410600","city":"鹤壁市"},{"cityId":"410700","city":"新乡市"},{"cityId":"410800","city":"焦作市"},{"cityId":"410900","city":"濮阳市"},{"cityId":"411000","city":"许昌市"},{"cityId":"411100","city":"漯河市"},{"cityId":"411200","city":"三门峡市"},{"cityId":"411300","city":"南阳市"},{"cityId":"411400","city":"商丘市"},{"cityId":"411500","city":"信阳市"},{"cityId":"411600","city":"周口市"},{"cityId":"411700","city":"驻马店市"}]},{"provinceId":"420000","province":"湖北省","cityList":[{"cityId":"420100","city":"武汉市"},{"cityId":"420200","city":"黄石市"},{"cityId":"420300","city":"十堰市"},{"cityId":"420500","city":"宜昌市"},{"cityId":"420600","city":"襄樊市"},{"cityId":"420700","city":"鄂州市"},{"cityId":"420800","city":"荆门市"},{"cityId":"420900","city":"孝感市"},{"cityId":"421000","city":"荆州市"},{"cityId":"421100","city":"黄冈市"},{"cityId":"421200","city":"咸宁市"},{"cityId":"421300","city":"随州市"},{"cityId":"422800","city":"恩施土家族苗族自治州"},{"cityId":"429000","city":"省直辖行政单位"}]},{"provinceId":"430000","province":"湖南省","cityList":[{"cityId":"430100","city":"长沙市"},{"cityId":"430200","city":"株洲市"},{"cityId":"430300","city":"湘潭市"},{"cityId":"430400","city":"衡阳市"},{"cityId":"430500","city":"邵阳市"},{"cityId":"430600","city":"岳阳市"},{"cityId":"430700","city":"常德市"},{"cityId":"430800","city":"张家界市"},{"cityId":"430900","city":"益阳市"},{"cityId":"431000","city":"郴州市"},{"cityId":"431100","city":"永州市"},{"cityId":"431200","city":"怀化市"},{"cityId":"431300","city":"娄底市"},{"cityId":"433100","city":"湘西土家族苗族自治州"}]},{"provinceId":"440000","province":"广东省","cityList":[{"cityId":"440100","city":"广州市"},{"cityId":"440200","city":"韶关市"},{"cityId":"440300","city":"深圳市"},{"cityId":"440400","city":"珠海市"},{"cityId":"440500","city":"汕头市"},{"cityId":"440600","city":"佛山市"},{"cityId":"440700","city":"江门市"},{"cityId":"440800","city":"湛江市"},{"cityId":"440900","city":"茂名市"},{"cityId":"441200","city":"肇庆市"},{"cityId":"441300","city":"惠州市"},{"cityId":"441400","city":"梅州市"},{"cityId":"441500","city":"汕尾市"},{"cityId":"441600","city":"河源市"},{"cityId":"441700","city":"阳江市"},{"cityId":"441800","city":"清远市"},{"cityId":"441900","city":"东莞市"},{"cityId":"442000","city":"中山市"},{"cityId":"445100","city":"潮州市"},{"cityId":"445200","city":"揭阳市"},{"cityId":"445300","city":"云浮市"}]},{"provinceId":"450000","province":"广西壮族自治区","cityList":[{"cityId":"450100","city":"南宁市"},{"cityId":"450200","city":"柳州市"},{"cityId":"450300","city":"桂林市"},{"cityId":"450400","city":"梧州市"},{"cityId":"450500","city":"北海市"},{"cityId":"450600","city":"防城港市"},{"cityId":"450700","city":"钦州市"},{"cityId":"450800","city":"贵港市"},{"cityId":"450900","city":"玉林市"},{"cityId":"451000","city":"百色市"},{"cityId":"451100","city":"贺州市"},{"cityId":"451200","city":"河池市"},{"cityId":"451300","city":"来宾市"},{"cityId":"451400","city":"崇左市"}]},{"provinceId":"460000","province":"海南省","cityList":[{"cityId":"460100","city":"海口市"},{"cityId":"460200","city":"三亚市"},{"cityId":"469000","city":"省直辖县级行政单位"}]},{"provinceId":"500000","province":"重庆市","cityList":[{"cityId":"500100","city":"市辖区"},{"cityId":"500200","city":"县"},{"cityId":"500300","city":"市"}]},{"provinceId":"510000","province":"四川省","cityList":[{"cityId":"510100","city":"成都市"},{"cityId":"510300","city":"自贡市"},{"cityId":"510400","city":"攀枝花市"},{"cityId":"510500","city":"泸州市"},{"cityId":"510600","city":"德阳市"},{"cityId":"510700","city":"绵阳市"},{"cityId":"510800","city":"广元市"},{"cityId":"510900","city":"遂宁市"},{"cityId":"511000","city":"内江市"},{"cityId":"511100","city":"乐山市"},{"cityId":"511300","city":"南充市"},{"cityId":"511400","city":"眉山市"},{"cityId":"511500","city":"宜宾市"},{"cityId":"511600","city":"广安市"},{"cityId":"511700","city":"达州市"},{"cityId":"511800","city":"雅安市"},{"cityId":"511900","city":"巴中市"},{"cityId":"512000","city":"资阳市"},{"cityId":"513200","city":"阿坝藏族羌族自治州"},{"cityId":"513300","city":"甘孜藏族自治州"},{"cityId":"513400","city":"凉山彝族自治州"}]},{"provinceId":"520000","province":"贵州省","cityList":[{"cityId":"520100","city":"贵阳市"},{"cityId":"520200","city":"六盘水市"},{"cityId":"520300","city":"遵义市"},{"cityId":"520400","city":"安顺市"},{"cityId":"522200","city":"铜仁地区"},{"cityId":"522300","city":"黔西南布依族苗族自治州"},{"cityId":"522400","city":"毕节地区"},{"cityId":"522600","city":"黔东南苗族侗族自治州"},{"cityId":"522700","city":"黔南布依族苗族自治州"}]},{"provinceId":"530000","province":"云南省","cityList":[{"cityId":"530100","city":"昆明市"},{"cityId":"530300","city":"曲靖市"},{"cityId":"530400","city":"玉溪市"},{"cityId":"530500","city":"保山市"},{"cityId":"530600","city":"昭通市"},{"cityId":"530700","city":"丽江市"},{"cityId":"530800","city":"思茅市"},{"cityId":"530900","city":"临沧市"},{"cityId":"532300","city":"楚雄彝族自治州"},{"cityId":"532500","city":"红河哈尼族彝族自治州"},{"cityId":"532600","city":"文山壮族苗族自治州"},{"cityId":"532800","city":"西双版纳傣族自治州"},{"cityId":"532900","city":"大理白族自治州"},{"cityId":"533100","city":"德宏傣族景颇族自治州"},{"cityId":"533300","city":"怒江傈僳族自治州"},{"cityId":"533400","city":"迪庆藏族自治州"}]},{"provinceId":"540000","province":"西藏自治区","cityList":[{"cityId":"540100","city":"拉萨市"},{"cityId":"542100","city":"昌都地区"},{"cityId":"542200","city":"山南地区"},{"cityId":"542300","city":"日喀则地区"},{"cityId":"542400","city":"那曲地区"},{"cityId":"542500","city":"阿里地区"},{"cityId":"542600","city":"林芝地区"}]},{"provinceId":"610000","province":"陕西省","cityList":[{"cityId":"610100","city":"西安市"},{"cityId":"610200","city":"铜川市"},{"cityId":"610300","city":"宝鸡市"},{"cityId":"610400","city":"咸阳市"},{"cityId":"610500","city":"渭南市"},{"cityId":"610600","city":"延安市"},{"cityId":"610700","city":"汉中市"},{"cityId":"610800","city":"榆林市"},{"cityId":"610900","city":"安康市"},{"cityId":"611000","city":"商洛市"}]},{"provinceId":"620000","province":"甘肃省","cityList":[{"cityId":"620100","city":"兰州市"},{"cityId":"620200","city":"嘉峪关市"},{"cityId":"620300","city":"金昌市"},{"cityId":"620400","city":"白银市"},{"cityId":"620500","city":"天水市"},{"cityId":"620600","city":"武威市"},{"cityId":"620700","city":"张掖市"},{"cityId":"620800","city":"平凉市"},{"cityId":"620900","city":"酒泉市"},{"cityId":"621000","city":"庆阳市"},{"cityId":"621100","city":"定西市"},{"cityId":"621200","city":"陇南市"},{"cityId":"622900","city":"临夏回族自治州"},{"cityId":"623000","city":"甘南藏族自治州"}]},{"provinceId":"630000","province":"青海省","cityList":[{"cityId":"630100","city":"西宁市"},{"cityId":"632100","city":"海东地区"},{"cityId":"632200","city":"海北藏族自治州"},{"cityId":"632300","city":"黄南藏族自治州"},{"cityId":"632500","city":"海南藏族自治州"},{"cityId":"632600","city":"果洛藏族自治州"},{"cityId":"632700","city":"玉树藏族自治州"},{"cityId":"632800","city":"海西蒙古族藏族自治州"}]},{"provinceId":"640000","province":"宁夏回族自治区","cityList":[{"cityId":"640100","city":"银川市"},{"cityId":"640200","city":"石嘴山市"},{"cityId":"640300","city":"吴忠市"},{"cityId":"640400","city":"固原市"},{"cityId":"640500","city":"中卫市"}]},{"provinceId":"650000","province":"新疆维吾尔自治区","cityList":[{"cityId":"650100","city":"乌鲁木齐市"},{"cityId":"650200","city":"克拉玛依市"},{"cityId":"652100","city":"吐鲁番地区"},{"cityId":"652200","city":"哈密地区"},{"cityId":"652300","city":"昌吉回族自治州"},{"cityId":"652700","city":"博尔塔拉蒙古自治州"},{"cityId":"652800","city":"巴音郭楞蒙古自治州"},{"cityId":"652900","city":"阿克苏地区"},{"cityId":"653000","city":"克孜勒苏柯尔克孜自治州"},{"cityId":"653100","city":"喀什地区"},{"cityId":"653200","city":"和田地区"},{"cityId":"654000","city":"伊犁哈萨克自治州"},{"cityId":"654200","city":"塔城地区"},{"cityId":"654300","city":"阿勒泰地区"},{"cityId":"659000","city":"省直辖行政单位"}]},{"provinceId":"710000","province":"台湾省","cityList":[]},{"provinceId":"810000","province":"香港特别行政区","cityList":[]},{"provinceId":"820000","province":"澳门特别行政区","cityList":[]}]
    $http({
        url:'/get_province_city',
        method:'get'
    }).success(function(response, status, headers, config){
        //填充到selectProvince 数据源
        $scope.selectProvince=response.data;
        //初始化第一个
        for(var i=0;i<$scope.selectProvince.length;i++){
            if($scope.selectProvince[i].province==resumeDetail.province){
                $scope.select_province=$scope.selectProvince[i];
            }
        }
        //填充到selectCity 数据源
        $scope.selectCity=$scope.select_province.cityList;
        //初始化第一个
        for(var i=0;i<$scope.select_province.cityList.length;i++){
            if($scope.select_province.cityList[i].city==resumeDetail.city){
                $scope.select_city=$scope.select_province.cityList[i];
            }
        }
    });
    $scope.changeProvince=function(){
        $scope.selectCity=$scope.select_province.cityList;
        $scope.select_city=$scope.selectCity[0];
    }

    /**
     * 初始化行业工作select
     */

    //var jcData=[{"categoryNameParent":"计算机/网络","jobCategoryList":[{"id":12,"categoryName":"网页设计/制作/美工"},{"id":13,"categoryName":"建站服务"},{"id":14,"categoryName":"动画/多媒体制作"},{"id":15,"categoryName":"程序员"},{"id":16,"categoryName":"网站推广/营销"},{"id":17,"categoryName":"网络录入/发帖员"},{"id":18,"categoryName":"游戏测试/试玩/代练"},{"id":19,"categoryName":"网站管理员/站长/版主"},{"id":20,"categoryName":"软件界面设计"},{"id":21,"categoryName":"日薪技术员工"},{"id":22,"categoryName":"seo优化"},{"id":23,"categoryName":"友情链接员"}]},{"categoryNameParent":"语言/文字/文职","jobCategoryList":[{"id":24,"categoryName":"外文翻译"},{"id":25,"categoryName":"现场口译"},{"id":26,"categoryName":"作家/撰稿人"},{"id":27,"categoryName":"编辑/记者"},{"id":28,"categoryName":"校队/排版"},{"id":29,"categoryName":"口语陪练"},{"id":30,"categoryName":"字幕翻译"},{"id":31,"categoryName":"数据整理/资料录入"},{"id":32,"categoryName":"新闻(博客)写手"},{"id":33,"categoryName":"解说员"},{"id":34,"categoryName":"行政/文员"},{"id":35,"categoryName":"打字员"}]},{"categoryNameParent":"商业/销售/促销","jobCategoryList":[{"id":36,"categoryName":"销售/业务员"},{"id":37,"categoryName":"校园代理"},{"id":38,"categoryName":"商务公关/文秘"},{"id":39,"categoryName":"发单员/派发员"},{"id":40,"categoryName":"电话销售"},{"id":41,"categoryName":"保险代理"},{"id":42,"categoryName":"招生/招商代理"},{"id":43,"categoryName":"促销员/导购员"},{"id":44,"categoryName":"营业员"},{"id":45,"categoryName":"超/便利店小时工"},{"id":46,"categoryName":"网络销售"}]},{"categoryNameParent":"礼仪/演艺","jobCategoryList":[{"id":47,"categoryName":"门童/迎宾"},{"id":48,"categoryName":"群众/临时演员"},{"id":49,"categoryName":"歌手"},{"id":50,"categoryName":"夜场"},{"id":51,"categoryName":"模特"},{"id":52,"categoryName":"商演/路演"},{"id":53,"categoryName":"主持"},{"id":54,"categoryName":"婚庆司仪/宴会司仪"},{"id":55,"categoryName":"DJ/酒吧驻唱/领舞"}]},{"categoryNameParent":"加工制作","jobCategoryList":[{"id":56,"categoryName":"日新/计件工作"},{"id":57,"categoryName":"手工制作"},{"id":58,"categoryName":"编织/工艺"}]},{"categoryNameParent":"图形/影像/设计","jobCategoryList":[{"id":59,"categoryName":"图像处理"},{"id":60,"categoryName":"影像处理/影视处理"},{"id":61,"categoryName":"摄影摄像"},{"id":62,"categoryName":"平面设计/logo设计/vi设计"},{"id":63,"categoryName":"建筑装潢设计"},{"id":64,"categoryName":"工业设计"},{"id":65,"categoryName":"CAD设计"},{"id":66,"categoryName":"插图漫画"}]},{"categoryNameParent":"客服/场调查","jobCategoryList":[{"id":67,"categoryName":"电话访问/回访"},{"id":68,"categoryName":"客户咨询热线"},{"id":69,"categoryName":"呼叫中心人员"},{"id":70,"categoryName":"客服/电话客服"},{"id":71,"categoryName":"售后服务"},{"id":72,"categoryName":"场调查员"},{"id":73,"categoryName":"问卷调查"}]},{"categoryNameParent":"餐饮/服务/旅游","jobCategoryList":[{"id":74,"categoryName":"餐厅工作"},{"id":75,"categoryName":"酒吧ktv"},{"id":76,"categoryName":"递送/快递员"},{"id":77,"categoryName":"送餐小时工"},{"id":78,"categoryName":"家政保洁"},{"id":79,"categoryName":"钟点工"},{"id":80,"categoryName":"导游"}]},{"categoryNameParent":"财务/法律/咨询","jobCategoryList":[{"id":81,"categoryName":"会计/审计"},{"id":82,"categoryName":"财务咨询"},{"id":83,"categoryName":"法律工作/资讯"},{"id":84,"categoryName":"咨询员"}]},{"categoryNameParent":"教育/培训/教练","jobCategoryList":[{"id":85,"categoryName":"家教"},{"id":86,"categoryName":"教师"},{"id":87,"categoryName":"健身/舞蹈教练"},{"id":88,"categoryName":"汽车陪练"},{"id":89,"categoryName":"客户协调"},{"id":90,"categoryName":"运动教练"}]},{"categoryNameParent":"其他","jobCategoryList":[{"id":91,"categoryName":"其他工作"}]}];
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
    $scope.resume_jobs=resumeDetail.resumeJobs;
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
    $scope.work_experience=resumeDetail.workExperiences;

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
    $scope.school=resumeDetail.school;
    $scope.major=resumeDetail.major;
    $scope.education=resumeDetail.education;
    //联系方式
    $scope.phone=resumeDetail.phone;
    $scope.qq=resumeDetail.qq;
    $scope.wechat=resumeDetail.wechat;
    //其他（自我介绍/兴趣爱好）
    $scope.self_description=resumeDetail.selfDescription;

    //提交
    $scope.submitResume=function () {
        var formData= new FormData();

        var jsonData={};
        jsonData.id=resumeDetail.id;
        jsonData.stuId=resumeDetail.stuId;
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
            url:'/update_resume',
            method:'post',
            data: formData,
            headers: {'Content-Type': undefined},
            transformRequest: angular.identity
        }).success(function(response, status, headers, config){
            //成功
            if(response.msg){
                alert("修改成功")
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
    });
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