
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
public class SUM_KUNNR_DEBT_DETAIL {
	 
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@RequestMapping(value = "/SUM_KUNNR_DEBT_DETAIL", method = RequestMethod.POST ,produces="application/json;charset=utf-8;") 
	public List<Map<String, Object>> DB_TEST( @RequestBody  Map<String, Object> params  ) {  
		try { 
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			String from = "";
			//System.out.println(params.get("FLAG").toString());
			if(params.get("FLAG").toString().equals("COST")){
				//from = "from \"_SYS_BIC\".\"zaomei.fi/CALC_CRM_KHHK_COST\" ";
				from = "from \"_SYS_BIC\".\"zaomei.fi/FI001\" ";
			}
			if(params.get("FLAG").toString().equals("PAY")){
				from = "from \"_SYS_BIC\".\"zaomei.fi/FI002\"  ";				
			}
			String sql = "select *  " + from
						+ "where   KUNNR=\'"+params.get("KUNNR").toString()+"\' "
							+ "and MANDT= \'"+params.get("MANDT").toString()+"\' "
							+ "and KTOKD= \'"+params.get("KTOKD").toString()+"\' "
							+ "and VKORG= \'"+params.get("VKORG").toString()+"\' "
							+ "and WAERK= \'"+params.get("WAERK").toString()+"\' "
							+ "and WERKS= \'"+params.get("WERKS").toString()+"\'";
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
