/**
 */
package wFP_V2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Output#getSrc_process <em>Src process</em>}</li>
 *   <li>{@link wFP_V2.Output#getTgt_data <em>Tgt data</em>}</li>
 *   <li>{@link wFP_V2.Output#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.Output#getMultAtTgt <em>Mult At Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getOutput()
 * @model
 * @generated
 */
public interface Output extends Reference {
	/**
	 * Returns the value of the '<em><b>Src process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src process</em>' reference.
	 * @see #setSrc_process(wFP_V2.Process)
	 * @see wFP_V2.WFP_V2Package#getOutput_Src_process()
	 * @model required="true"
	 * @generated
	 */
	wFP_V2.Process getSrc_process();

	/**
	 * Sets the value of the '{@link wFP_V2.Output#getSrc_process <em>Src process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src process</em>' reference.
	 * @see #getSrc_process()
	 * @generated
	 */
	void setSrc_process(wFP_V2.Process value);

	/**
	 * Returns the value of the '<em><b>Tgt data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt data</em>' reference.
	 * @see #setTgt_data(Data)
	 * @see wFP_V2.WFP_V2Package#getOutput_Tgt_data()
	 * @model required="true"
	 * @generated
	 */
	Data getTgt_data();

	/**
	 * Sets the value of the '{@link wFP_V2.Output#getTgt_data <em>Tgt data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt data</em>' reference.
	 * @see #getTgt_data()
	 * @generated
	 */
	void setTgt_data(Data value);

	/**
	 * Returns the value of the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mult At Src</em>' attribute.
	 * @see #setMultAtSrc(String)
	 * @see wFP_V2.WFP_V2Package#getOutput_MultAtSrc()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Output#getMultAtSrc <em>Mult At Src</em>}' attribute.
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
	 * @see wFP_V2.WFP_V2Package#getOutput_MultAtTgt()
	 * @model required="true"
	 * @generated
	 */
	String getMultAtTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Output#getMultAtTgt <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mult At Tgt</em>' attribute.
	 * @see #getMultAtTgt()
	 * @generated
	 */
	void setMultAtTgt(String value);

} // Output
