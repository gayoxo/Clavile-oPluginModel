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
	
	//NECESARIAS EN LOS ENVIOS PARA PODER EDITAR
	
	public static final String POSTURL="posturl";
	public static final String PASSID = "passid";
	public static final String PROTOCOL = "protocol";
	public static final String MULTI = "multi";
	public static final String EXTRADATA = "extradata";
	public static final String DATAGETURL = "datageturl";
	public static final String VISUALDATAGETURL = "visualdatageturl";
	public static final String POSITION = "position";
	public static final String DOCUMENTID = "documentpartid";
	public static final String EDITORNAME = "editorname";
	
	
	
	private String Name;
	private List<Parameter> Parametros;
	private String Icon;
	private String URLEdicion;
	private String URLVisual;
	
	
	public Interconect() {
		Name="";
		Icon="";
		Parametros=new ArrayList<>();
	}





	public Interconect(String name, String icon, String uRLEdicion, String uRLVisual) {
		super();
		Name = name;
		Icon = icon;
		URLEdicion = uRLEdicion;
		URLVisual = uRLVisual;
		Parametros=new ArrayList<>();
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





	public String getURLEdicion() {
		return URLEdicion;
	}





	public void setURLEdicion(String uRLEdicion) {
		URLEdicion = uRLEdicion;
	}





	public String getURLVisual() {
		return URLVisual;
	}





	public void setURLVisual(String uRLVisual) {
		URLVisual = uRLVisual;
	}
	
	
}
