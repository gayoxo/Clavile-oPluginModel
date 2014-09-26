/**
 * 
 */
package fdi.ucm.server.modelComplete;

import java.util.ArrayList;

import fdi.ucm.server.modelComplete.collection.CompleteCollectionAndLog;

/**
 * @author Joaquin Gayoso-Cabada
 *	Clase que genera un update de la coleccion en custion
 */
public abstract class UpdateCollection {

	/**
	 * Constructor, sirve para tener una uinstancia vacia de la clase,
	 * crear pero no rellenar
	 * 
	 */
	public UpdateCollection()
	{
		getConfiguracion();
	}
	
	
	
	/**
	 * Procesa la clase creando la coleccion pertinente
	 * @param dateEntrada 
	 * @return la nueva coleccion.
	 */
	public abstract CompleteCollectionAndLog processCollecccion(ArrayList<String> dateEntrada);
	
	
	/**
	 * Funcion que devuelve los datos que luego seran la entrada del sistema.
	 * @return Lista de datos que serviran como entrada al sistema.
	 */
	public abstract ArrayList<ImportExportPair> getConfiguracion();


	
	/**
	 * Obtiene el nombre por el que se entrara al plugin
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * Retorna si es necesario que se clonen las imagenes en local.
	 * @return si debe clonarse
	 */
	public abstract boolean getCloneLocalFiles(); 
	
}
