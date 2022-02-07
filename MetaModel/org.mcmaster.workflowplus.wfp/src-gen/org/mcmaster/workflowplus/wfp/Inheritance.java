/**
 */
package org.mcmaster.workflowplus.wfp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Inheritance#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Inheritance#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Reference {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInheritance_Src()
	 * @see org.mcmaster.workflowplus.wfp.Node#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Inheritance#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Node#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getInheritance_Tgt()
	 * @see org.mcmaster.workflowplus.wfp.Node#getChild
	 * @model opposite="child" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Inheritance#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

} // Inheritance
