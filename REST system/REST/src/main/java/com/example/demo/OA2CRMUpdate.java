package com.example.demo;

import java.io.StringReader;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;

import com.aomei.util.HttpClientCallSoapUtil;

@RestController
@RequestMapping("/api")
public class OA2CRMUpdate {

	@Autowired

	@RequestMapping(value = "/OA2CRMUpdate", method = RequestMethod.POST, produces = "application/xml;charset=utf-8;")
	public String updateCrmInfobyCrmid(@RequestBody Map<String, Object> params) {
		String result = "";
		try {
			
			System.out.println("++++++++++++++updateCrmInfobyCrmid+++++++++++++");
			if (params.size() == 0 || !params.containsKey("CRMID")) {
				return ""; 
			}
			

			String orderSoapXml = "";

			orderSoapXml += "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:glob=\"http://sap.com/xi/SAPGlobal20/Global\">";
			orderSoapXml += "<soapenv:Header/>";
			orderSoapXml += "<soapenv:Body>";
			orderSoapXml += "<glob:ExpenseReportUpdateRequest_sync>";
			orderSoapXml += "<ExpenseReport>";
			orderSoapXml += "<ID>" + params.get("CRMID") + "</ID>";
			orderSoapXml += "<APPROVE_MEMO> <![CDATA[" + params.get("APPROVE_MEMO") + "  ]]></APPROVE_MEMO>";
			orderSoapXml += "<STATUS>" + params.get("STATUSTXT") + "</STATUS>";
			orderSoapXml += "</ExpenseReport>";
			orderSoapXml += "</glob:ExpenseReportUpdateRequest_sync>";
			orderSoapXml += "</soapenv:Body>";
			orderSoapXml += "</soapenv:Envelope>";

			System.out.println(orderSoapXml);
							
			String S_URL = "https://my500073.c4c.saphybriscloud.cn/sap/bc/srt/scs/sap/yykacn5guy_approvefromoa?sap-vhost=my500073.c4c.saphybriscloud.cn";
			
			// 采用SOAP1.1调用服务端，这种方式能调用服务端为soap1.1和soap1.2的服务

			HttpClientCallSoapUtil client = new HttpClientCallSoapUtil();
			String data = client.doPostSoap1_1(S_URL, orderSoapXml, "");
			System.out.println(data);
			StringReader read = new StringReader(data);
			if (!data.equals("")) {
				InputSource source = new InputSource(read);
				SAXBuilder sb = new SAXBuilder();
				Document doc = sb.build(source);
				Element root = doc.getRootElement();
				if (root.getContentSize() > 0) {
					Element body = root.getChildren().get(1);
					Element sync = body.getChildren().get(0); 
					if (sync.getContentSize() > 0 ) {
						Element msg = sync.getChild("Log").getChild("Item").getChild("Note");
						result = msg.getValue();
					}
				}
			} else {
				result = "更新失败";
			}

			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return  e.toString();
		}

	}

}
