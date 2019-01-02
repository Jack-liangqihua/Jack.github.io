package weaver.workflow.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfWorkflowBaseInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkflowBaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowBaseInfo" type="{http://webservices.workflow.weaver}WorkflowBaseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkflowBaseInfo", propOrder = { "workflowBaseInfo" })
public class ArrayOfWorkflowBaseInfo {

	@XmlElement(name = "WorkflowBaseInfo", nillable = true)
	protected List<WorkflowBaseInfo> workflowBaseInfo;

	/**
	 * Gets the value of the workflowBaseInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the workflowBaseInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getWorkflowBaseInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link WorkflowBaseInfo }
	 * 
	 * 
	 */
	public List<WorkflowBaseInfo> getWorkflowBaseInfo() {
		if (workflowBaseInfo == null) {
			workflowBaseInfo = new ArrayList<WorkflowBaseInfo>();
		}
		return this.workflowBaseInfo;
	}

}
