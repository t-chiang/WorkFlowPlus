/**
 */
package wFP_V2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Inheritance#getChild <em>Child</em>}</li>
 *   <li>{@link wFP_V2.Inheritance#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Reference {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Node)
	 * @see wFP_V2.WFP_V2Package#getInheritance_Child()
	 * @model required="true"
	 * @generated
	 */
	Node getChild();

	/**
	 * Sets the value of the '{@link wFP_V2.Inheritance#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Node value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Node)
	 * @see wFP_V2.WFP_V2Package#getInheritance_Parent()
	 * @model required="true"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link wFP_V2.Inheritance#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

} // Inheritance
