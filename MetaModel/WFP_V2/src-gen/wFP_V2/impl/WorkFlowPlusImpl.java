/**
 */
package wFP_V2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wFP_V2.Argument;
import wFP_V2.Constraint;
import wFP_V2.Data;
import wFP_V2.Reference;
import wFP_V2.WFP_V2Package;
import wFP_V2.WorkFlowPlus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Flow Plus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.WorkFlowPlusImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link wFP_V2.impl.WorkFlowPlusImpl#getData <em>Data</em>}</li>
 *   <li>{@link wFP_V2.impl.WorkFlowPlusImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link wFP_V2.impl.WorkFlowPlusImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link wFP_V2.impl.WorkFlowPlusImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkFlowPlusImpl extends MinimalEObjectImpl.Container implements WorkFlowPlus {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<wFP_V2.Process> process;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowPlusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.WORK_FLOW_PLUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<wFP_V2.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<wFP_V2.Process>(wFP_V2.Process.class, this,
					WFP_V2Package.WORK_FLOW_PLUS__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, WFP_V2Package.WORK_FLOW_PLUS__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this,
					WFP_V2Package.WORK_FLOW_PLUS__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this,
					WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT:
			return ((InternalEList<?>) getArgument()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
			return getProcess();
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
			return getData();
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
			return getConstraint();
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			return getReference();
		case WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT:
			return getArgument();
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
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends wFP_V2.Process>) newValue);
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT:
			getArgument().clear();
			getArgument().addAll((Collection<? extends Argument>) newValue);
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
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
			getProcess().clear();
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
			getData().clear();
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
			getConstraint().clear();
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			getReference().clear();
			return;
		case WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT:
			getArgument().clear();
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
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
			return process != null && !process.isEmpty();
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
			return data != null && !data.isEmpty();
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			return reference != null && !reference.isEmpty();
		case WFP_V2Package.WORK_FLOW_PLUS__ARGUMENT:
			return argument != null && !argument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkFlowPlusImpl
