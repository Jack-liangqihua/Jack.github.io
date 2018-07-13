<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head></head>
 <body> 
    <!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
    <div id="main" style="height:200px;border:0px ;padding:0px;"></div>
    
    
    <!--Step:2 Import echarts.js--> 
    <script src="/js/echarts-2.2.7/build/dist/echarts-all.js"></script>  
    <script src="/js/assets/js/jquery.min.js"></script>
    
    <script type="text/javascript">
     //"select ARBPL,sum(BEFWEI_FLOAT) as BEFWEI_FLOAT from \"_SYS_BIC\".\"aomei/ZPPPR_KANBAN_BG\"  where	  C_TIME ="+nowtime()+" group by arbpl order by arbpl ",
    var json_data={
            "NAME"  : "挤压产量日报表",
            "SUBNAME"  : nowtime()+"日产量",
            "SQL"   :  "select ARBPL,sum(BEFWEI_FLOAT) as BEFWEI_FLOAT from \"_SYS_BIC\".\"aomei.prod/ZPPPR_KANBAN_BG\"  where	  C_TIME =\'20170607\' group by arbpl order by arbpl ",
            "ITEMS" : "日报工数量",
            "X":"ARBPL",
            "Y":"BEFWEI_FLOAT", 
            "UNITS":"1000",
            "UNITS_NAME":" 吨",
            "DECIMAL":"1"
         }; 
    //console.log(json_data);
	var echarts;
	var option; 

    $('#main').height($(window).height()-20); 
    $('#main').width($(window).width()-15); 
    var myChart = echarts.init(document.getElementById('main'));
    	
	    $.ajax({
	    	async:true,//默认是true ,异步执行
	    	url:"http://172.17.10.226:8181/api/Echart_Bar",
	    	type: "POST",
	    	data : JSON.stringify(json_data),
	        contentType : 'application/json;charset=utf-8' ,
	      success: function(data, status, xhr) {
	        //console.log(data);
	        if(data!=null){
	        	option = data;           
	            myChart.setOption(option);
	        } 
	      }
	     }); 
	    myChart.on('click', function (params) {
	    	console.log(params);
	    	window.open('dataTable.jsp?JT=' + encodeURIComponent(params.name)); 
	    });
	    
    
	  //当文档窗口发生改变时 触发  
	    $(window).resize(function(){  
	        $('#main').height($(window).height()-20); 
	        $('#main').width($(window).width()-15); 
	   	 	myChart.resize();
	    });
	  
	    setTimeout(function(){ 
	    	$(location).attr('href', 'JiTai.jsp');
    	},50000);
  
	    
 function nowtime(){//将当前时间转换成yyyymmdd格式
	        
	        var mydate = new Date();
	        mydate.setTime(mydate.getTime()-24*60*60*1000);
	    
	        var str = "" + mydate.getFullYear();
	        var mm = mydate.getMonth()+1
	        if(mydate.getMonth()>9){
	         str += mm;
	        }
	        else{
	         str += "0" + mm;
	        }
	        if(mydate.getDate()>9){
	         str += mydate.getDate();
	        }
	        else{
	         str += "0" + mydate.getDate();
	        }
	        //window.alert(str);
	        return str;
	      }
	 

	    
    </script>
</body>
</html>