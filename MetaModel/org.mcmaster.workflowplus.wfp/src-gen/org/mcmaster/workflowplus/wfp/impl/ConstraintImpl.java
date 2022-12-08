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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.workflowplus.wfp.Argument;
import org.mcmaster.workflowplus.wfp.Constraint;
import org.mcmaster.workflowplus.wfp.Node;
import org.mcmaster.workflowplus.wfp.Reference;
import org.mcmaster.workflowplus.wfp.WfpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#isSyntactic <em>Syntactic</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends NodeImpl implements Constraint {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

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
		return WfpPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.CONSTRAINT__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.CONSTRAINT__SYNTACTIC, oldSyntactic,
					syntactic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectWithInverseResolvingEList.ManyInverse<Argument>(Argument.class, this,
					WfpPackage.CONSTRAINT__ARGUMENT, WfpPackage.ARGUMENT__CONSTRAINT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Reference>(Reference.class, this, WfpPackage.CONSTRAINT__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectResolvingEList<Node>(Node.class, this, WfpPackage.CONSTRAINT__NODE);
		}
		return node;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WfpPackage.CONSTRAINT__NAME, oldName, name));
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
		case WfpPackage.CONSTRAINT__ARGUMENT:
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
		case WfpPackage.CONSTRAINT__ARGUMENT:
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
		case WfpPackage.CONSTRAINT__BODY:
			return getBody();
		case WfpPackage.CONSTRAINT__SYNTACTIC:
			return isSyntactic();
		case WfpPackage.CONSTRAINT__ARGUMENT:
			return getArgument();
		case WfpPackage.CONSTRAINT__REFERENCE:
			return getReference();
		case WfpPackage.CONSTRAINT__NODE:
			return getNode();
		case WfpPackage.CONSTRAINT__NAME:
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
		case WfpPackage.CONSTRAINT__BODY:
			setBody((String) newValue);
			return;
		case WfpPackage.CONSTRAINT__SYNTACTIC:
			setSyntactic((Boolean) newValue);
			return;
		case WfpPackage.CONSTRAINT__ARGUMENT:
			getArgument().clear();
			getArgument().addAll((Collection<? extends Argument>) newValue);
			return;
		case WfpPackage.CONSTRAINT__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case WfpPackage.CONSTRAINT__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case WfpPackage.CONSTRAINT__NAME:
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
		case WfpPackage.CONSTRAINT__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case WfpPackage.CONSTRAINT__SYNTACTIC:
			setSyntactic(SYNTACTIC_EDEFAULT);
			return;
		case WfpPackage.CONSTRAINT__ARGUMENT:
			getArgument().clear();
			return;
		case WfpPackage.CONSTRAINT__REFERENCE:
			getReference().clear();
			return;
		case WfpPackage.CONSTRAINT__NODE:
			getNode().clear();
			return;
		case WfpPackage.CONSTRAINT__NAME:
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
		case WfpPackage.CONSTRAINT__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case WfpPackage.CONSTRAINT__SYNTACTIC:
			return syntactic != SYNTACTIC_EDEFAULT;
		case WfpPackage.CONSTRAINT__ARGUMENT:
			return argument != null && !argument.isEmpty();
		case WfpPackage.CONSTRAINT__REFERENCE:
			return reference != null && !reference.isEmpty();
		case WfpPackage.CONSTRAINT__NODE:
			return node != null && !node.isEmpty();
		case WfpPackage.CONSTRAINT__NAME:
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
		result.append(" (body: ");
		result.append(body);
		result.append(", syntactic: ");
		result.append(syntactic);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
