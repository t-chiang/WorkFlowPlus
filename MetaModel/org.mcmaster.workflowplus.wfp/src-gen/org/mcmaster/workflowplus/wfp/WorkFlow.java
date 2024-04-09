/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.WorkFlow#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.WorkFlow#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlow()
 * @model
 * @generated
 */
public interface WorkFlow extends WorkFlowPlusRoot {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlow_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.WorkFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getWorkFlow_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

} // WorkFlow
