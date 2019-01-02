package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WorkflowMainTableInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowMainTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestRecords" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestTableRecord" minOccurs="0"/>
 *         &lt;element name="tableDBName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowMainTableInfo", propOrder = { "requestRecords",
		"tableDBName" })
public class WorkflowMainTableInfo {

	@XmlElementRef(name = "requestRecords", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfWorkflowRequestTableRecord> requestRecords;
	@XmlElementRef(name = "tableDBName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> tableDBName;

	/**
	 * Gets the value of the requestRecords property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfWorkflowRequestTableRecord> getRequestRecords() {
		return requestRecords;
	}

	/**
	 * Sets the value of the requestRecords property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	public void setRequestRecords(
			JAXBElement<ArrayOfWorkflowRequestTableRecord> value) {
		this.requestRecords = ((JAXBElement<ArrayOfWorkflowRequestTableRecord>) value);
	}

	/**
	 * Gets the value of the tableDBName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getTableDBName() {
		return tableDBName;
	}

	/**
	 * Sets the value of the tableDBName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setTableDBName(JAXBElement<String> value) {
		this.tableDBName = ((JAXBElement<String>) value);
	}

}
