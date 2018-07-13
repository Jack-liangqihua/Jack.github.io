<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/js/dataTables/jquery.dataTables.min.css" />
</head>
<body>
<script src="/js/assets/js/jquery.min.js"></script> 
<script src="/js/dataTables/jquery.dataTables.min.js"></script> 
<script src="/js/dataTables/decimal.js"></script> 
<script src="/js/kayalshri-tableExport/aomei/mybase64.js"></script> 
<script src="/js/kayalshri-tableExport/aomei/mytableExport.js"></script> 

 
<div style="border:2px solid #010E0F;margin-top:10px;">
	<div style="text-align:center"> 
		<input type="button" value="导出" onClick ="aomei_export(0);" style="display:none"></input>
		<h3>发货明细</h3>
		<div style="margin-top:15px;" id="sumresult"></div>
	</div>
	 <div id="aomei_data">
	<table id="myTable" class="display" cellspacing="0" width="100%">
						<thead>
							<tr> 
								<th>客户到期欠款</th> 
								<th>货币单位</th> 
								<th>超期天数</th> 
								<th>订单号</th> 
								<th>重量</th> 
								<th>重量单位</th> 
								<th>出货日期</th> 
								
							</tr>
						</thead>
						 <!--  <tfoot>
							<tr>  
								<th>ZNETWR</th> 
								<th>WAERK</th>  
								<th>ZOVERDUE</th> 
								<th>VBELN</th>
								<th>BTGEW</th> 
								<th>GEWEI</th>  
								<th>WADAT_IST</th>  
							</tr>
						</tfoot>  -->
	</table>
	</div>
</div>







<div style="border:2px solid #010E0F;margin-top:10px;">
	<div style="text-align:center"> 
		<input type="button" value="导出" onClick ="aomei_export(1);"  style="display:none" ></input>
		<h3>回款明细</h3>
		<div style="margin-top:15px;" id="sumresult1"></div>
	</div>
	 <div id="aomei_data1">
	<table id="myTable1" class="display" cellspacing="0" width="100%">
						<thead>
							<tr> 
								<th>金额</th> 
								<th>货币单位</th> 
								<th>汇款日期</th> 
								<th>款项说明</th>  
							</tr>
						</thead>
						  <!-- <tfoot>
							<tr>  
								<th>ZNETWR</th> 
								<th>WAERK</th>  
								<th>PDATE</th> 
								<th>TEXT</th> 
							</tr>
						</tfoot>  -->
	</table>
	</div>
</div>

<script>
function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}

