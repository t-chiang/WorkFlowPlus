/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wFP_V2.Data;
import wFP_V2.Input;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.InputImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends ReferenceImpl implements Input {
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
	protected wFP_V2.Process tgt;

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
		return WFP_V2Package.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.INPUT__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WFP_V2Package.DATA__INPUT, Data.class, msgs);
			return basicSetSrc((Data) otherEnd, msgs);
		case WFP_V2Package.INPUT__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WFP_V2Package.PROCESS__INPUT, wFP_V2.Process.class,
						msgs);
			return basicSetTgt((wFP_V2.Process) otherEnd, msgs);
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
		case WFP_V2Package.INPUT__SRC:
			return basicSetSrc(null, msgs);
		case WFP_V2Package.INPUT__TGT:
			return basicSetTgt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultAtSrc() {
		return multAtSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultAtSrc(String newMultAtSrc) {
		String oldMultAtSrc = multAtSrc;
		multAtSrc = newMultAtSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__MULT_AT_SRC, oldMultAtSrc,
					multAtSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultAtTgt() {
		return multAtTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultAtTgt(String newMultAtTgt) {
		String oldMultAtTgt = multAtTgt;
		multAtTgt = newMultAtTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__MULT_AT_TGT, oldMultAtTgt,
					multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Data) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.INPUT__SRC, oldSrc, src));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__SRC,
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
	@Override
	public void setSrc(Data newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WFP_V2Package.DATA__INPUT, Data.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, WFP_V2Package.DATA__INPUT, Data.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public wFP_V2.Process getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (wFP_V2.Process) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.INPUT__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wFP_V2.Process basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(wFP_V2.Process newTgt, NotificationChain msgs) {
		wFP_V2.Process oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__TGT,
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
	@Override
	public void setTgt(wFP_V2.Process newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WFP_V2Package.PROCESS__INPUT, wFP_V2.Process.class,
						msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, WFP_V2Package.PROCESS__INPUT, wFP_V2.Process.class,
						msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			return getMultAtSrc();
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			return getMultAtTgt();
		case WFP_V2Package.INPUT__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case WFP_V2Package.INPUT__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
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
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WFP_V2Package.INPUT__SRC:
			setSrc((Data) newValue);
			return;
		case WFP_V2Package.INPUT__TGT:
			setTgt((wFP_V2.Process) newValue);
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
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WFP_V2Package.INPUT__SRC:
			setSrc((Data) null);
			return;
		case WFP_V2Package.INPUT__TGT:
			setTgt((wFP_V2.Process) null);
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
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WFP_V2Package.INPUT__SRC:
			return src != null;
		case WFP_V2Package.INPUT__TGT:
			return tgt != null;
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
		result.append(" (MultAtSrc: ");
		result.append(multAtSrc);
		result.append(", MultAtTgt: ");
		result.append(multAtTgt);
		result.append(')');
		return result.toString();
	}

} //InputImpl
