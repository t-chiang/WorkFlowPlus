/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.workflowplus.wfp.Node;
import org.mcmaster.workflowplus.wfp.Reference;
import org.mcmaster.workflowplus.wfp.ReifyAssociation;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reify Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl#getLabelAtTgt <em>Label At Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReifyAssociationImpl extends ReferenceImpl implements ReifyAssociation {
	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected Node tgt;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Reference src;

	/**
	 * The default value of the '{@link #getMultAtTgt() <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtTgt()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_AT_TGT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultAtTgt() <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtTgt()
	 * @generated
	 * @ordered
	 */
	protected String multAtTgt = MULT_AT_TGT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelAtTgt() <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtTgt()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_AT_TGT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelAtTgt() <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtTgt()
	 * @generated
	 * @ordered
	 */
	protected String labelAtTgt = LABEL_AT_TGT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReifyAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.REIFY_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (Node) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.REIFY_ASSOCIATION__TGT, oldTgt,
							tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(Node newTgt, NotificationChain msgs) {
		Node oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.REIFY_ASSOCIATION__TGT, oldTgt, newTgt);
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
	public void setTgt(Node newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.NODE__REIFY_ASSOCIATION, Node.class,
						msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, WfpPackage.NODE__REIFY_ASSOCIATION, Node.class,
						msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.REIFY_ASSOCIATION__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Reference) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.REIFY_ASSOCIATION__SRC, oldSrc,
							src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Reference newSrc, NotificationChain msgs) {
		Reference oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.REIFY_ASSOCIATION__SRC, oldSrc, newSrc);
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
	public void setSrc(Reference newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.REFERENCE__REIFYASSOCIATION,
						Reference.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, WfpPackage.REFERENCE__REIFYASSOCIATION,
						Reference.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.REIFY_ASSOCIATION__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultAtTgt() {
		return multAtTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultAtTgt(String newMultAtTgt) {
		String oldMultAtTgt = multAtTgt;
		multAtTgt = newMultAtTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.REIFY_ASSOCIATION__MULT_AT_TGT,
					oldMultAtTgt, multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelAtTgt() {
		return labelAtTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelAtTgt(String newLabelAtTgt) {
		String oldLabelAtTgt = labelAtTgt;
		labelAtTgt = newLabelAtTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.REIFY_ASSOCIATION__LABEL_AT_TGT,
					oldLabelAtTgt, labelAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.NODE__REIFY_ASSOCIATION, Node.class,
						msgs);
			return basicSetTgt((Node) otherEnd, msgs);
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.REFERENCE__REIFYASSOCIATION,
						Reference.class, msgs);
			return basicSetSrc((Reference) otherEnd, msgs);
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
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			return basicSetTgt(null, msgs);
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			return basicSetSrc(null, msgs);
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
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case WfpPackage.REIFY_ASSOCIATION__MULT_AT_TGT:
			return getMultAtTgt();
		case WfpPackage.REIFY_ASSOCIATION__LABEL_AT_TGT:
			return getLabelAtTgt();
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
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			setTgt((Node) newValue);
			return;
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			setSrc((Reference) newValue);
			return;
		case WfpPackage.REIFY_ASSOCIATION__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WfpPackage.REIFY_ASSOCIATION__LABEL_AT_TGT:
			setLabelAtTgt((String) newValue);
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
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			setTgt((Node) null);
			return;
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			setSrc((Reference) null);
			return;
		case WfpPackage.REIFY_ASSOCIATION__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WfpPackage.REIFY_ASSOCIATION__LABEL_AT_TGT:
			setLabelAtTgt(LABEL_AT_TGT_EDEFAULT);
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
		case WfpPackage.REIFY_ASSOCIATION__TGT:
			return tgt != null;
		case WfpPackage.REIFY_ASSOCIATION__SRC:
			return src != null;
		case WfpPackage.REIFY_ASSOCIATION__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WfpPackage.REIFY_ASSOCIATION__LABEL_AT_TGT:
			return LABEL_AT_TGT_EDEFAULT == null ? labelAtTgt != null : !LABEL_AT_TGT_EDEFAULT.equals(labelAtTgt);
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
		result.append(" (multAtTgt: ");
		result.append(multAtTgt);
		result.append(", labelAtTgt: ");
		result.append(labelAtTgt);
		result.append(')');
		return result.toString();
	}

} //ReifyAssociationImpl
