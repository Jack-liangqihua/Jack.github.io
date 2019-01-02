package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aomei.bo.Workflow;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oa.crm.CRM;
import com.oa.crm.CRMPortType;
import com.oa.crm.OAInfo;

import cn.com.weaver.services.webservices.WorkflowService;
import cn.com.weaver.services.webservices.WorkflowServicePortType;
import weaver.workflow.webservices.ArrayOfWorkflowDetailTableInfo;
import weaver.workflow.webservices.ArrayOfWorkflowRequestTableField;
import weaver.workflow.webservices.ArrayOfWorkflowRequestTableRecord;
import weaver.workflow.webservices.ObjectFactory;
import weaver.workflow.webservices.WorkflowBaseInfo;
import weaver.workflow.webservices.WorkflowDetailTableInfo;
import weaver.workflow.webservices.WorkflowMainTableInfo;
import weaver.workflow.webservices.WorkflowRequestInfo;
import weaver.workflow.webservices.WorkflowRequestTableField;
import weaver.workflow.webservices.WorkflowRequestTableRecord;

@RestController
@RequestMapping("/api")
public class CRM2OA4DELETE {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	
	@RequestMapping(value = "/CRM2OA4DELETE", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	public String createWorkFlow(@RequestBody  Map<String, Object> params) {
		 
		
		String result = "";
		try { 
//			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
//			String SQL = "select * from formtable_main_360 where CRMID = \'"+params.get("CRMID")+"\'"; 
//			logs = jdbcTemplate2.queryForList(SQL);
//			if(logs.size()>0){			 
//				int requestid =  Integer.parseInt(logs.get(0).get("requestid").toString()) ;
			CRM service = new CRM();
			CRMPortType portType = service.getCRMHttpPort();
			result = portType.readOAStatus( params.get("CRMID")+"");
			System.out.println(result.toString());
			
			ObjectMapper mapper = new ObjectMapper();   
			OAInfo oainfo = mapper.readValue(result,OAInfo.class); 
			 System.out.println(oainfo.toString());
			
			
//			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
//			String SQL = "select * from formtable_main_376 where CRMID = \'"+params.get("CRMID")+"\'"; 
//			logs = jdbcTemplate2.queryForList(SQL);
			if(!oainfo.getRequestid().equals("")){			 
				int requestid =  Integer.parseInt(oainfo.getRequestid().toString()) ;
				WorkflowService wf = new WorkflowService();
				WorkflowServicePortType client = wf.getWorkflowServiceHttpPort();
				boolean  flag =   client.deleteRequest(requestid, 1);
				if(flag){
					result = "OK";
				}
			}else{
				result = "根据CRM ID 查找不到数据，失败";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			result = "FAULT" + e.toString();
		} 
		return "{MSG:"+result+"}";
	}

}
