/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Argument#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.Argument#getDescription <em>Description</em>}</li>
 *   <li>{@link wFP_V2.Argument#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link wFP_V2.Argument#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link wFP_V2.Argument#getConstructedBy <em>Constructed By</em>}</li>
 *   <li>{@link wFP_V2.Argument#isSyntactic <em>Syntactic</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wFP_V2.WFP_V2Package#getArgument_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wFP_V2.Argument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wFP_V2.WFP_V2Package#getArgument_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wFP_V2.Argument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Constraint}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Constraint#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getArgument_Constraint()
	 * @see wFP_V2.Constraint#getArgument
	 * @model opposite="argument" required="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Constructs</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Argument}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Argument#getConstructedBy <em>Constructed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructs</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getArgument_Constructs()
	 * @see wFP_V2.Argument#getConstructedBy
	 * @model opposite="constructedBy"
	 * @generated
	 */
	EList<Argument> getConstructs();

	/**
	 * Returns the value of the '<em><b>Constructed By</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Argument}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Argument#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructed By</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getArgument_ConstructedBy()
	 * @see wFP_V2.Argument#getConstructs
	 * @model opposite="constructs"
	 * @generated
	 */
	EList<Argument> getConstructedBy();

	/**
	 * Returns the value of the '<em><b>Syntactic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syntactic</em>' attribute.
	 * @see #setSyntactic(boolean)
	 * @see wFP_V2.WFP_V2Package#getArgument_Syntactic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSyntactic();

	/**
	 * Sets the value of the '{@link wFP_V2.Argument#isSyntactic <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntactic</em>' attribute.
	 * @see #isSyntactic()
	 * @generated
	 */
	void setSyntactic(boolean value);

} // Argument
