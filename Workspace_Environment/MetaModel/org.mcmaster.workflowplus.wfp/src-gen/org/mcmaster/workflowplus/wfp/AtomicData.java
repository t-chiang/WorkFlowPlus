/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.AtomicData#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.AtomicData#isIsNormative <em>Is Normative</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicData()
 * @model
 * @generated
 */
public interface AtomicData extends Data {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicData_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Is Normative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Normative</em>' attribute.
	 * @see #setIsNormative(boolean)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getAtomicData_IsNormative()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNormative();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.AtomicData#isIsNormative <em>Is Normative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Normative</em>' attribute.
	 * @see #isIsNormative()
	 * @generated
	 */
	void setIsNormative(boolean value);

} // AtomicData
