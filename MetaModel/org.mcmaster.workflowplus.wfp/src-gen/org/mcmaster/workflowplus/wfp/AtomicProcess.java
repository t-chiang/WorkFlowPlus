/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.AtomicProcess#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsReview <em>Is Review</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsQuery <em>Is Query</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicProcess()
 * @model
 * @generated
 */
public interface AtomicProcess extends org.mcmaster.workflowplus.wfp.Process {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicProcess_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Is Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Review</em>' attribute.
	 * @see #setIsReview(boolean)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicProcess_IsReview()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReview();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsReview <em>Is Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Review</em>' attribute.
	 * @see #isIsReview()
	 * @generated
	 */
	void setIsReview(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicProcess_IsQuery()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

} // AtomicProcess
