/**
 */
package wFP_V2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wFP_V2.Aggregation;
import wFP_V2.Argument;
import wFP_V2.Association;
import wFP_V2.Atomic_Process_Definition;
import wFP_V2.Attribute;
import wFP_V2.Automatic_Process_Definition;
import wFP_V2.Composed_Process_Definition;
import wFP_V2.Composition;
import wFP_V2.Constraint;
import wFP_V2.Data;
import wFP_V2.Data_Definition;
import wFP_V2.Data_Element;
import wFP_V2.Inheritance;
import wFP_V2.Input;
import wFP_V2.Node;
import wFP_V2.Output;
import wFP_V2.Performance_Data;
import wFP_V2.Reference;
import wFP_V2.Reify_Association;
import wFP_V2.WFP_V2Package;
import wFP_V2.WorkFlowPlus;
import wFP_V2.Work_Product;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wFP_V2.WFP_V2Package
 * @generated
 */
public class WFP_V2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WFP_V2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFP_V2Switch() {
		if (modelPackage == null) {
			modelPackage = WFP_V2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case WFP_V2Package.WORK_FLOW_PLUS: {
			WorkFlowPlus workFlowPlus = (WorkFlowPlus) theEObject;
			T result = caseWorkFlowPlus(workFlowPlus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.PROCESS: {
			wFP_V2.Process process = (wFP_V2.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseNode(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseNode(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.DATA_DEFINITION: {
			Data_Definition data_Definition = (Data_Definition) theEObject;
			T result = caseData_Definition(data_Definition);
			if (result == null)
				result = caseData(data_Definition);
			if (result == null)
				result = caseNode(data_Definition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.DATA_ELEMENT: {
			Data_Element data_Element = (Data_Element) theEObject;
			T result = caseData_Element(data_Element);
			if (result == null)
				result = caseData(data_Element);
			if (result == null)
				result = caseNode(data_Element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.COMPOSED_PROCESS_DEFINITION: {
			Composed_Process_Definition composed_Process_Definition = (Composed_Process_Definition) theEObject;
			T result = caseComposed_Process_Definition(composed_Process_Definition);
			if (result == null)
				result = caseProcess(composed_Process_Definition);
			if (result == null)
				result = caseNode(composed_Process_Definition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION: {
			Automatic_Process_Definition automatic_Process_Definition = (Automatic_Process_Definition) theEObject;
			T result = caseAutomatic_Process_Definition(automatic_Process_Definition);
			if (result == null)
				result = caseProcess(automatic_Process_Definition);
			if (result == null)
				result = caseNode(automatic_Process_Definition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.ATOMIC_PROCESS_DEFINITION: {
			Atomic_Process_Definition atomic_Process_Definition = (Atomic_Process_Definition) theEObject;
			T result = caseAtomic_Process_Definition(atomic_Process_Definition);
			if (result == null)
				result = caseProcess(atomic_Process_Definition);
			if (result == null)
				result = caseNode(atomic_Process_Definition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.ASSOCIATION: {
			Association association = (Association) theEObject;
			T result = caseAssociation(association);
			if (result == null)
				result = caseReference(association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.REIFY_ASSOCIATION: {
			Reify_Association reify_Association = (Reify_Association) theEObject;
			T result = caseReify_Association(reify_Association);
			if (result == null)
				result = caseReference(reify_Association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.COMPOSITION: {
			Composition composition = (Composition) theEObject;
			T result = caseComposition(composition);
			if (result == null)
				result = caseReference(composition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.INHERITANCE: {
			Inheritance inheritance = (Inheritance) theEObject;
			T result = caseInheritance(inheritance);
			if (result == null)
				result = caseReference(inheritance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.WORK_PRODUCT: {
			Work_Product work_Product = (Work_Product) theEObject;
			T result = caseWork_Product(work_Product);
			if (result == null)
				result = caseData(work_Product);
			if (result == null)
				result = caseNode(work_Product);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.PERFORMANCE_DATA: {
			Performance_Data performance_Data = (Performance_Data) theEObject;
			T result = casePerformance_Data(performance_Data);
			if (result == null)
				result = caseData(performance_Data);
			if (result == null)
				result = caseNode(performance_Data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = caseReference(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseReference(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.AGGREGATION: {
			Aggregation aggregation = (Aggregation) theEObject;
			T result = caseAggregation(aggregation);
			if (result == null)
				result = caseReference(aggregation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WFP_V2Package.ARGUMENT: {
			Argument argument = (Argument) theEObject;
			T result = caseArgument(argument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Flow Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Flow Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkFlowPlus(WorkFlowPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(wFP_V2.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Definition(Data_Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Element(Data_Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposed_Process_Definition(Composed_Process_Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automatic Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automatic Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomatic_Process_Definition(Automatic_Process_Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomic_Process_Definition(Atomic_Process_Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reify Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reify Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReify_Association(Reify_Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritance(Inheritance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWork_Product(Work_Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance_Data(Performance_Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WFP_V2Switch
