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

public abstract class CompleteResourceElement extends CompleteElement {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	
	/**
	 * COnstructor por defecto.
	 * @param hastype 
	 * 
	 */
	public CompleteResourceElement(CompleteResourceElementType hastype) {
		super(hastype);
	}

	/**
	 * COnstructor por defecto.
	 * @param hastype 
	 * 
	 */
	public CompleteResourceElement(Long clavilenoId,CompleteResourceElementType hastype) {
		super(clavilenoId,hastype);
	}
	
	public CompleteResourceElement() {
		super();
	}


	

	

}
