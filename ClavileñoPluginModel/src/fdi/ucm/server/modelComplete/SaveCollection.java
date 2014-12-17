/**
 * 
 */
package fdi.ucm.server.modelComplete;

import java.util.ArrayList;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.CompleteLogAndUpdates;

/**
 * Clase que define el iterface de salvado en el sistema.
 * @author Joaquin Gayoso-Cabada
 *
 */
public abstract class SaveCollection {
	
	
	public SaveCollection() {
		getConfiguracion();
	}

	/**
	 * Funcion que define el salvado de una clase collecion.
	 * @param Salvar Clase a salvar.
	 * @return resultado del salvado.
	 */
	public abstract CompleteLogAndUpdates processCollecccion(CompleteCollection Salvar,String PathTemporalFiles) throws CompleteImportRuntimeException;
	
	
	/**
	 * Funcion que devuelve los datos que luego seran la entrada del sistema.
	 * @return Lista de datos que serviran como entrada al sistema.
	 */
	public abstract ArrayList<ImportExportPair> getConfiguracion();
	
	/**
	 * Setea la configuracion del plugin.
	 * @param DateEntrada datos de entrada ordenados para configurar en el orden de GetConfiguracion();
	 */
	public abstract void setConfiguracion(ArrayList<String> DateEntrada);

	/**
	 * Obtiene el nombre por el que se entrara al plugin
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * Determina si la salida incluye un file
	 * @return
	 */
	public abstract boolean isFileOutput();
	
	/**
	 * Path del file en caso de que la salida sea correcta
	 * @return
	 */
	public abstract String FileOutput();
	
	/**
	 * Path del file en caso de que la salida sea correcta
	 * @return
	 */
	public abstract void SetlocalTemporalFolder(String TemporalPath);
	
}
