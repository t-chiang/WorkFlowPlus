/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normative Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Normative_Data#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getNormative_Data()
 * @model
 * @generated
 */
public interface Normative_Data extends Data {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getNormative_Data_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Normative_Data
