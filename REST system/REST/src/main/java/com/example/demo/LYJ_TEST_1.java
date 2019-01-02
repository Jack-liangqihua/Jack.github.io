package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aomei_api")
public class LYJ_TEST_1 {
 
	@RequestMapping(value = "/LYJ_TEST_1", method = RequestMethod.POST, produces = "application/Json;charset=utf-8;")
	public String   test1(  @RequestBody  String JsonStr  ) {

		try {  
			
			Map<String, Object> params = new HashMap<>();
			 params.put("abc",JsonStr);
			
			return JsonStr;
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
}
