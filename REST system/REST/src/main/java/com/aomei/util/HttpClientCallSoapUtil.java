package com.aomei.util;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.ws.commons.util.Base64;
//import org.apache.log4j.Logger;
public class HttpClientCallSoapUtil {


	static int socketTimeout = 300000;// 请求超时时间
	static int connectTimeout = 300000;// 传输超时时间
//	static Logger logger = Logger.getLogger(HttpClientCallSoapUtil.class);
 
	/**
	 * 使用SOAP1.1发送消息
	 * 
	 * @param postUrl
	 * @param soapXml
	 * @param soapAction
	 * @return
	 */
	public static String doPostSoap1_1(String postUrl, String soapXml, String soapAction) {
		String retStr = "";
		// 创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		// HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
		HttpPost httpPost = new HttpPost(postUrl);
        //  设置请求和传输超时时间
		RequestConfig requestConfig = RequestConfig.custom() .setSocketTimeout(socketTimeout) .setConnectTimeout(connectTimeout).build();
		httpPost.setConfig(requestConfig);
		try {
			httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
			String credentials = Base64.encode(("_OA_DEV" + ":" + "ABcd1234").getBytes(StandardCharsets.UTF_8));
			
			System.out.println(credentials);
			
			httpPost.addHeader("Authorization", "Basic " +  credentials ) ;
			httpPost.setHeader("SOAPAction", "");
			StringEntity data = new StringEntity(soapXml, Charset.forName("UTF-8"));
			httpPost.setEntity(data);
			CloseableHttpResponse response = closeableHttpClient .execute(httpPost);
			
			System.out.println(response.toString());
			
			HttpEntity httpEntity = response.getEntity();
			if (httpEntity != null) {
				// 打印响应内容
				retStr = EntityUtils.toString(httpEntity, "UTF-8");
//				logger.info("response:" + retStr);
				System.out.println("response:" + retStr);
			}
			// 释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
//			logger.error("exception in doPostSoap1_1", e);
			e.printStackTrace();
		}
		return retStr;
	}
 
	/**
	 * 使用SOAP1.2发送消息
	 * 
	 * @param postUrl
	 * @param soapXml
	 * @param soapAction
	 * @return
	 */
	public static String doPostSoap1_2(String postUrl, String soapXml,
			String soapAction) {
		String retStr = "";
		// 创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		// HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
		HttpPost httpPost = new HttpPost(postUrl);
                // 设置请求和传输超时时间
		RequestConfig requestConfig = RequestConfig.custom()
				.setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout).build();
		httpPost.setConfig(requestConfig);
		try {
			httpPost.setHeader("Content-Type", "application/soap+xml;charset=UTF-8");
			httpPost.setHeader("SOAPAction", soapAction);
			StringEntity data = new StringEntity(soapXml, Charset.forName("UTF-8"));
			httpPost.setEntity(data);
			CloseableHttpResponse response = closeableHttpClient .execute(httpPost);
			HttpEntity httpEntity = response.getEntity();
			if (httpEntity != null) {
				// 打印响应内容
				retStr = EntityUtils.toString(httpEntity, "UTF-8");
//				logger.info("response:" + retStr);
				System.out.println("response:" + retStr);
			}
			// 释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
//			logger.error("exception in doPostSoap1_2", e);
		}
		return retStr;
	}
 
	public static void main(String[] args) {
		String orderSoapXml = "";
		orderSoapXml +="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:glob=\"http://sap.com/xi/SAPGlobal20/Global\">";
		orderSoapXml +="<soapenv:Header/>";
		orderSoapXml +="<soapenv:Body>";
		orderSoapXml +="<glob:ExpenseReportReadByIDQuery_sync>";
		orderSoapXml +="<ExpenseReport>"; 
		//orderSoapXml +="<SAP_UUID>?</SAP_UUID>"; 
		orderSoapXml +="<ID>3</ID>";
		orderSoapXml +="</ExpenseReport>";
		orderSoapXml +="</glob:ExpenseReportReadByIDQuery_sync>";
		orderSoapXml +="</soapenv:Body>";
		orderSoapXml +="</soapenv:Envelope>";
		
		
		String updatestring = "";
		
		
		
		
	 
		
		final String S_URL  = "https://my500073.c4c.saphybriscloud.cn/sap/bc/srt/scs/sap/yykacn5guy_manageexpensereport?sap-vhost=my500073.c4c.saphybriscloud.cn";
		 
		//采用SOAP1.1调用服务端，这种方式能调用服务端为soap1.1和soap1.2的服务
		//doPostSoap1_1(S_URL, orderSoapXml, "");
		//doPostSoap1_1(S_URL, querySoapXml, "");
 
		//采用SOAP1.2调用服务端，这种方式只能调用服务端为soap1.2的服务
		//doPostSoap1_2(postUrl, orderSoapXml, "order");
		//doPostSoap1_2(postUrl, querySoapXml, "query");
	}
}

