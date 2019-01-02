package weaver.workflow.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfWorkflowRequestLog complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWorkflowRequestLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowRequestLog" type="{http://webservices.workflow.weaver}WorkflowRequestLog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWorkflowRequestLog", propOrder = { "workflowRequestLog" })
public class ArrayOfWorkflowRequestLog {

	@XmlElement(name = "WorkflowRequestLog", nillable = true)
	protected List<WorkflowRequestLog> workflowRequestLog;

	/**
	 * Gets the value of the workflowRequestLog property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the workflowRequestLog property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getWorkflowRequestLog().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link WorkflowRequestLog }
	 * 
	 * 
	 */
	public List<WorkflowRequestLog> getWorkflowRequestLog() {
		if (workflowRequestLog == null) {
			workflowRequestLog = new ArrayList<WorkflowRequestLog>();
		}
		return this.workflowRequestLog;
	}

}
