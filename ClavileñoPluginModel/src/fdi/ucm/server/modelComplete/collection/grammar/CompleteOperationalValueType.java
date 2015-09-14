/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;

import java.io.Serializable;

/**
 * Clase que define un valor para la vista
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteOperationalValueType implements Serializable{


	private static final long serialVersionUID = 2611988084685026790L;
	protected String Default;
	protected String Name;
	protected String View;
	private Long Clavilenoid;
	
	public CompleteOperationalValueType() {
		super();
		Default=null;
		Name=null;
		Clavilenoid=null;
	}

	
	/**
	 * 
	 * @param Name
	 * @param defaultV
	 */
	public CompleteOperationalValueType(String Name,String defaultV,String padre) {
		super();
		Default=defaultV;
		this.Name=Name;
		View=padre;
		Clavilenoid=null;
	}

	/**
	 * 
	 * @param Name
	 * @param defaultV
	 */
	public CompleteOperationalValueType(Long claviqueno,String Name,String defaultV,String padre) {
		super();
		Default=defaultV;
		this.Name=Name;
		View=padre;
		Clavilenoid=claviqueno;
	}

	/**
	 * @return the default
	 */
	public String getDefault() {
		return Default;
	}


	/**
	 * @param default1 the default to set
	 */
	public void setDefault(String default1) {
		Default = default1;
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
	 * @return the view
	 */
	public String getView() {
		return View;
	}


	/**
	 * @param view the view to set
	 */
	public void setView(String view) {
		View = view;
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
