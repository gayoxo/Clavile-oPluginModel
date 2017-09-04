/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joaquin Gayoso Cabada
 *
 */
public class Parameter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String Name;
	public String Value;
	public List<Parameter> Hijos;
	
	public Parameter() {
		Hijos=new ArrayList<>();
		Name="";
		Value="";
	}
	
	public Parameter(String name, String value) {
		super();
		Hijos=new ArrayList<>();
		Name = name;
		Value = value;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public List<Parameter> getHijos() {
		return Hijos;
	}

	public void setHijos(List<Parameter> hijos) {
		Hijos = hijos;
	}
	
	
	
	
}
