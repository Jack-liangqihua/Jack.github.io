package com.example.demo;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class SAGE2SAP {

	private static String url = "https://pmwebapi.cpio.cloud:287";
	private static String charset = "utf-8";
	private static HttpClientUtil httpClientUtil = null;
	static final String POOL_NAME = "ConnectionPool";
	private static AomeiLog logger ;
	@RequestMapping(value = "/SAGE2SAP4SO", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
	public String SAGE2SAP4SO(@RequestParam("STARTDATE") String STARTDATE, @RequestParam("ENDDATE") String ENDDATE,
			@RequestParam("ORDERNUMBER") String ORDERNUMBER, @RequestParam("ACCOUNTREF") String ACCOUNTREF1) {
		JCO.Client client = null;
		try {
			logger = new AomeiLog();
			httpClientUtil = new HttpClientUtil();
			String httpOrgCreateTest = url + "/SagePOPData.asmx/FetchPurchaseOrders";
			Map<String, String> createMap = new HashMap<String, String>();

			createMap.put("user", "PM\\pmwebapi");
			createMap.put("password", "j9DgdWjTHaSvEc");
			createMap.put("company", "Press Metal Live");
			createMap.put("source", "Desktop");
			createMap.put("startdate", STARTDATE);
			createMap.put("enddate", ENDDATE);
			createMap.put("ordernumber", ORDERNUMBER);
			createMap.put("accountref", ACCOUNTREF1);

			String httpOrgCreateTestRtn = httpClientUtil.doPost(httpOrgCreateTest, createMap, charset);
			 
			logger.LogInfo("+++++++++++++++读取英国的xml+++++++++++++++"+httpOrgCreateTestRtn);
			System.out.println(url);
			// 使用jco连接
			@SuppressWarnings("deprecation")

			SAPConnection db = new SAPConnection();
			client = db.conn();

			try {
				// 获取RFC对象
				JCO.Function function = db.getFunction("ZMODIFY_SAGE_XML");

				java.io.StringReader read = new StringReader(httpOrgCreateTestRtn);

				// 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
				org.xml.sax.InputSource source = new InputSource(read);
				// 创建一个新的SAXBuilder
				org.jdom2.input.SAXBuilder sb = new SAXBuilder();
				// 通过输入源构造一个Document
				org.jdom2.Document doc = sb.build(source);
				// 取的根元素
				org.jdom2.Element root = doc.getRootElement();
				read = new StringReader(root.getValue());
				source = new InputSource(read);
				doc = sb.build(source);
				root = doc.getRootElement();

				List<Element> jiedian = root.getChildren().get(0).getChildren();
				Namespace ns = root.getNamespace();
				for (int i = 0; i < jiedian.size(); i++) {
					Element et = (Element) jiedian.get(i);// 循环依次得到每个订单
					// System.out.println(et.getChildText("OrderNumber",ns));//循环依次得到订单的抬头子元素
					// System.out.println(et.getChildText("DocumentDate",ns));//循环依次得到订单的抬头子元素

					String ORDERNUMBER1 = et.getChildText("OrderNumber", ns);
					String DocumentDate = et.getChildText("DocumentDate", ns);
					String DeliveryRequested = et.getChildText("DeliveryRequested", ns);
					String CUSTOMERNAME = et.getChildText("AnalysisCode2", ns);
					String BUYINGPRICEKG = et.getChildText("AnalysisCode3", ns);
					String AnalysisCode4 = et.getChildText("AnalysisCode4", ns);
					String AnalysisCode5 = et.getChildText("AnalysisCode5", ns);
					String ACCOUNTREF = et.getChildText("AccountRef", ns);

					List<Element> etcOrderLines = et.getChildren("PurchaseOrderLine");

					for (int j = 0; j < etcOrderLines.size(); j++) {
						Element etLines = etcOrderLines.get(j);
						List<Element> etcOrderLine = etLines.getChildren();

						for (int k = 0; k < etcOrderLine.size(); k++) {
							Element etone = (Element) etcOrderLine.get(k);// 循环依次得到每个订单

							String ItemCode = etone.getChildText("ItemCode", ns);
							String LINEQUANTITY = etone.getChildText("LineQuantity", ns);
							String LINEARWEIGHT = etone.getChildText("LinearWeight", ns);
							String ITEMLINEDESCRIPT = etone.getChildText("ItemLineDescription", ns);
							String totalweight = etone.getChildText("SectionTotalWeight", ns);
							JCO.ParameterList input3 = function.getImportParameterList();
							input3.setValue(ORDERNUMBER1, "ORDERNUMBER");
							input3.setValue(DocumentDate, "ORDERDATE");
							input3.setValue(DeliveryRequested, "DELIVERYDATE");
							input3.setValue(CUSTOMERNAME, "CUSTOMERNAME");
							input3.setValue(ACCOUNTREF, "ACCOUNTREF");
							input3.setValue(BUYINGPRICEKG, "BUYINGPRICEKG");
							input3.setValue(AnalysisCode4, "BUKRS");
							input3.setValue(AnalysisCode5, "CPORDERNO");
							input3.setValue(ItemCode, "ITEMCODE");
							input3.setValue(LINEQUANTITY, "LINEQUANTITY");
							input3.setValue(LINEARWEIGHT, "LINEARWEIGHT");
							input3.setValue(ITEMLINEDESCRIPT, "ITEMLINEDESCRIPT");
							input3.setValue(totalweight, "TOTALWEIGHT");
							client.execute(function);

						}
					}

				}

			} catch (JCO.AbapException ex) {
				if (ex.getKey().equalsIgnoreCase("ERROR")) { 
					logger.LogInfo("-----------There is no record in the table ZQC_QA_INTERFACE.-----------");
					return ("123456789RFCNOTOK987654321");
				} else {
					System.out.println(ex.getMessage());
					return ("123456789RFCNOTOK987654321");
				}
			} catch (Exception ex) {
				logger.LogInfo("Caught an exception: \n" + ex);
				return ("123456789RFCNOTOK987654321");
			} finally {
				JCO.releaseClient(client);
			}

			logger.LogInfo(STARTDATE + "|" + ENDDATE + "|" + ORDERNUMBER + "|" + ACCOUNTREF1);

		} catch (Exception e) {
			// TODO: handle exception
			logger.LogInfo(e.toString());
			e.printStackTrace();
			return ("123456789RFCNOTOK987654321");
		}
		return ("123456789RFCOK987654321");

	}
}
