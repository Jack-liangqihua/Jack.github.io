<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="/js/assets/js/jquery.min.js"></script> 
<script src="/js/dataTables/jquery.dataTables.min.js"></script> 
<link rel="stylesheet" type="text/css" href="/js/dataTables/jquery.dataTables.min.css" />


<table id="myTable" class="display" cellspacing="0" width="100%">
					<thead>
						<tr>
							<th>AUFNR</th>
							<th>ARBPL</th>
							<th>MANDT</th>
							 <th>BGMNG</th>
							 <th>BEFWEI</th>
							 <th>DATES</th>
							 <th>TIMES</th>
							 <th>NORMT</th>
							 <th>GROES</th>
							 <th>BANZU</th>
							 <th>BEFWEI_FLOAT</th>
							 <th>BGMNG_FLOAT</th>
							 <th>XQ</th>
							 <th>C_TIME</th>
							 <th>YYYYMM</th>
						</tr>
					</thead>
					<tfoot>
						<tr> 
							<th>AUFNR</th>
							<th>ARBPL</th>
							<th>MANDT</th>
							 <th>BGMNG</th>
							 <th>BEFWEI</th>
							 <th>DATES</th>
							 <th>TIMES</th>
							 <th>NORMT</th>
							 <th>GROES</th>
							 <th>BANZU</th>
							 <th>BEFWEI_FLOAT</th>
							 <th>BGMNG_FLOAT</th>
							 <th>XQ</th>
							 <th>C_TIME</th>
							 <th>YYYYMM</th>
						</tr>
					</tfoot>
</table>
<script>
function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}

$(document).ready(function() {
	 var json_data={
	            "NAME"  : "挤压机台报工",
	            "JT"  : "\'"+ GetQueryString("JT") +"\'",	           
	         };  
    $.ajax({
    	async:true,//默认是true ,异步执行
    	url:"http://172.17.10.226:8181/api/DataTable",
    	type: "POST",
    	data : JSON.stringify(json_data),
        contentType : 'application/json;charset=utf-8' ,
      success: function(dataSet, status, xhr) {
        //console.log(data);
        if(dataSet!=null){
        	$('#myTable').DataTable( {
        		data: dataSet,
        		columns: [
        			{ "data": "AUFNR" }, { "data": "ARBPL" }, { "data": "MANDT" }, { "data": "BGMNG" }, { "data": "BEFWEI" }, 
        			{ "data": "DATES" }, { "data": "TIMES" }, { "data": "NORMT" }, { "data": "GROES" }, { "data": "BANZU" }, 
        			{ "data": "BEFWEI_FLOAT" }, { "data": "BGMNG_FLOAT" }, { "data": "XQ" }, { "data": "C_TIME" }, { "data": "YYYYMM" }

        		]
        	} );
        } 
      }
     });
	
	

	
	
	 
} );

</script>
</body>
</html>