package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aomei.util.IpUtil;
import com.aomei.util.ReadProperties;

@RestController
@RequestMapping("/api")
public class IPCellback {

	@Autowired
    private HttpServletRequest request;


	@RequestMapping(value = "/IpCellback", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
	public String readIPInfo() {
		String result = "";
		try {
			 
		 
			ReadProperties IpProperties = ReadProperties.load("/IP.properties");			
			String oaprd = IpProperties.getProperty("IP.OA.PRD");		 
			System.out.println( oaprd +"++++++++ip.getIpAddr(request)++++++++"+IpUtil.getIpAddr(request));
		 
			 

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "失败,程序异常" + e.toString();
		}
		return result;

	}
}
