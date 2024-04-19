/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.workflowplus.wfp.Association;
import org.mcmaster.workflowplus.wfp.Composition;
import org.mcmaster.workflowplus.wfp.Inheritance;
import org.mcmaster.workflowplus.wfp.Node;
import org.mcmaster.workflowplus.wfp.ReifyAssociation;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getAssociationTgt <em>Association Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getAssociationSrc <em>Association Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl#getReifyassociation <em>Reifyassociation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Inheritance parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Inheritance> child;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> composedOf;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected Composition composition;

	/**
	 * The cached value of the '{@link #getAssociationTgt() <em>Association Tgt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationTgt()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associationTgt;

	/**
	 * The cached value of the '{@link #getAssociationSrc() <em>Association Src</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationSrc()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associationSrc;

	/**
	 * The cached value of the '{@link #getReifyassociation() <em>Reifyassociation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReifyassociation()
	 * @generated
	 * @ordered
	 */
	protected ReifyAssociation reifyassociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (Inheritance) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.NODE__PARENT, oldParent,
							parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Inheritance newParent, NotificationChain msgs) {
		Inheritance oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__PARENT,
					oldParent, newParent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Inheritance newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, WfpPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, WfpPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inheritance> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList<Inheritance>(Inheritance.class, this, WfpPackage.NODE__CHILD,
					WfpPackage.INHERITANCE__TGT);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectWithInverseResolvingEList<Composition>(Composition.class, this,
					WfpPackage.NODE__COMPOSED_OF, WfpPackage.COMPOSITION__SRC);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getComposition() {
		if (composition != null && composition.eIsProxy()) {
			InternalEObject oldComposition = (InternalEObject) composition;
			composition = (Composition) eResolveProxy(oldComposition);
			if (composition != oldComposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.NODE__COMPOSITION,
							oldComposition, composition));
			}
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition basicGetComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		Composition oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__COMPOSITION,
					oldComposition, newComposition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Composition newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject) composition).eInverseRemove(this, WfpPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject) newComposition).eInverseAdd(this, WfpPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__COMPOSITION, newComposition,
					newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociationTgt() {
		if (associationTgt == null) {
			associationTgt = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					WfpPackage.NODE__ASSOCIATION_TGT, WfpPackage.ASSOCIATION__SRC);
		}
		return associationTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociationSrc() {
		if (associationSrc == null) {
			associationSrc = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					WfpPackage.NODE__ASSOCIATION_SRC, WfpPackage.ASSOCIATION__TGT);
		}
		return associationSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifyAssociation getReifyassociation() {
		if (reifyassociation != null && reifyassociation.eIsProxy()) {
			InternalEObject oldReifyassociation = (InternalEObject) reifyassociation;
			reifyassociation = (ReifyAssociation) eResolveProxy(oldReifyassociation);
			if (reifyassociation != oldReifyassociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.NODE__REIFYASSOCIATION,
							oldReifyassociation, reifyassociation));
			}
		}
		return reifyassociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReifyAssociation basicGetReifyassociation() {
		return reifyassociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReifyassociation(ReifyAssociation newReifyassociation, NotificationChain msgs) {
		ReifyAssociation oldReifyassociation = reifyassociation;
		reifyassociation = newReifyassociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.NODE__REIFYASSOCIATION, oldReifyassociation, newReifyassociation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReifyassociation(ReifyAssociation newReifyassociation) {
		if (newReifyassociation != reifyassociation) {
			NotificationChain msgs = null;
			if (reifyassociation != null)
				msgs = ((InternalEObject) reifyassociation).eInverseRemove(this, WfpPackage.REIFY_ASSOCIATION__TGT,
						ReifyAssociation.class, msgs);
			if (newReifyassociation != null)
				msgs = ((InternalEObject) newReifyassociation).eInverseAdd(this, WfpPackage.REIFY_ASSOCIATION__TGT,
						ReifyAssociation.class, msgs);
			msgs = basicSetReifyassociation(newReifyassociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.NODE__REIFYASSOCIATION,
					newReifyassociation, newReifyassociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.NODE__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, WfpPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			return basicSetParent((Inheritance) otherEnd, msgs);
		case WfpPackage.NODE__CHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChild()).basicAdd(otherEnd, msgs);
		case WfpPackage.NODE__COMPOSED_OF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComposedOf()).basicAdd(otherEnd, msgs);
		case WfpPackage.NODE__COMPOSITION:
			if (composition != null)
				msgs = ((InternalEObject) composition).eInverseRemove(this, WfpPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			return basicSetComposition((Composition) otherEnd, msgs);
		case WfpPackage.NODE__ASSOCIATION_TGT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociationTgt()).basicAdd(otherEnd, msgs);
		case WfpPackage.NODE__ASSOCIATION_SRC:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociationSrc()).basicAdd(otherEnd, msgs);
		case WfpPackage.NODE__REIFYASSOCIATION:
			if (reifyassociation != null)
				msgs = ((InternalEObject) reifyassociation).eInverseRemove(this, WfpPackage.REIFY_ASSOCIATION__TGT,
						ReifyAssociation.class, msgs);
			return basicSetReifyassociation((ReifyAssociation) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.NODE__PARENT:
			return basicSetParent(null, msgs);
		case WfpPackage.NODE__CHILD:
			return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
		case WfpPackage.NODE__COMPOSED_OF:
			return ((InternalEList<?>) getComposedOf()).basicRemove(otherEnd, msgs);
		case WfpPackage.NODE__COMPOSITION:
			return basicSetComposition(null, msgs);
		case WfpPackage.NODE__ASSOCIATION_TGT:
			return ((InternalEList<?>) getAssociationTgt()).basicRemove(otherEnd, msgs);
		case WfpPackage.NODE__ASSOCIATION_SRC:
			return ((InternalEList<?>) getAssociationSrc()).basicRemove(otherEnd, msgs);
		case WfpPackage.NODE__REIFYASSOCIATION:
			return basicSetReifyassociation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WfpPackage.NODE__NAME:
			return getName();
		case WfpPackage.NODE__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case WfpPackage.NODE__CHILD:
			return getChild();
		case WfpPackage.NODE__COMPOSED_OF:
			return getComposedOf();
		case WfpPackage.NODE__COMPOSITION:
			if (resolve)
				return getComposition();
			return basicGetComposition();
		case WfpPackage.NODE__ASSOCIATION_TGT:
			return getAssociationTgt();
		case WfpPackage.NODE__ASSOCIATION_SRC:
			return getAssociationSrc();
		case WfpPackage.NODE__REIFYASSOCIATION:
			if (resolve)
				return getReifyassociation();
			return basicGetReifyassociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WfpPackage.NODE__NAME:
			setName((String) newValue);
			return;
		case WfpPackage.NODE__PARENT:
			setParent((Inheritance) newValue);
			return;
		case WfpPackage.NODE__CHILD:
			getChild().clear();
			getChild().addAll((Collection<? extends Inheritance>) newValue);
			return;
		case WfpPackage.NODE__COMPOSED_OF:
			getComposedOf().clear();
			getComposedOf().addAll((Collection<? extends Composition>) newValue);
			return;
		case WfpPackage.NODE__COMPOSITION:
			setComposition((Composition) newValue);
			return;
		case WfpPackage.NODE__ASSOCIATION_TGT:
			getAssociationTgt().clear();
			getAssociationTgt().addAll((Collection<? extends Association>) newValue);
			return;
		case WfpPackage.NODE__ASSOCIATION_SRC:
			getAssociationSrc().clear();
			getAssociationSrc().addAll((Collection<? extends Association>) newValue);
			return;
		case WfpPackage.NODE__REIFYASSOCIATION:
			setReifyassociation((ReifyAssociation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WfpPackage.NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WfpPackage.NODE__PARENT:
			setParent((Inheritance) null);
			return;
		case WfpPackage.NODE__CHILD:
			getChild().clear();
			return;
		case WfpPackage.NODE__COMPOSED_OF:
			getComposedOf().clear();
			return;
		case WfpPackage.NODE__COMPOSITION:
			setComposition((Composition) null);
			return;
		case WfpPackage.NODE__ASSOCIATION_TGT:
			getAssociationTgt().clear();
			return;
		case WfpPackage.NODE__ASSOCIATION_SRC:
			getAssociationSrc().clear();
			return;
		case WfpPackage.NODE__REIFYASSOCIATION:
			setReifyassociation((ReifyAssociation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WfpPackage.NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WfpPackage.NODE__PARENT:
			return parent != null;
		case WfpPackage.NODE__CHILD:
			return child != null && !child.isEmpty();
		case WfpPackage.NODE__COMPOSED_OF:
			return composedOf != null && !composedOf.isEmpty();
		case WfpPackage.NODE__COMPOSITION:
			return composition != null;
		case WfpPackage.NODE__ASSOCIATION_TGT:
			return associationTgt != null && !associationTgt.isEmpty();
		case WfpPackage.NODE__ASSOCIATION_SRC:
			return associationSrc != null && !associationSrc.isEmpty();
		case WfpPackage.NODE__REIFYASSOCIATION:
			return reifyassociation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
