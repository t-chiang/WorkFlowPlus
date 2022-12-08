/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reify Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getLabelAtTgt <em>Label At Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReifyAssociation()
 * @model
 * @generated
 */
public interface ReifyAssociation extends Reference {
	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Node#getReifyAssociation <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReifyAssociation_Tgt()
	 * @see org.mcmaster.workflowplus.wfp.Node#getReifyAssociation
	 * @model opposite="reifyAssociation" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Reference#getReifyassociation <em>Reifyassociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Reference)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReifyAssociation_Src()
	 * @see org.mcmaster.workflowplus.wfp.Reference#getReifyassociation
	 * @model opposite="reifyassociation" required="true"
	 * @generated
	 */
	Reference getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Reference value);

	/**
	 * Returns the value of the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #setMultAtTgt(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReifyAssociation_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label At Tgt</em>' attribute.
	 * @see #setLabelAtTgt(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReifyAssociation_LabelAtTgt()
	 * @model
	 * @generated
	 */
	String getLabelAtTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getLabelAtTgt <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label At Tgt</em>' attribute.
	 * @see #getLabelAtTgt()
	 * @generated
	 */
	void setLabelAtTgt(String value);

} // ReifyAssociation
