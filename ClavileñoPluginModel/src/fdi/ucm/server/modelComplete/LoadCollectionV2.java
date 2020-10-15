/**
 * 
 */
package fdi.ucm.server.modelComplete;

/**
 * Clase que implementa el interface de una coleccion.
 * @author Joaquin Gayoso-Cabada
 *
 */
public abstract class LoadCollectionV2 extends LoadCollection{
	

	
	/**
	 * Constructor, sirve para tener una uinstancia vacia de la clase,
	 * crear pero no rellenar
	 * 
	 */
	public LoadCollectionV2()
	{
		getConfiguracion();
	}
	
	
	public boolean isrow() {
		return false;
	}
	
}
