package fdi.ucm.server.modelComplete.collection.grammar;


/**
 * Clase que genera una relacion entre secciones
 * @author Joaquin Gayoso
 *
 */
public class CompleteLinkElementType extends CompleteElementType{

	private static final long serialVersionUID = 1L;
	
	
	public CompleteLinkElementType() {
		super();
	}


	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteLinkElementType(String name, CompleteGrammar GramaticaPadre) {
		super(name,GramaticaPadre);
	}
	
	/**
	 * @param name
	 * @param father
	 * @param summary
	 */
	public CompleteLinkElementType(String name, CompleteStructure father) {
		super(name,father);
	}
	

}
