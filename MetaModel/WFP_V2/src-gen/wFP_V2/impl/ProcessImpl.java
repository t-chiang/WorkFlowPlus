/**
 */
package wFP_V2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wFP_V2.Input;
import wFP_V2.Output;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.impl.ProcessImpl#getNext <em>Next</em>}</li>
 *   <li>{@link wFP_V2.impl.ProcessImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link wFP_V2.impl.ProcessImpl#getInput <em>Input</em>}</li>
 *   <li>{@link wFP_V2.impl.ProcessImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessImpl extends NodeImpl implements wFP_V2.Process {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<wFP_V2.Process> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<wFP_V2.Process> previous;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<wFP_V2.Process> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<wFP_V2.Process>(wFP_V2.Process.class, this,
					WFP_V2Package.PROCESS__NEXT, WFP_V2Package.PROCESS__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<wFP_V2.Process> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<wFP_V2.Process>(wFP_V2.Process.class, this,
					WFP_V2Package.PROCESS__PREVIOUS, WFP_V2Package.PROCESS__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<Input>(Input.class, this, WFP_V2Package.PROCESS__INPUT,
					WFP_V2Package.INPUT__TGT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<Output>(Output.class, this, WFP_V2Package.PROCESS__OUTPUT,
					WFP_V2Package.OUTPUT__SRC);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.PROCESS__NEXT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNext()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.PROCESS__PREVIOUS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrevious()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.PROCESS__INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInput()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.PROCESS__OUTPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutput()).basicAdd(otherEnd, msgs);
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
		case WFP_V2Package.PROCESS__NEXT:
			return ((InternalEList<?>) getNext()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.PROCESS__PREVIOUS:
			return ((InternalEList<?>) getPrevious()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.PROCESS__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.PROCESS__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.PROCESS__NAME:
			return getName();
		case WFP_V2Package.PROCESS__NEXT:
			return getNext();
		case WFP_V2Package.PROCESS__PREVIOUS:
			return getPrevious();
		case WFP_V2Package.PROCESS__INPUT:
			return getInput();
		case WFP_V2Package.PROCESS__OUTPUT:
			return getOutput();
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
		case WFP_V2Package.PROCESS__NAME:
			setName((String) newValue);
			return;
		case WFP_V2Package.PROCESS__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends wFP_V2.Process>) newValue);
			return;
		case WFP_V2Package.PROCESS__PREVIOUS:
			getPrevious().clear();
			getPrevious().addAll((Collection<? extends wFP_V2.Process>) newValue);
			return;
		case WFP_V2Package.PROCESS__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
			return;
		case WFP_V2Package.PROCESS__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
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
		case WFP_V2Package.PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WFP_V2Package.PROCESS__NEXT:
			getNext().clear();
			return;
		case WFP_V2Package.PROCESS__PREVIOUS:
			getPrevious().clear();
			return;
		case WFP_V2Package.PROCESS__INPUT:
			getInput().clear();
			return;
		case WFP_V2Package.PROCESS__OUTPUT:
			getOutput().clear();
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
		case WFP_V2Package.PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WFP_V2Package.PROCESS__NEXT:
			return next != null && !next.isEmpty();
		case WFP_V2Package.PROCESS__PREVIOUS:
			return previous != null && !previous.isEmpty();
		case WFP_V2Package.PROCESS__INPUT:
			return input != null && !input.isEmpty();
		case WFP_V2Package.PROCESS__OUTPUT:
			return output != null && !output.isEmpty();
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

} //ProcessImpl
