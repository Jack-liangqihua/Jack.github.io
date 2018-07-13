<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>"> 
  </head>
  
 <body>
 
    <!--Step:1 Prepare a dom for ECharts which (must) has size (width & hight)-->
    <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
    <div id="main2" style="height:300px;width:350px;padding:10px;float:left;"></div>
    <div id="main" style="height:300px;width:550px;padding:10px;float:left;"></div>    
    <div id="main3" style="height:300px;width:350px;padding:10px;float:left;"></div>
    <div id="main1" style="height:300px;padding:10px;"></div>
    <!--Step:2 Import echarts.js-->
    <!--Step:2 引入echarts.js-->
    <script src="/js/echarts-2.2.7/build/dist/echarts-all.js"></script> 
    
    <script type="text/javascript">
   var    option = {
    title : {
        text: '温度计式图表',
        //subtext: 'From ExcelHome',
        sublink: '#'
    },/*
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
        show : false,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },*/
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
 

 var echarts;
 var myChart = echarts.init(document.getElementById('main'));
 myChart.setOption(option);

  var   option1 = {
    title : {
        text: '公司销售订单数量变化',
        //subtext: '纯属虚构'
    },
    tooltip : {
        trigger: 'axis'
    },
    /*
    legend: {
        data:['1000公司','2000公司' ,'8000公司']
    },*/
    toolbox: {
        show : false,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            boundaryGap : false,
            data : ['周一','周二','周三','周四','周五','周六','周日']
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value} °C'
            }
        }
    ],
    series : [
        {
            name:'1000公司',
            type:'line',
            data:[11, 11, 15, 13, 12, 13, 10],
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'2000公司',
            type:'line',
            data:[3, 2, 3, 7, 6, 4, 4],
            markPoint : {
                data : [
                    {name : '周最低', value : -2, xAxis: 1, yAxis: -1.5}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : '平均值'}
                ]
            }
        },
        {
            name:'8000公司',
            type:'line',
            data:[1, 0, 2, 2.5, 3, 2, 0],
            markPoint : {
                data : [
                    {name : '周最低', value : -2, xAxis: 1, yAxis: -1.5}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : '平均值'}
                ]
            }
        }
    ]
};

 var myChart1 = echarts.init(document.getElementById('main1'));
 myChart1.setOption(option1);
 
 
 
 var option2 = {
    title : {
        text: '销售订单 ',
        //subtext: '饼状图示例',
        x:'left'
    },/*
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
            dataView : {show: true, readOnly: true},
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
                
                 
				{value:1548, name:'1000	国内销售'},
				{value:1548, name:'1100	国际业务部'},
				{value:1548, name:'1200	高新业务部'},
				{value:1548, name:'1300	太阳能销售'},
				{value:1548, name:'1400	宜家销售'},
				{value:1548, name:'1500	工业材'},
				{value:1548, name:'1600	贸易销售部'},
				{value:1548, name:'2000	深加工'},
				{value:1548, name:'2100	家居产品'},
				{value:1548, name:'2200	3C产品'},
				{value:48, name:'2300	新能源产品'},
				{value:10, name:'3000	澳美贸易'},
				{value:1548, name:'6000	国内'},
				{value:1548, name:'6100	国际'},
				{value:1548, name:'6300	太阳能'},
				{value:18, name:'8000	湖北'}
                
            ]
        }
    ]
};
                    
var myChart2 = echarts.init(document.getElementById('main2'));
myChart2.setOption(option2);
 
 
 
 var option3 = {
    title : {
        text: '生产订单',
        //subtext: '完全实况数据'
    },
    tooltip : {
        trigger: 'axis'
    },/*
    legend: {
        x : 'center',
        data:['生产订单']
    },*/
    toolbox: {
        show : false,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    polar : [
        {
            indicator : [
                {text : '创建', max  : 100},
                {text : '释放', max  : 100},
                {text : '在途', max  : 100},
                {text : '取消', max  : 100},
                {text : '完成', max  : 100},
                {text : '出货', max  : 100}
            ],
            radius : 130
        }
    ],
    series : [
        {
            name: '实况数据',
            type: 'radar',
            itemStyle: {
                normal: {
                    areaStyle: {
                        type: 'default'
                    }
                }
            },
            data : [
                {
                    value : [87, 52, 88, 14, 60, 56],
                    name : '1000工厂'
                } 
            ]
        }
    ]
};
 
 
 var myChart3 = echarts.init(document.getElementById('main3'));
myChart3.setOption(option3);
      
    </script>
</body>
</html>