package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import cn.com.weaver.services.webservices.ArrayOfArrayOfString;
import cn.com.weaver.services.webservices.ArrayOfString;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the weaver.workflow.webservices package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _WorkflowMainTableInfoTableDBName_QNAME = new QName(
			"http://webservices.workflow.weaver", "tableDBName");
	private final static QName _WorkflowMainTableInfoRequestRecords_QNAME = new QName(
			"http://webservices.workflow.weaver", "requestRecords");
	private final static QName _WorkflowRequestInfoLastOperateTime_QNAME = new QName(
			"http://webservices.workflow.weaver", "lastOperateTime");
	private final static QName _WorkflowRequestInfoCurrentNodeId_QNAME = new QName(
			"http://webservices.workflow.weaver", "currentNodeId");
	private final static QName _WorkflowRequestInfoWorkflowDetailTableInfos_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowDetailTableInfos");
	private final static QName _WorkflowRequestInfoSubmitButtonName_QNAME = new QName(
			"http://webservices.workflow.weaver", "submitButtonName");
	private final static QName _WorkflowRequestInfoRemark_QNAME = new QName(
			"http://webservices.workflow.weaver", "remark");
	private final static QName _WorkflowRequestInfoSubnobackButtonName_QNAME = new QName(
			"http://webservices.workflow.weaver", "subnobackButtonName");
	private final static QName _WorkflowRequestInfoCreateTime_QNAME = new QName(
			"http://webservices.workflow.weaver", "createTime");
	private final static QName _WorkflowRequestInfoWorkflowBaseInfo_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowBaseInfo");
	private final static QName _WorkflowRequestInfoRequestName_QNAME = new QName(
			"http://webservices.workflow.weaver", "requestName");
	private final static QName _WorkflowRequestInfoWorkflowRequestLogs_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowRequestLogs");
	private final static QName _WorkflowRequestInfoRequestLevel_QNAME = new QName(
			"http://webservices.workflow.weaver", "requestLevel");
	private final static QName _WorkflowRequestInfoSubbackButtonName_QNAME = new QName(
			"http://webservices.workflow.weaver", "subbackButtonName");
	private final static QName _WorkflowRequestInfoForwardButtonName_QNAME = new QName(
			"http://webservices.workflow.weaver", "forwardButtonName");
	private final static QName _WorkflowRequestInfoLastOperatorName_QNAME = new QName(
			"http://webservices.workflow.weaver", "lastOperatorName");
	private final static QName _WorkflowRequestInfoWorkflowPhrases_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowPhrases");
	private final static QName _WorkflowRequestInfoMessageType_QNAME = new QName(
			"http://webservices.workflow.weaver", "messageType");
	private final static QName _WorkflowRequestInfoCreatorId_QNAME = new QName(
			"http://webservices.workflow.weaver", "creatorId");
	private final static QName _WorkflowRequestInfoWorkflowMainTableInfo_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowMainTableInfo");
	private final static QName _WorkflowRequestInfoRequestId_QNAME = new QName(
			"http://webservices.workflow.weaver", "requestId");
	private final static QName _WorkflowRequestInfoStatus_QNAME = new QName(
			"http://webservices.workflow.weaver", "status");
	private final static QName _WorkflowRequestInfoCurrentNodeName_QNAME = new QName(
			"http://webservices.workflow.weaver", "currentNodeName");
	private final static QName _WorkflowRequestInfoIsnextflow_QNAME = new QName(
			"http://webservices.workflow.weaver", "isnextflow");
	private final static QName _WorkflowRequestInfoReceiveTime_QNAME = new QName(
			"http://webservices.workflow.weaver", "receiveTime");
	private final static QName _WorkflowRequestInfoRejectButtonName_QNAME = new QName(
			"http://webservices.workflow.weaver", "rejectButtonName");
	private final static QName _WorkflowRequestInfoWorkflowHtmlShow_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowHtmlShow");
	private final static QName _WorkflowRequestInfoWorkflowHtmlTemplete_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowHtmlTemplete");
	private final static QName _WorkflowRequestInfoCreatorName_QNAME = new QName(
			"http://webservices.workflow.weaver", "creatorName");
	private final static QName _WorkflowRequestTableRecordWorkflowRequestTableFields_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowRequestTableFields");
	private final static QName _WorkflowRequestLogAnnexDocHtmls_QNAME = new QName(
			"http://webservices.workflow.weaver", "annexDocHtmls");
	private final static QName _WorkflowRequestLogNodeName_QNAME = new QName(
			"http://webservices.workflow.weaver", "nodeName");
	private final static QName _WorkflowRequestLogOperatorDept_QNAME = new QName(
			"http://webservices.workflow.weaver", "operatorDept");
	private final static QName _WorkflowRequestLogOperateTime_QNAME = new QName(
			"http://webservices.workflow.weaver", "operateTime");
	private final static QName _WorkflowRequestLogOperateType_QNAME = new QName(
			"http://webservices.workflow.weaver", "operateType");
	private final static QName _WorkflowRequestLogOperatorId_QNAME = new QName(
			"http://webservices.workflow.weaver", "operatorId");
	private final static QName _WorkflowRequestLogSignWorkFlowHtmls_QNAME = new QName(
			"http://webservices.workflow.weaver", "signWorkFlowHtmls");
	private final static QName _WorkflowRequestLogAgentorDept_QNAME = new QName(
			"http://webservices.workflow.weaver", "agentorDept");
	private final static QName _WorkflowRequestLogSignDocHtmls_QNAME = new QName(
			"http://webservices.workflow.weaver", "signDocHtmls");
	private final static QName _WorkflowRequestLogRemarkSign_QNAME = new QName(
			"http://webservices.workflow.weaver", "remarkSign");
	private final static QName _WorkflowRequestLogOperatorName_QNAME = new QName(
			"http://webservices.workflow.weaver", "operatorName");
	private final static QName _WorkflowRequestLogAgentor_QNAME = new QName(
			"http://webservices.workflow.weaver", "agentor");
	private final static QName _WorkflowRequestLogOperatorSign_QNAME = new QName(
			"http://webservices.workflow.weaver", "operatorSign");
	private final static QName _WorkflowRequestLogId_QNAME = new QName(
			"http://webservices.workflow.weaver", "id");
	private final static QName _WorkflowRequestLogReceivedPersons_QNAME = new QName(
			"http://webservices.workflow.weaver", "receivedPersons");
	private final static QName _WorkflowRequestLogNodeId_QNAME = new QName(
			"http://webservices.workflow.weaver", "nodeId");
	private final static QName _WorkflowRequestLogOperateDate_QNAME = new QName(
			"http://webservices.workflow.weaver", "operateDate");
	private final static QName _WorkflowBaseInfoWorkflowId_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowId");
	private final static QName _WorkflowBaseInfoWorkflowTypeName_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowTypeName");
	private final static QName _WorkflowBaseInfoWorkflowTypeId_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowTypeId");
	private final static QName _WorkflowBaseInfoWorkflowName_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowName");
	private final static QName _WorkflowRequestTableFieldFieldId_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldId");
	private final static QName _WorkflowRequestTableFieldBrowserurl_QNAME = new QName(
			"http://webservices.workflow.weaver", "browserurl");
	private final static QName _WorkflowRequestTableFieldSelectnames_QNAME = new QName(
			"http://webservices.workflow.weaver", "selectnames");
	private final static QName _WorkflowRequestTableFieldFieldType_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldType");
	private final static QName _WorkflowRequestTableFieldFieldHtmlType_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldHtmlType");
	private final static QName _WorkflowRequestTableFieldFiledHtmlShow_QNAME = new QName(
			"http://webservices.workflow.weaver", "filedHtmlShow");
	private final static QName _WorkflowRequestTableFieldFieldName_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldName");
	private final static QName _WorkflowRequestTableFieldSelectvalues_QNAME = new QName(
			"http://webservices.workflow.weaver", "selectvalues");
	private final static QName _WorkflowRequestTableFieldFieldDBType_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldDBType");
	private final static QName _WorkflowRequestTableFieldFieldShowValue_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldShowValue");
	private final static QName _WorkflowRequestTableFieldFieldShowName_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldShowName");
	private final static QName _WorkflowRequestTableFieldFieldValue_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldValue");
	private final static QName _WorkflowRequestTableFieldFieldFormName_QNAME = new QName(
			"http://webservices.workflow.weaver", "fieldFormName");
	private final static QName _WorkflowDetailTableInfoTableTitle_QNAME = new QName(
			"http://webservices.workflow.weaver", "tableTitle");
	private final static QName _WorkflowDetailTableInfoWorkflowRequestTableRecords_QNAME = new QName(
			"http://webservices.workflow.weaver", "workflowRequestTableRecords");
	private final static QName _WorkflowDetailTableInfoTableFieldName_QNAME = new QName(
			"http://webservices.workflow.weaver", "tableFieldName");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: weaver.workflow.webservices
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowBaseInfo }
	 * 
	 */
	public ArrayOfWorkflowBaseInfo createArrayOfWorkflowBaseInfo() {
		return new ArrayOfWorkflowBaseInfo();
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowRequestTableField }
	 * 
	 */
	public ArrayOfWorkflowRequestTableField createArrayOfWorkflowRequestTableField() {
		return new ArrayOfWorkflowRequestTableField();
	}

	/**
	 * Create an instance of {@link WorkflowRequestLog }
	 * 
	 */
	public WorkflowRequestLog createWorkflowRequestLog() {
		return new WorkflowRequestLog();
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowRequestInfo }
	 * 
	 */
	public ArrayOfWorkflowRequestInfo createArrayOfWorkflowRequestInfo() {
		return new ArrayOfWorkflowRequestInfo();
	}

	/**
	 * Create an instance of {@link WorkflowMainTableInfo }
	 * 
	 */
	public WorkflowMainTableInfo createWorkflowMainTableInfo() {
		return new WorkflowMainTableInfo();
	}

	/**
	 * Create an instance of {@link WorkflowRequestTableRecord }
	 * 
	 */
	public WorkflowRequestTableRecord createWorkflowRequestTableRecord() {
		return new WorkflowRequestTableRecord();
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowDetailTableInfo }
	 * 
	 */
	public ArrayOfWorkflowDetailTableInfo createArrayOfWorkflowDetailTableInfo() {
		return new ArrayOfWorkflowDetailTableInfo();
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowRequestLog }
	 * 
	 */
	public ArrayOfWorkflowRequestLog createArrayOfWorkflowRequestLog() {
		return new ArrayOfWorkflowRequestLog();
	}

	/**
	 * Create an instance of {@link ArrayOfWorkflowRequestTableRecord }
	 * 
	 */
	public ArrayOfWorkflowRequestTableRecord createArrayOfWorkflowRequestTableRecord() {
		return new ArrayOfWorkflowRequestTableRecord();
	}

	/**
	 * Create an instance of {@link WorkflowBaseInfo }
	 * 
	 */
	public WorkflowBaseInfo createWorkflowBaseInfo() {
		return new WorkflowBaseInfo();
	}

	/**
	 * Create an instance of {@link WorkflowRequestTableField }
	 * 
	 */
	public WorkflowRequestTableField createWorkflowRequestTableField() {
		return new WorkflowRequestTableField();
	}

	/**
	 * Create an instance of {@link WorkflowDetailTableInfo }
	 * 
	 */
	public WorkflowDetailTableInfo createWorkflowDetailTableInfo() {
		return new WorkflowDetailTableInfo();
	}

	/**
	 * Create an instance of {@link WorkflowRequestInfo }
	 * 
	 */
	public WorkflowRequestInfo createWorkflowRequestInfo() {
		return new WorkflowRequestInfo();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "tableDBName", scope = WorkflowMainTableInfo.class)
	public JAXBElement<String> createWorkflowMainTableInfoTableDBName(
			String value) {
		return new JAXBElement<String>(_WorkflowMainTableInfoTableDBName_QNAME,
				String.class, WorkflowMainTableInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "requestRecords", scope = WorkflowMainTableInfo.class)
	public JAXBElement<ArrayOfWorkflowRequestTableRecord> createWorkflowMainTableInfoRequestRecords(
			ArrayOfWorkflowRequestTableRecord value) {
		return new JAXBElement<ArrayOfWorkflowRequestTableRecord>(
				_WorkflowMainTableInfoRequestRecords_QNAME,
				ArrayOfWorkflowRequestTableRecord.class,
				WorkflowMainTableInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "lastOperateTime", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoLastOperateTime(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoLastOperateTime_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "currentNodeId", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoCurrentNodeId(
			String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoCurrentNodeId_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfWorkflowDetailTableInfo }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowDetailTableInfos", scope = WorkflowRequestInfo.class)
	public JAXBElement<ArrayOfWorkflowDetailTableInfo> createWorkflowRequestInfoWorkflowDetailTableInfos(
			ArrayOfWorkflowDetailTableInfo value) {
		return new JAXBElement<ArrayOfWorkflowDetailTableInfo>(
				_WorkflowRequestInfoWorkflowDetailTableInfos_QNAME,
				ArrayOfWorkflowDetailTableInfo.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "submitButtonName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoSubmitButtonName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoSubmitButtonName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "remark", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoRemark(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoRemark_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "subnobackButtonName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoSubnobackButtonName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoSubnobackButtonName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "createTime", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoCreateTime(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoCreateTime_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link WorkflowBaseInfo }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowBaseInfo", scope = WorkflowRequestInfo.class)
	public JAXBElement<WorkflowBaseInfo> createWorkflowRequestInfoWorkflowBaseInfo(
			WorkflowBaseInfo value) {
		return new JAXBElement<WorkflowBaseInfo>(
				_WorkflowRequestInfoWorkflowBaseInfo_QNAME,
				WorkflowBaseInfo.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "requestName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoRequestName(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoRequestName_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfWorkflowRequestLog }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowRequestLogs", scope = WorkflowRequestInfo.class)
	public JAXBElement<ArrayOfWorkflowRequestLog> createWorkflowRequestInfoWorkflowRequestLogs(
			ArrayOfWorkflowRequestLog value) {
		return new JAXBElement<ArrayOfWorkflowRequestLog>(
				_WorkflowRequestInfoWorkflowRequestLogs_QNAME,
				ArrayOfWorkflowRequestLog.class, WorkflowRequestInfo.class,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "requestLevel", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoRequestLevel(
			String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoRequestLevel_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "subbackButtonName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoSubbackButtonName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoSubbackButtonName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "forwardButtonName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoForwardButtonName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoForwardButtonName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "lastOperatorName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoLastOperatorName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoLastOperatorName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfArrayOfString }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowPhrases", scope = WorkflowRequestInfo.class)
	public JAXBElement<ArrayOfArrayOfString> createWorkflowRequestInfoWorkflowPhrases(
			ArrayOfArrayOfString value) {
		return new JAXBElement<ArrayOfArrayOfString>(
				_WorkflowRequestInfoWorkflowPhrases_QNAME,
				ArrayOfArrayOfString.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "messageType", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoMessageType(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoMessageType_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "creatorId", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoCreatorId(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoCreatorId_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link WorkflowMainTableInfo }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowMainTableInfo", scope = WorkflowRequestInfo.class)
	public JAXBElement<WorkflowMainTableInfo> createWorkflowRequestInfoWorkflowMainTableInfo(
			WorkflowMainTableInfo value) {
		return new JAXBElement<WorkflowMainTableInfo>(
				_WorkflowRequestInfoWorkflowMainTableInfo_QNAME,
				WorkflowMainTableInfo.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "requestId", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoRequestId(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoRequestId_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "status", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoStatus(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoStatus_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "currentNodeName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoCurrentNodeName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoCurrentNodeName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "isnextflow", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoIsnextflow(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoIsnextflow_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "receiveTime", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoReceiveTime(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoReceiveTime_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "rejectButtonName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoRejectButtonName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestInfoRejectButtonName_QNAME, String.class,
				WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowHtmlShow", scope = WorkflowRequestInfo.class)
	public JAXBElement<ArrayOfString> createWorkflowRequestInfoWorkflowHtmlShow(
			ArrayOfString value) {
		return new JAXBElement<ArrayOfString>(
				_WorkflowRequestInfoWorkflowHtmlShow_QNAME,
				ArrayOfString.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowHtmlTemplete", scope = WorkflowRequestInfo.class)
	public JAXBElement<ArrayOfString> createWorkflowRequestInfoWorkflowHtmlTemplete(
			ArrayOfString value) {
		return new JAXBElement<ArrayOfString>(
				_WorkflowRequestInfoWorkflowHtmlTemplete_QNAME,
				ArrayOfString.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "creatorName", scope = WorkflowRequestInfo.class)
	public JAXBElement<String> createWorkflowRequestInfoCreatorName(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoCreatorName_QNAME,
				String.class, WorkflowRequestInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfWorkflowRequestTableField }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowRequestTableFields", scope = WorkflowRequestTableRecord.class)
	public JAXBElement<ArrayOfWorkflowRequestTableField> createWorkflowRequestTableRecordWorkflowRequestTableFields(
			ArrayOfWorkflowRequestTableField value) {
		return new JAXBElement<ArrayOfWorkflowRequestTableField>(
				_WorkflowRequestTableRecordWorkflowRequestTableFields_QNAME,
				ArrayOfWorkflowRequestTableField.class,
				WorkflowRequestTableRecord.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "annexDocHtmls", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogAnnexDocHtmls(
			String value) {
		return new JAXBElement<String>(_WorkflowRequestLogAnnexDocHtmls_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "nodeName", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogNodeName(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogNodeName_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operatorDept", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperatorDept(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperatorDept_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "remark", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogRemark(String value) {
		return new JAXBElement<String>(_WorkflowRequestInfoRemark_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operateTime", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperateTime(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperateTime_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operateType", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperateType(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperateType_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operatorId", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperatorId(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperatorId_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "signWorkFlowHtmls", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogSignWorkFlowHtmls(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestLogSignWorkFlowHtmls_QNAME, String.class,
				WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "agentorDept", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogAgentorDept(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogAgentorDept_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "signDocHtmls", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogSignDocHtmls(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogSignDocHtmls_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "remarkSign", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogRemarkSign(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogRemarkSign_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operatorName", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperatorName(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperatorName_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "agentor", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogAgentor(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogAgentor_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operatorSign", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperatorSign(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperatorSign_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "id", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogId(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogId_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "receivedPersons", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogReceivedPersons(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestLogReceivedPersons_QNAME, String.class,
				WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "nodeId", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogNodeId(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogNodeId_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "operateDate", scope = WorkflowRequestLog.class)
	public JAXBElement<String> createWorkflowRequestLogOperateDate(String value) {
		return new JAXBElement<String>(_WorkflowRequestLogOperateDate_QNAME,
				String.class, WorkflowRequestLog.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowId", scope = WorkflowBaseInfo.class)
	public JAXBElement<String> createWorkflowBaseInfoWorkflowId(String value) {
		return new JAXBElement<String>(_WorkflowBaseInfoWorkflowId_QNAME,
				String.class, WorkflowBaseInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowTypeName", scope = WorkflowBaseInfo.class)
	public JAXBElement<String> createWorkflowBaseInfoWorkflowTypeName(
			String value) {
		return new JAXBElement<String>(_WorkflowBaseInfoWorkflowTypeName_QNAME,
				String.class, WorkflowBaseInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowTypeId", scope = WorkflowBaseInfo.class)
	public JAXBElement<String> createWorkflowBaseInfoWorkflowTypeId(String value) {
		return new JAXBElement<String>(_WorkflowBaseInfoWorkflowTypeId_QNAME,
				String.class, WorkflowBaseInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowName", scope = WorkflowBaseInfo.class)
	public JAXBElement<String> createWorkflowBaseInfoWorkflowName(String value) {
		return new JAXBElement<String>(_WorkflowBaseInfoWorkflowName_QNAME,
				String.class, WorkflowBaseInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldId", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldId(
			String value) {
		return new JAXBElement<String>(_WorkflowRequestTableFieldFieldId_QNAME,
				String.class, WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "browserurl", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldBrowserurl(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldBrowserurl_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "selectnames", scope = WorkflowRequestTableField.class)
	public JAXBElement<ArrayOfString> createWorkflowRequestTableFieldSelectnames(
			ArrayOfString value) {
		return new JAXBElement<ArrayOfString>(
				_WorkflowRequestTableFieldSelectnames_QNAME,
				ArrayOfString.class, WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldType", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldType(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldType_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldHtmlType", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldHtmlType(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldHtmlType_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "filedHtmlShow", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFiledHtmlShow(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFiledHtmlShow_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldName", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldName_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "selectvalues", scope = WorkflowRequestTableField.class)
	public JAXBElement<ArrayOfString> createWorkflowRequestTableFieldSelectvalues(
			ArrayOfString value) {
		return new JAXBElement<ArrayOfString>(
				_WorkflowRequestTableFieldSelectvalues_QNAME,
				ArrayOfString.class, WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldDBType", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldDBType(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldDBType_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldShowValue", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldShowValue(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldShowValue_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldShowName", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldShowName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldShowName_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldValue", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldValue(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldValue_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "fieldFormName", scope = WorkflowRequestTableField.class)
	public JAXBElement<String> createWorkflowRequestTableFieldFieldFormName(
			String value) {
		return new JAXBElement<String>(
				_WorkflowRequestTableFieldFieldFormName_QNAME, String.class,
				WorkflowRequestTableField.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "tableDBName", scope = WorkflowDetailTableInfo.class)
	public JAXBElement<String> createWorkflowDetailTableInfoTableDBName(
			String value) {
		return new JAXBElement<String>(_WorkflowMainTableInfoTableDBName_QNAME,
				String.class, WorkflowDetailTableInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "tableTitle", scope = WorkflowDetailTableInfo.class)
	public JAXBElement<String> createWorkflowDetailTableInfoTableTitle(
			String value) {
		return new JAXBElement<String>(
				_WorkflowDetailTableInfoTableTitle_QNAME, String.class,
				WorkflowDetailTableInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "workflowRequestTableRecords", scope = WorkflowDetailTableInfo.class)
	public JAXBElement<ArrayOfWorkflowRequestTableRecord> createWorkflowDetailTableInfoWorkflowRequestTableRecords(
			ArrayOfWorkflowRequestTableRecord value) {
		return new JAXBElement<ArrayOfWorkflowRequestTableRecord>(
				_WorkflowDetailTableInfoWorkflowRequestTableRecords_QNAME,
				ArrayOfWorkflowRequestTableRecord.class,
				WorkflowDetailTableInfo.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.workflow.weaver", name = "tableFieldName", scope = WorkflowDetailTableInfo.class)
	public JAXBElement<ArrayOfString> createWorkflowDetailTableInfoTableFieldName(
			ArrayOfString value) {
		return new JAXBElement<ArrayOfString>(
				_WorkflowDetailTableInfoTableFieldName_QNAME,
				ArrayOfString.class, WorkflowDetailTableInfo.class, value);
	}

}
