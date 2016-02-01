package fdi.ucm.server.modelComplete.collection;

import java.io.Serializable;
import java.util.ArrayList;

import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteElement;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;

public class CompleteLogAndUpdates implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> LogLines;
	private ArrayList<CompleteElement> NuevosElementos;
	private ArrayList<CompleteElement> NuevosOperationalValueElement;
	private ArrayList<CompleteDocuments> NuevosOperationalValueDocument;
	private ArrayList<CompleteGrammar> NuevosOperationalViewGrammar;
	private ArrayList<CompleteElementType> NuevosOperationalViewStructure;
	
	public CompleteLogAndUpdates() {
		LogLines=new ArrayList<String>();
		NuevosElementos=new ArrayList<CompleteElement>();
		NuevosOperationalValueElement=new ArrayList<CompleteElement>();
		NuevosOperationalValueDocument=new ArrayList<CompleteDocuments>();
		NuevosOperationalViewGrammar=new ArrayList<CompleteGrammar>();
		NuevosOperationalViewStructure=new ArrayList<CompleteElementType>();
	}
	

	/**
	 * @param logLines
	 * @param nuevosElementos
	 * @param nuevosOperationalValueElement
	 * @param nuevosOperationalValueDocument
	 * @param nuevosOperationalViewGrammar
	 * @param nuevosOperationalViewStructure
	 */
	public CompleteLogAndUpdates(ArrayList<String> logLines,
			ArrayList<CompleteElement> nuevosElementos,
			ArrayList<CompleteElement> nuevosOperationalValueElement,
			ArrayList<CompleteDocuments> nuevosOperationalValueDocument,
			ArrayList<CompleteGrammar> nuevosOperationalViewGrammar,
			ArrayList<CompleteElementType> nuevosOperationalViewStructure) {
		super();
		LogLines = logLines;
		NuevosElementos = nuevosElementos;
		NuevosOperationalValueElement = nuevosOperationalValueElement;
		NuevosOperationalValueDocument = nuevosOperationalValueDocument;
		NuevosOperationalViewGrammar = nuevosOperationalViewGrammar;
		NuevosOperationalViewStructure = nuevosOperationalViewStructure;
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

	/**
	 * @return the nuevosElementos
	 */
	public ArrayList<CompleteElement> getNuevosElementos() {
		return NuevosElementos;
	}

	/**
	 * @param nuevosElementos the nuevosElementos to set
	 */
	public void setNuevosElementos(ArrayList<CompleteElement> nuevosElementos) {
		NuevosElementos = nuevosElementos;
	}

	/**
	 * @return the nuevosOperationalValueElement
	 */
	public ArrayList<CompleteElement> getNuevosOperationalValueElement() {
		return NuevosOperationalValueElement;
	}

	/**
	 * @param nuevosOperationalValueElement the nuevosOperationalValueElement to set
	 */
	public void setNuevosOperationalValueElement(
			ArrayList<CompleteElement> nuevosOperationalValueElement) {
		NuevosOperationalValueElement = nuevosOperationalValueElement;
	}

	/**
	 * @return the nuevosOperationalValueDocument
	 */
	public ArrayList<CompleteDocuments> getNuevosOperationalValueDocument() {
		return NuevosOperationalValueDocument;
	}

	/**
	 * @param nuevosOperationalValueDocument the nuevosOperationalValueDocument to set
	 */
	public void setNuevosOperationalValueDocument(
			ArrayList<CompleteDocuments> nuevosOperationalValueDocument) {
		NuevosOperationalValueDocument = nuevosOperationalValueDocument;
	}

	/**
	 * @return the nuevosOperationalViewGrammar
	 */
	public ArrayList<CompleteGrammar> getNuevosOperationalViewGrammar() {
		return NuevosOperationalViewGrammar;
	}

	/**
	 * @param nuevosOperationalViewGrammar the nuevosOperationalViewGrammar to set
	 */
	public void setNuevosOperationalViewGrammar(
			ArrayList<CompleteGrammar> nuevosOperationalViewGrammar) {
		NuevosOperationalViewGrammar = nuevosOperationalViewGrammar;
	}

	/**
	 * @return the nuevosOperationalViewStructure
	 */
	public ArrayList<CompleteElementType> getNuevosOperationalViewStructure() {
		return NuevosOperationalViewStructure;
	}

	/**
	 * @param nuevosOperationalViewStructure the nuevosOperationalViewStructure to set
	 */
	public void setNuevosOperationalViewStructure(
			ArrayList<CompleteElementType> nuevosOperationalViewStructure) {
		NuevosOperationalViewStructure = nuevosOperationalViewStructure;
	}
	
	
}
