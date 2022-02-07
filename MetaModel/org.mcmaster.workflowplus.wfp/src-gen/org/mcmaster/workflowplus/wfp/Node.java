/**
 */
package org.mcmaster.workflowplus.wfp;

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
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getChild <em>Child</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getAssociationTgt <em>Association Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getAssociationSrc <em>Association Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.Node#getReifyassociation <em>Reifyassociation</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Inheritance)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_Parent()
	 * @see org.mcmaster.workflowplus.wfp.Inheritance#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Inheritance getParent();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Node#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Inheritance}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_Child()
	 * @see org.mcmaster.workflowplus.wfp.Inheritance#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Inheritance> getChild();

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Composition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_ComposedOf()
	 * @see org.mcmaster.workflowplus.wfp.Composition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Composition> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference.
	 * @see #setComposition(Composition)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_Composition()
	 * @see org.mcmaster.workflowplus.wfp.Composition#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Node#getComposition <em>Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Association Tgt</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Tgt</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_AssociationTgt()
	 * @see org.mcmaster.workflowplus.wfp.Association#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Association> getAssociationTgt();

	/**
	 * Returns the value of the '<em><b>Association Src</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.workflowplus.wfp.Association}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Src</em>' reference list.
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_AssociationSrc()
	 * @see org.mcmaster.workflowplus.wfp.Association#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	EList<Association> getAssociationSrc();

	/**
	 * Returns the value of the '<em><b>Reifyassociation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reifyassociation</em>' reference.
	 * @see #setReifyassociation(ReifyAssociation)
	 * @see org.mcmaster.workflowplus.wfp.WfpPackage#getNode_Reifyassociation()
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt
	 * @model opposite="tgt"
	 * @generated
	 */
	ReifyAssociation getReifyassociation();

	/**
	 * Sets the value of the '{@link org.mcmaster.workflowplus.wfp.Node#getReifyassociation <em>Reifyassociation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reifyassociation</em>' reference.
	 * @see #getReifyassociation()
	 * @generated
	 */
	void setReifyassociation(ReifyAssociation value);

} // Node
