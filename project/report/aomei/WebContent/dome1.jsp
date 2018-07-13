<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
     
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <body>
    <!--Step:1 Prepare a dom for ECharts which (must) has size (width & hight)-->
    <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
    <div id="main" style="height:500px;border:1px solid #ccc;padding:10px;"></div>
    
    
    <!--Step:2 Import echarts.js-->
    <!--Step:2 引入echarts.js-->
    <script src="/js/echarts-2.2.7/build/dist/echarts-all.js"></script>  
    <script src="/js/assets/js/jquery.min.js"></script>
    <script type="text/javascript">
    var option = {
    /*title : {
        text: '销售订单 ',
        subtext: '饼状图示例',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    }, 
    legend: {
        orient : 'vertical',
        x : 'left',
        data:[ 
				'1000	澳美国内销售部',
				'1100	澳美国际业务部',
				'1200	澳美高新业务部',
				'1300	澳美太阳能销售部',
				'1400	澳美宜家销售组织',
				'1500	澳美工业材销售组织',
				'1600	澳美贸易销售部',
				'2000	高新深加工产品销售部',
				'2100	高新家居产品营销部',
				'2200	高新3C产品销售部',
				'2300	高新新能源产品销售部',
				'3000	澳美贸易销售部',
				'6000	广东澳美国内销售部',
				'6100	广东澳美国际业务部',
				'6300	广东澳美太阳能销售部',
				'8000	澳美湖北综合销售部']
    },*/
    toolbox: {
        show : false,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {
                show: true, 
                type: ['pie', 'funnel'],
                option: {
                    funnel: {
                        x: '25%',
                        width: '50%',
                        funnelAlign: 'left',
                        max: 1548
                    }
                }
            },
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    series : [
        {
            name:'访问来源',
            type:'pie',
            radius : '55%',
            center: ['50%', '60%'],
            data:[
                
                 
				{value:1548, name:'1000	澳美国内销售部'},
				{value:1548, name:'1100	澳美国际业务部'},
				{value:1548, name:'1200	澳美高新业务部'},
				{value:1548, name:'1300	澳美太阳能销售部'},
				{value:1548, name:'1400	澳美宜家销售组织'},
				{value:1548, name:'1500	澳美工业材销售组织'},
				{value:1548, name:'1600	澳美贸易销售部'},
				{value:1548, name:'2000	高新深加工产品销售部'},
				{value:1548, name:'2100	高新家居产品营销部'},
				{value:1548, name:'2200	高新3C产品销售部'},
				{value:48, name:'2300	高新新能源产品销售部'},
				{value:10, name:'3000	澳美贸易销售部'},
				{value:1548, name:'6000	广东澳美国内销售部'},
				{value:1548, name:'6100	广东澳美国际业务部'},
				{value:1548, name:'6300	广东澳美太阳能销售部'},
				{value:18, name:'8000	澳美湖北综合销售部'}
                
            ]
        }
    ]
};
                    

//var option=eval('('+re+')');

var echarts;
var myChart = echarts.init(document.getElementById('main'));
myChart.setOption(option);
  
    </script>
</body>
</html>