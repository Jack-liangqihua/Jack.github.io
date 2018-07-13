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

 

<div style="text-align:center">
公司  
<select style="width:120px;" id="WERKS" class="select">
        <option value="">--请选择--</option>
        <option value="1000">1000</option>
        <option value="2000">2000</option>
 </select>
 
销售组织  
<select style="width:120px;" id="VKORG" class="select">
        <option value="">--请选择--</option>
		<option value="1000">1000	澳美国内销售部</option>
		<option value="1100">1100	澳美国际业务部</option>
		<option value="1300">1300	澳美太阳能销售部</option>
		<option value="1400">1400	澳美宜家销售组织</option>
		<option value="1500">1500	澳美工业材销售组织</option>
		<option value="2000">2000	高新深加工产品销售部</option>
		<option value="2100">2100	高新家居产品营销部</option> 
		<option value="2200">2200	高新3C产品销售部</option> 
		<option value="2300">2300	高新新能源产品销售部</option> 
		 
</select>

<input type="button" value="导出" onClick ="aomei_export();" ></input>

<div style="margin-top:15px;" id="sumresult"></div>


</div>
 <div id="aomei_data">
<table id="myTable" class="display" cellspacing="0" width="100%">
					<thead>
						<tr>  
							<th>客户到期欠款</th> 
							<th>货币单位</th> 
							<th>客户</th> 
							<th>名称</th> 
							<th>公司</th> 
							<th>销售负责人</th> 
							<th>销售组织名称</th> 
							
						</tr>
					</thead>
					  <tfoot>
						<tr>  
							<th>ZNETWR</th> 
							<th>WAERK</th>  
							<th>KUNNR</th> 
							<th>NAME1</th>
							<th>WERKS</th> 
							<th>VKORG</th>  
							<th>VTEXT</th>  
						</tr>
					</tfoot> 
</table>
</div>
<script>
 

$(document).ready(function() {
	
	
	 var table ;
	
	 var json_data={
	            "NAME"  : "客户到期欠款",
	            //"KUNNR"  : "\'"+ $("#KUNNR").val() +"\'" 	           
	         };  
	 console.log(json_data);
    $.ajax({
    	async:true,//默认是true ,异步执行
    	url:"http://172.17.10.226:8181/api/SUM_KUNNR_DEBT",
    	type: "POST",
    	data : JSON.stringify(json_data),
        contentType : 'application/json;charset=utf-8' ,
      success: function(dataSet, status, xhr) {
        //console.log(data);
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
	        			
	        			{ "data": "ZNETWR",
	        				"createdCell": function (cell, cellData, rowData, row, col) { 
	        				  $(cell).html(cellData.toFixed(2));
		                    }
	        			}, 
	        			{ "data": "WAERK" }, 
	        			{ "data": "KUNNR" }, 
	        			{ "data": "NAME1" },
	        			{ "data": "WERKS" ,
	        				"createdCell": function (cell, cellData, rowData, row, col) {
	        					var company = "";
	        				  switch(cellData){
	 	        		        case "1000": 
	 	        		        	company = "澳美"; 
	 	        		        	 break;
	 	        		       case "2000": 
	 	        		        	company = "高新"; 
	 	        		        	 break;
	 	        		        } 
	        				  $(cell).html(company);
		                    }
	        			}, 
	        			//{ "data": "KTOKD" }, 
	        			{ "data": "VKORG" ,
	        				"createdCell": function (cell, cellData, rowData, row, col) {
	        					var person = "";
	        				  switch(cellData){
	 	        		        case "1100":
	 	        		        case "1500":
	 	        		       case "1400":
	 	        		        	person = "朱海娟"; 
	 	        		        	 break;
	 	        		        case "1000":
	 	        		        case "1300": 
	 	        		        	person = "王娟 "; 
	 	        		        	break;
	 	        		        case "2100":
	 	        		        case "2200":
	 	        		        case "2300":
	 	        		        	person = "吕彩云";
	 	        		        	break;
	 	        		        } 
	        				  $(cell).html(person);
		                    }
	        			}, 
	        			{ "data": "VTEXT" } 
	
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
	     
	                /* Total over this page
	               var  pageTotal = api
	                    .column( 0, { page: 'current'} )
	                    .data()
	                    .reduce( function (a, b) {
	                    	var x = new Decimal(a);
	                    	var y = new Decimal(b); 
	                    	//a  +  b;
	                    	return x.add(y).toString();
	                         
	                    }, 0 );
	                    
	                    
	                  */  
	                    
	        
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
	
	
    
    
    
    
    
    $.fn.dataTable.ext.search.push(
    	    function( settings, data, dataIndex ) {
    	    	
    	    	var flag = 0;
    	    	
    	       //公司查询
    	    	var WERKS =  $('#WERKS').val();
    	        var WERKS_col =  data[4] ;  
    	        if ( 	 WERKS=="" ||  WERKS==WERKS_col   ) {
    	        	
    	        	//销售组织查询
        	    	var VKORG =  $('#VKORG').val();
        	        var VKORG_col =  data[5] ;  
        	        if ( 	 VKORG=="" ||  VKORG==VKORG_col   ) {   return true; } 
    	        	
    	        }
    	         
    	        
    	      
    	        
    	        return false;
    	    }
    	);
    
    
    $('#WERKS,#VKORG').change( function() {
        table.draw();
    } ); 
     
     

    $('#myTable').on('click', 'tr', function () {
        var data = table.row( this ).data();
        if(data!=null){ 
            console.log(data);
            var keycode ="?";
            keycode +="KTOKD="+data.KTOKD+"&";
            keycode +="KUNNR="+data.KUNNR+"&";
            keycode +="MANDT="+data.MANDT+"&";
            keycode +="VKORG="+data.VKORG+"&";
            keycode +="WAERK="+data.WAERK+"&";
            keycode +="WERKS="+data.WERKS;
           // window.open("datadetail.jsp"+keycode);
        }
    } );





} );

function Cleanup(idTmr) {
    window.clearInterval(idTmr);
    CollectGarbage();
}


function aomei_export(){ 
	 
	  if (!!window.ActiveXObject || "ActiveXObject" in window) {//IE浏览器
		var idTmr; 
		 var curTbl = document.getElementById("myTable");
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
	    $('#aomei_data table').tableExport({type:'excel',escape:'false',fileName: 'outpu'});		
	}
}
</script> 
</body>
</html>