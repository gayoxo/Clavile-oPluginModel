/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Crea el objeto base que define un coleccion attribute
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteStructure implements Serializable{
	

	
	private CompleteGrammar collectionFather;
	
	private static final long serialVersionUID = 1L;
	
	protected List<CompleteStructure> Sons=new ArrayList<CompleteStructure>();
	
	protected CompleteStructure Father;
	
	private Long Clavilenoid;
	
	protected String Name;
	
	protected ArrayList<CompleteOperationalValueType> Shows;
	
	protected CompleteStructure BFather;
	
	protected CompleteStructure BSon;
	
	protected boolean Browseable;

	protected boolean Multivalued;
	
	private CompleteStructure ClassOfIterator;
	
	/**
	 * Consctructor por defecto
	 */
	public CompleteStructure() {
		Sons=new ArrayList<CompleteStructure>();	
		Father=null;
		Clavilenoid=null;
		Name="~unknow";
		Shows=new ArrayList<CompleteOperationalValueType>();
		Browseable=false;
		Multivalued=false;
		ClassOfIterator=null;
	}
	
	
	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(String name,CompleteGrammar ColeccionPadre) {
		super();
		Father = null;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=null;
		Name=name;
		Shows=new ArrayList<CompleteOperationalValueType>();
		Browseable=false;
		Multivalued=false;
		ClassOfIterator=null;
	}
	
	
	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(String name,CompleteStructure father,CompleteGrammar ColeccionPadre) {
		super();
		Father = father;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=null;
		Name=name;
		Shows=new ArrayList<CompleteOperationalValueType>();
		Browseable=false;
		Multivalued=false;
		ClassOfIterator=null;
	}


	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(Long Claviqueno,String name,CompleteGrammar ColeccionPadre) {
		super();
		Father = null;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=Claviqueno;
		Name=name;
		Shows=new ArrayList<CompleteOperationalValueType>();
		Browseable=false;
		Multivalued=false;
		ClassOfIterator=null;
	}
	
	
	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(Long Claviqueno,String name,CompleteStructure father,CompleteGrammar ColeccionPadre) {
		super();
		Father = father;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=Claviqueno;
		Name=name;
		Shows=new ArrayList<CompleteOperationalValueType>();
		Browseable=false;
		Multivalued=false;
		ClassOfIterator=null;
	}

	/**
	 *  Retorna el Texto que representa al path.
	 *  @return Texto cadena para el elemento
	 */
	public String pathFather()
	{
		if (Father!=null)
			return Father.pathFather()+"/";
		else return "";
	}
	
	/**
	 * @return the father
	 */
	public CompleteStructure getFather() {
		return Father;
	}



	/**
	 * @param father the father to set
	 */
	public void setFather(CompleteStructure father) {
		Father = father;
	}



	/**
	 * @return the sons
	 */
	public List<CompleteStructure> getSons() {
		return Sons;
	}

	/**
	 * @param sons the sons to set
	 */
	public void setSons(List<CompleteStructure> sons) {
		Sons = sons;
	}




	/**
	 * @return the collectionFather
	 */
	public CompleteGrammar getCollectionFather() {
		return collectionFather;
	}


	/**
	 * @param collectionFather the collectionFather to set
	 */
	public void setCollectionFather(CompleteGrammar collectionFather) {
		this.collectionFather = collectionFather;
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


	/**
	 * @return the bFather
	 */
	public CompleteStructure getBFather() {
		return BFather;
	}


	/**
	 * @param bFather the bFather to set
	 */
	public void setBFather(CompleteStructure bFather) {
		BFather = bFather;
	}


	/**
	 * @return the bSon
	 */
	public CompleteStructure getBSon() {
		return BSon;
	}


	/**
	 * @param bSon the bSon to set
	 */
	public void setBSon(CompleteStructure bSon) {
		BSon = bSon;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}


	/**
	 * @return the shows
	 */
	public ArrayList<CompleteOperationalValueType> getShows() {
		return Shows;
	}


	/**
	 * @param shows the shows to set
	 */
	public void setShows(ArrayList<CompleteOperationalValueType> shows) {
		Shows = shows;
	}


	/**
	 * @return the browseable
	 */
	public boolean isBrowseable() {
		return Browseable;
	}


	/**
	 * @param browseable the browseable to set
	 */
	public void setBrowseable(boolean browseable) {
		Browseable = browseable;
	}


	/**
	 * @return the multivalued
	 */
	public boolean isMultivalued() {
		return Multivalued;
	}


	/**
	 * @param multivalued the multivalued to set
	 */
	public void setMultivalued(boolean multivalued) {
		Multivalued = multivalued;
	}


	public CompleteStructure getClassOfIterator() {
		return ClassOfIterator;
	}
	
	public void setClassOfIterator(CompleteStructure classOfIterator) {
		ClassOfIterator = classOfIterator;
	}

	
	
	
}
