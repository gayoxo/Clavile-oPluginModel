package fdi.ucm.server.modelComplete.collection;

import java.io.Serializable;
import java.util.ArrayList;

public class CompleteCollectionAndLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CompleteCollection Collection;
	private ArrayList<String> LogLines;
	
	public CompleteCollectionAndLog() {
	
	}

	
	/**
	 * @param collection
	 * @param logLines
	 */
	public CompleteCollectionAndLog(CompleteCollection collection,
			ArrayList<String> logLines) {
		super();
		Collection = collection;
		LogLines = logLines;
	}


	/**
	 * @return the collection
	 */
	public CompleteCollection getCollection() {
		return Collection;
	}

	/**
	 * @param collection the collection to set
	 */
	public void setCollection(CompleteCollection collection) {
		Collection = collection;
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
