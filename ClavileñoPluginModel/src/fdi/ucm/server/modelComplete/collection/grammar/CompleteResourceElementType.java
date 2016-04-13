package fdi.ucm.server.modelComplete.collection.grammar;


/**
 * Clase que genera una relacion entre secciones
 * @author Joaquin Gayoso
 *
 */
public class CompleteResourceElementType extends CompleteElementType{

	private static final long serialVersionUID = 1L;
	
	
	public CompleteResourceElementType() {
		super();
	}


	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteResourceElementType(String name, CompleteStructure father) {
		super(name,father);
	}
	
	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteResourceElementType(String name, CompleteGrammar GramaticaPadre) {
		super(name,GramaticaPadre);
	}
	
	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteResourceElementType(Long claviqueno,String name, CompleteStructure father) {
		super(claviqueno,name,father);
	}
	
	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteResourceElementType(Long claviqueno,String name, CompleteGrammar GramaticaPadre) {
		super(claviqueno,name,GramaticaPadre);
	}
	

}
