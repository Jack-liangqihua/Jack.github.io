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
     
    var json_data={
            "NAME"  : "挤压机台报工",
            "SUBNAME"  : "机台日产量",
            "SQL"   :  "内部",
            "ITEMS" : "前一天报工数量"
         };  
    
	var echarts;
	var option; 

    $('#main').height($(window).height()-20); 
    $('#main').width($(window).width()-15); 
    var myChart = echarts.init(document.getElementById('main'));
    	
	    $.ajax({
	    	async:true,//默认是true ,异步执行
	    	url:"http://172.17.10.226:8181/api/JY_1_BAR",
	    	type: "POST",
	    	data : JSON.stringify(json_data),
	        contentType : 'application/json;charset=utf-8' ,
	      success: function(data, status, xhr) {
	        console.log(data);
	        if(data!=null){
	        	option = data;           
	            myChart.setOption(option);
	        } 
	      }
	     });
    
	  //当文档窗口发生改变时 触发  
	    $(window).resize(function(){  
	        $('#main').height($(window).height()-20); 
	        $('#main').width($(window).width()-15); 
	   	 	myChart.resize();
	    });
  
    </script>
</body>
</html>