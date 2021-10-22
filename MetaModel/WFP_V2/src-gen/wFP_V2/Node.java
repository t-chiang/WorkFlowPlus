/**
 */
package wFP_V2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.Node#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link wFP_V2.Node#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link wFP_V2.Node#getReify_association <em>Reify association</em>}</li>
 *   <li>{@link wFP_V2.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link wFP_V2.Node#getChild <em>Child</em>}</li>
 *   <li>{@link wFP_V2.Node#getAssociation_tgt <em>Association tgt</em>}</li>
 *   <li>{@link wFP_V2.Node#getAssociation_src <em>Association src</em>}</li>
 *   <li>{@link wFP_V2.Node#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link wFP_V2.Node#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @see wFP_V2.WFP_V2Package#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Aggregation}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Aggregation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_Aggregate()
	 * @see wFP_V2.Aggregation#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Aggregation> getAggregate();

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Aggregation}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Aggregation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_Aggregation()
	 * @see wFP_V2.Aggregation#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Aggregation> getAggregation();

	/**
	 * Returns the value of the '<em><b>Reify association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Reify_Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reify association</em>' reference.
	 * @see #setReify_association(Reify_Association)
	 * @see wFP_V2.WFP_V2Package#getNode_Reify_association()
	 * @see wFP_V2.Reify_Association#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	Reify_Association getReify_association();

	/**
	 * Sets the value of the '{@link wFP_V2.Node#getReify_association <em>Reify association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reify association</em>' reference.
	 * @see #getReify_association()
	 * @generated
	 */
	void setReify_association(Reify_Association value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Inheritance}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_Child()
	 * @see wFP_V2.Inheritance#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Inheritance> getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Inheritance)
	 * @see wFP_V2.WFP_V2Package#getNode_Parent()
	 * @see wFP_V2.Inheritance#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Inheritance getParent();

	/**
	 * Sets the value of the '{@link wFP_V2.Node#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Association src</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Association}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association src</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_Association_src()
	 * @see wFP_V2.Association#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Association> getAssociation_src();

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Composition}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_ComposedOf()
	 * @see wFP_V2.Composition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Composition> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Association tgt</b></em>' reference list.
	 * The list contents are of type {@link wFP_V2.Association}.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association tgt</em>' reference list.
	 * @see wFP_V2.WFP_V2Package#getNode_Association_tgt()
	 * @see wFP_V2.Association#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Association> getAssociation_tgt();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link wFP_V2.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference.
	 * @see #setComposition(Composition)
	 * @see wFP_V2.WFP_V2Package#getNode_Composition()
	 * @see wFP_V2.Composition#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link wFP_V2.Node#getComposition <em>Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);
} // Node
