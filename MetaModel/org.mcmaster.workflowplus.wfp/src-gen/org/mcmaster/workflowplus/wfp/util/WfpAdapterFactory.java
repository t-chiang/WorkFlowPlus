/**
 */
package org.mcmaster.workflowplus.wfp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mcmaster.workflowplus.wfp.Argument;
import org.mcmaster.workflowplus.wfp.Association;
import org.mcmaster.workflowplus.wfp.AtomicData;
import org.mcmaster.workflowplus.wfp.AtomicProcess;
import org.mcmaster.workflowplus.wfp.Attribute;
import org.mcmaster.workflowplus.wfp.Composition;
import org.mcmaster.workflowplus.wfp.Constraint;
import org.mcmaster.workflowplus.wfp.Data;
import org.mcmaster.workflowplus.wfp.InPort;
import org.mcmaster.workflowplus.wfp.Inheritance;
import org.mcmaster.workflowplus.wfp.Input;
import org.mcmaster.workflowplus.wfp.Node;
import org.mcmaster.workflowplus.wfp.OutPort;
import org.mcmaster.workflowplus.wfp.Output;
import org.mcmaster.workflowplus.wfp.Reference;
import org.mcmaster.workflowplus.wfp.ReifyAssociation;
import org.mcmaster.workflowplus.wfp.WfpPackage;
import org.mcmaster.workflowplus.wfp.WorkFlow;
import org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot;
import org.mcmaster.workflowplus.wfp.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mcmaster.workflowplus.wfp.WfpPackage
 * @generated
 */
public class WfpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WfpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WfpPackage.eINSTANCE;
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
	protected WfpSwitch<Adapter> modelSwitch = new WfpSwitch<Adapter>() {
		@Override
		public Adapter caseWorkFlowPlusRoot(WorkFlowPlusRoot object) {
			return createWorkFlowPlusRootAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseProcess(org.mcmaster.workflowplus.wfp.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseAtomicData(AtomicData object) {
			return createAtomicDataAdapter();
		}

		@Override
		public Adapter caseAtomicProcess(AtomicProcess object) {
			return createAtomicProcessAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
		}

		@Override
		public Adapter caseWorkProduct(WorkProduct object) {
			return createWorkProductAdapter();
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
		public Adapter caseArgument(Argument object) {
			return createArgumentAdapter();
		}

		@Override
		public Adapter caseInheritance(Inheritance object) {
			return createInheritanceAdapter();
		}

		@Override
		public Adapter caseComposition(Composition object) {
			return createCompositionAdapter();
		}

		@Override
		public Adapter caseAssociation(Association object) {
			return createAssociationAdapter();
		}

		@Override
		public Adapter caseReifyAssociation(ReifyAssociation object) {
			return createReifyAssociationAdapter();
		}

		@Override
		public Adapter caseWorkFlow(WorkFlow object) {
			return createWorkFlowAdapter();
		}

		@Override
		public Adapter caseInPort(InPort object) {
			return createInPortAdapter();
		}

		@Override
		public Adapter caseOutPort(OutPort object) {
			return createOutPortAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot <em>Work Flow Plus Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot
	 * @generated
	 */
	public Adapter createWorkFlowPlusRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.AtomicData <em>Atomic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.AtomicData
	 * @generated
	 */
	public Adapter createAtomicDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.AtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.AtomicProcess
	 * @generated
	 */
	public Adapter createAtomicProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.WorkProduct
	 * @generated
	 */
	public Adapter createWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Inheritance
	 * @generated
	 */
	public Adapter createInheritanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation
	 * @generated
	 */
	public Adapter createReifyAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlow
	 * @generated
	 */
	public Adapter createWorkFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.InPort
	 * @generated
	 */
	public Adapter createInPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.workflowplus.wfp.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.workflowplus.wfp.OutPort
	 * @generated
	 */
	public Adapter createOutPortAdapter() {
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

} //WfpAdapterFactory
