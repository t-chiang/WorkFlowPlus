/**
 */
package org.mcmaster.workflowplus.wfp;

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
 *   <li>{@link org.mcmaster.workflowplus.wfp.Process#getInput <em>Input</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Process#getOutput <em>Output</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Process#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends Node {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Input}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Input#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getProcess_Input()
	 * @see org.mcmaster.workflowplus.wfp.Input#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Input> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Output}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Output#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getProcess_Output()
	 * @see org.mcmaster.workflowplus.wfp.Output#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Process
