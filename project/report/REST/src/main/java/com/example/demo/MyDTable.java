
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
public class MyDTable {
	 
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@RequestMapping(value = "/DataTable", method = RequestMethod.POST ,produces="application/json;charset=utf-8;") 
	public List<Map<String, Object>> DB_TEST( @RequestBody  Map<String, Object> params  ) {  
		try {
			
			 // @RequestBody  Map<String, Object> params
//			System.out.println(params.toString());
//			System.out.println(params.get("JT").toString());
			
			
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			logs = jdbcTemplate1.queryForList( 
					"select *  "
					+ "from \"_SYS_BIC\".\"aomei.prod/ZPPPR_KANBAN_BG\" "
					+ "where	  C_TIME =  " + params.get("JT_TIME").toString()
					+ " and  ARBPL = "  +params.get("JT").toString()
					);
			 

			return logs;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// System.out.println(ds);
		return null;

		
	}

	// @RequestMapping(value="/DBTEST_JSON",method= RequestMethod.GET)
	// public ZPPPR_KANBAN_BG DB_TEST_Json() {
	//
	// Connection conn=null;
	// try {
	// conn=ds.getConnection();
	// PreparedStatement stmt=conn.prepareStatement("SELECT \"ARBPL\",
	// \"DATES\", SUM(\"bgmng_double\") as bgmng5 FROM
	// \"_SYS_BIC\".\"aomei/ZPPPR_KANBAN_BG\" WHERE ARBPL = \'JY101\' AND
	// (\"DATES\" between \'20170520\' and \'20170524\' ) GROUP BY ARBPL, DATES
	// ORDER BY ARBPL ASC, DATES ASC ");
	// ResultSet re=stmt.executeQuery();
	// while(re.next()){
	// json.put( re.getString(1));
	// jy.setDATES(re.getDate(2) );
	// jy.setBgmng_double(re.getString(3));
	//
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// System.out.println(ds);
	//
	// return jy;
	// }

}
