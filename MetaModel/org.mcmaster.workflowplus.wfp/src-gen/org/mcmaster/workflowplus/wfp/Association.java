/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtSrc <em>Label At Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtTgt <em>Label At Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Reference {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Node#getAssociationTgt <em>Association Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_Src()
	 * @see org.mcmaster.workflowplus.wfp.Node#getAssociationTgt
	 * @model opposite="associationTgt" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Node#getAssociationSrc <em>Association Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_Tgt()
	 * @see org.mcmaster.workflowplus.wfp.Node#getAssociationSrc
	 * @model opposite="associationSrc" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

	/**
	 * Returns the value of the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Src</em>' attribute.
	 * @see #setMultAtSrc(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_MultAtSrc()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getMultAtSrc <em>Mult At Src</em>}' attribute.
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
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Label At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label At Src</em>' attribute.
	 * @see #setLabelAtSrc(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_LabelAtSrc()
	 * @model
	 * @generated
	 */
	String getLabelAtSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtSrc <em>Label At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label At Src</em>' attribute.
	 * @see #getLabelAtSrc()
	 * @generated
	 */
	void setLabelAtSrc(String value);

	/**
	 * Returns the value of the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label At Tgt</em>' attribute.
	 * @see #setLabelAtTgt(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAssociation_LabelAtTgt()
	 * @model
	 * @generated
	 */
	String getLabelAtTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtTgt <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label At Tgt</em>' attribute.
	 * @see #getLabelAtTgt()
	 * @generated
	 */
	void setLabelAtTgt(String value);

} // Association
