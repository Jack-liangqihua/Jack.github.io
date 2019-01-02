
package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
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
							+ "and WERKS= \'"+params.get("WERKS").toString()+"\' "
							+ "order by wdate desc , ZNETWR asc";
			//System.out.println(sql);
			logs = jdbcTemplate1.queryForList( sql	);
			//System.out.println(logs);
			

			//构造以字符串内容为值的BigDecimal类型的变量bd 
			BigDecimal bd1=new BigDecimal(params.get("ZNETWR").toString()); 
			//设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入) 
			bd1=bd1.setScale(2, BigDecimal.ROUND_HALF_UP);
			
		
			BigDecimal bd2;
			BigDecimal bd3=new BigDecimal("0");
			bd3=bd3.setScale(2, BigDecimal.ROUND_HALF_UP);
			
			//[{WDATE=20180129, SVFLG=X, DLFLG=, NETWR=5983.12, WAERK=CNY, DDLX=发货, MANDT=800, WERKS=1000, VKORG=1100, KUNAG=0000101560, KUNNR=0000101560, BUSNO=, VBELN=0080143145, FJFWR=1000.16, BTGEW=276.612, GEWEI=KG, WADAT_IST=20171221, TEXT=上机费：1000元, ZNETWR=6983.28, ZOVERDUE=-184.00, NAME1=江门埃铝可金属制品有限公司, KTOKD=Z101, BUKRS=1000}, 
			 

			
			List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
			Map<String, Object> oneresult =  new HashMap<String, Object>(); 
			
			
			
			bgm:for (int i = 0; i < logs.size(); i++) {   
				 bd2=new BigDecimal(logs.get(i).get("ZNETWR").toString());
				 bd2=bd2.setScale(2, BigDecimal.ROUND_HALF_UP);
				 bd3 = bd1.subtract(bd2);
				 oneresult =  new HashMap<String, Object>();
				 
				 if(bd3.doubleValue()>0){ 
					 
					 oneresult.put("ZNETWR", bd2.toString());					 
					 oneresult.put("WDATE", logs.get(i).get("ZNETWR").toString());
					 oneresult.put("SVFLG", logs.get(i).get("SVFLG").toString());
					 oneresult.put("DLFLG", logs.get(i).get("DLFLG").toString());
					 oneresult.put("NETWR", logs.get(i).get("NETWR").toString());
					 oneresult.put("WAERK", logs.get(i).get("WAERK").toString());
					 oneresult.put("DDLX", logs.get(i).get("DDLX").toString());
					 oneresult.put("MANDT", logs.get(i).get("MANDT").toString());
					 oneresult.put("WERKS", logs.get(i).get("WERKS").toString());
					 oneresult.put("VKORG", logs.get(i).get("VKORG").toString());
					 oneresult.put("KUNAG", logs.get(i).get("KUNAG").toString());
					 oneresult.put("KUNNR", logs.get(i).get("KUNNR").toString());
					 oneresult.put("BUSNO", logs.get(i).get("BUSNO").toString());
					 oneresult.put("VBELN", logs.get(i).get("VBELN").toString());
					 oneresult.put("FJFWR", logs.get(i).get("FJFWR").toString());
					 oneresult.put("BTGEW", logs.get(i).get("BTGEW").toString());
					 oneresult.put("GEWEI", logs.get(i).get("GEWEI").toString());
					 oneresult.put("WADAT_IST", logs.get(i).get("WADAT_IST").toString());
					 oneresult.put("TEXT", logs.get(i).get("TEXT").toString()); 
					 oneresult.put("ZOVERDUE", logs.get(i).get("ZOVERDUE").toString());
					 oneresult.put("NAME1", logs.get(i).get("NAME1").toString());
					 oneresult.put("KTOKD", logs.get(i).get("KTOKD").toString());
					 oneresult.put("BUKRS", logs.get(i).get("BUKRS").toString());
					 result.add(oneresult);
					 
					 bd1 = bd3; //剩余欠款额度
					 
				 }else{
					 oneresult.put("ZNETWR", bd1.toString()); 
					 
					 oneresult.put("WDATE", logs.get(i).get("ZNETWR").toString());
					 oneresult.put("SVFLG", logs.get(i).get("SVFLG").toString());
					 oneresult.put("DLFLG", logs.get(i).get("DLFLG").toString());
					 oneresult.put("NETWR", logs.get(i).get("NETWR").toString());
					 oneresult.put("WAERK", logs.get(i).get("WAERK").toString());
					 oneresult.put("DDLX", logs.get(i).get("DDLX").toString());
					 oneresult.put("MANDT", logs.get(i).get("MANDT").toString());
					 oneresult.put("WERKS", logs.get(i).get("WERKS").toString());
					 oneresult.put("VKORG", logs.get(i).get("VKORG").toString());
					 oneresult.put("KUNAG", logs.get(i).get("KUNAG").toString());
					 oneresult.put("KUNNR", logs.get(i).get("KUNNR").toString());
					 oneresult.put("BUSNO", logs.get(i).get("BUSNO").toString());
					 oneresult.put("VBELN", logs.get(i).get("VBELN").toString());
					 oneresult.put("FJFWR", logs.get(i).get("FJFWR").toString());
					 oneresult.put("BTGEW", logs.get(i).get("BTGEW").toString());
					 oneresult.put("GEWEI", logs.get(i).get("GEWEI").toString());
					 oneresult.put("WADAT_IST", logs.get(i).get("WADAT_IST").toString());
					 oneresult.put("TEXT", logs.get(i).get("TEXT").toString()); 
					 oneresult.put("ZOVERDUE", logs.get(i).get("ZOVERDUE").toString());
					 oneresult.put("NAME1", logs.get(i).get("NAME1").toString());
					 oneresult.put("KTOKD", logs.get(i).get("KTOKD").toString());
					 oneresult.put("BUKRS", logs.get(i).get("BUKRS").toString());
					 result.add(oneresult);
					 
					 break bgm;
				 }
				 
				 
				 
			}
			  
//			bd.subtract(0.0001).doubleValue();
            
			 
			
			
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		// System.out.println(ds);
		return null;

		
	} 
}
