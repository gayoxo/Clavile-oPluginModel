package fdi.ucm.server.modelComplete.collection.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;

/**
 * Clase que diseña las construciones basicas .
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteDocuments implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long Clavilenoid;
	private CompleteCollection collectionFather;
	protected List<CompleteElement> Description;
	private ArrayList<CompleteOperationalValue> ViewsValues;
	private String DescriptionText;
	private String Icon;


	/**
	 * Constructior por defecto
	 */
	public CompleteDocuments() {
		super();
		Description=new ArrayList<CompleteElement>();
		setViewsValues(new ArrayList<CompleteOperationalValue>());
		DescriptionText="";
		Icon ="";
		Clavilenoid=null;
	}


	/**
	 * @param collectionFather
	 * @param completeGrammar
	 * @param descriptionText
	 * @param icon
	 */
	public CompleteDocuments(
			CompleteCollection collectionFather,
			String descriptionText, String icon) {
		super();
		this.collectionFather = collectionFather;
		DescriptionText = descriptionText;
		Icon = icon;
		Description=new ArrayList<CompleteElement>();
		setViewsValues(new ArrayList<CompleteOperationalValue>());
		Clavilenoid=null;
	}


	/**
	 * @param collectionFather
	 * @param completeGrammar
	 * @param descriptionText
	 * @param icon
	 */
	public CompleteDocuments(Long clavilenoId,
			CompleteCollection collectionFather,
			String descriptionText, String icon) {
		super();
		this.collectionFather = collectionFather;
		DescriptionText = descriptionText;
		Icon = icon;
		Description=new ArrayList<CompleteElement>();
		setViewsValues(new ArrayList<CompleteOperationalValue>());
		Clavilenoid=clavilenoId;
	}



	public CompleteCollection getCollectionFather() {
		return collectionFather;
	}



	public void setCollectionFather(CompleteCollection collectionFather) {
		this.collectionFather=collectionFather;
		
	}




	/**
	 * @return the description
	 */
	public List<CompleteElement> getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(ArrayList<CompleteElement> description) {
		Description = description;
	}



	/**
	 * @return the viewsValues
	 */
	public ArrayList<CompleteOperationalValue> getViewsValues() {
		return ViewsValues;
	}



	/**
	 * @param viewsValues the viewsValues to set
	 */
	public void setViewsValues(ArrayList<CompleteOperationalValue> viewsValues) {
		ViewsValues = viewsValues;
	}



	/**
	 * @return the descriptionText
	 */
	public String getDescriptionText() {
		return DescriptionText;
	}



	/**
	 * @param descriptionText the descriptionText to set
	 */
	public void setDescriptionText(String descriptionText) {
		DescriptionText = descriptionText;
	}



	/**
	 * @return the icon
	 */
	public String getIcon() {
		return Icon;
	}



	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		Icon = icon;
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
