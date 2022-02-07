/**
 */
package org.mcmaster.workflowplus.wfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Argument#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Argument#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Argument#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Argument#getConstructedBy <em>Constructed By</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Argument#getConstructs <em>Constructs</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends Node {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Argument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntactic</em>' attribute.
	 * @see #setSyntactic(boolean)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument_Syntactic()
	 * @model required="true"
	 * @generated
	 */
	boolean isSyntactic();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Argument#isSyntactic <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntactic</em>' attribute.
	 * @see #isSyntactic()
	 * @generated
	 */
	void setSyntactic(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Constraint#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument_Constraint()
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getArgument
	 * @model opposite="argument" required="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Constructed By</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Argument}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Argument#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructed By</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument_ConstructedBy()
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstructs
	 * @model opposite="constructs"
	 * @generated
	 */
	EList<Argument> getConstructedBy();

	/**
	 * Returns the value of the '<em><b>Constructs</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Argument}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Argument#getConstructedBy <em>Constructed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructs</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getArgument_Constructs()
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstructedBy
	 * @model opposite="constructedBy"
	 * @generated
	 */
	EList<Argument> getConstructs();

} // Argument
