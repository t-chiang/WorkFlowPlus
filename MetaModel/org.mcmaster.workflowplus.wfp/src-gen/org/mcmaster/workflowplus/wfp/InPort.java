/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.InPort#getInputTgt <em>Input Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.InPort#getInputSrc <em>Input Src</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInPort()
 * @model
 * @generated
 */
public interface InPort extends Port {

	/**
	 * Returns the value of the '<em><b>Input Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Input#getInportTgt <em>Inport Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Tgt</em>' reference.
	 * @see #setInputTgt(Input)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInPort_InputTgt()
	 * @see org.mcmaster.workflowplus.wfp.Input#getInportTgt
	 * @model opposite="inportTgt"
	 * @generated
	 */
	Input getInputTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.InPort#getInputTgt <em>Input Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Tgt</em>' reference.
	 * @see #getInputTgt()
	 * @generated
	 */
	void setInputTgt(Input value);

	/**
	 * Returns the value of the '<em><b>Input Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Input#getInportSrc <em>Inport Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Src</em>' reference.
	 * @see #setInputSrc(Input)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInPort_InputSrc()
	 * @see org.mcmaster.workflowplus.wfp.Input#getInportSrc
	 * @model opposite="inportSrc"
	 * @generated
	 */
	Input getInputSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.InPort#getInputSrc <em>Input Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Src</em>' reference.
	 * @see #getInputSrc()
	 * @generated
	 */
	void setInputSrc(Input value);
} // InPort
