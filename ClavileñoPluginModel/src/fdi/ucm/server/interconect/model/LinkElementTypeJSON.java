package fdi.ucm.server.interconect.model;

import java.util.ArrayList;



/**
 * Clase que genera una relacion entre secciones
 * @author Joaquin Gayoso
 *
 */
public class LinkElementTypeJSON extends StructureJSON{

	private static final long serialVersionUID = 1L;
	
	
	public LinkElementTypeJSON() {
		super();
	}

	
	

	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public LinkElementTypeJSON(String name,ArrayList<Long> id,boolean multivalued,boolean browseable,boolean filtro, Long ClaseOf) {
		super(name,id,multivalued,browseable,false,filtro,ClaseOf);
	}
	

}
