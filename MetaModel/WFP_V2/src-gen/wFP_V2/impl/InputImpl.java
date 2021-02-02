/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link wFP_V2.impl.InputImpl#getSrc_data <em>Src data</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getTgt_process <em>Tgt process</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.impl.InputImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends ReferenceImpl implements Input {
	/**
	 * The cached value of the '{@link #getSrc_data() <em>Src data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc_data()
	 * @generated
	 * @ordered
	 */
	protected Data src_data;

	/**
	 * The cached value of the '{@link #getTgt_process() <em>Tgt process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt_process()
	 * @generated
	 * @ordered
	 */
	protected wFP_V2.Process tgt_process;

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
	public Data getSrc_data() {
		if (src_data != null && src_data.eIsProxy()) {
			InternalEObject oldSrc_data = (InternalEObject) src_data;
			src_data = (Data) eResolveProxy(oldSrc_data);
			if (src_data != oldSrc_data) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.INPUT__SRC_DATA,
							oldSrc_data, src_data));
			}
		}
		return src_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetSrc_data() {
		return src_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc_data(Data newSrc_data) {
		Data oldSrc_data = src_data;
		src_data = newSrc_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__SRC_DATA, oldSrc_data,
					src_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public wFP_V2.Process getTgt_process() {
		if (tgt_process != null && tgt_process.eIsProxy()) {
			InternalEObject oldTgt_process = (InternalEObject) tgt_process;
			tgt_process = (wFP_V2.Process) eResolveProxy(oldTgt_process);
			if (tgt_process != oldTgt_process) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.INPUT__TGT_PROCESS,
							oldTgt_process, tgt_process));
			}
		}
		return tgt_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wFP_V2.Process basicGetTgt_process() {
		return tgt_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTgt_process(wFP_V2.Process newTgt_process) {
		wFP_V2.Process oldTgt_process = tgt_process;
		tgt_process = newTgt_process;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.INPUT__TGT_PROCESS, oldTgt_process,
					tgt_process));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WFP_V2Package.INPUT__SRC_DATA:
			if (resolve)
				return getSrc_data();
			return basicGetSrc_data();
		case WFP_V2Package.INPUT__TGT_PROCESS:
			if (resolve)
				return getTgt_process();
			return basicGetTgt_process();
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			return getMultAtSrc();
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			return getMultAtTgt();
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
		case WFP_V2Package.INPUT__SRC_DATA:
			setSrc_data((Data) newValue);
			return;
		case WFP_V2Package.INPUT__TGT_PROCESS:
			setTgt_process((wFP_V2.Process) newValue);
			return;
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
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
		case WFP_V2Package.INPUT__SRC_DATA:
			setSrc_data((Data) null);
			return;
		case WFP_V2Package.INPUT__TGT_PROCESS:
			setTgt_process((wFP_V2.Process) null);
			return;
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
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
		case WFP_V2Package.INPUT__SRC_DATA:
			return src_data != null;
		case WFP_V2Package.INPUT__TGT_PROCESS:
			return tgt_process != null;
		case WFP_V2Package.INPUT__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WFP_V2Package.INPUT__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
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
