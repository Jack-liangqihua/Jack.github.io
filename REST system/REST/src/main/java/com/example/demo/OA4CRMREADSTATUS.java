package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oa.crm.CRM;
import com.oa.crm.CRMPortType;

@RestController
@RequestMapping("/api")
public class OA4CRMREADSTATUS {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;

	@RequestMapping(value = "/OA4CRMREADSTATUS", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	public String readCrmInfobyCrmid(@RequestBody Map<String, Object> params) {
		String result = "";
 		try {
 			CRM service = new CRM();
			CRMPortType portType = service.getCRMHttpPort();
			result = portType.readOAStatus( params.get("CRMID")+"");
 			
//			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
//			String SQL = "select CRMID , requestId from formtable_main_360   where CRMID=\'" + params.get("CRMID").toString() + "\'";
//			System.out.println(SQL);
//			logs = jdbcTemplate2.queryForList(SQL);
//			String requestid = logs.get(0).get("requestId").toString();
//			result += "{";
//			if (logs != null && logs.size() > 0) {
//				if (requestid != null) { 
//					SQL = "select workflow_requestbase.requestid , workflow_requestbase.status , HrmResource.lastname from workflow_requestbase left join HrmResource on workflow_requestbase.lastoperator = HrmResource.id where requestid="
//							+ requestid;
//					logs = jdbcTemplate2.queryForList(SQL);
//					if (logs != null && logs.size() > 0) {
//						
//						result += "requestid:" + logs.get(0).get("requestid").toString() + ",";
//						if (logs.get(0).get("status").toString().equals("领导审批")) {
//							result += "CanDel:Y,";
//						} else {
//							result += "CanDel:N,";
//						}
//						result += "status:" + logs.get(0).get("status").toString() + ",";
//						result += "lastname:" + logs.get(0).get("lastname").toString();
//						 
//					}
//				}
//			} else {
//				result += "CanDel:N";
//			}
//			result += "}";
//
 		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "失败,程序异常" + e.toString();
		}
		return result;

	}
}
