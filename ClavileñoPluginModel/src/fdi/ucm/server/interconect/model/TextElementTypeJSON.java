/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.util.ArrayList;



/**
 * Clase que define el atributo Meta para un elemento de texto.
 * @author Joaquin Gayoso-Cabada
 *
 */
public class TextElementTypeJSON extends StructureJSON {

	private static final long serialVersionUID = -3295083410485450541L;

	/**
	 * Constructor por defecto
	 */
	public TextElementTypeJSON() {
		super();
	}

	/**
	 * @param name
	 * @param father
	 */
	public TextElementTypeJSON(String name,ArrayList<Long> id,boolean multivalued,boolean browseable,boolean filtro, Long ClaseOf,String Value,ArrayList<OperationalValueJSON> OperationalValues) {
		super(name,id,multivalued,browseable,false,filtro,ClaseOf,Value,OperationalValues);
	}

	
	

}
