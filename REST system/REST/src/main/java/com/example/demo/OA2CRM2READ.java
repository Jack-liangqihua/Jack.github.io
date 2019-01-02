package com.example.demo;

import java.io.StringReader;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;

import com.aomei.util.HttpClientCallSoapUtil;

@RestController
@RequestMapping("/api")
public class OA2CRM2READ {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;

	@RequestMapping(value = "/OA2CRMREAD", method = RequestMethod.POST, produces = "application/xml;charset=utf-8;")
	public String readCrmInfobyCrmid(@RequestBody Map<String, Object> params) {

		try {
			String result = "";

			String orderSoapXml = "";
			orderSoapXml += "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:glob=\"http://sap.com/xi/SAPGlobal20/Global\">";
			orderSoapXml += "<soapenv:Header/>";
			orderSoapXml += "<soapenv:Body>";
			orderSoapXml += "<glob:ExpenseReportReadByIDQuery_sync>";
			orderSoapXml += "<ExpenseReport>";
			// orderSoapXml +="<SAP_UUID>?</SAP_UUID>";
			orderSoapXml += "<ID>" + Integer.parseInt(params.get("CRMID").toString()) + "</ID>";
			orderSoapXml += "</ExpenseReport>";
			orderSoapXml += "</glob:ExpenseReportReadByIDQuery_sync>";
			orderSoapXml += "</soapenv:Body>";
			orderSoapXml += "</soapenv:Envelope>";

			String S_URL = "https://my500073.c4c.saphybriscloud.cn/sap/bc/srt/scs/sap/yykacn5guy_manageexpensereport?sap-vhost=my500073.c4c.saphybriscloud.cn";
			
			// 采用SOAP1.1调用服务端，这种方式能调用服务端为soap1.1和soap1.2的服务

			HttpClientCallSoapUtil client = new HttpClientCallSoapUtil();
			String data = client.doPostSoap1_1(S_URL, orderSoapXml, "");
			StringReader read = new StringReader(data); 
			if(!data.equals("")){
			    InputSource source = new InputSource(read); 
			    SAXBuilder sb = new SAXBuilder(); 
			    Document doc = sb.build(source); 
			    Element root = doc.getRootElement(); 
			    if(root.getContentSize()>0){
				    Element body = root.getChildren().get(1);
				    Element  sync = body.getChildren().get(0);
				    Element msg =  sync.getChild("Log").getChild("Item").getChild("Note");
				    data = msg.getValue();
			    }
			}    
		            
			  
			 
			return data;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "失败,程序异常" + e.toString();
		}

	}
}
