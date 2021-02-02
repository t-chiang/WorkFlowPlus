/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Flow Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.WorkFlowPlus#getProcess <em>Process</em>}</li>
 *   <li>{@link wFP_V2.WorkFlowPlus#getData <em>Data</em>}</li>
 *   <li>{@link wFP_V2.WorkFlowPlus#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link wFP_V2.WorkFlowPlus#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getWorkFlowPlus()
 * @model
 * @generated
 */
public interface WorkFlowPlus extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getWorkFlowPlus_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<wFP_V2.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getWorkFlowPlus_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getWorkFlowPlus_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link wFP_V2.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see wFP_V2.WFP_V2Package#getWorkFlowPlus_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

} // WorkFlowPlus
