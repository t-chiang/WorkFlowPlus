/**
 */
package wFP_V2.impl;

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
import wFP_V2.Aggregation;
import wFP_V2.Association;
import wFP_V2.Composition;
import wFP_V2.Inheritance;
import wFP_V2.Node;
import wFP_V2.Reify_Association;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.NodeImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getReify_association <em>Reify association</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getChild <em>Child</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getAssociation_tgt <em>Association tgt</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getAssociation_src <em>Association src</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link wFP_V2.impl.NodeImpl#getComposition <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregation> aggregate;
	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregation> aggregation;
	/**
	 * The cached value of the '{@link #getReify_association() <em>Reify association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReify_association()
	 * @generated
	 * @ordered
	 */
	protected Reify_Association reify_association;
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
	 * The cached value of the '{@link #getAssociation_tgt() <em>Association tgt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation_tgt()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association_tgt;
	/**
	 * The cached value of the '{@link #getAssociation_src() <em>Association src</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation_src()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association_src;
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
		return WFP_V2Package.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregation> getAggregate() {
		if (aggregate == null) {
			aggregate = new EObjectWithInverseResolvingEList<Aggregation>(Aggregation.class, this,
					WFP_V2Package.NODE__AGGREGATE, WFP_V2Package.AGGREGATION__SRC);
		}
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregation> getAggregation() {
		if (aggregation == null) {
			aggregation = new EObjectWithInverseResolvingEList<Aggregation>(Aggregation.class, this,
					WFP_V2Package.NODE__AGGREGATION, WFP_V2Package.AGGREGATION__TGT);
		}
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reify_Association getReify_association() {
		if (reify_association != null && reify_association.eIsProxy()) {
			InternalEObject oldReify_association = (InternalEObject) reify_association;
			reify_association = (Reify_Association) eResolveProxy(oldReify_association);
			if (reify_association != oldReify_association) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.NODE__REIFY_ASSOCIATION,
							oldReify_association, reify_association));
			}
		}
		return reify_association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reify_Association basicGetReify_association() {
		return reify_association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReify_association(Reify_Association newReify_association, NotificationChain msgs) {
		Reify_Association oldReify_association = reify_association;
		reify_association = newReify_association;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WFP_V2Package.NODE__REIFY_ASSOCIATION, oldReify_association, newReify_association);
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
	@Override
	public void setReify_association(Reify_Association newReify_association) {
		if (newReify_association != reify_association) {
			NotificationChain msgs = null;
			if (reify_association != null)
				msgs = ((InternalEObject) reify_association).eInverseRemove(this, WFP_V2Package.REIFY_ASSOCIATION__TGT,
						Reify_Association.class, msgs);
			if (newReify_association != null)
				msgs = ((InternalEObject) newReify_association).eInverseAdd(this, WFP_V2Package.REIFY_ASSOCIATION__TGT,
						Reify_Association.class, msgs);
			msgs = basicSetReify_association(newReify_association, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.NODE__REIFY_ASSOCIATION,
					newReify_association, newReify_association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Inheritance> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList<Inheritance>(Inheritance.class, this,
					WFP_V2Package.NODE__CHILD, WFP_V2Package.INHERITANCE__TGT);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (Inheritance) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.NODE__PARENT, oldParent,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFP_V2Package.NODE__PARENT,
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
	@Override
	public void setParent(Inheritance newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, WFP_V2Package.INHERITANCE__SRC,
						Inheritance.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, WFP_V2Package.INHERITANCE__SRC,
						Inheritance.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.NODE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation_src() {
		if (association_src == null) {
			association_src = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					WFP_V2Package.NODE__ASSOCIATION_SRC, WFP_V2Package.ASSOCIATION__TGT);
		}
		return association_src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Composition> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectWithInverseResolvingEList<Composition>(Composition.class, this,
					WFP_V2Package.NODE__COMPOSED_OF, WFP_V2Package.COMPOSITION__SRC);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation_tgt() {
		if (association_tgt == null) {
			association_tgt = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					WFP_V2Package.NODE__ASSOCIATION_TGT, WFP_V2Package.ASSOCIATION__SRC);
		}
		return association_tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition getComposition() {
		if (composition != null && composition.eIsProxy()) {
			InternalEObject oldComposition = (InternalEObject) composition;
			composition = (Composition) eResolveProxy(oldComposition);
			if (composition != oldComposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.NODE__COMPOSITION,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WFP_V2Package.NODE__COMPOSITION, oldComposition, newComposition);
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
	@Override
	public void setComposition(Composition newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject) composition).eInverseRemove(this, WFP_V2Package.COMPOSITION__TGT,
						Composition.class, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject) newComposition).eInverseAdd(this, WFP_V2Package.COMPOSITION__TGT,
						Composition.class, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.NODE__COMPOSITION, newComposition,
					newComposition));
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
		case WFP_V2Package.NODE__AGGREGATE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAggregate()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__AGGREGATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAggregation()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			if (reify_association != null)
				msgs = ((InternalEObject) reify_association).eInverseRemove(this, WFP_V2Package.REIFY_ASSOCIATION__TGT,
						Reify_Association.class, msgs);
			return basicSetReify_association((Reify_Association) otherEnd, msgs);
		case WFP_V2Package.NODE__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, WFP_V2Package.INHERITANCE__SRC,
						Inheritance.class, msgs);
			return basicSetParent((Inheritance) otherEnd, msgs);
		case WFP_V2Package.NODE__CHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChild()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociation_tgt()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociation_src()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__COMPOSED_OF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComposedOf()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.NODE__COMPOSITION:
			if (composition != null)
				msgs = ((InternalEObject) composition).eInverseRemove(this, WFP_V2Package.COMPOSITION__TGT,
						Composition.class, msgs);
			return basicSetComposition((Composition) otherEnd, msgs);
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
		case WFP_V2Package.NODE__AGGREGATE:
			return ((InternalEList<?>) getAggregate()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__AGGREGATION:
			return ((InternalEList<?>) getAggregation()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			return basicSetReify_association(null, msgs);
		case WFP_V2Package.NODE__PARENT:
			return basicSetParent(null, msgs);
		case WFP_V2Package.NODE__CHILD:
			return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			return ((InternalEList<?>) getAssociation_tgt()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			return ((InternalEList<?>) getAssociation_src()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__COMPOSED_OF:
			return ((InternalEList<?>) getComposedOf()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.NODE__COMPOSITION:
			return basicSetComposition(null, msgs);
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
		case WFP_V2Package.NODE__AGGREGATE:
			return getAggregate();
		case WFP_V2Package.NODE__AGGREGATION:
			return getAggregation();
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			if (resolve)
				return getReify_association();
			return basicGetReify_association();
		case WFP_V2Package.NODE__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case WFP_V2Package.NODE__CHILD:
			return getChild();
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			return getAssociation_tgt();
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			return getAssociation_src();
		case WFP_V2Package.NODE__COMPOSED_OF:
			return getComposedOf();
		case WFP_V2Package.NODE__COMPOSITION:
			if (resolve)
				return getComposition();
			return basicGetComposition();
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
		case WFP_V2Package.NODE__AGGREGATE:
			getAggregate().clear();
			getAggregate().addAll((Collection<? extends Aggregation>) newValue);
			return;
		case WFP_V2Package.NODE__AGGREGATION:
			getAggregation().clear();
			getAggregation().addAll((Collection<? extends Aggregation>) newValue);
			return;
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			setReify_association((Reify_Association) newValue);
			return;
		case WFP_V2Package.NODE__PARENT:
			setParent((Inheritance) newValue);
			return;
		case WFP_V2Package.NODE__CHILD:
			getChild().clear();
			getChild().addAll((Collection<? extends Inheritance>) newValue);
			return;
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			getAssociation_tgt().clear();
			getAssociation_tgt().addAll((Collection<? extends Association>) newValue);
			return;
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			getAssociation_src().clear();
			getAssociation_src().addAll((Collection<? extends Association>) newValue);
			return;
		case WFP_V2Package.NODE__COMPOSED_OF:
			getComposedOf().clear();
			getComposedOf().addAll((Collection<? extends Composition>) newValue);
			return;
		case WFP_V2Package.NODE__COMPOSITION:
			setComposition((Composition) newValue);
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
		case WFP_V2Package.NODE__AGGREGATE:
			getAggregate().clear();
			return;
		case WFP_V2Package.NODE__AGGREGATION:
			getAggregation().clear();
			return;
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			setReify_association((Reify_Association) null);
			return;
		case WFP_V2Package.NODE__PARENT:
			setParent((Inheritance) null);
			return;
		case WFP_V2Package.NODE__CHILD:
			getChild().clear();
			return;
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			getAssociation_tgt().clear();
			return;
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			getAssociation_src().clear();
			return;
		case WFP_V2Package.NODE__COMPOSED_OF:
			getComposedOf().clear();
			return;
		case WFP_V2Package.NODE__COMPOSITION:
			setComposition((Composition) null);
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
		case WFP_V2Package.NODE__AGGREGATE:
			return aggregate != null && !aggregate.isEmpty();
		case WFP_V2Package.NODE__AGGREGATION:
			return aggregation != null && !aggregation.isEmpty();
		case WFP_V2Package.NODE__REIFY_ASSOCIATION:
			return reify_association != null;
		case WFP_V2Package.NODE__PARENT:
			return parent != null;
		case WFP_V2Package.NODE__CHILD:
			return child != null && !child.isEmpty();
		case WFP_V2Package.NODE__ASSOCIATION_TGT:
			return association_tgt != null && !association_tgt.isEmpty();
		case WFP_V2Package.NODE__ASSOCIATION_SRC:
			return association_src != null && !association_src.isEmpty();
		case WFP_V2Package.NODE__COMPOSED_OF:
			return composedOf != null && !composedOf.isEmpty();
		case WFP_V2Package.NODE__COMPOSITION:
			return composition != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
