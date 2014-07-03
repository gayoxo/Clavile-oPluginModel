/**
 * 
 */
package fdi.ucm.server.modelComplete;

import java.io.Serializable;

/**
 * Clase que implementa los datos para la exportacion e importacion de los elementos en un plugin. 
 * @author Joaquin Gayoso-Cabada
 *
 */
public class ImportExportPair implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5865820843900140019L;
	private ImportExportDataEnum Tipo;
	private String Label;
	private Boolean vacioAllow;
	
	
	public ImportExportPair() {
		Tipo=null;
		Label=null;
		vacioAllow=false;
	}
	
	/**
	 * @param tipo
	 * @param label
	 */
	public ImportExportPair(ImportExportDataEnum tipo, String label) {
		super();
		Tipo = tipo;
		Label = label;
		vacioAllow=false;
	}
	
	/**
	 * @param tipo
	 * @param label
	 */
	public ImportExportPair(ImportExportDataEnum tipo, String label,Boolean vacioAllow) {
		super();
		Tipo = tipo;
		Label = label;
		this.vacioAllow=vacioAllow;
	}
	
	
	/**
	 * @return the tipo
	 */
	public ImportExportDataEnum getTipo() {
		return Tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(ImportExportDataEnum tipo) {
		Tipo = tipo;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return Label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		Label = label;
	}

	/**
	 * @return the vacioAllow
	 */
	public Boolean getVacioAllow() {
		return vacioAllow;
	}

	/**
	 * @param vacioAllow the vacioAllow to set
	 */
	public void setVacioAllow(Boolean vacioAllow) {
		this.vacioAllow = vacioAllow;
	}
	
	
}
