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
public class Interconect implements Serializable {


	private static final long serialVersionUID = 1L;
	public static final String EDITOR = "editor";
	private String Name;
	private List<Parameter> Parametros;
	private String Icon;
	
	
	public Interconect() {
		Name="";
		Icon="";
		Parametros=new ArrayList<>();
	}


	public Interconect(String name, String icon) {
		super();
		Name = name;
		Icon = icon;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public List<Parameter> getParametros() {
		return Parametros;
	}


	public void setParametros(List<Parameter> parametros) {
		Parametros = parametros;
	}


	public String getIcon() {
		return Icon;
	}


	public void setIcon(String icon) {
		Icon = icon;
	}
	
	
}
