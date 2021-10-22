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
 *   <li>{@link wFP_V2.Inheritance#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.Inheritance#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Reference {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see wFP_V2.WFP_V2Package#getInheritance_Src()
	 * @see wFP_V2.Node#getParent
	 * @model opposite="parent" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Inheritance#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see wFP_V2.WFP_V2Package#getInheritance_Tgt()
	 * @see wFP_V2.Node#getChild
	 * @model opposite="child" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Inheritance#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

} // Inheritance
