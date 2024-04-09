/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.workflowplus.wfp.Data;
import org.mcmaster.workflowplus.wfp.InPort;
import org.mcmaster.workflowplus.wfp.Input;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getInportTgt <em>Inport Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InputImpl#getInportSrc <em>Inport Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends ReferenceImpl implements Input {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Data src;

	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected org.mcmaster.workflowplus.wfp.Process tgt;

	/**
	 * The default value of the '{@link #getMultAtSrc() <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_AT_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultAtSrc() <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtSrc()
	 * @generated
	 * @ordered
	 */
	protected String multAtSrc = MULT_AT_SRC_EDEFAULT;

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
	 * The cached value of the '{@link #getInportTgt() <em>Inport Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInportTgt()
	 * @generated
	 * @ordered
	 */
	protected InPort inportTgt;

	/**
	 * The cached value of the '{@link #getInportSrc() <em>Inport Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInportSrc()
	 * @generated
	 * @ordered
	 */
	protected InPort inportSrc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Data) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.INPUT__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Data newSrc, NotificationChain msgs) {
		Data oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__SRC,
					oldSrc, newSrc);
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
	public void setSrc(Data newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.DATA__INPUT, Data.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, WfpPackage.DATA__INPUT, Data.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.workflowplus.wfp.Process getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (org.mcmaster.workflowplus.wfp.Process) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.INPUT__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.workflowplus.wfp.Process basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(org.mcmaster.workflowplus.wfp.Process newTgt, NotificationChain msgs) {
		org.mcmaster.workflowplus.wfp.Process oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__TGT,
					oldTgt, newTgt);
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
	public void setTgt(org.mcmaster.workflowplus.wfp.Process newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.PROCESS__INPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, WfpPackage.PROCESS__INPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultAtSrc() {
		return multAtSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultAtSrc(String newMultAtSrc) {
		String oldMultAtSrc = multAtSrc;
		multAtSrc = newMultAtSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__MULT_AT_SRC, oldMultAtSrc,
					multAtSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__MULT_AT_TGT, oldMultAtTgt,
					multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getInportTgt() {
		if (inportTgt != null && inportTgt.eIsProxy()) {
			InternalEObject oldInportTgt = (InternalEObject) inportTgt;
			inportTgt = (InPort) eResolveProxy(oldInportTgt);
			if (inportTgt != oldInportTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.INPUT__INPORT_TGT,
							oldInportTgt, inportTgt));
			}
		}
		return inportTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetInportTgt() {
		return inportTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInportTgt(InPort newInportTgt, NotificationChain msgs) {
		InPort oldInportTgt = inportTgt;
		inportTgt = newInportTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__INPORT_TGT,
					oldInportTgt, newInportTgt);
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
	public void setInportTgt(InPort newInportTgt) {
		if (newInportTgt != inportTgt) {
			NotificationChain msgs = null;
			if (inportTgt != null)
				msgs = ((InternalEObject) inportTgt).eInverseRemove(this, WfpPackage.IN_PORT__INPUT_TGT, InPort.class,
						msgs);
			if (newInportTgt != null)
				msgs = ((InternalEObject) newInportTgt).eInverseAdd(this, WfpPackage.IN_PORT__INPUT_TGT, InPort.class,
						msgs);
			msgs = basicSetInportTgt(newInportTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__INPORT_TGT, newInportTgt,
					newInportTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getInportSrc() {
		if (inportSrc != null && inportSrc.eIsProxy()) {
			InternalEObject oldInportSrc = (InternalEObject) inportSrc;
			inportSrc = (InPort) eResolveProxy(oldInportSrc);
			if (inportSrc != oldInportSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.INPUT__INPORT_SRC,
							oldInportSrc, inportSrc));
			}
		}
		return inportSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetInportSrc() {
		return inportSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInportSrc(InPort newInportSrc, NotificationChain msgs) {
		InPort oldInportSrc = inportSrc;
		inportSrc = newInportSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__INPORT_SRC,
					oldInportSrc, newInportSrc);
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
	public void setInportSrc(InPort newInportSrc) {
		if (newInportSrc != inportSrc) {
			NotificationChain msgs = null;
			if (inportSrc != null)
				msgs = ((InternalEObject) inportSrc).eInverseRemove(this, WfpPackage.IN_PORT__INPUT_SRC, InPort.class,
						msgs);
			if (newInportSrc != null)
				msgs = ((InternalEObject) newInportSrc).eInverseAdd(this, WfpPackage.IN_PORT__INPUT_SRC, InPort.class,
						msgs);
			msgs = basicSetInportSrc(newInportSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.INPUT__INPORT_SRC, newInportSrc,
					newInportSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.INPUT__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.DATA__INPUT, Data.class, msgs);
			return basicSetSrc((Data) otherEnd, msgs);
		case WfpPackage.INPUT__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.PROCESS__INPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			return basicSetTgt((org.mcmaster.workflowplus.wfp.Process) otherEnd, msgs);
		case WfpPackage.INPUT__INPORT_TGT:
			if (inportTgt != null)
				msgs = ((InternalEObject) inportTgt).eInverseRemove(this, WfpPackage.IN_PORT__INPUT_TGT, InPort.class,
						msgs);
			return basicSetInportTgt((InPort) otherEnd, msgs);
		case WfpPackage.INPUT__INPORT_SRC:
			if (inportSrc != null)
				msgs = ((InternalEObject) inportSrc).eInverseRemove(this, WfpPackage.IN_PORT__INPUT_SRC, InPort.class,
						msgs);
			return basicSetInportSrc((InPort) otherEnd, msgs);
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
		case WfpPackage.INPUT__SRC:
			return basicSetSrc(null, msgs);
		case WfpPackage.INPUT__TGT:
			return basicSetTgt(null, msgs);
		case WfpPackage.INPUT__INPORT_TGT:
			return basicSetInportTgt(null, msgs);
		case WfpPackage.INPUT__INPORT_SRC:
			return basicSetInportSrc(null, msgs);
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
		case WfpPackage.INPUT__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case WfpPackage.INPUT__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
		case WfpPackage.INPUT__MULT_AT_SRC:
			return getMultAtSrc();
		case WfpPackage.INPUT__MULT_AT_TGT:
			return getMultAtTgt();
		case WfpPackage.INPUT__INPORT_TGT:
			if (resolve)
				return getInportTgt();
			return basicGetInportTgt();
		case WfpPackage.INPUT__INPORT_SRC:
			if (resolve)
				return getInportSrc();
			return basicGetInportSrc();
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
		case WfpPackage.INPUT__SRC:
			setSrc((Data) newValue);
			return;
		case WfpPackage.INPUT__TGT:
			setTgt((org.mcmaster.workflowplus.wfp.Process) newValue);
			return;
		case WfpPackage.INPUT__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WfpPackage.INPUT__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WfpPackage.INPUT__INPORT_TGT:
			setInportTgt((InPort) newValue);
			return;
		case WfpPackage.INPUT__INPORT_SRC:
			setInportSrc((InPort) newValue);
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
		case WfpPackage.INPUT__SRC:
			setSrc((Data) null);
			return;
		case WfpPackage.INPUT__TGT:
			setTgt((org.mcmaster.workflowplus.wfp.Process) null);
			return;
		case WfpPackage.INPUT__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WfpPackage.INPUT__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WfpPackage.INPUT__INPORT_TGT:
			setInportTgt((InPort) null);
			return;
		case WfpPackage.INPUT__INPORT_SRC:
			setInportSrc((InPort) null);
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
		case WfpPackage.INPUT__SRC:
			return src != null;
		case WfpPackage.INPUT__TGT:
			return tgt != null;
		case WfpPackage.INPUT__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WfpPackage.INPUT__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WfpPackage.INPUT__INPORT_TGT:
			return inportTgt != null;
		case WfpPackage.INPUT__INPORT_SRC:
			return inportSrc != null;
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
		result.append(" (multAtSrc: ");
		result.append(multAtSrc);
		result.append(", multAtTgt: ");
		result.append(multAtTgt);
		result.append(')');
		return result.toString();
	}

} //InputImpl
