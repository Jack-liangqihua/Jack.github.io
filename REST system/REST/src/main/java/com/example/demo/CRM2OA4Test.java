package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CRM2OA4Test {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	
	@RequestMapping(value = "/CRM2OA4Test", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
	public String createWorkFlow() {
		 
		
		String result = "";
		try { 
			return "{get info from oa is ok }";
			
		} catch (Exception e) {
			// TODO: handle exception
			result = "出现错误" + e.toString();
		}
		System.out.println(result);
		return result;
	}

}
