/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public class DocumentCompleteJSON implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DocumentsJSON Documento;
	
	private ArrayList<GrammarJSON> Gramaticas;

	public DocumentCompleteJSON() {

	}

	/**
	 * @param documento
	 * @param gramatica
	 * @param elementos
	 * @param structura
	 */
	public DocumentCompleteJSON(DocumentsJSON documento, ArrayList<GrammarJSON> gramaticas) {
		super();
		Documento = documento;
		Gramaticas = gramaticas;

	}

	/**
	 * @return the documento
	 */
	public DocumentsJSON getDocumento() {
		return Documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(DocumentsJSON documento) {
		Documento = documento;
	}

	/**
	 * @return the gramatica
	 */
	public ArrayList<GrammarJSON> getGramatica() {
		return Gramaticas;
	}

	/**
	 * @param gramatica the gramatica to set
	 */
	public void setGramatica(ArrayList<GrammarJSON> gramaticas) {
		Gramaticas = gramaticas;
	}





	
	
	
	
}
