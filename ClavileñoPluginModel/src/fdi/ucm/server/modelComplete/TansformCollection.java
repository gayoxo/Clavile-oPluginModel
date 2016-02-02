/**
 * 
 */
package fdi.ucm.server.modelComplete;

import fdi.ucm.server.modelComplete.collection.CompleteCollectionAndLog;

/**
 * Clase que define el transformado de salvado en el sistema.
 * @author Joaquin Gayoso-Cabada
 *
 */
public abstract class TansformCollection {
	
	
	public TansformCollection(TransformFunctionsCollection ConexionTrnasformacion) {
		super();
	}

	/**
	 * Funcion que define el proceso de transformacion.
	 * @param Salvar Clase a salvar.
	 * @return resultado del salvado.
	 */
	public abstract CompleteCollectionAndLog processTransform(Long ColeccionEntrada) throws CompleteTransformRuntimeException;
	
	
	
	
}
