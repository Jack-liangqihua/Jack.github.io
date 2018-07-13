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
							<th>ARBPL</th>
							<th>DATES</th>
							<th>bgmng_double</th>
							 
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>ARBPL</th>
							<th>DATES</th>
							<th>bgmng_double</th>
						</tr>
					</tfoot>
</table>
<script>
 

$(document).ready(function() {
	$('#myTable').DataTable( {
		"ajax": {
			"url": 'http://172.17.10.226:8181/api/DataTable',
			"dataSrc": ""
		},
		"columns": [
					{ "data": "arbpl" },
					{ "data": "dates" },
					{ "data": "bgmng_double" } 
		]
	} );
} );

</script>
</body>
</html>