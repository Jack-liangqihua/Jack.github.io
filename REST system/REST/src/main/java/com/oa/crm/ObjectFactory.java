package com.oa.crm;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.oa.crm package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.oa.crm
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ReadOAStatusResponse }
	 * 
	 */
	public ReadOAStatusResponse createReadOAStatusResponse() {
		return new ReadOAStatusResponse();
	}

	/**
	 * Create an instance of {@link ReadOAStatus }
	 * 
	 */
	public ReadOAStatus createReadOAStatus() {
		return new ReadOAStatus();
	}

	/**
	 * Create an instance of {@link ReadOAEMPResponse }
	 * 
	 */
	public ReadOAEMPResponse createReadOAEMPResponse() {
		return new ReadOAEMPResponse();
	}

	/**
	 * Create an instance of {@link ReadOAEMP }
	 * 
	 */
	public ReadOAEMP createReadOAEMP() {
		return new ReadOAEMP();
	}

}
