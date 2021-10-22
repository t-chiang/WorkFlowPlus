/**
 */
package wFP_V2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Composition#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Composition#getLabelAtTgt <em>Label At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Composition#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.Composition#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Reference {
	/**
	 * Returns the value of the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #setMultAtTgt(String)
	 * @see wFP_V2.WFP_V2Package#getComposition_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label At Tgt</em>' attribute.
	 * @see #setLabelAtTgt(String)
	 * @see wFP_V2.WFP_V2Package#getComposition_LabelAtTgt()
	 * @model
	 * @generated
	 */
	String getLabelAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getLabelAtTgt <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label At Tgt</em>' attribute.
	 * @see #getLabelAtTgt()
	 * @generated
	 */
	void setLabelAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see wFP_V2.WFP_V2Package#getComposition_Src()
	 * @see wFP_V2.Node#getComposedOf
	 * @model opposite="composedOf" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see wFP_V2.WFP_V2Package#getComposition_Tgt()
	 * @see wFP_V2.Node#getComposition
	 * @model opposite="composition" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

} // Composition
