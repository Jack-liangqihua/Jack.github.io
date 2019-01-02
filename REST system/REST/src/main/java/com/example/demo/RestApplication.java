package com.example.demo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.aomei.util.HTTPBasicAuthorizeAttribute;

@SpringBootApplication   
public class RestApplication {

	public static void main(String[] args) {
		/**
		 * 主程序入口处
		 */
		SpringApplication.run(RestApplication.class, args);
	} 
	
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public FilterRegistrationBean  filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		HTTPBasicAuthorizeAttribute httpBasicFilter = new HTTPBasicAuthorizeAttribute();
		registrationBean.setFilter(httpBasicFilter);
		List<String> urlPatterns = new ArrayList<String>();
		
		
		/**
		 * 和外部系统做接口的时候，请一定要使用这个路径，输入用户和密码
		 */
	    
		urlPatterns.add("/aomei_api/*"); 
	    registrationBean.setUrlPatterns(urlPatterns);
	    return registrationBean;
    }
 
}
  