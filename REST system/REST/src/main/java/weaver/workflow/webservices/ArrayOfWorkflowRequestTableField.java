package weaver.workflow.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfWorkflowRequestTableField complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkflowRequestTableField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowRequestTableField" type="{http://webservices.workflow.weaver}WorkflowRequestTableField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkflowRequestTableField", propOrder = { "workflowRequestTableField" })
public class ArrayOfWorkflowRequestTableField {

	@XmlElement(name = "WorkflowRequestTableField", nillable = true)
	protected List<WorkflowRequestTableField> workflowRequestTableField;

	/**
	 * Gets the value of the workflowRequestTableField property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the workflowRequestTableField property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getWorkflowRequestTableField().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link WorkflowRequestTableField }
	 * 
	 * 
	 */
	public List<WorkflowRequestTableField> getWorkflowRequestTableField() {
		if (workflowRequestTableField == null) {
			workflowRequestTableField = new ArrayList<WorkflowRequestTableField>();
		}
		return this.workflowRequestTableField;
	}

}
