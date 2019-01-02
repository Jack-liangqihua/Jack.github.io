package weaver.workflow.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfWorkflowDetailTableInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkflowDetailTableInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowDetailTableInfo" type="{http://webservices.workflow.weaver}WorkflowDetailTableInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkflowDetailTableInfo", propOrder = { "workflowDetailTableInfo" })
public class ArrayOfWorkflowDetailTableInfo {

	@XmlElement(name = "WorkflowDetailTableInfo", nillable = true)
	protected List<WorkflowDetailTableInfo> workflowDetailTableInfo;

	/**
	 * Gets the value of the workflowDetailTableInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the workflowDetailTableInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getWorkflowDetailTableInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link WorkflowDetailTableInfo }
	 * 
	 * 
	 */
	public List<WorkflowDetailTableInfo> getWorkflowDetailTableInfo() {
		if (workflowDetailTableInfo == null) {
			workflowDetailTableInfo = new ArrayList<WorkflowDetailTableInfo>();
		}
		return this.workflowDetailTableInfo;
	}

}
