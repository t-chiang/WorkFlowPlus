/**
 */
package wFP_V2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wFP_V2.WFP_V2Package
 * @generated
 */
public class WFP_V2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WFP_V2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFP_V2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WFP_V2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WFP_V2Switch<Adapter> modelSwitch = new WFP_V2Switch<Adapter>() {
		@Override
		public Adapter caseWorkFlowPlus(WorkFlowPlus object) {
			return createWorkFlowPlusAdapter();
		}

		@Override
		public Adapter caseProcess(wFP_V2.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseData_Definition(Data_Definition object) {
			return createData_DefinitionAdapter();
		}

		@Override
		public Adapter caseData_Element(Data_Element object) {
			return createData_ElementAdapter();
		}

		@Override
		public Adapter caseComposed_Process_Definition(Composed_Process_Definition object) {
			return createComposed_Process_DefinitionAdapter();
		}

		@Override
		public Adapter caseAutomatic_Process_Definition(Automatic_Process_Definition object) {
			return createAutomatic_Process_DefinitionAdapter();
		}

		@Override
		public Adapter caseAtomic_Process_Definition(Atomic_Process_Definition object) {
			return createAtomic_Process_DefinitionAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseReify_Association(Reify_Association object) {
			return createReify_AssociationAdapter();
		}

		@Override
		public Adapter caseComposition(Composition object) {
			return createCompositionAdapter();
		}

		@Override
		public Adapter caseInheritance(Inheritance object) {
			return createInheritanceAdapter();
		}

		@Override
		public Adapter caseWork_Product(Work_Product object) {
			return createWork_ProductAdapter();
		}

		@Override
		public Adapter casePerformance_Data(Performance_Data object) {
			return createPerformance_DataAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseAggregation(Aggregation object) {
			return createAggregationAdapter();
		}

		@Override
		public Adapter caseArgument(Argument object) {
			return createArgumentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.WorkFlowPlus <em>Work Flow Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.WorkFlowPlus
	 * @generated
	 */
	public Adapter createWorkFlowPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Data_Definition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Data_Definition
	 * @generated
	 */
	public Adapter createData_DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Data_Element <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Data_Element
	 * @generated
	 */
	public Adapter createData_ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Composed_Process_Definition <em>Composed Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Composed_Process_Definition
	 * @generated
	 */
	public Adapter createComposed_Process_DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Automatic_Process_Definition <em>Automatic Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Automatic_Process_Definition
	 * @generated
	 */
	public Adapter createAutomatic_Process_DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Atomic_Process_Definition <em>Atomic Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Atomic_Process_Definition
	 * @generated
	 */
	public Adapter createAtomic_Process_DefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Reify_Association <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Reify_Association
	 * @generated
	 */
	public Adapter createReify_AssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Work_Product <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Work_Product
	 * @generated
	 */
	public Adapter createWork_ProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Performance_Data <em>Performance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Performance_Data
	 * @generated
	 */
	public Adapter createPerformance_DataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wFP_V2.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wFP_V2.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WFP_V2AdapterFactory
