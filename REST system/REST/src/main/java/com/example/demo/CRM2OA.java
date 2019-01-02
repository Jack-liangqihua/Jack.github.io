package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBElement;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aomei.bo.Workflow;
import com.aomei.util.IpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.oa.crm.CRM;
import com.oa.crm.CRMPortType;
import com.oa.crm.User;

import cn.com.weaver.services.webservices.WorkflowService;
import cn.com.weaver.services.webservices.WorkflowServicePortType;
import weaver.workflow.webservices.ArrayOfWorkflowDetailTableInfo;
import weaver.workflow.webservices.ArrayOfWorkflowRequestTableField;
import weaver.workflow.webservices.ArrayOfWorkflowRequestTableRecord;
import weaver.workflow.webservices.ObjectFactory;
import weaver.workflow.webservices.WorkflowBaseInfo;
import weaver.workflow.webservices.WorkflowDetailTableInfo;
import weaver.workflow.webservices.WorkflowMainTableInfo;
import weaver.workflow.webservices.WorkflowRequestInfo;
import weaver.workflow.webservices.WorkflowRequestTableField;
import weaver.workflow.webservices.WorkflowRequestTableRecord;

@RestController
@RequestMapping("/api")
public class CRM2OA {

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;
	


	
	@RequestMapping(value = "/CRM2OA", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	public String createWorkFlow(@RequestBody Workflow params) {
		 
		
		String result = "";
		try {

			
//			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
////			logs = jdbcTemplate2.queryForList( "select * from HrmResource where isnumeric(loginid) = 1 and mobile = '"+params.getMobile()+"' and loginid = '"+params.getEMPID()+"'" );
//			String SQL = "select * from HrmResource where isnumeric(loginid) = 1 and loginid = "+params.getEMPID();
//			System.out.println(SQL);
//			logs = jdbcTemplate2.queryForList(SQL);
//			if(logs !=null &&  logs.size()>0){
//				params.setCreatorId(logs.get(0).get("id").toString());
//				if(logs.get(0).get("departmentid")  != null){
//					params.setDepartment(Integer.parseInt(logs.get(0).get("departmentid").toString()));
//				}
//			}else{
//				return "-2";
//			}
			
			CRM service = new CRM();
			CRMPortType portType = service.getCRMHttpPort();
			String DEPTID = "";
			String EMPID = params.getEMPID()+"";
			String EmpStr = "";
			
			EmpStr = portType.readOAEMP( EMPID , DEPTID) ;
			ObjectMapper mapper = new ObjectMapper();   
		    User user = mapper.readValue(EmpStr,User.class); 
			System.out.println(DEPTID +"++++++++DEPTID+++++++++EMPID+++++++++++++++++"+EMPID);
			 
			params.setDepartment(Integer.parseInt( user.getDepartmentid() ));
			params.setCreatorId(user.getId());
			 
			
			
			//result = params.getSYS() + params.getItems().get(0).getFlag();

			// TODO Auto-generated method stub
			WorkflowService wf = new WorkflowService();

			WorkflowServicePortType client = wf.getWorkflowServiceHttpPort();

			WorkflowRequestInfo wfobj = new WorkflowRequestInfo();

			wfobj.setCanEdit(true);
			wfobj.setCanView(true);
			// chatsType
			ObjectFactory objFac = new ObjectFactory();

			JAXBElement<String> obj = null;
			obj = objFac.createWorkflowRequestInfoCreateTime(params.getCreateTime()); // 创建日期
			wfobj.setCreateTime(obj);

			obj = objFac.createWorkflowRequestInfoCreatorId(params.getCreatorId()); // 创建人OA系统账号
			wfobj.setCreatorId(obj);
			obj = objFac.createWorkflowRequestInfoCreatorName(params.getCreatorName()); // 创建人名称
			wfobj.setLastOperatorName(obj);
			wfobj.setCreatorName(obj);
			
			// 提交到流程节点名称 :select * from workflow_nodelink where workflowid = 627 and isreject <> 1
			

			obj = objFac.createWorkflowRequestInfoCurrentNodeId(params.getNodeId()); 
			wfobj.setCurrentNodeId(obj);

			// currentNodeName
			// currentNodeType
			// eh_operatorMap
			// forhandbackButtonName
			// forhandnobackButtonName
			// formsignaturemd5
			// forwardButtonName
			// freeNodeId
			// freeNodeName
			// givingOpinionsbackName
			// givingOpinionsnobackName
			// givingopinionsName
			// handWrittenSign
			// handleForwardButtonName
			// isAnnexUpload
			// isFormSignature
			// isremark

			// wfobj.setLanguageid(7);
			// lastOperateTime
			// lastOperatorName
			// messageType
			// messagecontent
			//obj = objFac.createWorkflowRequestInfoMessagecontent("测试");
			//wfobj.setMessagecontent(obj);
			// messageid
			// module
			// mustInputRemark
			// needAffirmance
			// nodeId

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			obj = objFac.createWorkflowRequestInfoReceiveTime(sdf.toString()); // 流程接收日期
			wfobj.setReceiveTime(obj);

			// rejcetToType
			// rejectButtonName
			// rejectToNodeid
			// remark
			// remarkLocation
			// requestId

			obj = objFac.createWorkflowRequestInfoRequestLevel("2"); // 流程紧急程度
			wfobj.setRequestLevel(obj);

			obj = objFac.createWorkflowRequestInfoRequestName(params.getCreateTime() + params.getRequestName()); // 流程标题
			wfobj.setRequestName(obj);
			 
			// retractbackButtonName
			// saveButtonName
			// signatureAppendfix
			// signatureStatus
			// signtype
			// speechAttachment
			// status
			// subbackButtonName
			// submitButtonName
			// submitDirectName
			// submitToNodeid
			// subnobackButtonName
			// takingOpsButtonName
			// takisremark
			// templetStatus
			// wfobj.setVersion(1);

			WorkflowBaseInfo wfextinfo = new WorkflowBaseInfo();
			// obj = objFac.createWorkflowExtInfoFWeaverBelongtoUserid("1072");
			// wfextinfo.setFWeaverBelongtoUserid(obj);
			// obj = objFac.createWorkflowExtInfoFWeaverBelongtoUsertype("0");
			// wfextinfo.setFWeaverBelongtoUsertype(obj);
			// formId

			// isBill
			// isForwardReceiveDef
			// isFreeWorkflow
			// obj=objFac.createWorkflowBaseInfoIsFreeWorkflow("N");
			// wfextinfo.setIsFreeWorkflow(obj);
			// ischangrejectnode
			// isrejectremind
			// isselectrejectnode
			// userList" type="{http://hrm.weaver}ArrayOfUser" minOccurs="0"/>
			// workflowDsOrder" type="{http://www.w3.org/2001/XMLSchema}string"
			// minOccurs="0"/>

			// 流程内部id号码  : select id , workflowname from workflow_base where workflowname = '出差报告'
			obj = objFac.createWorkflowBaseInfoWorkflowId("627"); 
			wfextinfo.setWorkflowId(obj);
			 

			// workflowTypeId
			// workflowTypeName

			wfobj.setWorkflowBaseInfo(objFac.createWorkflowRequestInfoWorkflowBaseInfo(wfextinfo));

			// workflowDetailTableInfos"
			// type="{http://workflow.webservices.mobile.weaver}ArrayOfWorkflowDetailTableInfo"
			// minOccurs="0"/>
			// workflowHtmlShow"
			// type="{webservices.services.weaver.com.cn}ArrayOfString"
			// minOccurs="0"/>
			// workflowHtmlTemplete"
			// type="{webservices.services.weaver.com.cn}ArrayOfString"
			// minOccurs="0"/>
			// workflowMainTableInfo"
			// type="{http://workflow.webservices.mobile.weaver}WorkflowMainTableInfo"
			// minOccurs="0"/>
			// workflowPhrases"
			// type="{webservices.services.weaver.com.cn}ArrayOfArrayOfString"
			// minOccurs="0"/>
			// workflowRequestLogs"
			// type="{http://workflow.webservices.mobile.weaver}ArrayOfWorkflowRequestLog"
			// minOccurs="0"/>

			// System.out.println(client.getToDoWorkflowRequestCount(1722150,null));

			// 主字段
			WorkflowMainTableInfo wfmti = new WorkflowMainTableInfo();
			ArrayOfWorkflowRequestTableRecord trecord = new ArrayOfWorkflowRequestTableRecord();
			WorkflowRequestTableRecord record = new WorkflowRequestTableRecord();

			ArrayOfWorkflowRequestTableField af = new ArrayOfWorkflowRequestTableField();
			
			WorkflowRequestTableField field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("xcjh"));
			if(params.getXcjh().equals(null)){
				field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(""));
			}else{
				field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getXcjh().replaceAll("&lt;br/>","<br/>")));
			}
			//field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getXcjh().replaceAll("&lt;br/>","<br/>")));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);
 
			
			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("hynr"));
			if(params.getHynr().equals(null)){
				field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(""));
			}else{
				field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getHynr().replaceAll("&lt;br/>","<br/>")));
			}
			//field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getHynr().replaceAll("&lt;br/>","<br/>")));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);

			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("sqrq"));
			field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getCreateTime()));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);

			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("department"));
			field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getDepartment()+""));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);

			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("sqr"));
			field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getCreatorId()));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);
			
			
			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("CRMID"));
			field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getCRMID()));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);
			
			
			
			field = new WorkflowRequestTableField();
			field.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("CRMUPDATAFLAG"));
			field.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getCRMUPDATAFLAG()+""));
			field.setView(true);
			field.setEdit(true);
			af.getWorkflowRequestTableField().add(field);
			

			record.setWorkflowRequestTableFields(objFac.createWorkflowRequestTableRecordWorkflowRequestTableFields(af));
			trecord.getWorkflowRequestTableRecord().add(record);
			wfmti.setRequestRecords(objFac.createWorkflowMainTableInfoRequestRecords(trecord));

			wfobj.setWorkflowMainTableInfo(objFac.createWorkflowRequestInfoWorkflowMainTableInfo(wfmti));

			// 行项目

			ArrayOfWorkflowDetailTableInfo arrwfdti = new ArrayOfWorkflowDetailTableInfo();
			WorkflowDetailTableInfo wfdti = new WorkflowDetailTableInfo();
			ArrayOfWorkflowRequestTableRecord arrwftrecords = new ArrayOfWorkflowRequestTableRecord();
 

			//行项目数据
			ArrayOfWorkflowRequestTableField fields = null;
			WorkflowRequestTableRecord wfrecord 	=  null;
			for (int i = 0; i < params.getItemTraval().size(); i++) {

				wfrecord = new WorkflowRequestTableRecord();
				fields = new ArrayOfWorkflowRequestTableField();

				WorkflowRequestTableField wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Bfkh"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getBfkh()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);

				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Bfmd"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getBfmd()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				 
				
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Bfry"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getBfry()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				 
				
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Chailv"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getChailv()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				
				 
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Chailvnama"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getChailvnama()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				
				
				
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Jieguo"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getJieguo()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				 
			 
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Jssj"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getJssj()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				

				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Kssj"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getKssj()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				
				

				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Wizhi"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getWizhi()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				
				
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Zsjd"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemTraval().get(i).getZsjd()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				 
				
				wfrecord.setWorkflowRequestTableFields( objFac.createWorkflowRequestTableRecordWorkflowRequestTableFields(fields));
				arrwftrecords.getWorkflowRequestTableRecord().add(wfrecord);
			}
			
			wfdti.setWorkflowRequestTableRecords( objFac.createWorkflowDetailTableInfoWorkflowRequestTableRecords(arrwftrecords));
			arrwfdti.getWorkflowDetailTableInfo().add(wfdti);
			
			 
			
			//行项目数据
			WorkflowDetailTableInfo wfdti1 = new WorkflowDetailTableInfo();
			ArrayOfWorkflowRequestTableRecord arrwftrecords1 = new ArrayOfWorkflowRequestTableRecord();
			
			for (int i = 0; i < params.getItemFree().size(); i++) { 

				wfrecord = new WorkflowRequestTableRecord();
				fields = new ArrayOfWorkflowRequestTableField();

				WorkflowRequestTableField wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Bxxm"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemFree().get(i).getBxxm()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);

				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Yuanyin"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemFree().get(i).getYuanyin()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				
				
				
				wffield = new WorkflowRequestTableField();
				wffield.setFieldName(objFac.createWorkflowRequestTableFieldFieldName("Jine"));
				wffield.setFieldValue(objFac.createWorkflowRequestTableFieldFieldValue(params.getItemFree().get(i).getJine()));
				wffield.setView(true);
				wffield.setEdit(true);
				fields.getWorkflowRequestTableField().add(wffield);
				  

				wfrecord.setWorkflowRequestTableFields(objFac.createWorkflowRequestTableRecordWorkflowRequestTableFields(fields));
				arrwftrecords1.getWorkflowRequestTableRecord().add(wfrecord);
			
			}
			
			
			 

			

			wfdti1.setWorkflowRequestTableRecords(objFac.createWorkflowDetailTableInfoWorkflowRequestTableRecords(arrwftrecords1));
			arrwfdti.getWorkflowDetailTableInfo().add(wfdti1);
			wfobj.setWorkflowDetailTableInfos(objFac.createWorkflowRequestInfoWorkflowDetailTableInfos(arrwfdti));

			/*
			 * 如果小于0表示失败 
			 * -1：创建流程失败 
			 * -2：用户没有流程创建权限 
			 * -3：创建流程基本信息失败 
			 * -4：保存表单主表信息失败
			 * -5：更新紧急程度失败 
			 * -6：流程操作者失败 
			 * -7：流转至下一节点失败 
			 * -8：节点附加操作失败
			 */

			// System.out.println(client.getToDoWorkflowRequestCount(1722150,
			// null));
			result = client.doCreateWorkflowRequest(wfobj, Integer.parseInt(params.getCreatorId()));

		} catch (Exception e) {
			// TODO: handle exception
			result = "出现错误" + e.toString();
		}
		System.out.println(result);
		return result;
	}

 

}
