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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wFP_V2.Argument;
import wFP_V2.Constraint;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#getConstructedBy <em>Constructed By</em>}</li>
 *   <li>{@link wFP_V2.impl.ArgumentImpl#isSyntactic <em>Syntactic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument {
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
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

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
	 * The cached value of the '{@link #getConstructedBy() <em>Constructed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> constructedBy;

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
		return WFP_V2Package.Literals.ARGUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ARGUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ARGUMENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectWithInverseResolvingEList.ManyInverse<Constraint>(Constraint.class, this,
					WFP_V2Package.ARGUMENT__CONSTRAINT, WFP_V2Package.CONSTRAINT__ARGUMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getConstructs() {
		if (constructs == null) {
			constructs = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WFP_V2Package.ARGUMENT__CONSTRUCTS, WFP_V2Package.ARGUMENT__CONSTRUCTED_BY);
		}
		return constructs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getConstructedBy() {
		if (constructedBy == null) {
			constructedBy = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WFP_V2Package.ARGUMENT__CONSTRUCTED_BY, WFP_V2Package.ARGUMENT__CONSTRUCTS);
		}
		return constructedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSyntactic() {
		return syntactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyntactic(boolean newSyntactic) {
		boolean oldSyntactic = syntactic;
		syntactic = newSyntactic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ARGUMENT__SYNTACTIC, oldSyntactic,
					syntactic));
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
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraint()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstructs()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstructedBy()).basicAdd(otherEnd, msgs);
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
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			return ((InternalEList<?>) getConstructs()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			return ((InternalEList<?>) getConstructedBy()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.ARGUMENT__NAME:
			return getName();
		case WFP_V2Package.ARGUMENT__DESCRIPTION:
			return getDescription();
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			return getConstraint();
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			return getConstructs();
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			return getConstructedBy();
		case WFP_V2Package.ARGUMENT__SYNTACTIC:
			return isSyntactic();
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
		case WFP_V2Package.ARGUMENT__NAME:
			setName((String) newValue);
			return;
		case WFP_V2Package.ARGUMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			getConstructs().clear();
			getConstructs().addAll((Collection<? extends Argument>) newValue);
			return;
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			getConstructedBy().clear();
			getConstructedBy().addAll((Collection<? extends Argument>) newValue);
			return;
		case WFP_V2Package.ARGUMENT__SYNTACTIC:
			setSyntactic((Boolean) newValue);
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
		case WFP_V2Package.ARGUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WFP_V2Package.ARGUMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			getConstraint().clear();
			return;
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			getConstructs().clear();
			return;
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			getConstructedBy().clear();
			return;
		case WFP_V2Package.ARGUMENT__SYNTACTIC:
			setSyntactic(SYNTACTIC_EDEFAULT);
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
		case WFP_V2Package.ARGUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WFP_V2Package.ARGUMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case WFP_V2Package.ARGUMENT__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case WFP_V2Package.ARGUMENT__CONSTRUCTS:
			return constructs != null && !constructs.isEmpty();
		case WFP_V2Package.ARGUMENT__CONSTRUCTED_BY:
			return constructedBy != null && !constructedBy.isEmpty();
		case WFP_V2Package.ARGUMENT__SYNTACTIC:
			return syntactic != SYNTACTIC_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", syntactic: ");
		result.append(syntactic);
		result.append(')');
		return result.toString();
	}

} //ArgumentImpl
