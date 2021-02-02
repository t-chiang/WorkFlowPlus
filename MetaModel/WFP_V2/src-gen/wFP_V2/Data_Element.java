/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Data_Element#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link wFP_V2.Data_Element#isIsNormative <em>Is Normative</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getData_Element()
 * @model
 * @generated
 */
public interface Data_Element extends Data {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getData_Element_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Is Normative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Normative</em>' attribute.
	 * @see #setIsNormative(boolean)
	 * @see wFP_V2.WFP_V2Package#getData_Element_IsNormative()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsNormative();

	/**
	 * Sets the value of the '{@link wFP_V2.Data_Element#isIsNormative <em>Is Normative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Normative</em>' attribute.
	 * @see #isIsNormative()
	 * @generated
	 */
	void setIsNormative(boolean value);

} // Data_Element
