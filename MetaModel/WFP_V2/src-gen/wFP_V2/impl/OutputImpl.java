/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wFP_V2.Data;
import wFP_V2.Output;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.OutputImpl#getSrc_process <em>Src process</em>}</li>
 *   <li>{@link wFP_V2.impl.OutputImpl#getTgt_data <em>Tgt data</em>}</li>
 *   <li>{@link wFP_V2.impl.OutputImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.impl.OutputImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends ReferenceImpl implements Output {
	/**
	 * The cached value of the '{@link #getSrc_process() <em>Src process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc_process()
	 * @generated
	 * @ordered
	 */
	protected wFP_V2.Process src_process;

	/**
	 * The cached value of the '{@link #getTgt_data() <em>Tgt data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt_data()
	 * @generated
	 * @ordered
	 */
	protected Data tgt_data;

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
		return WFP_V2Package.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public wFP_V2.Process getSrc_process() {
		if (src_process != null && src_process.eIsProxy()) {
			InternalEObject oldSrc_process = (InternalEObject) src_process;
			src_process = (wFP_V2.Process) eResolveProxy(oldSrc_process);
			if (src_process != oldSrc_process) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.OUTPUT__SRC_PROCESS,
							oldSrc_process, src_process));
			}
		}
		return src_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wFP_V2.Process basicGetSrc_process() {
		return src_process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc_process(wFP_V2.Process newSrc_process) {
		wFP_V2.Process oldSrc_process = src_process;
		src_process = newSrc_process;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.OUTPUT__SRC_PROCESS, oldSrc_process,
					src_process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data getTgt_data() {
		if (tgt_data != null && tgt_data.eIsProxy()) {
			InternalEObject oldTgt_data = (InternalEObject) tgt_data;
			tgt_data = (Data) eResolveProxy(oldTgt_data);
			if (tgt_data != oldTgt_data) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.OUTPUT__TGT_DATA,
							oldTgt_data, tgt_data));
			}
		}
		return tgt_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetTgt_data() {
		return tgt_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTgt_data(Data newTgt_data) {
		Data oldTgt_data = tgt_data;
		tgt_data = newTgt_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.OUTPUT__TGT_DATA, oldTgt_data,
					tgt_data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.OUTPUT__MULT_AT_SRC, oldMultAtSrc,
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.OUTPUT__MULT_AT_TGT, oldMultAtTgt,
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
		case WFP_V2Package.OUTPUT__SRC_PROCESS:
			if (resolve)
				return getSrc_process();
			return basicGetSrc_process();
		case WFP_V2Package.OUTPUT__TGT_DATA:
			if (resolve)
				return getTgt_data();
			return basicGetTgt_data();
		case WFP_V2Package.OUTPUT__MULT_AT_SRC:
			return getMultAtSrc();
		case WFP_V2Package.OUTPUT__MULT_AT_TGT:
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
		case WFP_V2Package.OUTPUT__SRC_PROCESS:
			setSrc_process((wFP_V2.Process) newValue);
			return;
		case WFP_V2Package.OUTPUT__TGT_DATA:
			setTgt_data((Data) newValue);
			return;
		case WFP_V2Package.OUTPUT__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WFP_V2Package.OUTPUT__MULT_AT_TGT:
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
		case WFP_V2Package.OUTPUT__SRC_PROCESS:
			setSrc_process((wFP_V2.Process) null);
			return;
		case WFP_V2Package.OUTPUT__TGT_DATA:
			setTgt_data((Data) null);
			return;
		case WFP_V2Package.OUTPUT__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WFP_V2Package.OUTPUT__MULT_AT_TGT:
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
		case WFP_V2Package.OUTPUT__SRC_PROCESS:
			return src_process != null;
		case WFP_V2Package.OUTPUT__TGT_DATA:
			return tgt_data != null;
		case WFP_V2Package.OUTPUT__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WFP_V2Package.OUTPUT__MULT_AT_TGT:
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

} //OutputImpl
