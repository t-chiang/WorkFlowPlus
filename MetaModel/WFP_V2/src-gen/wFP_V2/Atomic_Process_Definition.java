/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Atomic_Process_Definition#isIsReview <em>Is Review</em>}</li>
 *   <li>{@link wFP_V2.Atomic_Process_Definition#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link wFP_V2.Atomic_Process_Definition#isIsQuery <em>Is Query</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getAtomic_Process_Definition()
 * @model
 * @generated
 */
public interface Atomic_Process_Definition extends wFP_V2.Process {
	/**
	 * Returns the value of the '<em><b>Is Review</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Review</em>' attribute.
	 * @see #setIsReview(boolean)
	 * @see wFP_V2.WFP_V2Package#getAtomic_Process_Definition_IsReview()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsReview();

	/**
	 * Sets the value of the '{@link wFP_V2.Atomic_Process_Definition#isIsReview <em>Is Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Review</em>' attribute.
	 * @see #isIsReview()
	 * @generated
	 */
	void setIsReview(boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getAtomic_Process_Definition_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see wFP_V2.WFP_V2Package#getAtomic_Process_Definition_IsQuery()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link wFP_V2.Atomic_Process_Definition#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

} // Atomic_Process_Definition
