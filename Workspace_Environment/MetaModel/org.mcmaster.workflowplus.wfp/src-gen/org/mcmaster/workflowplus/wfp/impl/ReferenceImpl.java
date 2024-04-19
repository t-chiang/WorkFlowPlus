/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mcmaster.workflowplus.wfp.Reference;
import org.mcmaster.workflowplus.wfp.ReifyAssociation;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ReferenceImpl#getReifyassociation <em>Reifyassociation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
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
		return WfpPackage.Literals.REFERENCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.REFERENCE__REIFYASSOCIATION,
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
					WfpPackage.REFERENCE__REIFYASSOCIATION, oldReifyassociation, newReifyassociation);
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
				msgs = ((InternalEObject) reifyassociation).eInverseRemove(this, WfpPackage.REIFY_ASSOCIATION__SRC,
						ReifyAssociation.class, msgs);
			if (newReifyassociation != null)
				msgs = ((InternalEObject) newReifyassociation).eInverseAdd(this, WfpPackage.REIFY_ASSOCIATION__SRC,
						ReifyAssociation.class, msgs);
			msgs = basicSetReifyassociation(newReifyassociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.REFERENCE__REIFYASSOCIATION,
					newReifyassociation, newReifyassociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
			if (reifyassociation != null)
				msgs = ((InternalEObject) reifyassociation).eInverseRemove(this, WfpPackage.REIFY_ASSOCIATION__SRC,
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
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
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
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
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
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
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
		case WfpPackage.REFERENCE__REIFYASSOCIATION:
			return reifyassociation != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
