/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.document;

import fdi.ucm.server.modelComplete.collection.grammar.CompleteLinkElementType;



/**
 * Clase que define un Ration value.
 * @author Joaquin Gayoso
 *
 */

public class CompleteLinkElement extends CompleteElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CompleteDocuments RValue;
	
	/**
	 * COnstructor por defecto.
	 * 
	 */
	public CompleteLinkElement() {
		super();
		RValue=null;
	}

	//TODO
//	/**
//	 * Constructor con parametros con el hasttype correspondiente.
//	 * @param hastype tipo al que pertenece.
//	 */
//	public CompleteLinkElement(CompleteLinkElementType hastype) {
//		super(hastype);
//		RValue=null;
//	}
//
//	/**
//	 * Constructor con todos los parametros.
//	 * @param hastype Elemento al que pertenece.
//	 * @param value valor de la referencia.
//	 */
//	public CompleteLinkElement(CompleteLinkElementType hastype, CompleteDocuments value) {
//		super(hastype);
//		RValue = value;
//	}
	
	/**
	 * Constructor con parametros con el hasttype correspondiente.
	 * @param hastype tipo al que pertenece.
	 */
	public CompleteLinkElement(Long clavilenoId,CompleteLinkElementType hastype) {
		super(clavilenoId,hastype);
		RValue=null;
	}

	/**
	 * Constructor con todos los parametros.
	 * @param hastype Elemento al que pertenece.
	 * @param value valor de la referencia.
	 */
	public CompleteLinkElement(Long clavilenoId,CompleteLinkElementType hastype, CompleteDocuments value) {
		super(clavilenoId,hastype);
		RValue = value;
	}

	/**
	 * @return the value
	 */
	public CompleteDocuments getValue() {
		return RValue;
	}

	
	
	/**
	 * @param value the value to set
	 */
	public void setValue(CompleteDocuments value) {
		RValue = value;
	}

	/**
	 * Limpia el valor
	 */
	public void removeValue() {
		RValue = null;
		
	}


	
	

}
