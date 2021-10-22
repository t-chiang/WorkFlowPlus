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
 *   <li>{@link wFP_V2.Input#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.Input#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.Input#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.Input#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getInput()
 * @model
 * @generated
 */
public interface Input extends Reference {
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

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Data#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Data)
	 * @see wFP_V2.WFP_V2Package#getInput_Src()
	 * @see wFP_V2.Data#getInput
	 * @model opposite="input" required="true"
	 * @generated
	 */
	Data getSrc();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Data value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Process#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(wFP_V2.Process)
	 * @see wFP_V2.WFP_V2Package#getInput_Tgt()
	 * @see wFP_V2.Process#getInput
	 * @model opposite="input" required="true"
	 * @generated
	 */
	wFP_V2.Process getTgt();

	/**
	 * Sets the value of the '{@link wFP_V2.Input#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(wFP_V2.Process value);

} // Input