$(document).ready(function() { 
	 var table ; 
	 var json_data={  
			    "FLAG"   : "COST",
			    "KTOKD"  : GetQueryString("KTOKD"),
			    "KUNNR"  : GetQueryString("KUNNR"),
	            "MANDT"  : GetQueryString("MANDT"),
	            "VKORG"  : GetQueryString("VKORG"),
	            "WAERK"  : GetQueryString("WAERK"),
	            "WERKS"  : GetQueryString("WERKS")
	             	           //KUNNR, MANDT, VKORG, WAERK, WERKS
	         };  
	 console.log(json_data);
    $.ajax({
    	async:false,//默认是true ,异步执行
    	url:"http://172.17.10.226:8181/api/SUM_KUNNR_DEBT_DETAIL",
    	type: "POST",
    	data : JSON.stringify(json_data),
        contentType : 'application/json;charset=utf-8' ,
      success: function(dataSet, status, xhr) {
        console.log(dataSet);
        if(dataSet!=null){
        	table =$('#myTable').DataTable( {
	        		"autoWidth": true,
	        		"aLengthMenu" : [ 5, 10, 20, 40, 60, 100, 500, 1000], //更改显示记录数选项 
	        		 //"scrollY": 300, //控制y轴滚动
	        		"oLanguage": {
	        			"sLengthMenu": "每页显示 _MENU_ 条记录",
	        			"sZeroRecords": "抱歉， 没有找到",
	        			"sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
	        			"sInfoEmpty": "没有数据",
	        			"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
	        			"oPaginate": {
	        			"sFirst": "首页",
	        			"sPrevious": "前一页",
	        			"sNext": "后一页",
	        			"sLast": "尾页"
	        			},
	        			"sZeroRecords": "没有检索到数据",
	        			"sProcessing": "<img src='./loading.gif' />"
	        			},
	        		"bFilter": true, 
	        		"language": {
	                    "decimal":",",
	                    "thousands":"."
	                },
	        		data: dataSet,
	        		"order": [ 0, 'desc' ],
	        		columns: [  
	        			//{ "data": "MANDT" }, 
	        			
	        			{ "data": "ZNETWR" }, 
	        			{ "data": "WAERK" }, 
	        			{ "data": "ZOVERDUE"}, 
	        			{ "data": "VBELN" }, 
	        			{ "data": "BTGEW" }, 
	        			{ "data": "GEWEI" },
	        			{ "data": "WADAT_IST"}
	
	        		],
	                "footerCallback": function ( row, data, start, end, display ) {
	                    var api = this.api(), data;  
	                    
	                    var WAERK_column=api .column( 1 ) .data();  //获取货币类别
	                    var total_Curr=$.unique(WAERK_column.sort());
	                    
	                    var total_result = "";
	                   
	                    for(var i =0 ;i<total_Curr.length;i++){ 
	                     	var curr = 0; 
	                    	for(var k = 0;k<data.length;k++){ 
		                    	if(data[k].WAERK == total_Curr[i]){ 
		                    		curr = new Decimal(curr).add(new Decimal(data[k].ZNETWR)).toString();
		                    	}
		                    }
	                    	total_result += ("<font style=\"color:red\">"+total_Curr[i] + ":</font>")+ curr + "   "; 
		                }
	                    
	                    
	                    //当前页面的统计
	                    var pageTotal_result = ""; 
	                    var page_WAERK_column=api .column('0', { page: 'current'} ) .data(); 
	                    
	                    var page_Curr=api .column('1', { page: 'current'} ) .data();
	                     
	                    var page_Curr_temp = []; 
	                    for(var t=0;t<page_Curr.length;t++){
	                    	page_Curr_temp[t] = page_Curr[t];
	                    }
	                    var page_total_Curr=$.unique(page_Curr_temp.sort()); 
	                   
	                    
	                    for(var j =0 ;j<page_total_Curr.length;j++){ 
	                     	var curr = 0;  
	                     	for(var p = 0;p<page_WAERK_column.length;p++){  
	                     		//console.log(page_Curr[p]+ ":" +page_total_Curr[j]);
		                    	if(page_Curr[p] == page_total_Curr[j]){   
		                    		curr = new Decimal(curr).add(new Decimal(page_WAERK_column[p])).toString();
		                    	}
		                    }
	                    	pageTotal_result += ("<font style=\"color:red\">"+page_total_Curr[j] + ":</font>")+ curr + "   "; 
		                }
	      
	                    $( "#sumresult" ).html(
	                        '当前页总计：'+pageTotal_result  +' ( 所有单据总计：'+ total_result  +')'
	                    );
	                },
	        		 "createdRow": function ( row, data, dataIndex )   {
	        		        //console.log(data);   
	        		        if(data.ZNETWR > 1000000 ){ 
		        		        $('td', row).eq(0).css('color','red');
	        		        }
	        		         
	        		 },
	                "columnDefs": [
	                               {

	                                   defaultContent: '',
	                                   targets: [ '_all' ]
	                               }
	                           ]
        	} );
        } 
      }
     });
    
    
    
    
    
    
	 var table1 ; 
	 var json_data1={  
			    "FLAG"  : "PAY",
			    "KTOKD"  : GetQueryString("KTOKD"),
			    "KUNNR"  : GetQueryString("KUNNR"),
	            "MANDT"  : GetQueryString("MANDT"),
	            "VKORG"  : GetQueryString("VKORG"),
	            "WAERK"  : GetQueryString("WAERK"),
	            "WERKS"  : GetQueryString("WERKS")
	             	           //KUNNR, MANDT, VKORG, WAERK, WERKS
	         };  
	 console.log(json_data1);
   $.ajax({
   	 async:false,//默认是true ,异步执行
   	 url:"http://172.17.10.226:8181/api/SUM_KUNNR_DEBT_DETAIL",
   	 type: "POST",
   	 data : JSON.stringify(json_data1),
     contentType : 'application/json;charset=utf-8' ,
     success: function(dataSet, status, xhr) {
       console.log(dataSet);
       if(dataSet!=null){
       	table1 =$('#myTable1').DataTable( {
	        		"autoWidth": true,
	        		"aLengthMenu" : [ 5, 10, 20, 40, 60, 100, 500, 1000], //更改显示记录数选项 
	        		 //"scrollY": 300, //控制y轴滚动
	        		"oLanguage": {
	        			"sLengthMenu": "每页显示 _MENU_ 条记录",
	        			"sZeroRecords": "抱歉， 没有找到",
	        			"sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
	        			"sInfoEmpty": "没有数据",
	        			"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
	        			"oPaginate": {
	        			"sFirst": "首页",
	        			"sPrevious": "前一页",
	        			"sNext": "后一页",
	        			"sLast": "尾页"
	        			},
	        			"sZeroRecords": "没有检索到数据",
	        			"sProcessing": "<img src='./loading.gif' />"
	        			},
	        		"bFilter": true, 
	        		"language": {
	                    "decimal":",",
	                    "thousands":"."
	                },
	        		data: dataSet,
	        		"order": [ 0, 'desc' ],
	        		columns: [  
	        			//{ "data": "MANDT" }, 
	        			
	        			{ "data": "ZNETWR" }, 
	        			{ "data": "WAERK" }, 
	        			{ "data": "PDATE"}, 
	        			{ "data": "TEXT" }
	        		 
	
	        		],
	                "footerCallback": function ( row, data, start, end, display ) {
	                    var api = this.api(), data;  
	                    
	                    var WAERK_column=api .column( 1 ) .data();  //获取货币类别
	                    var total_Curr=$.unique(WAERK_column.sort());
	                    
	                    var total_result = "";
	                   
	                    for(var i =0 ;i<total_Curr.length;i++){ 
	                     	var curr = 0; 
	                    	for(var k = 0;k<data.length;k++){ 
		                    	if(data[k].WAERK == total_Curr[i]){ 
		                    		curr = new Decimal(curr).add(new Decimal(data[k].ZNETWR)).toString();
		                    	}
		                    }
	                    	total_result += ("<font style=\"color:red\">"+total_Curr[i] + ":</font>")+ curr + "   "; 
		                }
	                    
	                    
	                    //当前页面的统计
	                    var pageTotal_result = ""; 
	                    var page_WAERK_column=api .column('0', { page: 'current'} ) .data(); 
	                    
	                    var page_Curr=api .column('1', { page: 'current'} ) .data();
	                     
	                    var page_Curr_temp = []; 
	                    for(var t=0;t<page_Curr.length;t++){
	                    	page_Curr_temp[t] = page_Curr[t];
	                    }
	                    var page_total_Curr=$.unique(page_Curr_temp.sort()); 
	                   
	                    
	                    for(var j =0 ;j<page_total_Curr.length;j++){ 
	                     	var curr = 0;  
	                     	for(var p = 0;p<page_WAERK_column.length;p++){  
	                     		//console.log(page_Curr[p]+ ":" +page_total_Curr[j]);
		                    	if(page_Curr[p] == page_total_Curr[j]){   
		                    		curr = new Decimal(curr).add(new Decimal(page_WAERK_column[p])).toString();
		                    	}
		                    }
	                    	pageTotal_result += ("<font style=\"color:red\">"+page_total_Curr[j] + ":</font>")+ curr + "   "; 
		                }
	      
	                    $( "#sumresult1" ).html(
	                        '当前页总计：'+pageTotal_result  +' ( 所有单据总计：'+ total_result  +')'
	                    );
	                },
	        		 "createdRow": function ( row, data, dataIndex )   {
	        		        //console.log(data);   
	        		        if(data.ZNETWR > 1000000 ){ 
		        		        $('td', row).eq(0).css('color','red');
	        		        }
	        		         
	        		 },
	                "columnDefs": [
	                               {

	                                   defaultContent: '',
	                                   targets: [ '_all' ]
	                               }
	                           ]
       	} );
       } 
     }
    });
    
    
    
	 
} );

