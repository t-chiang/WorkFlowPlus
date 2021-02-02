/**
 */
package wFP_V2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wFP_V2.Aggregation;
import wFP_V2.Association;
import wFP_V2.Atomic_Process_Definition;
import wFP_V2.Attribute;
import wFP_V2.Automatic_Process_Definition;
import wFP_V2.Composed_Process_Definition;
import wFP_V2.Composition;
import wFP_V2.Constraint;
import wFP_V2.Data_Definition;
import wFP_V2.Data_Element;
import wFP_V2.Inheritance;
import wFP_V2.Input;
import wFP_V2.Output;
import wFP_V2.Performance_Data;
import wFP_V2.Reify_Association;
import wFP_V2.WFP_V2Factory;
import wFP_V2.WFP_V2Package;
import wFP_V2.WorkFlowPlus;
import wFP_V2.Work_Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WFP_V2FactoryImpl extends EFactoryImpl implements WFP_V2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WFP_V2Factory init() {
		try {
			WFP_V2Factory theWFP_V2Factory = (WFP_V2Factory) EPackage.Registry.INSTANCE
					.getEFactory(WFP_V2Package.eNS_URI);
			if (theWFP_V2Factory != null) {
				return theWFP_V2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WFP_V2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFP_V2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WFP_V2Package.WORK_FLOW_PLUS:
			return createWorkFlowPlus();
		case WFP_V2Package.DATA_DEFINITION:
			return createData_Definition();
		case WFP_V2Package.DATA_ELEMENT:
			return createData_Element();
		case WFP_V2Package.COMPOSED_PROCESS_DEFINITION:
			return createComposed_Process_Definition();
		case WFP_V2Package.AUTOMATIC_PROCESS_DEFINITION:
			return createAutomatic_Process_Definition();
		case WFP_V2Package.ATOMIC_PROCESS_DEFINITION:
			return createAtomic_Process_Definition();
		case WFP_V2Package.ATTRIBUTE:
			return createAttribute();
		case WFP_V2Package.CONSTRAINT:
			return createConstraint();
		case WFP_V2Package.ASSOCIATION:
			return createAssociation();
		case WFP_V2Package.REIFY_ASSOCIATION:
			return createReify_Association();
		case WFP_V2Package.COMPOSITION:
			return createComposition();
		case WFP_V2Package.INHERITANCE:
			return createInheritance();
		case WFP_V2Package.WORK_PRODUCT:
			return createWork_Product();
		case WFP_V2Package.PERFORMANCE_DATA:
			return createPerformance_Data();
		case WFP_V2Package.OUTPUT:
			return createOutput();
		case WFP_V2Package.INPUT:
			return createInput();
		case WFP_V2Package.AGGREGATION:
			return createAggregation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkFlowPlus createWorkFlowPlus() {
		WorkFlowPlusImpl workFlowPlus = new WorkFlowPlusImpl();
		return workFlowPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data_Definition createData_Definition() {
		Data_DefinitionImpl data_Definition = new Data_DefinitionImpl();
		return data_Definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data_Element createData_Element() {
		Data_ElementImpl data_Element = new Data_ElementImpl();
		return data_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composed_Process_Definition createComposed_Process_Definition() {
		Composed_Process_DefinitionImpl composed_Process_Definition = new Composed_Process_DefinitionImpl();
		return composed_Process_Definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Automatic_Process_Definition createAutomatic_Process_Definition() {
		Automatic_Process_DefinitionImpl automatic_Process_Definition = new Automatic_Process_DefinitionImpl();
		return automatic_Process_Definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atomic_Process_Definition createAtomic_Process_Definition() {
		Atomic_Process_DefinitionImpl atomic_Process_Definition = new Atomic_Process_DefinitionImpl();
		return atomic_Process_Definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reify_Association createReify_Association() {
		Reify_AssociationImpl reify_Association = new Reify_AssociationImpl();
		return reify_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Work_Product createWork_Product() {
		Work_ProductImpl work_Product = new Work_ProductImpl();
		return work_Product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Performance_Data createPerformance_Data() {
		Performance_DataImpl performance_Data = new Performance_DataImpl();
		return performance_Data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFP_V2Package getWFP_V2Package() {
		return (WFP_V2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WFP_V2Package getPackage() {
		return WFP_V2Package.eINSTANCE;
	}

} //WFP_V2FactoryImpl
