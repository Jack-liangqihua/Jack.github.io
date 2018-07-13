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
    
    <script type="text/javascript">
   var    option = {
    title : {
        text: '温度计式图表',
        subtext: 'From ExcelHome',
        sublink: 'http://e.weibo.com/1341556070/AizJXrAEa'
    },
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        },
        formatter: function (params){
            return params[0].name + '<br/>'
                   + params[0].seriesName + ' : ' + params[0].value + '<br/>'
                   + params[1].seriesName + ' : ' + (params[1].value + params[0].value);
        }
    },
    legend: {
        selectedMode:false,
        data:['Acutal', 'Forecast']
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : ['Cosco','CMA','APL','OOCL','Wanhai','Zim']
        }
    ],
    yAxis : [
        {
            type : 'value',
            boundaryGap: [0, 0.1]
        }
    ],
    series : [
        {
            name:'Acutal',
            type:'bar',
            stack: 'sum',
            barCategoryGap: '50%',
            itemStyle: {
                normal: {
                    color: 'tomato',
                    barBorderColor: 'tomato',
                    barBorderWidth: 6,
                    barBorderRadius:0,
                    label : {
                        show: true, position: 'insideTop'
                    }
                }
            },
            data:[260, 200, 220, 120, 100, 80]
        },
        {
            name:'Forecast',
            type:'bar',
            stack: 'sum',
            itemStyle: {
                normal: {
                    color: '#fff',
                    barBorderColor: 'tomato',
                    barBorderWidth: 6,
                    barBorderRadius:0,
                    label : {
                        show: true, 
                        position: 'top',
                        formatter: function (params) {
                            for (var i = 0, l = option.xAxis[0].data.length; i < l; i++) {
                                if (option.xAxis[0].data[i] == params.name) {
                                    return option.series[0].data[i] + params.value;
                                }
                            }
                        },
                        textStyle: {
                            color: 'tomato'
                        }
                    }
                }
            },
            data:[40, 80, 50, 80,80, 70]
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