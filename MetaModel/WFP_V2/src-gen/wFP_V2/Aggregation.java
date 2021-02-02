/**
 */
package wFP_V2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Aggregation#getLabelAtTgt <em>Label At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Aggregation#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Aggregation#getConsists <em>Consists</em>}</li>
 *   <li>{@link wFP_V2.Aggregation#getConsistedOf <em>Consisted Of</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends Reference {
	/**
	 * Returns the value of the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label At Tgt</em>' attribute.
	 * @see #setLabelAtTgt(String)
	 * @see wFP_V2.WFP_V2Package#getAggregation_LabelAtTgt()
	 * @model
	 * @generated
	 */
	String getLabelAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getLabelAtTgt <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label At Tgt</em>' attribute.
	 * @see #getLabelAtTgt()
	 * @generated
	 */
	void setLabelAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #setMultAtTgt(String)
	 * @see wFP_V2.WFP_V2Package#getAggregation_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

	/**
	 * Returns the value of the '<em><b>Consists</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists</em>' reference.
	 * @see #setConsists(Node)
	 * @see wFP_V2.WFP_V2Package#getAggregation_Consists()
	 * @model required="true"
	 * @generated
	 */
	Node getConsists();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getConsists <em>Consists</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consists</em>' reference.
	 * @see #getConsists()
	 * @generated
	 */
	void setConsists(Node value);

	/**
	 * Returns the value of the '<em><b>Consisted Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consisted Of</em>' reference.
	 * @see #setConsistedOf(Node)
	 * @see wFP_V2.WFP_V2Package#getAggregation_ConsistedOf()
	 * @model required="true"
	 * @generated
	 */
	Node getConsistedOf();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getConsistedOf <em>Consisted Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consisted Of</em>' reference.
	 * @see #getConsistedOf()
	 * @generated
	 */
	void setConsistedOf(Node value);

} // Aggregation
