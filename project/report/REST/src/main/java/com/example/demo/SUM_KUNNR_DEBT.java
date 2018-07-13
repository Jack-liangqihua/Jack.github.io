
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

@RestController
@RequestMapping("/api")
public class SUM_KUNNR_DEBT {
	 
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@RequestMapping(value = "/SUM_KUNNR_DEBT", method = RequestMethod.POST ,produces="application/json;charset=utf-8;") 
	public List<Map<String, Object>> DB_TEST( @RequestBody  Map<String, Object> params  ) {  
		try { 
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();

			//String sql = "SELECT MANDT,WERKS,VKORG,VTEXT,KUNNR, SUM(ZNETWR) AS ZNETWR ,WAERK ,KTOKD ,NAME1 FROM \"_SYS_BIC\".\"zaomei.fi/CALC_FI001\"  " ;
			//sql += " WHERE ZNETWR > 0 ";
			String sql = "SELECT * FROM \"_SYS_BIC\".\"zaomei.fi/FI101\"  " ;
			
			if(params.get("KUNNR")!=null){
				sql += " AND KUNNR = "+params.get("KUNNR").toString() ;
			}
			//sql += " GROUP BY MANDT,WERKS,VKORG,VTEXT,KUNNR,WAERK,KTOKD ,NAME1 "; 
			//System.out.println(sql);
			logs = jdbcTemplate1.queryForList( sql	);
			  
			return logs;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// System.out.println(ds);
		return null;

		
	} 
}
