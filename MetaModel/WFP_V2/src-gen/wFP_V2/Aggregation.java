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
 *   <li>{@link wFP_V2.Aggregation#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.Aggregation#getTgt <em>Tgt</em>}</li>
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
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see wFP_V2.WFP_V2Package#getAggregation_Src()
	 * @see wFP_V2.Node#getAggregate
	 * @model opposite="aggregate" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Node#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see wFP_V2.WFP_V2Package#getAggregation_Tgt()
	 * @see wFP_V2.Node#getAggregation
	 * @model opposite="aggregation" required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Aggregation#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

} // Aggregation
