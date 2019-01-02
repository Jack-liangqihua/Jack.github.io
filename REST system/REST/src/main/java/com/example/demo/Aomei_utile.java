
package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aomei.util.Date_Time;

@RestController 
@RequestMapping("/api")
public class Aomei_utile {
 
	 
	@RequestMapping(value = "/Aomei_utile", method = RequestMethod.POST ,produces="application/json;charset=utf-8;") 
	public String aomei_utils(  @RequestBody  Map<String, Object> params) {
		String result="";
		Date day = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(day);
		calendar.add(Calendar.DAY_OF_MONTH, -1);

		Date_Time dt = new Date_Time();
 
		try { 
			switch(params.get("KEY").toString()){
			case "DTFormat": 
				result=   dt.formatDate(day, params.get("VALUE").toString()) ; 
				break;
			case "PREDAY":  
				result =  dt.formatDate(calendar.getTime(), "yyyyMMdd").toString();
				break;

			case "MONTH":  
				result =  dt.formatDate(calendar.getTime(), "yyyyMM").toString();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}  
		// System.out.println(ds);

		return result;
	}

}
