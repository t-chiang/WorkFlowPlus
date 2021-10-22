/**
 */
package wFP_V2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import wFP_V2.Data;
import wFP_V2.Input;
import wFP_V2.Output;
import wFP_V2.WFP_V2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wFP_V2.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link wFP_V2.impl.DataImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link wFP_V2.impl.DataImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataImpl extends NodeImpl implements Data {
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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFP_V2Package.Literals.DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WFP_V2Package.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<Output>(Output.class, this, WFP_V2Package.DATA__OUTPUT,
					WFP_V2Package.OUTPUT__TGT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<Input>(Input.class, this, WFP_V2Package.DATA__INPUT,
					WFP_V2Package.INPUT__SRC);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void forwardImpactAnalysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<? extends Input> inputs = this.getInput();
		Iterator<? extends Input> itInput = inputs.iterator();
		while (itInput.hasNext()) {
			Input nextInput = itInput.next();
			EList<? extends Output> outputs = nextInput.getTgt().getOutput();
			Iterator<? extends Output> itOutput = outputs.iterator();
			while (itOutput.hasNext()) {
				Data dataOutput = (Data) itOutput.next().getTgt();
				//This line will return the same element that is put in, but instead of as an ecore class it will be of a sirius class that will allow for the manipulation of the concrete syntax in the model instance.
				Set<? extends DSemanticDecorator> result = (Set<? extends DSemanticDecorator>) new EObjectQuery(
						dataOutput).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
				DDiagramElementContainer myContainer = (DDiagramElementContainer) result.iterator().next();
				ContainerStyle containerStyle = myContainer.getOwnedStyle();
				RGBValues newBorderColor = RGBValues.create(255, 0, 0);
				containerStyle.setBorderColor(newBorderColor);
				containerStyle.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				dataOutput.forwardImpactAnalysis();
			}

		}
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void backwardImpactAnalysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<? extends Output> outputs = this.getOutput();
		Iterator<? extends Output> itOutputs = outputs.iterator();
		while (itOutputs.hasNext()) {
			EList<? extends Input> inputs = itOutputs.next().getSrc().getInput();
			Iterator<? extends Input> itInputs = inputs.iterator();
			while (itInputs.hasNext()) {
				Data dataInput = (Data) itInputs.next().getSrc();
				Set<? extends DSemanticDecorator> result = (Set<? extends DSemanticDecorator>) new EObjectQuery(
						dataInput).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
				DDiagramElementContainer myContainer = (DDiagramElementContainer) result.iterator().next();
				ContainerStyle containerStyle = myContainer.getOwnedStyle();
				RGBValues newBorderColor = RGBValues.create(255, 0, 0);
				containerStyle.setBorderColor(newBorderColor);
				containerStyle.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				dataInput.backwardImpactAnalysis();
			}
		}
		//throw new UnsupportedOperationException();
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
		case WFP_V2Package.DATA__OUTPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutput()).basicAdd(otherEnd, msgs);
		case WFP_V2Package.DATA__INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInput()).basicAdd(otherEnd, msgs);
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
		case WFP_V2Package.DATA__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		case WFP_V2Package.DATA__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
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
		case WFP_V2Package.DATA__NAME:
			return getName();
		case WFP_V2Package.DATA__OUTPUT:
			return getOutput();
		case WFP_V2Package.DATA__INPUT:
			return getInput();
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
		case WFP_V2Package.DATA__NAME:
			setName((String) newValue);
			return;
		case WFP_V2Package.DATA__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Output>) newValue);
			return;
		case WFP_V2Package.DATA__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Input>) newValue);
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
		case WFP_V2Package.DATA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WFP_V2Package.DATA__OUTPUT:
			getOutput().clear();
			return;
		case WFP_V2Package.DATA__INPUT:
			getInput().clear();
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
		case WFP_V2Package.DATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WFP_V2Package.DATA__OUTPUT:
			return output != null && !output.isEmpty();
		case WFP_V2Package.DATA__INPUT:
			return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WFP_V2Package.DATA___FORWARD_IMPACT_ANALYSIS:
			forwardImpactAnalysis();
			return null;
		case WFP_V2Package.DATA___BACKWARD_IMPACT_ANALYSIS:
			backwardImpactAnalysis();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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

} //DataImpl
