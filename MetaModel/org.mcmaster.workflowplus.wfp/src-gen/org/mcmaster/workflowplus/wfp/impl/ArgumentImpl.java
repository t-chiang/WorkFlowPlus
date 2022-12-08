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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.workflowplus.wfp.Argument;
import org.mcmaster.workflowplus.wfp.Constraint;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#getConstructedBy <em>Constructed By</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends NodeImpl implements Argument {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSyntactic() <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyntactic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNTACTIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSyntactic() <em>Syntactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyntactic()
	 * @generated
	 * @ordered
	 */
	protected boolean syntactic = SYNTACTIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getConstructedBy() <em>Constructed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> constructedBy;

	/**
	 * The cached value of the '{@link #getConstructs() <em>Constructs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructs()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> constructs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfpPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.ARGUMENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSyntactic() {
		return syntactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntactic(boolean newSyntactic) {
		boolean oldSyntactic = syntactic;
		syntactic = newSyntactic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.ARGUMENT__SYNTACTIC, oldSyntactic,
					syntactic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectWithInverseResolvingEList.ManyInverse<Constraint>(Constraint.class, this,
					WfpPackage.ARGUMENT__CONSTRAINT, WfpPackage.CONSTRAINT__ARGUMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getConstructedBy() {
		if (constructedBy == null) {
			constructedBy = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WfpPackage.ARGUMENT__CONSTRUCTED_BY, WfpPackage.ARGUMENT__CONSTRUCTS);
		}
		return constructedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getConstructs() {
		if (constructs == null) {
			constructs = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WfpPackage.ARGUMENT__CONSTRUCTS, WfpPackage.ARGUMENT__CONSTRUCTED_BY);
		}
		return constructs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.ARGUMENT__NAME, oldName, name));
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
		case WfpPackage.ARGUMENT__CONSTRAINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraint()).basicAdd(otherEnd, msgs);
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstructedBy()).basicAdd(otherEnd, msgs);
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstructs()).basicAdd(otherEnd, msgs);
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
		case WfpPackage.ARGUMENT__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			return ((InternalEList<?>) getConstructedBy()).basicRemove(otherEnd, msgs);
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			return ((InternalEList<?>) getConstructs()).basicRemove(otherEnd, msgs);
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
		case WfpPackage.ARGUMENT__DESCRIPTION:
			return getDescription();
		case WfpPackage.ARGUMENT__SYNTACTIC:
			return isSyntactic();
		case WfpPackage.ARGUMENT__CONSTRAINT:
			return getConstraint();
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			return getConstructedBy();
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			return getConstructs();
		case WfpPackage.ARGUMENT__NAME:
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
		case WfpPackage.ARGUMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case WfpPackage.ARGUMENT__SYNTACTIC:
			setSyntactic((Boolean) newValue);
			return;
		case WfpPackage.ARGUMENT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			getConstructedBy().clear();
			getConstructedBy().addAll((Collection<? extends Argument>) newValue);
			return;
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			getConstructs().clear();
			getConstructs().addAll((Collection<? extends Argument>) newValue);
			return;
		case WfpPackage.ARGUMENT__NAME:
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
		case WfpPackage.ARGUMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case WfpPackage.ARGUMENT__SYNTACTIC:
			setSyntactic(SYNTACTIC_EDEFAULT);
			return;
		case WfpPackage.ARGUMENT__CONSTRAINT:
			getConstraint().clear();
			return;
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			getConstructedBy().clear();
			return;
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			getConstructs().clear();
			return;
		case WfpPackage.ARGUMENT__NAME:
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
		case WfpPackage.ARGUMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case WfpPackage.ARGUMENT__SYNTACTIC:
			return syntactic != SYNTACTIC_EDEFAULT;
		case WfpPackage.ARGUMENT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case WfpPackage.ARGUMENT__CONSTRUCTED_BY:
			return constructedBy != null && !constructedBy.isEmpty();
		case WfpPackage.ARGUMENT__CONSTRUCTS:
			return constructs != null && !constructs.isEmpty();
		case WfpPackage.ARGUMENT__NAME:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", syntactic: ");
		result.append(syntactic);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArgumentImpl
