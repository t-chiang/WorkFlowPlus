/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Process#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.Process#getNext <em>Next</em>}</li>
 *   <li>{@link wFP_V2.Process#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wFP_V2.WFP_V2Package#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wFP_V2.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Process}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Process#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getProcess_Next()
	 * @see wFP_V2.Process#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<Process> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Process}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Process#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getProcess_Previous()
	 * @see wFP_V2.Process#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Process> getPrevious();

} // Process
