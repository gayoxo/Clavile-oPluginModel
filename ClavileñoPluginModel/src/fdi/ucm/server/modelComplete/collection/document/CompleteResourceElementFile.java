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

public class CompleteResourceElementFile extends CompleteResourceElement {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CompleteFile FilePath;
	
	/**
	 * COnstructor por defecto.
	 * 
	 */
	public CompleteResourceElementFile() {
		super();
		FilePath=null;
	}


	/**
	 * Constructor con parametros con el hasttype correspondiente.
	 * @param hastype tipo al que pertenece.
	 */
	public CompleteResourceElementFile(CompleteResourceElementType hastype) {
		super(hastype);
		FilePath=null;
	}

	/**
	 * Constructor con todos los parametros.
	 * @param hastype Elemento al que pertenece.
	 * @param value valor de la referencia.
	 */
	public CompleteResourceElementFile(CompleteResourceElementType hastype, CompleteFile value) {
		super(hastype);
		FilePath = value;
	}
	
	/**
	 * Constructor con parametros con el hasttype correspondiente.
	 * @param hastype tipo al que pertenece.
	 */
	public CompleteResourceElementFile(Long clavileboId,CompleteResourceElementType hastype) {
		super(clavileboId,hastype);
		FilePath=null;
	}

	/**
	 * Constructor con todos los parametros.
	 * @param hastype Elemento al que pertenece.
	 * @param value valor de la referencia.
	 */
	public CompleteResourceElementFile(Long clavileboId,CompleteResourceElementType hastype, CompleteFile value) {
		super(clavileboId,hastype);
		FilePath = value;
	}

	/**
	 * @return the value
	 */
	public CompleteFile getValue() {
		return FilePath;
	}

	
	
	/**
	 * @param value the value to set
	 */
	public void setValue(CompleteFile value) {
		FilePath = value;
	}

	/**
	 * Limpia el valor
	 */
	public void removeValue() {
		FilePath = null;
		
	}


	

	

}
