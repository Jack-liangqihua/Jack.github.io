package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SMSCellback {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;

	@RequestMapping(value = "/SMSCellback", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	public String readCrmInfobyCrmid(
			@RequestParam(name = "appid") String appid ,
			@RequestParam(name = "msgid") String msgid ,
			@RequestParam(name = "mobile") String mobile ,
			@RequestParam(name = "servicenumber") String servicenumber ,
			@RequestParam(name = "msg") String msg ,
			@RequestParam(name = "uptime") String uptime ,
			@RequestParam(name = "sign") String sign ,
			
			@RequestBody Map<String, Object> params) {
		String result = "";
		try {
			//http://callback_url? appid=&msgid=&mobile=&servicenumber=&msg=&uptime=&sign=
			
			
			System.out.println(appid + msgid + mobile+ servicenumber+ msg+ uptime+ sign);
			
			
//			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
//			String SQL = "select CRMID , requestId from formtable_main_360   where CRMID=\'" + params.get("CRMID").toString() + "\'";
//			System.out.println(SQL);
//			logs = jdbcTemplate2.queryForList(SQL);
			 

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "失败,程序异常" + e.toString();
		}
		return result;

	}
}
