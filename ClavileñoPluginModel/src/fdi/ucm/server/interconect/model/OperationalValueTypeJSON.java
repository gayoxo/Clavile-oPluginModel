/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que define un valor para la vista
 * @author Joaquin Gayoso-Cabada
 *
 */
public class OperationalValueTypeJSON implements Serializable{


	private static final long serialVersionUID = 2611988084685026790L;
	protected String Default;
	protected String Name;
	protected String View;
	protected ArrayList<Long> Id;

	
	public OperationalValueTypeJSON() {
		super();
		Default=null;
		Name=null;
	}

	/**
	 * @param default1
	 * @param name
	 * @param view
	 * @param id
	 */
	public OperationalValueTypeJSON(String default1, String name,
			String view, ArrayList<Long> id) {
		super();
		Default = default1;
		Name = name;
		View = view;
		Id = id;
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
	 * @return the id
	 */
	public ArrayList<Long> getId() {
		return Id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(ArrayList<Long> id) {
		Id = id;
	}
	
	
	
}
