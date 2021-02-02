/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Composed_Process_Definition#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getComposed_Process_Definition()
 * @model
 * @generated
 */
public interface Composed_Process_Definition extends wFP_V2.Process {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getComposed_Process_Definition_Process()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<wFP_V2.Process> getProcess();

} // Composed_Process_Definition
