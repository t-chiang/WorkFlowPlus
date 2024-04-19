/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.WorkFlowPlus#getNode <em>Node</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.WorkFlowPlus#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlowPlus()
 * @model
 * @generated
 */
public interface WorkFlowPlus extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlowPlus_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlowPlus_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

} // WorkFlowPlus
