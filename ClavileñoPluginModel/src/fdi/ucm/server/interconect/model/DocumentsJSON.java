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
public class DocumentsJSON implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long Id;
	private String Description;
	private String IconPath;
	private Long Coleccion;
	private ArrayList<Long> UserDocument; 
	private ArrayList<OperationalValueJSON> OperationalValues;  
	private String QRPath;
	
	public DocumentsJSON() {
		
	}



	/**
	 * @param id
	 * @param description
	 * @param iconPath
	 * @param coleccion
	 * @param grammar
	 * @param userDocument
	 * @param elements
	 * @param operationalValues
	 * @param qRPath
	 */
	public DocumentsJSON(Long id, String description, String iconPath,
			Long coleccion, ArrayList<Long> userDocument,
			ArrayList<OperationalValueJSON> operationalValues, String qRPath) {
		super();
		Id = id;
		Description = description;
		IconPath = iconPath;
		Coleccion = coleccion;
		UserDocument = userDocument;
		OperationalValues = operationalValues;
		QRPath = qRPath;
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
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * @return the iconPath
	 */
	public String getIconPath() {
		return IconPath;
	}

	/**
	 * @param iconPath the iconPath to set
	 */
	public void setIconPath(String iconPath) {
		IconPath = iconPath;
	}

	/**
	 * @return the coleccion
	 */
	public Long getColeccion() {
		return Coleccion;
	}

	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(Long coleccion) {
		Coleccion = coleccion;
	}


	/**
	 * @return the userDocument
	 */
	public ArrayList<Long> getUserDocument() {
		return UserDocument;
	}



	/**
	 * @param userDocument the userDocument to set
	 */
	public void setUserDocument(ArrayList<Long> userDocument) {
		UserDocument = userDocument;
	}







	/**
	 * @return the operationalValues
	 */
	public ArrayList<OperationalValueJSON> getOperationalValues() {
		return OperationalValues;
	}



	/**
	 * @param operationalValues the operationalValues to set
	 */
	public void setOperationalValues(ArrayList<OperationalValueJSON> operationalValues) {
		OperationalValues = operationalValues;
	}



	/**
	 * @return the qRPath
	 */
	public String getQRPath() {
		return QRPath;
	}



	/**
	 * @param qRPath the qRPath to set
	 */
	public void setQRPath(String qRPath) {
		QRPath = qRPath;
	}


	
}
