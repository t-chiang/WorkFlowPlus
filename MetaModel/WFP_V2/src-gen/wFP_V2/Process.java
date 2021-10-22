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
 *   <li>{@link wFP_V2.Process#getInput <em>Input</em>}</li>
 *   <li>{@link wFP_V2.Process#getOutput <em>Output</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Input}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Input#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getProcess_Input()
	 * @see wFP_V2.Input#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Output}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Output#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getProcess_Output()
	 * @see wFP_V2.Output#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Output> getOutput();

} // Process
