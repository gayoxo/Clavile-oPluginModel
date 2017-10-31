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
	
	private ArrayList<GrammarCompleteJSON> Gramaticas;
	
	private ArrayList<DocumentElementJSON> Elementos;

	public DocumentCompleteJSON() {

	}

	/**
	 * @param documento
	 * @param gramatica
	 * @param elementos
	 * @param structura
	 */
	public DocumentCompleteJSON(DocumentsJSON documento, ArrayList<GrammarCompleteJSON> gramaticas,
			ArrayList<DocumentElementJSON> elementos) {
		super();
		Documento = documento;
		Gramaticas = gramaticas;
		Elementos = elementos;
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
	public ArrayList<GrammarCompleteJSON> getGramatica() {
		return Gramaticas;
	}

	/**
	 * @param gramatica the gramatica to set
	 */
	public void setGramatica(ArrayList<GrammarCompleteJSON> gramaticas) {
		Gramaticas = gramaticas;
	}



	/**
	 * @return the elementos
	 */
	public ArrayList<DocumentElementJSON> getElementos() {
		return Elementos;
	}



	/**
	 * @param elementos the elementos to set
	 */
	public void setElementos(ArrayList<DocumentElementJSON> elementos) {
		Elementos = elementos;
	}

	
	
	
	
}
