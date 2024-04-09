/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.workflowplus.wfp.Data;
import org.mcmaster.workflowplus.wfp.OutPort;
import org.mcmaster.workflowplus.wfp.Output;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getOutportSrc <em>Outport Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl#getOutportTgt <em>Outport Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends ReferenceImpl implements Output {
	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected Data tgt;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected org.mcmaster.workflowplus.wfp.Process src;

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
	 * The cached value of the '{@link #getOutportSrc() <em>Outport Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutportSrc()
	 * @generated
	 * @ordered
	 */
	protected OutPort outportSrc;

	/**
	 * The cached value of the '{@link #getOutportTgt() <em>Outport Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutportTgt()
	 * @generated
	 * @ordered
	 */
	protected OutPort outportTgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (Data) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUTPUT__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(Data newTgt, NotificationChain msgs) {
		Data oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__TGT,
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
	public void setTgt(Data newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.DATA__OUTPUT, Data.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, WfpPackage.DATA__OUTPUT, Data.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.workflowplus.wfp.Process getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (org.mcmaster.workflowplus.wfp.Process) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUTPUT__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.mcmaster.workflowplus.wfp.Process basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(org.mcmaster.workflowplus.wfp.Process newSrc, NotificationChain msgs) {
		org.mcmaster.workflowplus.wfp.Process oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__SRC,
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
	public void setSrc(org.mcmaster.workflowplus.wfp.Process newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.PROCESS__OUTPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, WfpPackage.PROCESS__OUTPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__SRC, newSrc, newSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__MULT_AT_SRC, oldMultAtSrc,
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__MULT_AT_TGT, oldMultAtTgt,
					multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getOutportSrc() {
		if (outportSrc != null && outportSrc.eIsProxy()) {
			InternalEObject oldOutportSrc = (InternalEObject) outportSrc;
			outportSrc = (OutPort) eResolveProxy(oldOutportSrc);
			if (outportSrc != oldOutportSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUTPUT__OUTPORT_SRC,
							oldOutportSrc, outportSrc));
			}
		}
		return outportSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetOutportSrc() {
		return outportSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutportSrc(OutPort newOutportSrc, NotificationChain msgs) {
		OutPort oldOutportSrc = outportSrc;
		outportSrc = newOutportSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.OUTPUT__OUTPORT_SRC, oldOutportSrc, newOutportSrc);
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
	public void setOutportSrc(OutPort newOutportSrc) {
		if (newOutportSrc != outportSrc) {
			NotificationChain msgs = null;
			if (outportSrc != null)
				msgs = ((InternalEObject) outportSrc).eInverseRemove(this, WfpPackage.OUT_PORT__OUTPUT_SRC,
						OutPort.class, msgs);
			if (newOutportSrc != null)
				msgs = ((InternalEObject) newOutportSrc).eInverseAdd(this, WfpPackage.OUT_PORT__OUTPUT_SRC,
						OutPort.class, msgs);
			msgs = basicSetOutportSrc(newOutportSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__OUTPORT_SRC, newOutportSrc,
					newOutportSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getOutportTgt() {
		if (outportTgt != null && outportTgt.eIsProxy()) {
			InternalEObject oldOutportTgt = (InternalEObject) outportTgt;
			outportTgt = (OutPort) eResolveProxy(oldOutportTgt);
			if (outportTgt != oldOutportTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUTPUT__OUTPORT_TGT,
							oldOutportTgt, outportTgt));
			}
		}
		return outportTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetOutportTgt() {
		return outportTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutportTgt(OutPort newOutportTgt, NotificationChain msgs) {
		OutPort oldOutportTgt = outportTgt;
		outportTgt = newOutportTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.OUTPUT__OUTPORT_TGT, oldOutportTgt, newOutportTgt);
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
	public void setOutportTgt(OutPort newOutportTgt) {
		if (newOutportTgt != outportTgt) {
			NotificationChain msgs = null;
			if (outportTgt != null)
				msgs = ((InternalEObject) outportTgt).eInverseRemove(this, WfpPackage.OUT_PORT__OUTPUT_TGT,
						OutPort.class, msgs);
			if (newOutportTgt != null)
				msgs = ((InternalEObject) newOutportTgt).eInverseAdd(this, WfpPackage.OUT_PORT__OUTPUT_TGT,
						OutPort.class, msgs);
			msgs = basicSetOutportTgt(newOutportTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUTPUT__OUTPORT_TGT, newOutportTgt,
					newOutportTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.OUTPUT__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WfpPackage.DATA__OUTPUT, Data.class, msgs);
			return basicSetTgt((Data) otherEnd, msgs);
		case WfpPackage.OUTPUT__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WfpPackage.PROCESS__OUTPUT,
						org.mcmaster.workflowplus.wfp.Process.class, msgs);
			return basicSetSrc((org.mcmaster.workflowplus.wfp.Process) otherEnd, msgs);
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			if (outportSrc != null)
				msgs = ((InternalEObject) outportSrc).eInverseRemove(this, WfpPackage.OUT_PORT__OUTPUT_SRC,
						OutPort.class, msgs);
			return basicSetOutportSrc((OutPort) otherEnd, msgs);
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			if (outportTgt != null)
				msgs = ((InternalEObject) outportTgt).eInverseRemove(this, WfpPackage.OUT_PORT__OUTPUT_TGT,
						OutPort.class, msgs);
			return basicSetOutportTgt((OutPort) otherEnd, msgs);
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
		case WfpPackage.OUTPUT__TGT:
			return basicSetTgt(null, msgs);
		case WfpPackage.OUTPUT__SRC:
			return basicSetSrc(null, msgs);
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			return basicSetOutportSrc(null, msgs);
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			return basicSetOutportTgt(null, msgs);
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
		case WfpPackage.OUTPUT__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
		case WfpPackage.OUTPUT__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case WfpPackage.OUTPUT__MULT_AT_SRC:
			return getMultAtSrc();
		case WfpPackage.OUTPUT__MULT_AT_TGT:
			return getMultAtTgt();
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			if (resolve)
				return getOutportSrc();
			return basicGetOutportSrc();
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			if (resolve)
				return getOutportTgt();
			return basicGetOutportTgt();
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
		case WfpPackage.OUTPUT__TGT:
			setTgt((Data) newValue);
			return;
		case WfpPackage.OUTPUT__SRC:
			setSrc((org.mcmaster.workflowplus.wfp.Process) newValue);
			return;
		case WfpPackage.OUTPUT__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WfpPackage.OUTPUT__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			setOutportSrc((OutPort) newValue);
			return;
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			setOutportTgt((OutPort) newValue);
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
		case WfpPackage.OUTPUT__TGT:
			setTgt((Data) null);
			return;
		case WfpPackage.OUTPUT__SRC:
			setSrc((org.mcmaster.workflowplus.wfp.Process) null);
			return;
		case WfpPackage.OUTPUT__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WfpPackage.OUTPUT__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			setOutportSrc((OutPort) null);
			return;
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			setOutportTgt((OutPort) null);
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
		case WfpPackage.OUTPUT__TGT:
			return tgt != null;
		case WfpPackage.OUTPUT__SRC:
			return src != null;
		case WfpPackage.OUTPUT__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WfpPackage.OUTPUT__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WfpPackage.OUTPUT__OUTPORT_SRC:
			return outportSrc != null;
		case WfpPackage.OUTPUT__OUTPORT_TGT:
			return outportTgt != null;
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

} //OutputImpl
