/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;

import java.io.Serializable;
import java.util.ArrayList;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;

/**
 * Clase que define una gramatica
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteGrammar implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1669968409568391810L;
	private ArrayList<CompleteStructure> Sons;
	private String Nombre;
	private String Description;
	private ArrayList<CompleteOperationalView> Views;
	private CompleteCollection Coleccion;
	private Long Clavilenoid;
	
	
	public CompleteGrammar() {
		Sons=new ArrayList<CompleteStructure>();
		Nombre=null;
		Description=null;
		Views=new ArrayList<CompleteOperationalView>();
		Clavilenoid=null;
	}


	/**
	 * @param nombre
	 * @param description
	 */
	public CompleteGrammar(String nombre, String description,CompleteCollection coleccion) {
		super();
		Nombre = nombre;
		Description = description;
		Sons=new ArrayList<CompleteStructure>();
		Views=new ArrayList<CompleteOperationalView>();
		Coleccion=coleccion;
		Clavilenoid=null;
	}

	/**
	 * @param nombre
	 * @param description
	 */
	public CompleteGrammar(Long claviqueno,String nombre, String description,CompleteCollection coleccion) {
		super();
		Nombre = nombre;
		Description = description;
		Sons=new ArrayList<CompleteStructure>();
		Views=new ArrayList<CompleteOperationalView>();
		Coleccion=coleccion;
		Clavilenoid=claviqueno;
	}
	
	/**
	 * @return the sons
	 */
	public ArrayList<CompleteStructure> getSons() {
		return Sons;
	}


	/**
	 * @param sons the sons to set
	 */
	public void setSons(ArrayList<CompleteStructure> sons) {
		Sons = sons;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	 * @return the views
	 */
	public ArrayList<CompleteOperationalView> getViews() {
		return Views;
	}


	/**
	 * @param views the views to set
	 */
	public void setViews(ArrayList<CompleteOperationalView> views) {
		Views = views;
	}


	/**
	 * @return the coleccion
	 */
	public CompleteCollection getColeccion() {
		return Coleccion;
	}


	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(CompleteCollection coleccion) {
		Coleccion = coleccion;
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
