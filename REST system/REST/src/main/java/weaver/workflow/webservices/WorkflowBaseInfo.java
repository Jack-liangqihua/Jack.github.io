package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WorkflowBaseInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowBaseInfo", propOrder = { "workflowId", "workflowName",
		"workflowTypeId", "workflowTypeName" })
public class WorkflowBaseInfo {

	@XmlElementRef(name = "workflowId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> workflowId;
	@XmlElementRef(name = "workflowName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> workflowName;
	@XmlElementRef(name = "workflowTypeId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> workflowTypeId;
	@XmlElementRef(name = "workflowTypeName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> workflowTypeName;

	/**
	 * Gets the value of the workflowId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getWorkflowId() {
		return workflowId;
	}

	/**
	 * Sets the value of the workflowId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setWorkflowId(JAXBElement<String> value) {
		this.workflowId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the workflowName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getWorkflowName() {
		return workflowName;
	}

	/**
	 * Sets the value of the workflowName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setWorkflowName(JAXBElement<String> value) {
		this.workflowName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the workflowTypeId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getWorkflowTypeId() {
		return workflowTypeId;
	}

	/**
	 * Sets the value of the workflowTypeId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setWorkflowTypeId(JAXBElement<String> value) {
		this.workflowTypeId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the workflowTypeName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getWorkflowTypeName() {
		return workflowTypeName;
	}

	/**
	 * Sets the value of the workflowTypeName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setWorkflowTypeName(JAXBElement<String> value) {
		this.workflowTypeName = ((JAXBElement<String>) value);
	}

}
