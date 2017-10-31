/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;


/**
 * Clase que define un valor para la vista
 * @author Joaquin Gayoso-Cabada
 *
 */

public class OperationalValueJSON implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1058491057386424065L;
	private Long Id;
	private Long OperationalValueTypeId;
	private String Value;

	public OperationalValueJSON() {
		super();
		Value=null;
		OperationalValueTypeId=null;
	}

	

	/**
	 * @param id
	 * @param operationalValueTypeId
	 * @param value
	 */
	public OperationalValueJSON(Long id, Long operationalValueTypeId, String value) {
		super();
		Id = id;
		OperationalValueTypeId = operationalValueTypeId;
		Value = value;
	}



	/**
	 * @return the type
	 */
	public Long getType() {
		return OperationalValueTypeId;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(Long type) {
		this.OperationalValueTypeId = type;
	}


	/**
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		Value = value;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}


	/**
	 * @return the operationalValueTypeId
	 */
	public Long getOperationalValueTypeId() {
		return OperationalValueTypeId;
	}


	/**
	 * @param operationalValueTypeId the operationalValueTypeId to set
	 */
	public void setOperationalValueTypeId(Long operationalValueTypeId) {
		OperationalValueTypeId = operationalValueTypeId;
	}




	
}
