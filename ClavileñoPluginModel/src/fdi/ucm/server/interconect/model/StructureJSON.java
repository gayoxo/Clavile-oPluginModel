/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Crea el objeto base que define un coleccion attribute
 * @author Joaquin Gayoso-Cabada
 *
 */
public class StructureJSON implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	protected List<StructureJSON> Sons=new ArrayList<StructureJSON>();
	
	protected ArrayList<Long> Id;
	
	protected String Name;

	protected ArrayList<OperationalValueTypeJSON> Shows;  
	
	protected boolean Multivalued;
	
	protected boolean Browseable;
	
	protected boolean Selected;
	
	protected boolean Filtro;
	
	protected Long ClaseOf;
	
	protected String Value;
	
	private ArrayList<OperationalValueJSON> OperationalValues;  

	/**
	 * Consctructor por defecto
	 */
	public StructureJSON() {
		Sons=new ArrayList<StructureJSON>();	
		Id=new ArrayList<Long>();
		Name="unknown";
		Shows=new ArrayList<OperationalValueTypeJSON>();
		Multivalued=false;
		Browseable=false;
		ClaseOf=0l;
		Selected=false;
		Filtro=false;
		Value="";
		OperationalValues=new ArrayList<OperationalValueJSON>();
	}
	
	
	/** Constructor con todos los parametros
	 * @param father Padre del attibuto.
	 * @param name Nombre del atributo.
	 * @param browseable Define si es navegable
	 */
		public StructureJSON(String name,ArrayList<Long> id,boolean multivalued,boolean browseable,boolean Selected,boolean filtro, Long ClaseOf,String Value,ArrayList<OperationalValueJSON> OperationalValues) {
			super();
			Sons=new ArrayList<StructureJSON>();	
			this.Id=id;
			Name = name;
			Shows=new ArrayList<OperationalValueTypeJSON>();
			Multivalued=multivalued;
			Browseable=browseable;
			this.ClaseOf=ClaseOf;
			this.Selected=Selected;
			this.Filtro=filtro;
			this.Value=Value;
			this.OperationalValues=OperationalValues;
		}



	/**
	 * @return the sons
	 */
	public List<StructureJSON> getSons() {
		return Sons;
	}

	/**
	 * @param sons the sons to set
	 */
	public void setSons(List<StructureJSON> sons) {
		Sons = sons;
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
	public ArrayList<OperationalValueTypeJSON> getShows() {
		return Shows;
	}




	/**
	 * @param shows the shows to set
	 */
	public void setShows(ArrayList<OperationalValueTypeJSON> shows) {
		Shows = shows;
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

public Long getClaseOf() {
	return ClaseOf;
}


public void setClaseOf(Long claseOf) {
	ClaseOf = claseOf;
}


public boolean isSelected() {
	return Selected;
}


public void setSelected(boolean selected) {
	Selected = selected;
}

public boolean isFiltro() {
	return Filtro;
}

public void setFiltro(boolean filtro) {
	Filtro = filtro;
}

public String getValue() {
	return Value;
}

public void setValue(String value) {
	Value = value;
}

public ArrayList<OperationalValueJSON> getOperationalValues() {
	return OperationalValues;
}

public void setOperationalValues(ArrayList<OperationalValueJSON> operationalValues) {
	OperationalValues = operationalValues;
}


}
