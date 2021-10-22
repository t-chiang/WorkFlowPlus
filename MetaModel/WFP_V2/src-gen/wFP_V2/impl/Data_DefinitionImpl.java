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

import wFP_V2.Data;
import wFP_V2.Data_Definition;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.Data_DefinitionImpl#getData <em>Data</em>}</li>
 *   <li>{@link wFP_V2.impl.Data_DefinitionImpl#isIsNormative <em>Is Normative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Data_DefinitionImpl extends DataImpl implements Data_Definition {
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
	protected Data_DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.DATA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, WFP_V2Package.DATA_DEFINITION__DATA);
		}
		return data;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.DATA_DEFINITION__IS_NORMATIVE,
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
		case WFP_V2Package.DATA_DEFINITION__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.DATA_DEFINITION__DATA:
			return getData();
		case WFP_V2Package.DATA_DEFINITION__IS_NORMATIVE:
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
		case WFP_V2Package.DATA_DEFINITION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case WFP_V2Package.DATA_DEFINITION__IS_NORMATIVE:
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
		case WFP_V2Package.DATA_DEFINITION__DATA:
			getData().clear();
			return;
		case WFP_V2Package.DATA_DEFINITION__IS_NORMATIVE:
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
		case WFP_V2Package.DATA_DEFINITION__DATA:
			return data != null && !data.isEmpty();
		case WFP_V2Package.DATA_DEFINITION__IS_NORMATIVE:
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

} //Data_DefinitionImpl
