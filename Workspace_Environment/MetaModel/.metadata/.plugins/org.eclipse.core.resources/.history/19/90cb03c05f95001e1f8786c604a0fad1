/**
 */
package org.mcmaster.workflowplus.wfp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.workflowplus.wfp.InPort;
import org.mcmaster.workflowplus.wfp.OutPort;
import org.mcmaster.workflowplus.wfp.WfpPackage;
import org.mcmaster.workflowplus.wfp.WorkFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkFlowImpl extends WorkFlowPlusRootImpl implements WorkFlow {
	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> inPort;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPort> outPort;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.WORK_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getInPort() {
		if (inPort == null) {
			inPort = new EObjectContainmentEList<InPort>(InPort.class, this, WfpPackage.WORK_FLOW__IN_PORT);
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPort> getOutPort() {
		if (outPort == null) {
			outPort = new EObjectContainmentEList<OutPort>(OutPort.class, this, WfpPackage.WORK_FLOW__OUT_PORT);
		}
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.WORK_FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WfpPackage.WORK_FLOW__IN_PORT:
			return ((InternalEList<?>) getInPort()).basicRemove(otherEnd, msgs);
		case WfpPackage.WORK_FLOW__OUT_PORT:
			return ((InternalEList<?>) getOutPort()).basicRemove(otherEnd, msgs);
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
		case WfpPackage.WORK_FLOW__IN_PORT:
			return getInPort();
		case WfpPackage.WORK_FLOW__OUT_PORT:
			return getOutPort();
		case WfpPackage.WORK_FLOW__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WfpPackage.WORK_FLOW__IN_PORT:
			getInPort().clear();
			getInPort().addAll((Collection<? extends InPort>) newValue);
			return;
		case WfpPackage.WORK_FLOW__OUT_PORT:
			getOutPort().clear();
			getOutPort().addAll((Collection<? extends OutPort>) newValue);
			return;
		case WfpPackage.WORK_FLOW__NAME:
			setName((String) newValue);
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
		case WfpPackage.WORK_FLOW__IN_PORT:
			getInPort().clear();
			return;
		case WfpPackage.WORK_FLOW__OUT_PORT:
			getOutPort().clear();
			return;
		case WfpPackage.WORK_FLOW__NAME:
			setName(NAME_EDEFAULT);
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
		case WfpPackage.WORK_FLOW__IN_PORT:
			return inPort != null && !inPort.isEmpty();
		case WfpPackage.WORK_FLOW__OUT_PORT:
			return outPort != null && !outPort.isEmpty();
		case WfpPackage.WORK_FLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkFlowImpl
