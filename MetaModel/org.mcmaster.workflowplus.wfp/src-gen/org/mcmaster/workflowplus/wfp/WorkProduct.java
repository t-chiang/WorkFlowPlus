/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.WorkProduct#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends Data {

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkProduct_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();
} // WorkProduct
