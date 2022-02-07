/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Reference#getReifyassociation <em>Reifyassociation</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reifyassociation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reifyassociation</em>' reference.
	 * @see #setReifyassociation(ReifyAssociation)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getReference_Reifyassociation()
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	ReifyAssociation getReifyassociation();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Reference#getReifyassociation <em>Reifyassociation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reifyassociation</em>' reference.
	 * @see #getReifyassociation()
	 * @generated
	 */
	void setReifyassociation(ReifyAssociation value);

} // Reference
