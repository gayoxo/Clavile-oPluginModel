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
	protected CompleteOperationalView View;

	
	public CompleteOperationalValueType() {
		super();
		Default=null;
		Name=null;
	}

	
	/**
	 * 
	 * @param Name
	 * @param defaultV
	 */
	public CompleteOperationalValueType(String Name,String defaultV,CompleteOperationalView padre) {
		super();
		Default=defaultV;
		this.Name=Name;
		View=padre;
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
	public CompleteOperationalView getView() {
		return View;
	}


	/**
	 * @param view the view to set
	 */
	public void setView(CompleteOperationalView view) {
		View = view;
	}
	
	
	
}
