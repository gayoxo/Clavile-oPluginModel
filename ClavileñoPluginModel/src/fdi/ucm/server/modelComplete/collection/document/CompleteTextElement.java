/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.document;

import fdi.ucm.server.modelComplete.collection.grammar.CompleteTextElementType;


/**
 * Clase que genera la implementacion de un valor de tipo texto para un Meta
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteTextElement extends CompleteElement {


	private static final long serialVersionUID = 1L;
	protected String TValue;
	
	/**
	 * Constructor por defecto
	 */
	public CompleteTextElement() {
		super();
		TValue=null;
	}

	/**
	 * Constructor por parametrps de la clase
	 * @param hastype clase padre
	 */
	public CompleteTextElement(CompleteTextElementType hastype) {
		super(hastype);
		TValue=null;
	}

	/**
	 * Constructor por parametrps de la clase.
	 * @param hastype clase padre.
	 * @param Value valor del Texto.
	 */
	public CompleteTextElement(CompleteTextElementType hastype, String Valuein) {
		super(hastype);
		TValue=Valuein;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return TValue;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		TValue = value;
	}
	
	
}
