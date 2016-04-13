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
public abstract class CompleteStructure implements Serializable{
	

	
	private CompleteGrammar collectionFather;
	
	private static final long serialVersionUID = 1L;
	
	protected List<CompleteStructure> Sons=new ArrayList<CompleteStructure>();
	
	protected CompleteStructure Father;
	
	private Long Clavilenoid;
	

	/**
	 * Consctructor por defecto
	 */
	public CompleteStructure() {
		Sons=new ArrayList<CompleteStructure>();	
		Father=null;
	//	PositionInFather=0;
		Clavilenoid=null;
	}
	
	
	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(CompleteStructure father,CompleteGrammar ColeccionPadre) {
		super();
		Father = father;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=null;
	}


	/**
	 * Constructor con parametros
	 * @param father padre del objeto
	 */
	public CompleteStructure(Long Claviqueno,CompleteStructure father,CompleteGrammar ColeccionPadre) {
		super();
		Father = father;
		Sons=new ArrayList<CompleteStructure>();	
		collectionFather=ColeccionPadre;
		Clavilenoid=Claviqueno;
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

	
	
	
}
