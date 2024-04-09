/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.workflowplus.wfp.OutPort;
import org.mcmaster.workflowplus.wfp.Output;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutPortImpl#getOutputSrc <em>Output Src</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.OutPortImpl#getOutputTgt <em>Output Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutPortImpl extends PortImpl implements OutPort {
	/**
	 * The cached value of the '{@link #getOutputSrc() <em>Output Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSrc()
	 * @generated
	 * @ordered
	 */
	protected Output outputSrc;
	/**
	 * The cached value of the '{@link #getOutputTgt() <em>Output Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTgt()
	 * @generated
	 * @ordered
	 */
	protected Output outputTgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.OUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutputSrc() {
		if (outputSrc != null && outputSrc.eIsProxy()) {
			InternalEObject oldOutputSrc = (InternalEObject) outputSrc;
			outputSrc = (Output) eResolveProxy(oldOutputSrc);
			if (outputSrc != oldOutputSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUT_PORT__OUTPUT_SRC,
							oldOutputSrc, outputSrc));
			}
		}
		return outputSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutputSrc() {
		return outputSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSrc(Output newOutputSrc, NotificationChain msgs) {
		Output oldOutputSrc = outputSrc;
		outputSrc = newOutputSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.OUT_PORT__OUTPUT_SRC, oldOutputSrc, newOutputSrc);
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
	public void setOutputSrc(Output newOutputSrc) {
		if (newOutputSrc != outputSrc) {
			NotificationChain msgs = null;
			if (outputSrc != null)
				msgs = ((InternalEObject) outputSrc).eInverseRemove(this, WfpPackage.OUTPUT__OUTPORT_SRC, Output.class,
						msgs);
			if (newOutputSrc != null)
				msgs = ((InternalEObject) newOutputSrc).eInverseAdd(this, WfpPackage.OUTPUT__OUTPORT_SRC, Output.class,
						msgs);
			msgs = basicSetOutputSrc(newOutputSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUT_PORT__OUTPUT_SRC, newOutputSrc,
					newOutputSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutputTgt() {
		if (outputTgt != null && outputTgt.eIsProxy()) {
			InternalEObject oldOutputTgt = (InternalEObject) outputTgt;
			outputTgt = (Output) eResolveProxy(oldOutputTgt);
			if (outputTgt != oldOutputTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfpPackage.OUT_PORT__OUTPUT_TGT,
							oldOutputTgt, outputTgt));
			}
		}
		return outputTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutputTgt() {
		return outputTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputTgt(Output newOutputTgt, NotificationChain msgs) {
		Output oldOutputTgt = outputTgt;
		outputTgt = newOutputTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WfpPackage.OUT_PORT__OUTPUT_TGT, oldOutputTgt, newOutputTgt);
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
	public void setOutputTgt(Output newOutputTgt) {
		if (newOutputTgt != outputTgt) {
			NotificationChain msgs = null;
			if (outputTgt != null)
				msgs = ((InternalEObject) outputTgt).eInverseRemove(this, WfpPackage.OUTPUT__OUTPORT_TGT, Output.class,
						msgs);
			if (newOutputTgt != null)
				msgs = ((InternalEObject) newOutputTgt).eInverseAdd(this, WfpPackage.OUTPUT__OUTPORT_TGT, Output.class,
						msgs);
			msgs = basicSetOutputTgt(newOutputTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.OUT_PORT__OUTPUT_TGT, newOutputTgt,
					newOutputTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			if (outputSrc != null)
				msgs = ((InternalEObject) outputSrc).eInverseRemove(this, WfpPackage.OUTPUT__OUTPORT_SRC, Output.class,
						msgs);
			return basicSetOutputSrc((Output) otherEnd, msgs);
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			if (outputTgt != null)
				msgs = ((InternalEObject) outputTgt).eInverseRemove(this, WfpPackage.OUTPUT__OUTPORT_TGT, Output.class,
						msgs);
			return basicSetOutputTgt((Output) otherEnd, msgs);
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
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			return basicSetOutputSrc(null, msgs);
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			return basicSetOutputTgt(null, msgs);
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
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			if (resolve)
				return getOutputSrc();
			return basicGetOutputSrc();
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			if (resolve)
				return getOutputTgt();
			return basicGetOutputTgt();
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
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			setOutputSrc((Output) newValue);
			return;
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			setOutputTgt((Output) newValue);
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
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			setOutputSrc((Output) null);
			return;
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			setOutputTgt((Output) null);
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
		case WfpPackage.OUT_PORT__OUTPUT_SRC:
			return outputSrc != null;
		case WfpPackage.OUT_PORT__OUTPUT_TGT:
			return outputTgt != null;
		}
		return super.eIsSet(featureID);
	}

} //OutPortImpl
