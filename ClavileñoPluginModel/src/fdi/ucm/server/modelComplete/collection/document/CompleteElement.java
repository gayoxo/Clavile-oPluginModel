package fdi.ucm.server.modelComplete.collection.document;

import java.io.Serializable;
import java.util.ArrayList;


import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;



/**
 * Clase base que para la definicion de los atributos de las section values, poseen un tipo dentro del esquema de atributos.  
 * @author Joaquin Gayoso-Cabada
 *
 */

public class CompleteElement implements Serializable {


	private CompleteDocuments DocumentsFather;
	
	private Long Clavilenoid;
	private static final long serialVersionUID = 1L;
	protected CompleteElementType hastype;
	protected ArrayList<Integer> Ambitos;
	protected ArrayList<CompleteOperationalValue> Shows;  
	
	/**
	 * Constructor por defecto.
	 */
	public CompleteElement() {
		Ambitos=new ArrayList<Integer>();
		Shows=new ArrayList<CompleteOperationalValue>();
		Clavilenoid=null;
	}
	
//TODO
//	/**
//	 * Constructor con parametro de entrada de el nodo al que pertenece dentro del esquema.
//	 * @param hastype
//	 */
//	public CompleteElement(CompleteElementType hastype) {
//		this.hastype = hastype;
//		Ambitos=new ArrayList<Integer>();
//		Shows=new ArrayList<CompleteOperationalValue>();
//		Clavilenoid=null;
//	}

	/**
	 * Constructor con parametro de entrada de el nodo al que pertenece dentro del esquema.
	 * @param hastype
	 */
	public CompleteElement(Long clavilenoId,CompleteElementType hastype) {
		this.hastype = hastype;
		Ambitos=new ArrayList<Integer>();
		Shows=new ArrayList<CompleteOperationalValue>();
		Clavilenoid=null;
	}
	
	/**
	 * @return the hastype
	 */
	public CompleteElementType getHastype() {
		return hastype;
		
	}

	/**
	 * @param hastype the hastype to set
	 */
	public void setHastype(CompleteElementType hastype) {
		this.hastype = hastype;
	}

	/**
	 * @return the ambitos
	 */
	public ArrayList<Integer> getAmbitos() {
		return Ambitos;
	}

	/**
	 * @param ambitos the ambitos to set
	 */
	public void setAmbitos(ArrayList<Integer> ambitos) {
		Ambitos = ambitos;
	}


	/**
	 * @return the DocumentsFather
	 */
	public CompleteDocuments getDocumentsFather() {
		return DocumentsFather;
	}

	/**
	 * @param DocumentsFather the DocumentsFather to set
	 */
	public void setDocumentsFather(CompleteDocuments DocumentsFather) {
		this.DocumentsFather = DocumentsFather;
	}

	/**
	 * @return the shows
	 */
	public ArrayList<CompleteOperationalValue> getShows() {
		return Shows;
	}

	/**
	 * @param shows the shows to set
	 */
	public void setShows(ArrayList<CompleteOperationalValue> shows) {
		Shows = shows;
	}

	/**
	 * @return the clavilenoid
	 */
	public Long getClavilenoid() {
		return Clavilenoid;
	}

	/**
	 * @param clavilenoid the clavilenoid to set
	 */
	public void setClavilenoid(Long clavilenoid) {
		Clavilenoid = clavilenoid;
	}
	
	
	
	
}
