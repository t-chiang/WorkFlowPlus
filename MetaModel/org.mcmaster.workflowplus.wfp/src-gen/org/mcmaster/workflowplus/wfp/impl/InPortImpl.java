/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.workflowplus.wfp.InPort;
import org.mcmaster.workflowplus.wfp.Input;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InPortImpl#getInputTgt <em>Input Tgt</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.InPortImpl#getInputSrc <em>Input Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InPortImpl extends PortImpl implements InPort {
	/**
	 * The cached value of the '{@link #getInputTgt() <em>Input Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputTgt()
	 * @generated
	 * @ordered
	 */
	protected Input inputTgt;
	/**
	 * The cached value of the '{@link #getInputSrc() <em>Input Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSrc()
	 * @generated
	 * @ordered
	 */
	protected Input inputSrc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.IN_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInputTgt() {
		if (inputTgt != null && inputTgt.eIsProxy()) {
			InternalEObject oldInputTgt = (InternalEObject) inputTgt;
			inputTgt = (Input) eResolveProxy(oldInputTgt);
			if (inputTgt != oldInputTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.IN_PORT__INPUT_TGT,
							oldInputTgt, inputTgt));
			}
		}
		return inputTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetInputTgt() {
		return inputTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputTgt(Input newInputTgt, NotificationChain msgs) {
		Input oldInputTgt = inputTgt;
		inputTgt = newInputTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.IN_PORT__INPUT_TGT, oldInputTgt, newInputTgt);
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
	public void setInputTgt(Input newInputTgt) {
		if (newInputTgt != inputTgt) {
			NotificationChain msgs = null;
			if (inputTgt != null)
				msgs = ((InternalEObject) inputTgt).eInverseRemove(this, WfpPackage.INPUT__INPORT_TGT, Input.class,
						msgs);
			if (newInputTgt != null)
				msgs = ((InternalEObject) newInputTgt).eInverseAdd(this, WfpPackage.INPUT__INPORT_TGT, Input.class,
						msgs);
			msgs = basicSetInputTgt(newInputTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.IN_PORT__INPUT_TGT, newInputTgt,
					newInputTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInputSrc() {
		if (inputSrc != null && inputSrc.eIsProxy()) {
			InternalEObject oldInputSrc = (InternalEObject) inputSrc;
			inputSrc = (Input) eResolveProxy(oldInputSrc);
			if (inputSrc != oldInputSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.IN_PORT__INPUT_SRC,
							oldInputSrc, inputSrc));
			}
		}
		return inputSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetInputSrc() {
		return inputSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputSrc(Input newInputSrc, NotificationChain msgs) {
		Input oldInputSrc = inputSrc;
		inputSrc = newInputSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.IN_PORT__INPUT_SRC, oldInputSrc, newInputSrc);
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
	public void setInputSrc(Input newInputSrc) {
		if (newInputSrc != inputSrc) {
			NotificationChain msgs = null;
			if (inputSrc != null)
				msgs = ((InternalEObject) inputSrc).eInverseRemove(this, WfpPackage.INPUT__INPORT_SRC, Input.class,
						msgs);
			if (newInputSrc != null)
				msgs = ((InternalEObject) newInputSrc).eInverseAdd(this, WfpPackage.INPUT__INPORT_SRC, Input.class,
						msgs);
			msgs = basicSetInputSrc(newInputSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.IN_PORT__INPUT_SRC, newInputSrc,
					newInputSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.IN_PORT__INPUT_TGT:
			if (inputTgt != null)
				msgs = ((InternalEObject) inputTgt).eInverseRemove(this, WfpPackage.INPUT__INPORT_TGT, Input.class,
						msgs);
			return basicSetInputTgt((Input) otherEnd, msgs);
		case WfpPackage.IN_PORT__INPUT_SRC:
			if (inputSrc != null)
				msgs = ((InternalEObject) inputSrc).eInverseRemove(this, WfpPackage.INPUT__INPORT_SRC, Input.class,
						msgs);
			return basicSetInputSrc((Input) otherEnd, msgs);
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
		case WfpPackage.IN_PORT__INPUT_TGT:
			return basicSetInputTgt(null, msgs);
		case WfpPackage.IN_PORT__INPUT_SRC:
			return basicSetInputSrc(null, msgs);
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
		case WfpPackage.IN_PORT__INPUT_TGT:
			if (resolve)
				return getInputTgt();
			return basicGetInputTgt();
		case WfpPackage.IN_PORT__INPUT_SRC:
			if (resolve)
				return getInputSrc();
			return basicGetInputSrc();
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
		case WfpPackage.IN_PORT__INPUT_TGT:
			setInputTgt((Input) newValue);
			return;
		case WfpPackage.IN_PORT__INPUT_SRC:
			setInputSrc((Input) newValue);
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
		case WfpPackage.IN_PORT__INPUT_TGT:
			setInputTgt((Input) null);
			return;
		case WfpPackage.IN_PORT__INPUT_SRC:
			setInputSrc((Input) null);
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
		case WfpPackage.IN_PORT__INPUT_TGT:
			return inputTgt != null;
		case WfpPackage.IN_PORT__INPUT_SRC:
			return inputSrc != null;
		}
		return super.eIsSet(featureID);
	}

} //InPortImpl
