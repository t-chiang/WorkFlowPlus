/**
 */
package wFP_V2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wFP_V2.Association;
import wFP_V2.Node;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getMultAtSrc <em>Mult At Src</em>}</li>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getMultAtTgt <em>Mult At Tgt</em>}</li>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getLabelAtSrc <em>Label At Src</em>}</li>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getLabelAtTgt <em>Label At Tgt</em>}</li>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link wFP_V2.impl.AssociationImpl#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ReferenceImpl implements Association {
	/**
	 * The default value of the '{@link #getMultAtSrc() <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String MULT_AT_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultAtSrc() <em>Mult At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultAtSrc()
	 * @generated
	 * @ordered
	 */
	protected String multAtSrc = MULT_AT_SRC_EDEFAULT;

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
	 * The default value of the '{@link #getLabelAtSrc() <em>Label At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_AT_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelAtSrc() <em>Label At Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAtSrc()
	 * @generated
	 * @ordered
	 */
	protected String labelAtSrc = LABEL_AT_SRC_EDEFAULT;

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
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Node src;

	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected Node tgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultAtSrc() {
		return multAtSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultAtSrc(String newMultAtSrc) {
		String oldMultAtSrc = multAtSrc;
		multAtSrc = newMultAtSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__MULT_AT_SRC, oldMultAtSrc,
					multAtSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__MULT_AT_TGT, oldMultAtTgt,
					multAtTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (Node) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.ASSOCIATION__TGT, oldTgt,
							tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(Node newTgt, NotificationChain msgs) {
		Node oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WFP_V2Package.ASSOCIATION__TGT, oldTgt, newTgt);
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
	@Override
	public void setTgt(Node newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WFP_V2Package.NODE__ASSOCIATION_SRC, Node.class,
						msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, WFP_V2Package.NODE__ASSOCIATION_SRC, Node.class,
						msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WFP_V2Package.ASSOCIATION__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WFP_V2Package.NODE__ASSOCIATION_TGT, Node.class,
						msgs);
			return basicSetSrc((Node) otherEnd, msgs);
		case WFP_V2Package.ASSOCIATION__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, WFP_V2Package.NODE__ASSOCIATION_SRC, Node.class,
						msgs);
			return basicSetTgt((Node) otherEnd, msgs);
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
		case WFP_V2Package.ASSOCIATION__SRC:
			return basicSetSrc(null, msgs);
		case WFP_V2Package.ASSOCIATION__TGT:
			return basicSetTgt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Node) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WFP_V2Package.ASSOCIATION__SRC, oldSrc,
							src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Node newSrc, NotificationChain msgs) {
		Node oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WFP_V2Package.ASSOCIATION__SRC, oldSrc, newSrc);
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
	@Override
	public void setSrc(Node newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, WFP_V2Package.NODE__ASSOCIATION_TGT, Node.class,
						msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, WFP_V2Package.NODE__ASSOCIATION_TGT, Node.class,
						msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelAtSrc() {
		return labelAtSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelAtSrc(String newLabelAtSrc) {
		String oldLabelAtSrc = labelAtSrc;
		labelAtSrc = newLabelAtSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__LABEL_AT_SRC,
					oldLabelAtSrc, labelAtSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.ASSOCIATION__LABEL_AT_TGT,
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
		case WFP_V2Package.ASSOCIATION__MULT_AT_SRC:
			return getMultAtSrc();
		case WFP_V2Package.ASSOCIATION__MULT_AT_TGT:
			return getMultAtTgt();
		case WFP_V2Package.ASSOCIATION__LABEL_AT_SRC:
			return getLabelAtSrc();
		case WFP_V2Package.ASSOCIATION__LABEL_AT_TGT:
			return getLabelAtTgt();
		case WFP_V2Package.ASSOCIATION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case WFP_V2Package.ASSOCIATION__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
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
		case WFP_V2Package.ASSOCIATION__MULT_AT_SRC:
			setMultAtSrc((String) newValue);
			return;
		case WFP_V2Package.ASSOCIATION__MULT_AT_TGT:
			setMultAtTgt((String) newValue);
			return;
		case WFP_V2Package.ASSOCIATION__LABEL_AT_SRC:
			setLabelAtSrc((String) newValue);
			return;
		case WFP_V2Package.ASSOCIATION__LABEL_AT_TGT:
			setLabelAtTgt((String) newValue);
			return;
		case WFP_V2Package.ASSOCIATION__SRC:
			setSrc((Node) newValue);
			return;
		case WFP_V2Package.ASSOCIATION__TGT:
			setTgt((Node) newValue);
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
		case WFP_V2Package.ASSOCIATION__MULT_AT_SRC:
			setMultAtSrc(MULT_AT_SRC_EDEFAULT);
			return;
		case WFP_V2Package.ASSOCIATION__MULT_AT_TGT:
			setMultAtTgt(MULT_AT_TGT_EDEFAULT);
			return;
		case WFP_V2Package.ASSOCIATION__LABEL_AT_SRC:
			setLabelAtSrc(LABEL_AT_SRC_EDEFAULT);
			return;
		case WFP_V2Package.ASSOCIATION__LABEL_AT_TGT:
			setLabelAtTgt(LABEL_AT_TGT_EDEFAULT);
			return;
		case WFP_V2Package.ASSOCIATION__SRC:
			setSrc((Node) null);
			return;
		case WFP_V2Package.ASSOCIATION__TGT:
			setTgt((Node) null);
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
		case WFP_V2Package.ASSOCIATION__MULT_AT_SRC:
			return MULT_AT_SRC_EDEFAULT == null ? multAtSrc != null : !MULT_AT_SRC_EDEFAULT.equals(multAtSrc);
		case WFP_V2Package.ASSOCIATION__MULT_AT_TGT:
			return MULT_AT_TGT_EDEFAULT == null ? multAtTgt != null : !MULT_AT_TGT_EDEFAULT.equals(multAtTgt);
		case WFP_V2Package.ASSOCIATION__LABEL_AT_SRC:
			return LABEL_AT_SRC_EDEFAULT == null ? labelAtSrc != null : !LABEL_AT_SRC_EDEFAULT.equals(labelAtSrc);
		case WFP_V2Package.ASSOCIATION__LABEL_AT_TGT:
			return LABEL_AT_TGT_EDEFAULT == null ? labelAtTgt != null : !LABEL_AT_TGT_EDEFAULT.equals(labelAtTgt);
		case WFP_V2Package.ASSOCIATION__SRC:
			return src != null;
		case WFP_V2Package.ASSOCIATION__TGT:
			return tgt != null;
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
		result.append(" (MultAtSrc: ");
		result.append(multAtSrc);
		result.append(", MultAtTgt: ");
		result.append(multAtTgt);
		result.append(", LabelAtSrc: ");
		result.append(labelAtSrc);
		result.append(", LabelAtTgt: ");
		result.append(labelAtTgt);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
