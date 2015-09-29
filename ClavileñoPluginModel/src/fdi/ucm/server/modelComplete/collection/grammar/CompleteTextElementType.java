/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;


/**
 * Clase que define el atributo Meta para un elemento de texto.
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteTextElementType extends CompleteStructure {

	private static final long serialVersionUID = -3295083410485450541L;

	/**
	 * Constructor por defecto
	 */
	public CompleteTextElementType() {
		super();
	}

	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(Long claviqueno,String name,CompleteStructure father, CompleteGrammar GramaticaPadre) {
		super(claviqueno,name,father,GramaticaPadre);
	}

	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(Long claviqueno,String name,CompleteGrammar GramaticaPadre) {
		super(claviqueno,name,GramaticaPadre);
	}
	
	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(String name,CompleteStructure father, CompleteGrammar GramaticaPadre) {
		super(name,father,GramaticaPadre);
	}

	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(String name,CompleteGrammar GramaticaPadre) {
		super(name,GramaticaPadre);
	}
	
	

}
