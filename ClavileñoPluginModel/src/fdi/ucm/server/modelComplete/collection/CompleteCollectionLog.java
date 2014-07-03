package fdi.ucm.server.modelComplete.collection;

import java.io.Serializable;
import java.util.ArrayList;

public class CompleteCollectionLog implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> LogLines;
	
	public CompleteCollectionLog() {
		LogLines=new ArrayList<String>();
	}

	/**
	 * @param coleccion
	 * @param logLines
	 */
	public CompleteCollectionLog(ArrayList<String> logLines) {
		super();
		LogLines = logLines;
	}

	/**
	 * @return the logLines
	 */
	public ArrayList<String> getLogLines() {
		return LogLines;
	}

	/**
	 * @param logLines the logLines to set
	 */
	public void setLogLines(ArrayList<String> logLines) {
		LogLines = logLines;
	}
	
	
}