function Cleanup(idTmr) {
    window.clearInterval(idTmr);
    CollectGarbage();
}


function aomei_export(id){ 
	 
	  if (!!window.ActiveXObject || "ActiveXObject" in window) {//IE浏览器
		var idTmr; 
		 var curTbl ;
		 if(id==1){
			 curTbl = document.getElementById("myTable1");
		 }else{
			 curTbl = document.getElementById("myTable");
		 }
         var oXL = new ActiveXObject("Excel.Application");

         //创建AX对象excel 
         var oWB = oXL.Workbooks.Add();
         //获取workbook对象 
         var xlsheet = oWB.Worksheets(1);
         //激活当前sheet 
         var sel = document.body.createTextRange();
         sel.moveToElementText(curTbl);
         //把表格中的内容移到TextRange中 
         sel.select;
         //全选TextRange中内容 
         sel.execCommand("Copy");
         //复制TextRange中内容  
         xlsheet.Paste();
         //粘贴到活动的EXCEL中       
         oXL.Visible = true;
         //设置excel可见属性

         try {
             var fname = oXL.Application.GetSaveAsFilename("Excel.xls", "Excel Spreadsheets (*.xls), *.xls");
         } catch (e) {
             print("Nested catch caught " + e);
         } finally {
             oWB.SaveAs(fname);

             oWB.Close(savechanges = false);
             //xls.visible = false;
             oXL.Quit();
             oXL = null;
             //结束excel进程，退出完成
             //window.setInterval("Cleanup();",1);
             idTmr = window.setInterval("Cleanup();", 1);

         }

	}else{
		var id_table = "#"+id+" table";
		 if(id==1){
			    $("#myTable1 table").tableExport({type:'excel',escape:'false',fileName: 'outpu'});				 
		 }else{
			 $("#myTable table").tableExport({type:'excel',escape:'false',fileName: 'outpu'});				 
		 }	
	}
}
</script> 
</body>
</html>