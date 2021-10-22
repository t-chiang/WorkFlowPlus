/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wFP_V2.Reference;
import wFP_V2.Reify_Association;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.ReferenceImpl#getReify_association <em>Reify association</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WFP_V2Package.REFERENCE__REIFY_ASSOCIATION, oldReify_association, reify_association));
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
					WFP_V2Package.REFERENCE__REIFY_ASSOCIATION, oldReify_association, newReify_association);
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
				msgs = ((InternalEObject) reify_association).eInverseRemove(this, WFP_V2Package.REIFY_ASSOCIATION__SRC,
						Reify_Association.class, msgs);
			if (newReify_association != null)
				msgs = ((InternalEObject) newReify_association).eInverseAdd(this, WFP_V2Package.REIFY_ASSOCIATION__SRC,
						Reify_Association.class, msgs);
			msgs = basicSetReify_association(newReify_association, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.REFERENCE__REIFY_ASSOCIATION,
					newReify_association, newReify_association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			if (reify_association != null)
				msgs = ((InternalEObject) reify_association).eInverseRemove(this, WFP_V2Package.REIFY_ASSOCIATION__SRC,
						Reify_Association.class, msgs);
			return basicSetReify_association((Reify_Association) otherEnd, msgs);
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
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			return basicSetReify_association(null, msgs);
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
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			if (resolve)
				return getReify_association();
			return basicGetReify_association();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			setReify_association((Reify_Association) newValue);
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
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			setReify_association((Reify_Association) null);
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
		case WFP_V2Package.REFERENCE__REIFY_ASSOCIATION:
			return reify_association != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
