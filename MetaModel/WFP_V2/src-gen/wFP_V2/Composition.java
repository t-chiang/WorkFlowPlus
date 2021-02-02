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
 *   <li>{@link wFP_V2.Composition#getComposes <em>Composes</em>}</li>
 *   <li>{@link wFP_V2.Composition#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link wFP_V2.Composition#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Composition#getLabelAtTgt <em>Label At Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Reference {
	/**
	 * Returns the value of the '<em><b>Composes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' reference.
	 * @see #setComposes(Node)
	 * @see wFP_V2.WFP_V2Package#getComposition_Composes()
	 * @model required="true"
	 * @generated
	 */
	Node getComposes();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getComposes <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composes</em>' reference.
	 * @see #getComposes()
	 * @generated
	 */
	void setComposes(Node value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference.
	 * @see #setComposedOf(Node)
	 * @see wFP_V2.WFP_V2Package#getComposition_ComposedOf()
	 * @model required="true"
	 * @generated
	 */
	Node getComposedOf();

	/**
	 * Sets the value of the '{@link wFP_V2.Composition#getComposedOf <em>Composed Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Of</em>' reference.
	 * @see #getComposedOf()
	 * @generated
	 */
	void setComposedOf(Node value);

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

} // Composition
