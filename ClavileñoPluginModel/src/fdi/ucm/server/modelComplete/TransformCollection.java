/**
 * 
 */
package fdi.ucm.server.modelComplete;

import java.util.ArrayList;
import java.util.List;

import fdi.ucm.server.modelComplete.collection.CompleteCollection;
import fdi.ucm.server.modelComplete.collection.document.CompleteDocuments;
import fdi.ucm.server.modelComplete.collection.document.CompleteElement;
import fdi.ucm.server.modelComplete.collection.document.CompleteFile;
import fdi.ucm.server.modelComplete.collection.document.CompleteOperationalValue;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteElementType;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteGrammar;
import fdi.ucm.server.modelComplete.collection.grammar.CompleteOperationalValueType;

/**
 * @author Joaquin Gayoso-Cabada
 *
 */
public interface TransformCollection {
	
	
	//Generales 
	
	
	public CompleteDocuments getDocument(Long DocId); ///Sin los elementos
	public CompleteFile getFile(Long FileId);
	public CompleteGrammar getGrammar(Long ColId); //Sin los ElementType
	public CompleteCollection getCollection(Long ColId); //Sin documentos ni Files ni Gramaticas
	public CompleteElementType getElementType(Long ElemId);
	public CompleteElement getElement(Long ElemId);
	
	public List<CompleteFile> getFiles(Long ColId);
	public List<CompleteDocuments> getDocuments(Long ColId); //Sin los elementos
	public List<CompleteGrammar> getGrammars(Long ColId); //Sin los ElementType
	
	public List<CompleteElementType> getElementTypeByGrammar(Long GrammarId); 
	public List<CompleteElementType> getElementTypeByStructure(Long StructureId); 
	
	public List<CompleteOperationalValueType> getOperationalByGrammar(Long GrammarId); 
	public List<CompleteOperationalValueType> getOperationalByStructure(Long StructureId);
	
	public List<CompleteOperationalValue> getOperationalByDocument(Long DocId);
	public List<CompleteElement> getElements(Long DocId);
	public List<CompleteOperationalValue> getOperationalByElement(Long ElemId);
	
	
	//Busqueda 
	
	public List<CompleteDocuments> findDocument(Long ColectionId, String name, List<CompleteOperationalValue> operational); //null para comodin en ambos atributos , coleccion requerida
	public List<CompleteGrammar> findGrammar(Long ColectionId, String name, List<CompleteOperationalValueType> operational); //null para comodin en ambos atributos, coleccion requerida
	public List<CompleteElementType> findElementType(Long GrammarId, String name, List<CompleteOperationalValue> operational); //null para comodin en ambos atributos, gramatica requerida 
	public List<CompleteFile> findFile(Long ColectionId, String path);
	public List<CompleteElement> findValues(Long ElementTypeId, Long DocumentId, List<CompleteOperationalValue> operational ); //null para comodin en operacionales,
	public List<CompleteOperationalValueType> findOperationalTypebyElementType(Long ElementTypeId, String view, String name, String Value ); //null para comodin en view,name y value
	public List<CompleteOperationalValue> findOperationalTypebyElement(Long ElementId, String view, String name, String Value ); //null para comodin en view,name y value
	
	//Final Salvado
	
	public ArrayList<String> StoreCollection(CompleteCollection storeCollection, Long OldCollectionId,String Description, String IconPath );

	
	
//	Attr createAttr(String name, Attr parent, Tipo, boolean browsable, boolean multievaluated)
//	createView(Attr attr,String name)
//	createViewField(Attr attr, String viewName, String fieldName, String value)
//	getInstances(Attr parent, L<String> attrs2Search, L<String> attrs4Search, L<String> values4Search)
//	createFile(String path)
//	createDocument(String path)
//	getFile()
//	getDocument()
//	getFilePath()
//	addInstances(Attr parent, L<String> attrs2Set, L<Object> values2Set)
}
