package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import cn.com.weaver.services.webservices.ArrayOfArrayOfString;
import cn.com.weaver.services.webservices.ArrayOfString;

/**
 * <p>
 * Java class for WorkflowRequestInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forwardButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isnextflow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastOperateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastOperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mustInputRemark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="needAffirmance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subbackButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subnobackButtonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowBaseInfo" type="{http://webservices.workflow.weaver}WorkflowBaseInfo" minOccurs="0"/>
 *         &lt;element name="workflowDetailTableInfos" type="{http://webservices.workflow.weaver}ArrayOfWorkflowDetailTableInfo" minOccurs="0"/>
 *         &lt;element name="workflowHtmlShow" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowHtmlTemplete" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowMainTableInfo" type="{http://webservices.workflow.weaver}WorkflowMainTableInfo" minOccurs="0"/>
 *         &lt;element name="workflowPhrases" type="{webservices.services.weaver.com.cn}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="workflowRequestLogs" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestInfo", propOrder = { "canEdit", "canView",
		"createTime", "creatorId", "creatorName", "currentNodeId",
		"currentNodeName", "forwardButtonName", "isnextflow",
		"lastOperateTime", "lastOperatorName", "messageType",
		"mustInputRemark", "needAffirmance", "receiveTime", "rejectButtonName",
		"remark", "requestId", "requestLevel", "requestName", "status",
		"subbackButtonName", "submitButtonName", "subnobackButtonName",
		"workflowBaseInfo", "workflowDetailTableInfos", "workflowHtmlShow",
		"workflowHtmlTemplete", "workflowMainTableInfo", "workflowPhrases",
		"workflowRequestLogs" })
public class WorkflowRequestInfo {

	protected Boolean canEdit;
	protected Boolean canView;
	@XmlElementRef(name = "createTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> createTime;
	@XmlElementRef(name = "creatorId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> creatorId;
	@XmlElementRef(name = "creatorName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> creatorName;
	@XmlElementRef(name = "currentNodeId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> currentNodeId;
	@XmlElementRef(name = "currentNodeName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> currentNodeName;
	@XmlElementRef(name = "forwardButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> forwardButtonName;
	@XmlElementRef(name = "isnextflow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> isnextflow;
	@XmlElementRef(name = "lastOperateTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> lastOperateTime;
	@XmlElementRef(name = "lastOperatorName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> lastOperatorName;
	@XmlElementRef(name = "messageType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> messageType;
	protected Boolean mustInputRemark;
	protected Boolean needAffirmance;
	@XmlElementRef(name = "receiveTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> receiveTime;
	@XmlElementRef(name = "rejectButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> rejectButtonName;
	@XmlElementRef(name = "remark", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> remark;
	@XmlElementRef(name = "requestId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> requestId;
	@XmlElementRef(name = "requestLevel", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> requestLevel;
	@XmlElementRef(name = "requestName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> requestName;
	@XmlElementRef(name = "status", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> status;
	@XmlElementRef(name = "subbackButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> subbackButtonName;
	@XmlElementRef(name = "submitButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> submitButtonName;
	@XmlElementRef(name = "subnobackButtonName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> subnobackButtonName;
	@XmlElementRef(name = "workflowBaseInfo", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<WorkflowBaseInfo> workflowBaseInfo;
	@XmlElementRef(name = "workflowDetailTableInfos", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfWorkflowDetailTableInfo> workflowDetailTableInfos;
	@XmlElementRef(name = "workflowHtmlShow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfString> workflowHtmlShow;
	@XmlElementRef(name = "workflowHtmlTemplete", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfString> workflowHtmlTemplete;
	@XmlElementRef(name = "workflowMainTableInfo", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<WorkflowMainTableInfo> workflowMainTableInfo;
	@XmlElementRef(name = "workflowPhrases", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfArrayOfString> workflowPhrases;
	@XmlElementRef(name = "workflowRequestLogs", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfWorkflowRequestLog> workflowRequestLogs;

	/**
	 * Gets the value of the canEdit property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCanEdit() {
		return canEdit;
	}

	/**
	 * Sets the value of the canEdit property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCanEdit(Boolean value) {
		this.canEdit = value;
	}

	/**
	 * Gets the value of the canView property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCanView() {
		return canView;
	}

	/**
	 * Sets the value of the canView property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCanView(Boolean value) {
		this.canView = value;
	}

	/**
	 * Gets the value of the createTime property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getCreateTime() {
		return createTime;
	}

	/**
	 * Sets the value of the createTime property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setCreateTime(JAXBElement<String> value) {
		this.createTime = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the creatorId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getCreatorId() {
		return creatorId;
	}

	/**
	 * Sets the value of the creatorId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setCreatorId(JAXBElement<String> value) {
		this.creatorId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the creatorName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getCreatorName() {
		return creatorName;
	}

	/**
	 * Sets the value of the creatorName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setCreatorName(JAXBElement<String> value) {
		this.creatorName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the currentNodeId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getCurrentNodeId() {
		return currentNodeId;
	}

	/**
	 * Sets the value of the currentNodeId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setCurrentNodeId(JAXBElement<String> value) {
		this.currentNodeId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the currentNodeName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getCurrentNodeName() {
		return currentNodeName;
	}

	/**
	 * Sets the value of the currentNodeName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setCurrentNodeName(JAXBElement<String> value) {
		this.currentNodeName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the forwardButtonName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getForwardButtonName() {
		return forwardButtonName;
	}

	/**
	 * Sets the value of the forwardButtonName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setForwardButtonName(JAXBElement<String> value) {
		this.forwardButtonName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the isnextflow property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getIsnextflow() {
		return isnextflow;
	}

	/**
	 * Sets the value of the isnextflow property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setIsnextflow(JAXBElement<String> value) {
		this.isnextflow = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the lastOperateTime property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getLastOperateTime() {
		return lastOperateTime;
	}

	/**
	 * Sets the value of the lastOperateTime property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setLastOperateTime(JAXBElement<String> value) {
		this.lastOperateTime = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the lastOperatorName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getLastOperatorName() {
		return lastOperatorName;
	}

	/**
	 * Sets the value of the lastOperatorName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setLastOperatorName(JAXBElement<String> value) {
		this.lastOperatorName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the messageType property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getMessageType() {
		return messageType;
	}

	/**
	 * Sets the value of the messageType property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setMessageType(JAXBElement<String> value) {
		this.messageType = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the mustInputRemark property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isMustInputRemark() {
		return mustInputRemark;
	}

	/**
	 * Sets the value of the mustInputRemark property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setMustInputRemark(Boolean value) {
		this.mustInputRemark = value;
	}

	/**
	 * Gets the value of the needAffirmance property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isNeedAffirmance() {
		return needAffirmance;
	}

	/**
	 * Sets the value of the needAffirmance property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setNeedAffirmance(Boolean value) {
		this.needAffirmance = value;
	}

	/**
	 * Gets the value of the receiveTime property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getReceiveTime() {
		return receiveTime;
	}

	/**
	 * Sets the value of the receiveTime property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setReceiveTime(JAXBElement<String> value) {
		this.receiveTime = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the rejectButtonName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRejectButtonName() {
		return rejectButtonName;
	}

	/**
	 * Sets the value of the rejectButtonName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRejectButtonName(JAXBElement<String> value) {
		this.rejectButtonName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRemark(JAXBElement<String> value) {
		this.remark = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the requestId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRequestId() {
		return requestId;
	}

	/**
	 * Sets the value of the requestId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRequestId(JAXBElement<String> value) {
		this.requestId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the requestLevel property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRequestLevel() {
		return requestLevel;
	}

	/**
	 * Sets the value of the requestLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRequestLevel(JAXBElement<String> value) {
		this.requestLevel = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the requestName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRequestName() {
		return requestName;
	}

	/**
	 * Sets the value of the requestName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRequestName(JAXBElement<String> value) {
		this.requestName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setStatus(JAXBElement<String> value) {
		this.status = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the subbackButtonName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getSubbackButtonName() {
		return subbackButtonName;
	}

	/**
	 * Sets the value of the subbackButtonName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setSubbackButtonName(JAXBElement<String> value) {
		this.subbackButtonName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the submitButtonName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getSubmitButtonName() {
		return submitButtonName;
	}

	/**
	 * Sets the value of the submitButtonName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setSubmitButtonName(JAXBElement<String> value) {
		this.submitButtonName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the subnobackButtonName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getSubnobackButtonName() {
		return subnobackButtonName;
	}

	/**
	 * Sets the value of the subnobackButtonName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setSubnobackButtonName(JAXBElement<String> value) {
		this.subnobackButtonName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the workflowBaseInfo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link WorkflowBaseInfo }{@code >}
	 * 
	 */
	public JAXBElement<WorkflowBaseInfo> getWorkflowBaseInfo() {
		return workflowBaseInfo;
	}

	/**
	 * Sets the value of the workflowBaseInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link WorkflowBaseInfo }{@code >}
	 * 
	 */
	public void setWorkflowBaseInfo(JAXBElement<WorkflowBaseInfo> value) {
		this.workflowBaseInfo = ((JAXBElement<WorkflowBaseInfo>) value);
	}

	/**
	 * Gets the value of the workflowDetailTableInfos property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfWorkflowDetailTableInfo }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfWorkflowDetailTableInfo> getWorkflowDetailTableInfos() {
		return workflowDetailTableInfos;
	}

	/**
	 * Sets the value of the workflowDetailTableInfos property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfWorkflowDetailTableInfo }{@code >}
	 * 
	 */
	public void setWorkflowDetailTableInfos(
			JAXBElement<ArrayOfWorkflowDetailTableInfo> value) {
		this.workflowDetailTableInfos = ((JAXBElement<ArrayOfWorkflowDetailTableInfo>) value);
	}

	/**
	 * Gets the value of the workflowHtmlShow property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfString> getWorkflowHtmlShow() {
		return workflowHtmlShow;
	}

	/**
	 * Sets the value of the workflowHtmlShow property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfString }{@code >}
	 * 
	 */
	public void setWorkflowHtmlShow(JAXBElement<ArrayOfString> value) {
		this.workflowHtmlShow = ((JAXBElement<ArrayOfString>) value);
	}

	/**
	 * Gets the value of the workflowHtmlTemplete property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfString> getWorkflowHtmlTemplete() {
		return workflowHtmlTemplete;
	}

	/**
	 * Sets the value of the workflowHtmlTemplete property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfString }{@code >}
	 * 
	 */
	public void setWorkflowHtmlTemplete(JAXBElement<ArrayOfString> value) {
		this.workflowHtmlTemplete = ((JAXBElement<ArrayOfString>) value);
	}

	/**
	 * Gets the value of the workflowMainTableInfo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link WorkflowMainTableInfo }{@code >}
	 * 
	 */
	public JAXBElement<WorkflowMainTableInfo> getWorkflowMainTableInfo() {
		return workflowMainTableInfo;
	}

	/**
	 * Sets the value of the workflowMainTableInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link WorkflowMainTableInfo }{@code >}
	 * 
	 */
	public void setWorkflowMainTableInfo(
			JAXBElement<WorkflowMainTableInfo> value) {
		this.workflowMainTableInfo = ((JAXBElement<WorkflowMainTableInfo>) value);
	}

	/**
	 * Gets the value of the workflowPhrases property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfArrayOfString> getWorkflowPhrases() {
		return workflowPhrases;
	}

	/**
	 * Sets the value of the workflowPhrases property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfArrayOfString }{@code >}
	 * 
	 */
	public void setWorkflowPhrases(JAXBElement<ArrayOfArrayOfString> value) {
		this.workflowPhrases = ((JAXBElement<ArrayOfArrayOfString>) value);
	}

	/**
	 * Gets the value of the workflowRequestLogs property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfWorkflowRequestLog }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfWorkflowRequestLog> getWorkflowRequestLogs() {
		return workflowRequestLogs;
	}

	/**
	 * Sets the value of the workflowRequestLogs property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfWorkflowRequestLog }{@code >}
	 * 
	 */
	public void setWorkflowRequestLogs(
			JAXBElement<ArrayOfWorkflowRequestLog> value) {
		this.workflowRequestLogs = ((JAXBElement<ArrayOfWorkflowRequestLog>) value);
	}

}
