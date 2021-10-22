/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Data#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.Data#getOutput <em>Output</em>}</li>
 *   <li>{@link wFP_V2.Data#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wFP_V2.WFP_V2Package#getData_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wFP_V2.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Output}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Output#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getData_Output()
	 * @see wFP_V2.Output#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Input}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Input#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getData_Input()
	 * @see wFP_V2.Input#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void forwardImpactAnalysis();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void backwardImpactAnalysis();

} // Data
