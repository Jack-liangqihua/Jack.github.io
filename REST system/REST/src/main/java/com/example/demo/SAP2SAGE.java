package com.example.demo;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.InputSource;

import com.aomei.util.SAPConnection;
import com.aomei.util.AomeiLog;
import com.aomei.util.HttpClientUtil;
import com.sap.mw.jco.JCO;

@RestController
@RequestMapping("/api")
public class SAP2SAGE { 
	private static String url = "https://pmwebapi.cpio.cloud:287";
	private static String charset = "utf-8";
	static final String POOL_NAME = "ConnectionPool";
	private static AomeiLog logger ;
	@RequestMapping(value = "/SAP2SAGE4PO", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
	public String SAGE2SAP4SO(@RequestParam("ZG_DATE") String ZG_DATE, @RequestParam("WERKS") String WERKS,
			@RequestParam("RECEIPTREFERENCE") String RECEIPTREFERENCE) {
		JCO.Client client = null;
		JCO.ParameterList input = null;
		String XML = "";
		String DocumentNo = "";
		// String ORDERNUMBER = "123456";
		// //request.getParameter("ORDERNUMBER").toString();
		String PME = "FAIL";
		SAPConnection db = null;
		try {
			logger = new AomeiLog();
			db = new SAPConnection();
			client = db.conn();

			JCO.Function function = db.getFunction("ZGET_POPRECEIPT");
			String READORWRITE = "1"; // 读1 ， 写2
			JCO.ParameterList input3 = function.getImportParameterList();

			input3.setValue(WERKS, "WERKS");
			input3.setValue(RECEIPTREFERENCE, "RECEIPTREFERENCE");
			// input3.setValue(ORDERNUMBER,"ORDERNUMBER");

			input3.setValue(READORWRITE, "READORWRITE");
			input3.setValue(ZG_DATE, "ZG_DATE");

			client.execute(function);
			XML = function.getExportParameterList().getString("GRNDATA");

			HttpClientUtil httpClientUtil = new HttpClientUtil();
			String httpOrgCreateTest = url + "/SagePOPData.asmx/PostPOPReceipt";
			Map<String, String> createMap = new HashMap<String, String>();

			createMap.put("user", "PM\\pmwebapi");
			createMap.put("password", "j9DgdWjTHaSvEc");
			createMap.put("company", "Press Metal UK Test");
			createMap.put("source", "Web");
			createMap.put("GRNdata", XML);
			String httpOrgCreateTestRtn = httpClientUtil.doPost(httpOrgCreateTest, createMap, charset);
			
			logger.LogInfo("+++++++++++写入英国的xml+++++++++++++++++++"+httpOrgCreateTestRtn);
			System.out.println(url);
			
			String Result = "";
			String Message = "";
			String GRNNUMBER = "";

			StringReader read = new StringReader(httpOrgCreateTestRtn);
			// 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
			InputSource source = new InputSource(read);
			// 创建一个新的SAXBuilder
			SAXBuilder sb = new SAXBuilder();
			// 通过输入源构造一个Document
			Document doc = sb.build(source);
			Element root = doc.getDocument().getRootElement();
			Namespace ns = root.getNamespace();
			DocumentNo = doc.getRootElement().getChildText("DocumentNo", ns);
			Result = doc.getRootElement().getChildText("Result", ns);
			PME = Result;
			Message = doc.getRootElement().getChildText("Message", ns);
			GRNNUMBER = doc.getRootElement().getChildText("GRNNumber", ns);

			function = db.getFunction("ZGET_POPRECEIPT");

			READORWRITE = "2"; // 读1 ， 写2
			input = function.getImportParameterList();
			input.setValue(WERKS, "WERKS");
			input.setValue(RECEIPTREFERENCE, "RECEIPTREFERENCE");
			input.setValue(GRNNUMBER, "GRNNUMBER");
			// input.setValue(ORDERNUMBER,"ORDERNUMBER");
			input.setValue(READORWRITE, "READORWRITE");
			input.setValue(DocumentNo, "DOCUMENTNO");
			input.setValue(Message, "MESSAGE");
			input.setValue(Result, "RESULT");
			input.setValue(ZG_DATE, "ZG_DATE");
			client.execute(function);

			return "";
		} catch (Exception e) {

			JCO.Function function = db.getFunction("ZGET_POPRECEIPT");

			input = function.getImportParameterList();
			input.setValue(WERKS, "WERKS");
			input.setValue(RECEIPTREFERENCE, "RECEIPTREFERENCE");
			// input.setValue(ORDERNUMBER,"ORDERNUMBER");
			input.setValue("2", "READORWRITE");
			input.setValue(e.toString(), "MESSAGE");
			input.setValue("Fail", "RESULT");
			input.setValue(ZG_DATE, "ZG_DATE");
			input.setValue(PME, "PME");
			input.setValue(DocumentNo, "DOCUMENTNO");
			client.execute(function);

			// TODO: handle exception
			e.printStackTrace();
			logger.LogInfo(e.toString());
			return "失败,程序异常" + e.toString();
		} finally {
			JCO.releaseClient(client);
		}

	}
}
