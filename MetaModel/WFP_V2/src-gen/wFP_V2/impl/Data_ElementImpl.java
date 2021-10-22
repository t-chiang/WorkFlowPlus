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
import wFP_V2.Data_Element;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.Data_ElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link wFP_V2.impl.Data_ElementImpl#isIsNormative <em>Is Normative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Data_ElementImpl extends DataImpl implements Data_Element {
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
	 * The default value of the '{@link #isIsNormative() <em>Is Normative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNormative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NORMATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNormative() <em>Is Normative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNormative()
	 * @generated
	 * @ordered
	 */
	protected boolean isNormative = IS_NORMATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.DATA_ELEMENT;
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
					WFP_V2Package.DATA_ELEMENT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNormative() {
		return isNormative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNormative(boolean newIsNormative) {
		boolean oldIsNormative = isNormative;
		isNormative = newIsNormative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.DATA_ELEMENT__IS_NORMATIVE,
					oldIsNormative, isNormative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.DATA_ELEMENT__ATTRIBUTE:
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
		case WFP_V2Package.DATA_ELEMENT__ATTRIBUTE:
			return getAttribute();
		case WFP_V2Package.DATA_ELEMENT__IS_NORMATIVE:
			return isIsNormative();
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
		case WFP_V2Package.DATA_ELEMENT__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case WFP_V2Package.DATA_ELEMENT__IS_NORMATIVE:
			setIsNormative((Boolean) newValue);
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
		case WFP_V2Package.DATA_ELEMENT__ATTRIBUTE:
			getAttribute().clear();
			return;
		case WFP_V2Package.DATA_ELEMENT__IS_NORMATIVE:
			setIsNormative(IS_NORMATIVE_EDEFAULT);
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
		case WFP_V2Package.DATA_ELEMENT__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case WFP_V2Package.DATA_ELEMENT__IS_NORMATIVE:
			return isNormative != IS_NORMATIVE_EDEFAULT;
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
		result.append(" (isNormative: ");
		result.append(isNormative);
		result.append(')');
		return result.toString();
	}

} //Data_ElementImpl
