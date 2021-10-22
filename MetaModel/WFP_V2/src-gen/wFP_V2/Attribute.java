/**
 */
package wFP_V2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link wFP_V2.Attribute#isIsExecutable <em>Is Executable</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wFP_V2.WFP_V2Package#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wFP_V2.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see wFP_V2.WFP_V2Package#getAttribute_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wFP_V2.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Executable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Executable</em>' attribute.
	 * @see #setIsExecutable(boolean)
	 * @see wFP_V2.WFP_V2Package#getAttribute_IsExecutable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsExecutable();

	/**
	 * Sets the value of the '{@link wFP_V2.Attribute#isIsExecutable <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Executable</em>' attribute.
	 * @see #isIsExecutable()
	 * @generated
	 */
	void setIsExecutable(boolean value);

} // Attribute
