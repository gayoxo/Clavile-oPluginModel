package fdi.ucm.server.modelComplete.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteFile;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;


/**
 * Clase que implemeta una coleccion
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteCollection  implements Serializable{

	private static final long serialVersionUID = 3540633522691779763L;
	
	private Long id;
	
	private String Name;
	
	private String Description;
	
	private List<CompleteGrammar> MetamodelSchemas;
	
	private List<CompleteFile> SectionValues;
	
	private List<CompleteDocuments> Estructuras;
	
	

	/**
	 * Constructor por defecto necesario para serializacion
	 */
	public CompleteCollection() {
		MetamodelSchemas= new ArrayList<CompleteGrammar>();
		SectionValues=new ArrayList<CompleteFile>();
		Estructuras=new ArrayList<CompleteDocuments>();
		id=null;
				
	}

	/**
	 * Constructor por defecto necesario para serializacion
	 */
	public CompleteCollection(String Namein,String description) {
		MetamodelSchemas= new ArrayList<CompleteGrammar>();
		SectionValues=new ArrayList<CompleteFile>();
		Estructuras=new ArrayList<CompleteDocuments>();
		Name=Namein;
		id=null;	
		Description=description;
	}
	
	/**
	 * @return the metamodelSchemas
	 */
	public List<CompleteGrammar> getMetamodelGrammar() {
		return MetamodelSchemas;
	}

	/**
	 * @param metamodelSchemas the metamodelSchemas to set
	 */
	public void setMetamodelGrammar(ArrayList<CompleteGrammar> metamodelSchemas) {
		MetamodelSchemas = metamodelSchemas;
	}

	/**
	 * @return the sectionValues
	 */
	public List<CompleteFile> getSectionValues() {
		return SectionValues;
	}

	/**
	 * @param sectionValues the sectionValues to set
	 */
	public void setSectionValues(ArrayList<CompleteFile> sectionValues) {
		SectionValues = sectionValues;
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
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the estructuras
	 */
	public List<CompleteDocuments> getEstructuras() {
		return Estructuras;
	}

	/**
	 * @param estructuras the estructuras to set
	 */
	public void setEstructuras(List<CompleteDocuments> estructuras) {
		Estructuras = estructuras;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	
}
