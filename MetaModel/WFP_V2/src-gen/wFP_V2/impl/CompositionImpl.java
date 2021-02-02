/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wFP_V2.Composition;
import wFP_V2.Node;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.CompositionImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link wFP_V2.impl.CompositionImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link wFP_V2.impl.CompositionImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.impl.CompositionImpl#getLabelAtTgt <em>Label At Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends ReferenceImpl implements Composition {
	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected Node composes;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected Node composedOf;

	/**
	 * The default value of the '{@link #getMultAtTgt() <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtTgt()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_AT_TGT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultAtTgt() <em>Mult At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtTgt()
	 * @generated
	 * @ordered
	 */
	protected String multAtTgt = MULT_AT_TGT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelAtTgt() <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtTgt()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_AT_TGT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelAtTgt() <em>Label At Tgt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtTgt()
	 * @generated
	 * @ordered
	 */
	protected String labelAtTgt = LABEL_AT_TGT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getComposes() {
		if (composes != null && composes.eIsProxy()) {
			InternalEObject oldComposes = (InternalEObject) composes;
			composes = (Node) eResolveProxy(oldComposes);
			if (composes != oldComposes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.COMPOSITION__COMPOSES,
							oldComposes, composes));
			}
		}
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetComposes() {
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposes(Node newComposes) {
		Node oldComposes = composes;
		composes = newComposes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.COMPOSITION__COMPOSES, oldComposes,
					composes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getComposedOf() {
		if (composedOf != null && composedOf.eIsProxy()) {
			InternalEObject oldComposedOf = (InternalEObject) composedOf;
			composedOf = (Node) eResolveProxy(oldComposedOf);
			if (composedOf != oldComposedOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.COMPOSITION__COMPOSED_OF,
							oldComposedOf, composedOf));
			}
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetComposedOf() {
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposedOf(Node newComposedOf) {
		Node oldComposedOf = composedOf;
		composedOf = newComposedOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.COMPOSITION__COMPOSED_OF, oldComposedOf,
					composedOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultAtTgt() {
		return multAtTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultAtTgt(String newMultAtTgt) {
		String oldMultAtTgt = multAtTgt;
		multAtTgt = newMultAtTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.COMPOSITION__MULT_AT_TGT, oldMultAtTgt,
					multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelAtTgt() {
		return labelAtTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelAtTgt(String newLabelAtTgt) {
		String oldLabelAtTgt = labelAtTgt;
		labelAtTgt = newLabelAtTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.COMPOSITION__LABEL_AT_TGT,
					oldLabelAtTgt, labelAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WFP_V2Package.COMPOSITION__COMPOSES:
			if (resolve)
				return getComposes();
			return basicGetComposes();
		case WFP_V2Package.COMPOSITION__COMPOSED_OF:
			if (resolve)
				return getComposedOf();
			return basicGetComposedOf();
		case WFP_V2Package.COMPOSITION__MULT_AT_TGT:
			return getMultAtTgt();
		case WFP_V2Package.COMPOSITION__LABEL_AT_TGT:
			return getLabelAtTgt();
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
		case WFP_V2Package.COMPOSITION__COMPOSES:
			setComposes((Node) newValue);
			return;
		case WFP_V2Package.COMPOSITION__COMPOSED_OF:
			setComposedOf((Node) newValue);
			return;
		case WFP_V2Package.COMPOSITION__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WFP_V2Package.COMPOSITION__LABEL_AT_TGT:
			setLabelAtTgt((String) newValue);
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
		case WFP_V2Package.COMPOSITION__COMPOSES:
			setComposes((Node) null);
			return;
		case WFP_V2Package.COMPOSITION__COMPOSED_OF:
			setComposedOf((Node) null);
			return;
		case WFP_V2Package.COMPOSITION__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WFP_V2Package.COMPOSITION__LABEL_AT_TGT:
			setLabelAtTgt(LABEL_AT_TGT_EDEFAULT);
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
		case WFP_V2Package.COMPOSITION__COMPOSES:
			return composes != null;
		case WFP_V2Package.COMPOSITION__COMPOSED_OF:
			return composedOf != null;
		case WFP_V2Package.COMPOSITION__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WFP_V2Package.COMPOSITION__LABEL_AT_TGT:
			return LABEL_AT_TGT_EDEFAULT == null ? labelAtTgt != null : !LABEL_AT_TGT_EDEFAULT.equals(labelAtTgt);
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
		result.append(" (MultAtTgt: ");
		result.append(multAtTgt);
		result.append(", LabelAtTgt: ");
		result.append(labelAtTgt);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl
