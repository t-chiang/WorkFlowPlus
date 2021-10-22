/**
 */
package wFP_V2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Reference#getReify_association <em>Reify association</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends EObject {

	/**
	 * Returns the value of the '<em><b>Reify association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Reify_Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reify association</em>' reference.
	 * @see #setReify_association(Reify_Association)
	 * @see wFP_V2.WFP_V2Package#getReference_Reify_association()
	 * @see wFP_V2.Reify_Association#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Reify_Association getReify_association();

	/**
	 * Sets the value of the '{@link wFP_V2.Reference#getReify_association <em>Reify association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reify association</em>' reference.
	 * @see #getReify_association()
	 * @generated
	 */
	void setReify_association(Reify_Association value);
} // Reference
