/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que define una vista para un Meta
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteOperationalView implements Serializable{

	
	private static final long serialVersionUID = -5553181915585551551L;
	protected String name;
	protected ArrayList<CompleteOperationalValueType> Values;
	private Long Clavilenoid;
	
	public CompleteOperationalView() {
		name="Error";
		Values=new ArrayList<CompleteOperationalValueType>();
		Clavilenoid=null;
	}

	public CompleteOperationalView(String value)
	{
		name=value;
		Values=new ArrayList<CompleteOperationalValueType>();
		Clavilenoid=null;
	}
	
	public CompleteOperationalView(Long claviqueno,String value)
	{
		name=value;
		Values=new ArrayList<CompleteOperationalValueType>();
		Clavilenoid=claviqueno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the values
	 */
	public ArrayList<CompleteOperationalValueType> getValues() {
		return Values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(ArrayList<CompleteOperationalValueType> values) {
		Values = values;
	}

	/**
	 * @return the clavilenoid
	 */
	public Long getClavilenoid() {
		return Clavilenoid;
	}

	/**
	 * @param clavilenoid the clavilenoid to set
	 */
	public void setClavilenoid(Long clavilenoid) {
		Clavilenoid = clavilenoid;
	}
}
