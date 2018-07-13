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
            "NAME"  : "挤压日平均报工",
            "SUBNAME"  : "截至时间为："+Avg_time(-1),
            "SQL"   :  " ",
            "ITEMS" : "平均报工数量",
            "X":"C_TIME",
            "Y":"BEFWEI_FLOAT",
            "UNITS":"1000",
            "UNITS_NAME":" 吨",
            "DECIMAL":"4",
            "strStartDate": "20170501",//Avg_time().substr(0,6)+"01",
            "strEndDate"  : "20170531",// Avg_time(-1),
            "strCurDate"  : "20170531",//Avg_time(0)
            "YYYYMM"      : "201705",//Avg_time().substr(0,6)
            "ZHIBIAO"	  : 34,
            "ZHIBIAO_NAME": "目标产量"
         };  
    
	var echarts;
	var option; 
console.log(json_data);
    $('#main').height($(window).height()-20); 
    $('#main').width($(window).width()-25); 
    var myChart = echarts.init(document.getElementById('main'));
    	
	    $.ajax({
	    	async:true,//默认是true ,异步执行
	    	url:"http://172.17.10.226:8181/api/JY_2_BAR", 
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
	        $('#main').width($(window).width()-25); 
	   	 	myChart.resize();
	    });

	    //setTimeout(function(){ 
	    //	$(location).attr('href', 'day.jsp');
    	//},500000);
	    
	   function Avg_time(add_day){//将当前时间转换成yyyymmdd格式
	        
	        var mydate = new Date();
	        mydate.setTime(mydate.getTime()+(add_day*24)*60*60*1000);
	    
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