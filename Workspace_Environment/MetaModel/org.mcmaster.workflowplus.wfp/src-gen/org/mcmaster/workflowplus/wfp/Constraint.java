/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Constraint#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Constraint#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Constraint#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Constraint#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends Node {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Constraint#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntactic</em>' attribute.
	 * @see #setSyntactic(boolean)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint_Syntactic()
	 * @model required="true"
	 * @generated
	 */
	boolean isSyntactic();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Constraint#isSyntactic <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntactic</em>' attribute.
	 * @see #isSyntactic()
	 * @generated
	 */
	void setSyntactic(boolean value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Argument}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Argument#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint_Argument()
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstraint
	 * @model opposite="constraint" required="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint_Reference()
	 * @model
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getConstraint_Node()
	 * @model
	 * @generated
	 */
	EList<Node> getNode();

} // Constraint
