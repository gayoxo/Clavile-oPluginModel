/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.document;

import java.io.Serializable;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;

/**
 * Clase que implementa un sectionValue file
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteFile implements Serializable{


	private static final long serialVersionUID = 7786350162913651910L;
	private String Path;
	private CompleteCollection collectionFather;
	
	public CompleteFile() {
		super();
		this.Path="";
	}
	
	/**
	 * @param path
	 * @param collectionFather
	 */
	public CompleteFile(String path, CompleteCollection collectionFather) {
		super();
		Path = path;
		this.collectionFather = collectionFather;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return Path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		Path = path;
	}
	
	public CompleteCollection getCollectionFather() {
		return collectionFather;
	}



	public void setCollectionFather(CompleteCollection collectionFather) {
		this.collectionFather=collectionFather;
		
	}
}
