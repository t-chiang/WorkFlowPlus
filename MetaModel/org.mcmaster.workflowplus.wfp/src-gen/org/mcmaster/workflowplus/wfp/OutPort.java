/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc <em>Output Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt <em>Output Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutPort()
 * @model
 * @generated
 */
public interface OutPort extends Port {

	/**
	 * Returns the value of the '<em><b>Output Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Output#getOutportSrc <em>Outport Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Src</em>' reference.
	 * @see #setOutputSrc(Output)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutPort_OutputSrc()
	 * @see org.mcmaster.workflowplus.wfp.Output#getOutportSrc
	 * @model opposite="outportSrc"
	 * @generated
	 */
	Output getOutputSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc <em>Output Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Src</em>' reference.
	 * @see #getOutputSrc()
	 * @generated
	 */
	void setOutputSrc(Output value);

	/**
	 * Returns the value of the '<em><b>Output Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Output#getOutportTgt <em>Outport Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Tgt</em>' reference.
	 * @see #setOutputTgt(Output)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutPort_OutputTgt()
	 * @see org.mcmaster.workflowplus.wfp.Output#getOutportTgt
	 * @model opposite="outportTgt"
	 * @generated
	 */
	Output getOutputTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt <em>Output Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Tgt</em>' reference.
	 * @see #getOutputTgt()
	 * @generated
	 */
	void setOutputTgt(Output value);
} // OutPort
