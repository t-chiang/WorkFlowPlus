/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getOutportSrc <em>Outport Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Output#getOutportTgt <em>Outport Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Reference {
	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Data#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Data)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_Tgt()
	 * @see org.mcmaster.workflowplus.wfp.Data#getOutput
	 * @model opposite="output" required="true"
	 * @generated
	 */
	Data getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Data value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Process#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(org.mcmaster.workflowplus.wfp.Process)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_Src()
	 * @see org.mcmaster.workflowplus.wfp.Process#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	org.mcmaster.workflowplus.wfp.Process getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(org.mcmaster.workflowplus.wfp.Process value);

	/**
	 * Returns the value of the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Src</em>' attribute.
	 * @see #setMultAtSrc(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_MultAtSrc()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getMultAtSrc <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Src</em>' attribute.
	 * @see #getMultAtSrc()
	 * @generated
	 */
	void setMultAtSrc(String value);

	/**
	 * Returns the value of the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #setMultAtTgt(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Outport Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc <em>Output Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outport Src</em>' reference.
	 * @see #setOutportSrc(OutPort)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_OutportSrc()
	 * @see org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc
	 * @model opposite="outputSrc"
	 * @generated
	 */
	OutPort getOutportSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getOutportSrc <em>Outport Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outport Src</em>' reference.
	 * @see #getOutportSrc()
	 * @generated
	 */
	void setOutportSrc(OutPort value);

	/**
	 * Returns the value of the '<em><b>Outport Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt <em>Output Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outport Tgt</em>' reference.
	 * @see #setOutportTgt(OutPort)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getOutput_OutportTgt()
	 * @see org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt
	 * @model opposite="outputTgt"
	 * @generated
	 */
	OutPort getOutportTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Output#getOutportTgt <em>Outport Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outport Tgt</em>' reference.
	 * @see #getOutportTgt()
	 * @generated
	 */
	void setOutportTgt(OutPort value);

} // Output
