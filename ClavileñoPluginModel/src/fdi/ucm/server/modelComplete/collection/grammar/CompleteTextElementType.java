/**
 * 
 */
package fdi.ucm.server.modelComplete.collection.grammar;


/**
 * Clase que define el atributo Meta para un elemento de texto.
 * @author Joaquin Gayoso-Cabada
 *
 */
public class CompleteTextElementType extends CompleteElementType {

	private static final long serialVersionUID = -3295083410485450541L;

	/**
	 * Constructor por defecto
	 */
	public CompleteTextElementType() {
		super();
	}

	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(String name,CompleteStructure father) {
		super(name,father);
	}

	/**
	 * @param name
	 * @param father
	 */
	public CompleteTextElementType(String name,CompleteGrammar GramaticaPadre) {
		super(name,GramaticaPadre);
	}
	
	

}
