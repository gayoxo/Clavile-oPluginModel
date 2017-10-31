/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase que genera el serializable para una gramatica con su estructura
 * @author Joaquin Gayoso-Cabada
 *
 */
public class GrammarCompleteJSON implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7127361258801014570L;
	private GrammarJSON G;
	private List<StructureJSON> ListaS;
	
	public GrammarCompleteJSON() {
		G=null;
		ListaS=new ArrayList<StructureJSON>();
	}

	/**
	 * @param g
	 * @param listaS
	 */
	public GrammarCompleteJSON(GrammarJSON g, List<StructureJSON> listaS) {
		super();
		G = g;
		ListaS = listaS;
	}

	/**
	 * @return the g
	 */
	public GrammarJSON getG() {
		return G;
	}

	/**
	 * @param g the g to set
	 */
	public void setG(GrammarJSON g) {
		G = g;
	}

	/**
	 * @return the listaS
	 */
	public List<StructureJSON> getListaS() {
		return ListaS;
	}

	/**
	 * @param listaS the listaS to set
	 */
	public void setListaS(List<StructureJSON> listaS) {
		ListaS = listaS;
	}
	
	
}
