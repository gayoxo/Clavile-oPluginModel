/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.document;

import java.io.Serializable;

import fdi.ucm.server.modelComplete.collection.grammar.CompleteOperationalValueType;

/**
 * Clase que define un valor para la vista
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteOperationalValue implements Serializable{



	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1058491057386424065L;
	private CompleteOperationalValueType type;
	private String Value;
	private Long Clavilenoid;

	public CompleteOperationalValue() {
		super();
		Value=null;
		type=null;
		Clavilenoid=null;
	}

	/**
	 * @param valor
	 */
	public CompleteOperationalValue(CompleteOperationalValueType type,String valor) {
		super();
		Value=valor;
		this.type=type;
		Clavilenoid=null;
	}
	
	/**
	 * @param valor
	 */
	public CompleteOperationalValue(Long clavileno,CompleteOperationalValueType type,String valor) {
		super();
		Value=valor;
		this.type=type;
		Clavilenoid=clavileno;
	}


	/**
	 * @return the type
	 */
	public CompleteOperationalValueType getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(CompleteOperationalValueType type) {
		this.type = type;
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
	 * @return the clavilenoid
	 */
	public Long getClavilenoid() {
		return Clavilenoid;
	}


	/**
	 * @param clavilenoid the clavilenoid to set
	 */
	public void setClavilenoid(Long clavilenoid) {
		Clavilenoid = clavilenoid;
	}


	
}
