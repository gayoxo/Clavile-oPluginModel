package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




/**
 * Clase base que para la definicion de los atributos de las section values, poseen un tipo dentro del esquema de atributos.  
 * @author Joaquin Gayoso-Cabada
 *
 */
public class DocumentElementJSON implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;
	private Long Document;
	private Long ElementTypeId;
	private ArrayList<OperationalValueJSON> OperationalValues;  
	private String Value;
	private boolean Extended;

	
	/**
	 * Constructor por defecto.
	 */
	public DocumentElementJSON() {
		OperationalValues=new ArrayList<OperationalValueJSON>();
		Value="";
		Extended=false;
	}


	
	/**
	 * @param id
	 * @param document
	 * @param elementTypeId
	 * @param ambitos
	 * @param operationalValues
	 * @param value
	 */
	public DocumentElementJSON(Long id, Long document, Long elementTypeId,
			ArrayList<OperationalValueJSON> operationalValues,
			String value,boolean extended) {
		super();
		Id = id;
		Document = document;
		ElementTypeId = elementTypeId;
		OperationalValues = operationalValues;
		Value = value;
		Extended=extended;
	}



	/**
	 * @return the hastype
	 */
	public Long getHastype() {
		return ElementTypeId;
		
	}

	/**
	 * @param hastype the hastype to set
	 */
	public void setHastype(Long hastype) {
		this.ElementTypeId = hastype;
	}


	/**
	 * @return the shows
	 */
	public ArrayList<OperationalValueJSON> getShows() {
		return OperationalValues;
	}

	/**
	 * @param shows the shows to set
	 */
	public void setShows(ArrayList<OperationalValueJSON> shows) {
		OperationalValues = shows;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		Value = value;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the elementTypeId
	 */
	public Long getElementTypeId() {
		return ElementTypeId;
	}

	/**
	 * @param elementTypeId the elementTypeId to set
	 */
	public void setElementTypeId(Long elementTypeId) {
		ElementTypeId = elementTypeId;
	}


	/**
	 * @return the document
	 */
	public Long getDocument() {
		return Document;
	}


	/**
	 * @param document the document to set
	 */
	public void setDocument(Long document) {
		Document = document;
	}


	/**
	 * @return the operationalValues
	 */
	public List<OperationalValueJSON> getOperationalValues() {
		return OperationalValues;
	}


	/**
	 * @param operationalValues the operationalValues to set
	 */
	public void setOperationalValues(ArrayList<OperationalValueJSON> operationalValues) {
		OperationalValues = operationalValues;
	}



public boolean isExtended() {
	return Extended;
}

public void setExtended(boolean extended) {
	Extended = extended;
}
	
	
	
	
}
