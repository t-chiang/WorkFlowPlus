/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Data_Definition#getData <em>Data</em>}</li>
 *   <li>{@link wFP_V2.Data_Definition#isIsNormative <em>Is Normative</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getData_Definition()
 * @model
 * @generated
 */
public interface Data_Definition extends Data {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getData_Definition_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Is Normative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Normative</em>' attribute.
	 * @see #setIsNormative(boolean)
	 * @see wFP_V2.WFP_V2Package#getData_Definition_IsNormative()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsNormative();

	/**
	 * Sets the value of the '{@link wFP_V2.Data_Definition#isIsNormative <em>Is Normative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Normative</em>' attribute.
	 * @see #isIsNormative()
	 * @generated
	 */
	void setIsNormative(boolean value);

} // Data_Definition
