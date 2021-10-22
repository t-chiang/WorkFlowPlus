/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.Constraint#getNode <em>Node</em>}</li>
 *   <li>{@link wFP_V2.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link wFP_V2.Constraint#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link wFP_V2.Constraint#getArgument <em>Argument</em>}</li>
 *   <li>{@link wFP_V2.Constraint#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wFP_V2.WFP_V2Package#getConstraint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wFP_V2.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getConstraint_Node()
	 * @model
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see wFP_V2.WFP_V2Package#getConstraint_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link wFP_V2.Constraint#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Syntactic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntactic</em>' attribute.
	 * @see #setSyntactic(boolean)
	 * @see wFP_V2.WFP_V2Package#getConstraint_Syntactic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSyntactic();

	/**
	 * Sets the value of the '{@link wFP_V2.Constraint#isSyntactic <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntactic</em>' attribute.
	 * @see #isSyntactic()
	 * @generated
	 */
	void setSyntactic(boolean value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Argument}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Argument#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getConstraint_Argument()
	 * @see wFP_V2.Argument#getConstraint
	 * @model opposite="constraint" required="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getConstraint_Reference()
	 * @model
	 * @generated
	 */
	EList<Reference> getReference();

} // Constraint
