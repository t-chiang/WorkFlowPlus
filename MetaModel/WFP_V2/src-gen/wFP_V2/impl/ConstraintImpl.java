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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import wFP_V2.Argument;
import wFP_V2.Constraint;
import wFP_V2.Node;
import wFP_V2.Reference;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#getNode <em>Node</em>}</li>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#getBody <em>Body</em>}</li>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link wFP_V2.impl.ConstraintImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

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
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectResolvingEList<Node>(Node.class, this, WFP_V2Package.CONSTRAINT__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.CONSTRAINT__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.CONSTRAINT__SYNTACTIC, oldSyntactic,
					syntactic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WFP_V2Package.CONSTRAINT__ARGUMENT, WFP_V2Package.ARGUMENT__CONSTRAINT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Reference>(Reference.class, this,
					WFP_V2Package.CONSTRAINT__REFERENCE);
		}
		return reference;
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
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArgument()).basicAdd(otherEnd, msgs);
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
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
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
		case WFP_V2Package.CONSTRAINT__NAME:
			return getName();
		case WFP_V2Package.CONSTRAINT__NODE:
			return getNode();
		case WFP_V2Package.CONSTRAINT__BODY:
			return getBody();
		case WFP_V2Package.CONSTRAINT__SYNTACTIC:
			return isSyntactic();
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
			return getArgument();
		case WFP_V2Package.CONSTRAINT__REFERENCE:
			return getReference();
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
		case WFP_V2Package.CONSTRAINT__NAME:
			setName((String) newValue);
			return;
		case WFP_V2Package.CONSTRAINT__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case WFP_V2Package.CONSTRAINT__BODY:
			setBody((String) newValue);
			return;
		case WFP_V2Package.CONSTRAINT__SYNTACTIC:
			setSyntactic((Boolean) newValue);
			return;
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
			getArgument().clear();
			getArgument().addAll((Collection<? extends Argument>) newValue);
			return;
		case WFP_V2Package.CONSTRAINT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
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
		case WFP_V2Package.CONSTRAINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WFP_V2Package.CONSTRAINT__NODE:
			getNode().clear();
			return;
		case WFP_V2Package.CONSTRAINT__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case WFP_V2Package.CONSTRAINT__SYNTACTIC:
			setSyntactic(SYNTACTIC_EDEFAULT);
			return;
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
			getArgument().clear();
			return;
		case WFP_V2Package.CONSTRAINT__REFERENCE:
			getReference().clear();
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
		case WFP_V2Package.CONSTRAINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WFP_V2Package.CONSTRAINT__NODE:
			return node != null && !node.isEmpty();
		case WFP_V2Package.CONSTRAINT__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case WFP_V2Package.CONSTRAINT__SYNTACTIC:
			return syntactic != SYNTACTIC_EDEFAULT;
		case WFP_V2Package.CONSTRAINT__ARGUMENT:
			return argument != null && !argument.isEmpty();
		case WFP_V2Package.CONSTRAINT__REFERENCE:
			return reference != null && !reference.isEmpty();
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
		result.append(", body: ");
		result.append(body);
		result.append(", syntactic: ");
		result.append(syntactic);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
