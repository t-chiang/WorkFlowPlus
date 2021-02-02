/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Automatic_Process_Definition#getFormalDescription <em>Formal Description</em>}</li>
 *   <li>{@link wFP_V2.Automatic_Process_Definition#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getAutomatic_Process_Definition()
 * @model
 * @generated
 */
public interface Automatic_Process_Definition extends wFP_V2.Process {
	/**
	 * Returns the value of the '<em><b>Formal Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Description</em>' attribute.
	 * @see #setFormalDescription(String)
	 * @see wFP_V2.WFP_V2Package#getAutomatic_Process_Definition_FormalDescription()
	 * @model required="true"
	 * @generated
	 */
	String getFormalDescription();

	/**
	 * Sets the value of the '{@link wFP_V2.Automatic_Process_Definition#getFormalDescription <em>Formal Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Description</em>' attribute.
	 * @see #getFormalDescription()
	 * @generated
	 */
	void setFormalDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getAutomatic_Process_Definition_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Automatic_Process_Definition
