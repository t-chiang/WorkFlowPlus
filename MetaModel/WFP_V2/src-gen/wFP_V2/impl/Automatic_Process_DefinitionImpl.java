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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wFP_V2.Attribute;
import wFP_V2.Automatic_Process_Definition;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automatic Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.Automatic_Process_DefinitionImpl#getFormalDescription <em>Formal Description</em>}</li>
 *   <li>{@link wFP_V2.impl.Automatic_Process_DefinitionImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Automatic_Process_DefinitionImpl extends ProcessImpl implements Automatic_Process_Definition {
	/**
	 * The default value of the '{@link #getFormalDescription() <em>Formal Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalDescription() <em>Formal Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalDescription()
	 * @generated
	 * @ordered
	 */
	protected String formalDescription = FORMAL_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Automatic_Process_DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.AUTOMATIC_PROCESS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormalDescription() {
		return formalDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormalDescription(String newFormalDescription) {
		String oldFormalDescription = formalDescription;
		formalDescription = newFormalDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION, oldFormalDescription,
					formalDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION:
			return getFormalDescription();
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE:
			return getAttribute();
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
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION:
			setFormalDescription((String) newValue);
			return;
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
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
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION:
			setFormalDescription(FORMAL_DESCRIPTION_EDEFAULT);
			return;
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE:
			getAttribute().clear();
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
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION:
			return FORMAL_DESCRIPTION_EDEFAULT == null ? formalDescription != null
					: !FORMAL_DESCRIPTION_EDEFAULT.equals(formalDescription);
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
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
		result.append(" (formalDescription: ");
		result.append(formalDescription);
		result.append(')');
		return result.toString();
	}

} //Automatic_Process_DefinitionImpl
