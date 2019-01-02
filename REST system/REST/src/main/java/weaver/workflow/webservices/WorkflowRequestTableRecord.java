package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WorkflowRequestTableRecord complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestTableRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workflowRequestTableFields" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestTableField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestTableRecord", propOrder = { "recordOrder",
		"workflowRequestTableFields" })
public class WorkflowRequestTableRecord {

	protected Integer recordOrder;
	@XmlElementRef(name = "workflowRequestTableFields", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfWorkflowRequestTableField> workflowRequestTableFields;

	/**
	 * Gets the value of the recordOrder property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRecordOrder() {
		return recordOrder;
	}

	/**
	 * Sets the value of the recordOrder property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRecordOrder(Integer value) {
		this.recordOrder = value;
	}

	/**
	 * Gets the value of the workflowRequestTableFields property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfWorkflowRequestTableField }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfWorkflowRequestTableField> getWorkflowRequestTableFields() {
		return workflowRequestTableFields;
	}

	/**
	 * Sets the value of the workflowRequestTableFields property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfWorkflowRequestTableField }{@code >}
	 * 
	 */
	public void setWorkflowRequestTableFields(
			JAXBElement<ArrayOfWorkflowRequestTableField> value) {
		this.workflowRequestTableFields = ((JAXBElement<ArrayOfWorkflowRequestTableField>) value);
	}

}
