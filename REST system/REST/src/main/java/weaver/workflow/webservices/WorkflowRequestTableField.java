package weaver.workflow.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import cn.com.weaver.services.webservices.ArrayOfString;

/**
 * <p>
 * Java class for WorkflowRequestTableField complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestTableField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browserurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fieldDBType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldHtmlType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldShowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldShowValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filedHtmlShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="selectnames" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="selectvalues" type="{webservices.services.weaver.com.cn}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestTableField", propOrder = { "browserurl",
		"edit", "fieldDBType", "fieldFormName", "fieldHtmlType", "fieldId",
		"fieldName", "fieldOrder", "fieldShowName", "fieldShowValue",
		"fieldType", "fieldValue", "filedHtmlShow", "mand", "selectnames",
		"selectvalues", "view" })
public class WorkflowRequestTableField {

	@XmlElementRef(name = "browserurl", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> browserurl;
	protected Boolean edit;
	@XmlElementRef(name = "fieldDBType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldDBType;
	@XmlElementRef(name = "fieldFormName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldFormName;
	@XmlElementRef(name = "fieldHtmlType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldHtmlType;
	@XmlElementRef(name = "fieldId", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldId;
	@XmlElementRef(name = "fieldName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldName;
	protected Integer fieldOrder;
	@XmlElementRef(name = "fieldShowName", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldShowName;
	@XmlElementRef(name = "fieldShowValue", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldShowValue;
	@XmlElementRef(name = "fieldType", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldType;
	@XmlElementRef(name = "fieldValue", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> fieldValue;
	@XmlElementRef(name = "filedHtmlShow", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<String> filedHtmlShow;
	protected Boolean mand;
	@XmlElementRef(name = "selectnames", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfString> selectnames;
	@XmlElementRef(name = "selectvalues", namespace = "http://webservices.workflow.weaver", type = JAXBElement.class)
	protected JAXBElement<ArrayOfString> selectvalues;
	protected Boolean view;

	/**
	 * Gets the value of the browserurl property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getBrowserurl() {
		return browserurl;
	}

	/**
	 * Sets the value of the browserurl property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setBrowserurl(JAXBElement<String> value) {
		this.browserurl = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the edit property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEdit() {
		return edit;
	}

	/**
	 * Sets the value of the edit property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEdit(Boolean value) {
		this.edit = value;
	}

	/**
	 * Gets the value of the fieldDBType property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldDBType() {
		return fieldDBType;
	}

	/**
	 * Sets the value of the fieldDBType property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldDBType(JAXBElement<String> value) {
		this.fieldDBType = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldFormName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldFormName() {
		return fieldFormName;
	}

	/**
	 * Sets the value of the fieldFormName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldFormName(JAXBElement<String> value) {
		this.fieldFormName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldHtmlType property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldHtmlType() {
		return fieldHtmlType;
	}

	/**
	 * Sets the value of the fieldHtmlType property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldHtmlType(JAXBElement<String> value) {
		this.fieldHtmlType = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldId property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldId() {
		return fieldId;
	}

	/**
	 * Sets the value of the fieldId property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldId(JAXBElement<String> value) {
		this.fieldId = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldName() {
		return fieldName;
	}

	/**
	 * Sets the value of the fieldName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldName(JAXBElement<String> value) {
		this.fieldName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldOrder property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFieldOrder() {
		return fieldOrder;
	}

	/**
	 * Sets the value of the fieldOrder property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFieldOrder(Integer value) {
		this.fieldOrder = value;
	}

	/**
	 * Gets the value of the fieldShowName property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldShowName() {
		return fieldShowName;
	}

	/**
	 * Sets the value of the fieldShowName property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldShowName(JAXBElement<String> value) {
		this.fieldShowName = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldShowValue property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldShowValue() {
		return fieldShowValue;
	}

	/**
	 * Sets the value of the fieldShowValue property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldShowValue(JAXBElement<String> value) {
		this.fieldShowValue = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldType property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldType() {
		return fieldType;
	}

	/**
	 * Sets the value of the fieldType property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldType(JAXBElement<String> value) {
		this.fieldType = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the fieldValue property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFieldValue() {
		return fieldValue;
	}

	/**
	 * Sets the value of the fieldValue property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFieldValue(JAXBElement<String> value) {
		this.fieldValue = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the filedHtmlShow property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getFiledHtmlShow() {
		return filedHtmlShow;
	}

	/**
	 * Sets the value of the filedHtmlShow property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setFiledHtmlShow(JAXBElement<String> value) {
		this.filedHtmlShow = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the mand property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isMand() {
		return mand;
	}

	/**
	 * Sets the value of the mand property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setMand(Boolean value) {
		this.mand = value;
	}

	/**
	 * Gets the value of the selectnames property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfString> getSelectnames() {
		return selectnames;
	}

	/**
	 * Sets the value of the selectnames property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfString }{@code >}
	 * 
	 */
	public void setSelectnames(JAXBElement<ArrayOfString> value) {
		this.selectnames = ((JAXBElement<ArrayOfString>) value);
	}

	/**
	 * Gets the value of the selectvalues property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfString }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfString> getSelectvalues() {
		return selectvalues;
	}

	/**
	 * Sets the value of the selectvalues property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfString }{@code >}
	 * 
	 */
	public void setSelectvalues(JAXBElement<ArrayOfString> value) {
		this.selectvalues = ((JAXBElement<ArrayOfString>) value);
	}

	/**
	 * Gets the value of the view property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isView() {
		return view;
	}

	/**
	 * Sets the value of the view property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setView(Boolean value) {
		this.view = value;
	}

}
