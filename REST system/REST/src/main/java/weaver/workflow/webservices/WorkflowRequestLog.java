package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WorkflowRequestLog complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentorDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annexDocHtmls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorDept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedPersons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarkSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signDocHtmls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signWorkFlowHtmls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestLog", propOrder = { "agentor", "agentorDept",
		"annexDocHtmls", "id", "nodeId", "nodeName", "operateDate",
		"operateTime", "operateType", "operatorDept", "operatorId",
		"operatorName", "operatorSign", "receivedPersons", "remark",
		"remarkSign", "signDocHtmls", "signWorkFlowHtmls" })
public class WorkflowRequestLog {

	@XmlElementRef(name = "agentor", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> agentor;
	@XmlElementRef(name = "agentorDept", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> agentorDept;
	@XmlElementRef(name = "annexDocHtmls", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> annexDocHtmls;
	@XmlElementRef(name = "id", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> id;
	@XmlElementRef(name = "nodeId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> nodeId;
	@XmlElementRef(name = "nodeName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> nodeName;
	@XmlElementRef(name = "operateDate", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operateDate;
	@XmlElementRef(name = "operateTime", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operateTime;
	@XmlElementRef(name = "operateType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operateType;
	@XmlElementRef(name = "operatorDept", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operatorDept;
	@XmlElementRef(name = "operatorId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operatorId;
	@XmlElementRef(name = "operatorName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operatorName;
	@XmlElementRef(name = "operatorSign", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> operatorSign;
	@XmlElementRef(name = "receivedPersons", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> receivedPersons;
	@XmlElementRef(name = "remark", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> remark;
	@XmlElementRef(name = "remarkSign", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> remarkSign;
	@XmlElementRef(name = "signDocHtmls", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> signDocHtmls;
	@XmlElementRef(name = "signWorkFlowHtmls", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> signWorkFlowHtmls;

	/**
	 * Gets the value of the agentor property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAgentor() {
		return agentor;
	}

	/**
	 * Sets the value of the agentor property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAgentor(JAXBElement<String> value) {
		this.agentor = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the agentorDept property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAgentorDept() {
		return agentorDept;
	}

	/**
	 * Sets the value of the agentorDept property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAgentorDept(JAXBElement<String> value) {
		this.agentorDept = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the annexDocHtmls property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAnnexDocHtmls() {
		return annexDocHtmls;
	}

	/**
	 * Sets the value of the annexDocHtmls property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAnnexDocHtmls(JAXBElement<String> value) {
		this.annexDocHtmls = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setId(JAXBElement<String> value) {
		this.id = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the nodeId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getNodeId() {
		return nodeId;
	}

	/**
	 * Sets the value of the nodeId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setNodeId(JAXBElement<String> value) {
		this.nodeId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the nodeName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getNodeName() {
		return nodeName;
	}

	/**
	 * Sets the value of the nodeName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setNodeName(JAXBElement<String> value) {
		this.nodeName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operateDate property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperateDate() {
		return operateDate;
	}

	/**
	 * Sets the value of the operateDate property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperateDate(JAXBElement<String> value) {
		this.operateDate = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operateTime property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperateTime() {
		return operateTime;
	}

	/**
	 * Sets the value of the operateTime property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperateTime(JAXBElement<String> value) {
		this.operateTime = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operateType property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperateType() {
		return operateType;
	}

	/**
	 * Sets the value of the operateType property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperateType(JAXBElement<String> value) {
		this.operateType = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operatorDept property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperatorDept() {
		return operatorDept;
	}

	/**
	 * Sets the value of the operatorDept property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperatorDept(JAXBElement<String> value) {
		this.operatorDept = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operatorId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperatorId() {
		return operatorId;
	}

	/**
	 * Sets the value of the operatorId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperatorId(JAXBElement<String> value) {
		this.operatorId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operatorName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperatorName() {
		return operatorName;
	}

	/**
	 * Sets the value of the operatorName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperatorName(JAXBElement<String> value) {
		this.operatorName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the operatorSign property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getOperatorSign() {
		return operatorSign;
	}

	/**
	 * Sets the value of the operatorSign property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setOperatorSign(JAXBElement<String> value) {
		this.operatorSign = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the receivedPersons property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getReceivedPersons() {
		return receivedPersons;
	}

	/**
	 * Sets the value of the receivedPersons property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setReceivedPersons(JAXBElement<String> value) {
		this.receivedPersons = ((JAXBElement<String>) value);
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
	 * Gets the value of the remarkSign property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getRemarkSign() {
		return remarkSign;
	}

	/**
	 * Sets the value of the remarkSign property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setRemarkSign(JAXBElement<String> value) {
		this.remarkSign = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the signDocHtmls property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getSignDocHtmls() {
		return signDocHtmls;
	}

	/**
	 * Sets the value of the signDocHtmls property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setSignDocHtmls(JAXBElement<String> value) {
		this.signDocHtmls = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the signWorkFlowHtmls property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getSignWorkFlowHtmls() {
		return signWorkFlowHtmls;
	}

	/**
	 * Sets the value of the signWorkFlowHtmls property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setSignWorkFlowHtmls(JAXBElement<String> value) {
		this.signWorkFlowHtmls = ((JAXBElement<String>) value);
	}

}
