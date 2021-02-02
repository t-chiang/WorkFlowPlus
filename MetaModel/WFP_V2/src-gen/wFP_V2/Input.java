/**
 */
package wFP_V2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Input#getSrc_data <em>Src data</em>}</li>
 *   <li>{@link wFP_V2.Input#getTgt_process <em>Tgt process</em>}</li>
 *   <li>{@link wFP_V2.Input#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.Input#getMultAtTgt <em>Mult At Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getInput()
 * @model
 * @generated
 */
public interface Input extends Reference {
	/**
	 * Returns the value of the '<em><b>Src data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src data</em>' reference.
	 * @see #setSrc_data(Data)
	 * @see wFP_V2.WFP_V2Package#getInput_Src_data()
	 * @model required="true"
	 * @generated
	 */
	Data getSrc_data();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getSrc_data <em>Src data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src data</em>' reference.
	 * @see #getSrc_data()
	 * @generated
	 */
	void setSrc_data(Data value);

	/**
	 * Returns the value of the '<em><b>Tgt process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt process</em>' reference.
	 * @see #setTgt_process(wFP_V2.Process)
	 * @see wFP_V2.WFP_V2Package#getInput_Tgt_process()
	 * @model required="true"
	 * @generated
	 */
	wFP_V2.Process getTgt_process();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getTgt_process <em>Tgt process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt process</em>' reference.
	 * @see #getTgt_process()
	 * @generated
	 */
	void setTgt_process(wFP_V2.Process value);

	/**
	 * Returns the value of the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Src</em>' attribute.
	 * @see #setMultAtSrc(String)
	 * @see wFP_V2.WFP_V2Package#getInput_MultAtSrc()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getMultAtSrc <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Src</em>' attribute.
	 * @see #getMultAtSrc()
	 * @generated
	 */
	void setMultAtSrc(String value);

	/**
	 * Returns the value of the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #setMultAtTgt(String)
	 * @see wFP_V2.WFP_V2Package#getInput_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

} // Input
