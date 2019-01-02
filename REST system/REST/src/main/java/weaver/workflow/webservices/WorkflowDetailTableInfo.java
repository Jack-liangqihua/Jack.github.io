package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import cn.com.weaver.services.webservices.ArrayOfString;

/**
 * <p>
 * Java class for WorkflowDetailTableInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowDetailTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableDBName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableFieldName" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="tableTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowRequestTableRecords" type="{http://webservices.workflow.weaver}ArrayOfWorkflowRequestTableRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowDetailTableInfo", propOrder = { "tableDBName",
		"tableFieldName", "tableTitle", "workflowRequestTableRecords" })
public class WorkflowDetailTableInfo {

	@XmlElementRef(name = "tableDBName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> tableDBName;
	@XmlElementRef(name = "tableFieldName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfString> tableFieldName;
	@XmlElementRef(name = "tableTitle", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> tableTitle;
	@XmlElementRef(name = "workflowRequestTableRecords", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfWorkflowRequestTableRecord> workflowRequestTableRecords;

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

	/**
	 * Gets the value of the tableFieldName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfString> getTableFieldName() {
		return tableFieldName;
	}

	/**
	 * Sets the value of the tableFieldName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfString }{@code >}
	 * 
	 */
	public void setTableFieldName(JAXBElement<ArrayOfString> value) {
		this.tableFieldName = ((JAXBElement<ArrayOfString>) value);
	}

	/**
	 * Gets the value of the tableTitle property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getTableTitle() {
		return tableTitle;
	}

	/**
	 * Sets the value of the tableTitle property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setTableTitle(JAXBElement<String> value) {
		this.tableTitle = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the workflowRequestTableRecords property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfWorkflowRequestTableRecord> getWorkflowRequestTableRecords() {
		return workflowRequestTableRecords;
	}

	/**
	 * Sets the value of the workflowRequestTableRecords property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfWorkflowRequestTableRecord }{@code >}
	 * 
	 */
	public void setWorkflowRequestTableRecords(
			JAXBElement<ArrayOfWorkflowRequestTableRecord> value) {
		this.workflowRequestTableRecords = ((JAXBElement<ArrayOfWorkflowRequestTableRecord>) value);
	}

}
