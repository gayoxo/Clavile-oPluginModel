package fdi.ucm.server.modelComplete.collection.grammar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase base del esquema de atributos
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteElementType extends CompleteStructure implements Serializable{


	private static final long serialVersionUID = 5151085195953705390L;
	protected String Name;
	protected ArrayList<CompleteOperationalValueType> Shows;  

	
	
	/**
	 * Constructor por defecto
	 */
	public CompleteElementType() {
		super();
	Father=null;
	Name="unknown";
	Shows=new ArrayList<CompleteOperationalValueType>();
	
	}




	/** Constructor con todos los parametros
	 * @param father Padre del attibuto.
	 * @param name Nombre del atributo.
	 * @param browseable Define si es navegable
	 */
		public CompleteElementType(String name,CompleteGrammar GramaticaPadre) {
			super(null,GramaticaPadre);
			Name = name;
			Shows=new ArrayList<CompleteOperationalValueType>();
		}
		
		/** @param father Padre del attibuto.
		 * @param name Nombre del atributo.
		 * @param browseable Define si es navegable
		 */
			public CompleteElementType(String name, CompleteStructure father) {
				super(father,null);
				Name = name;
				Shows=new ArrayList<CompleteOperationalValueType>();
			}
	
	
	/** Constructor con todos los parametros
	 * @param father Padre del attibuto.
	 * @param name Nombre del atributo.
	 * @param browseable Define si es navegable
	 */
		public CompleteElementType(Long Claviqueno,String name,CompleteGrammar GramaticaPadre) {
			super(Claviqueno,null,GramaticaPadre);
			Name = name;
			Shows=new ArrayList<CompleteOperationalValueType>();
		}
		
		/** @param father Padre del attibuto.
		 * @param name Nombre del atributo.
		 * @param browseable Define si es navegable
		 */
			public CompleteElementType(Long Claviqueno,String name, CompleteStructure father) {
				super(Claviqueno,father,null);
				Name = name;
				Shows=new ArrayList<CompleteOperationalValueType>();
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




	
}
