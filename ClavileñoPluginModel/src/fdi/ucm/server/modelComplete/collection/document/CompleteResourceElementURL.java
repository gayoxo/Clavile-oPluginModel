/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.document;


import fdi.ucm.server.modelComplete.collection.grammar.CompleteResourceElementType;



/**
 * Clase que define un Ration value.
 * @author Joaquin Gayoso
 *
 */

public class CompleteResourceElementURL extends CompleteResourceElement {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String URL;
	
	/**
	 * COnstructor por defecto.
	 * 
	 */
	public CompleteResourceElementURL() {
		super();
		URL=null;
	}
	
		
	/**
	 * Constructor con parametros con el hasttype correspondiente.
	 * @param hastype tipo al que pertenece.
	 */
	public CompleteResourceElementURL(CompleteResourceElementType hastype) {
		super(hastype);
		URL=null;
	}

	/**
	 * Constructor con todos los parametros.
	 * @param hastype Elemento al que pertenece.
	 * @param value valor de la referencia.
	 */
	public CompleteResourceElementURL(CompleteResourceElementType hastype, String value) {
		super(hastype);
		URL = value;
	}
	
	/**
	 * Constructor con parametros con el hasttype correspondiente.
	 * @param hastype tipo al que pertenece.
	 */
	public CompleteResourceElementURL(Long clavileboId,CompleteResourceElementType hastype) {
		super(clavileboId,hastype);
		URL=null;
	}

	/**
	 * Constructor con todos los parametros.
	 * @param hastype Elemento al que pertenece.
	 * @param value valor de la referencia.
	 */
	public CompleteResourceElementURL(Long clavileboId,CompleteResourceElementType hastype, String value) {
		super(clavileboId,hastype);
		URL = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return URL;
	}

	
	
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		URL = value;
	}

	/**
	 * Limpia el valor
	 */
	public void removeValue() {
		URL = null;
		
	}


	

	

}
