/**
 */
package wFP_V2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import wFP_V2.WFP_V2Factory;
import wFP_V2.WFP_V2Package;
import wFP_V2.WorkFlowPlus;
import wFP_V2.Work_Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WFP_V2PackageImpl extends EPackageImpl implements WFP_V2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workFlowPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_DefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composed_Process_DefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automatic_Process_DefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomic_Process_DefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reify_AssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass work_ProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performance_DataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wFP_V2.WFP_V2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WFP_V2PackageImpl() {
		super(eNS_URI, WFP_V2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WFP_V2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WFP_V2Package init() {
		if (isInited)
			return (WFP_V2Package) EPackage.Registry.INSTANCE.getEPackage(WFP_V2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredWFP_V2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		WFP_V2PackageImpl theWFP_V2Package = registeredWFP_V2Package instanceof WFP_V2PackageImpl
				? (WFP_V2PackageImpl) registeredWFP_V2Package
				: new WFP_V2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWFP_V2Package.createPackageContents();

		// Initialize created meta-data
		theWFP_V2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWFP_V2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WFP_V2Package.eNS_URI, theWFP_V2Package);
		return theWFP_V2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkFlowPlus() {
		return workFlowPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkFlowPlus_Process() {
		return (EReference) workFlowPlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkFlowPlus_Data() {
		return (EReference) workFlowPlusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkFlowPlus_Constraint() {
		return (EReference) workFlowPlusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkFlowPlus_Reference() {
		return (EReference) workFlowPlusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkFlowPlus_Argument() {
		return (EReference) workFlowPlusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Name() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Next() {
		return (EReference) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Previous() {
		return (EReference) processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Input() {
		return (EReference) processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Output() {
		return (EReference) processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Name() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Output() {
		return (EReference) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Input() {
		return (EReference) dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getData__ForwardImpactAnalysis() {
		return dataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getData__BackwardImpactAnalysis() {
		return dataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData_Definition() {
		return data_DefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Definition_Data() {
		return (EReference) data_DefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Definition_IsNormative() {
		return (EAttribute) data_DefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData_Element() {
		return data_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Element_Attribute() {
		return (EReference) data_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Element_IsNormative() {
		return (EAttribute) data_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposed_Process_Definition() {
		return composed_Process_DefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposed_Process_Definition_Process() {
		return (EReference) composed_Process_DefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomatic_Process_Definition() {
		return automatic_Process_DefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomatic_Process_Definition_FormalDescription() {
		return (EAttribute) automatic_Process_DefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutomatic_Process_Definition_Attribute() {
		return (EReference) automatic_Process_DefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomic_Process_Definition() {
		return atomic_Process_DefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomic_Process_Definition_IsReview() {
		return (EAttribute) atomic_Process_DefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomic_Process_Definition_Attribute() {
		return (EReference) atomic_Process_DefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtomic_Process_Definition_IsQuery() {
		return (EAttribute) atomic_Process_DefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Description() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_IsExecutable() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Name() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Node() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Body() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Syntactic() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Argument() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Reference() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Aggregate() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Aggregation() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Reify_association() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Child() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Parent() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Association_src() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_ComposedOf() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Association_tgt() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Composition() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Reify_association() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_MultAtSrc() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_MultAtTgt() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Tgt() {
		return (EReference) associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Src() {
		return (EReference) associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_LabelAtSrc() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_LabelAtTgt() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReify_Association() {
		return reify_AssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReify_Association_Src() {
		return (EReference) reify_AssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReify_Association_Tgt() {
		return (EReference) reify_AssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReify_Association_LabelAtTgt() {
		return (EAttribute) reify_AssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReify_Association_MultAtTgt() {
		return (EAttribute) reify_AssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_MultAtTgt() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_LabelAtTgt() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Src() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Tgt() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInheritance_Src() {
		return (EReference) inheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInheritance_Tgt() {
		return (EReference) inheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWork_Product() {
		return work_ProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformance_Data() {
		return performance_DataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformance_Data_Attribute() {
		return (EReference) performance_DataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_MultAtSrc() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_MultAtTgt() {
		return (EAttribute) outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Tgt() {
		return (EReference) outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Src() {
		return (EReference) outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_MultAtSrc() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_MultAtTgt() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Src() {
		return (EReference) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Tgt() {
		return (EReference) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregation_LabelAtTgt() {
		return (EAttribute) aggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregation_MultAtTgt() {
		return (EAttribute) aggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAggregation_Src() {
		return (EReference) aggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAggregation_Tgt() {
		return (EReference) aggregationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArgument_Name() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArgument_Description() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgument_Constraint() {
		return (EReference) argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgument_Constructs() {
		return (EReference) argumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArgument_ConstructedBy() {
		return (EReference) argumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArgument_Syntactic() {
		return (EAttribute) argumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WFP_V2Factory getWFP_V2Factory() {
		return (WFP_V2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		workFlowPlusEClass = createEClass(WORK_FLOW_PLUS);
		createEReference(workFlowPlusEClass, WORK_FLOW_PLUS__PROCESS);
		createEReference(workFlowPlusEClass, WORK_FLOW_PLUS__DATA);
		createEReference(workFlowPlusEClass, WORK_FLOW_PLUS__CONSTRAINT);
		createEReference(workFlowPlusEClass, WORK_FLOW_PLUS__REFERENCE);
		createEReference(workFlowPlusEClass, WORK_FLOW_PLUS__ARGUMENT);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__NEXT);
		createEReference(processEClass, PROCESS__PREVIOUS);
		createEReference(processEClass, PROCESS__INPUT);
		createEReference(processEClass, PROCESS__OUTPUT);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__NAME);
		createEReference(dataEClass, DATA__OUTPUT);
		createEReference(dataEClass, DATA__INPUT);
		createEOperation(dataEClass, DATA___FORWARD_IMPACT_ANALYSIS);
		createEOperation(dataEClass, DATA___BACKWARD_IMPACT_ANALYSIS);

		data_DefinitionEClass = createEClass(DATA_DEFINITION);
		createEReference(data_DefinitionEClass, DATA_DEFINITION__DATA);
		createEAttribute(data_DefinitionEClass, DATA_DEFINITION__IS_NORMATIVE);

		data_ElementEClass = createEClass(DATA_ELEMENT);
		createEReference(data_ElementEClass, DATA_ELEMENT__ATTRIBUTE);
		createEAttribute(data_ElementEClass, DATA_ELEMENT__IS_NORMATIVE);

		composed_Process_DefinitionEClass = createEClass(COMPOSED_PROCESS_DEFINITION);
		createEReference(composed_Process_DefinitionEClass, COMPOSED_PROCESS_DEFINITION__PROCESS);

		automatic_Process_DefinitionEClass = createEClass(AUTOMATIC_PROCESS_DEFINITION);
		createEAttribute(automatic_Process_DefinitionEClass, AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION);
		createEReference(automatic_Process_DefinitionEClass, AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE);

		atomic_Process_DefinitionEClass = createEClass(ATOMIC_PROCESS_DEFINITION);
		createEAttribute(atomic_Process_DefinitionEClass, ATOMIC_PROCESS_DEFINITION__IS_REVIEW);
		createEReference(atomic_Process_DefinitionEClass, ATOMIC_PROCESS_DEFINITION__ATTRIBUTE);
		createEAttribute(atomic_Process_DefinitionEClass, ATOMIC_PROCESS_DEFINITION__IS_QUERY);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__DESCRIPTION);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_EXECUTABLE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEReference(constraintEClass, CONSTRAINT__NODE);
		createEAttribute(constraintEClass, CONSTRAINT__BODY);
		createEAttribute(constraintEClass, CONSTRAINT__SYNTACTIC);
		createEReference(constraintEClass, CONSTRAINT__ARGUMENT);
		createEReference(constraintEClass, CONSTRAINT__REFERENCE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__AGGREGATE);
		createEReference(nodeEClass, NODE__AGGREGATION);
		createEReference(nodeEClass, NODE__REIFY_ASSOCIATION);
		createEReference(nodeEClass, NODE__PARENT);
		createEReference(nodeEClass, NODE__CHILD);
		createEReference(nodeEClass, NODE__ASSOCIATION_TGT);
		createEReference(nodeEClass, NODE__ASSOCIATION_SRC);
		createEReference(nodeEClass, NODE__COMPOSED_OF);
		createEReference(nodeEClass, NODE__COMPOSITION);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REIFY_ASSOCIATION);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__MULT_AT_SRC);
		createEAttribute(associationEClass, ASSOCIATION__MULT_AT_TGT);
		createEAttribute(associationEClass, ASSOCIATION__LABEL_AT_SRC);
		createEAttribute(associationEClass, ASSOCIATION__LABEL_AT_TGT);
		createEReference(associationEClass, ASSOCIATION__SRC);
		createEReference(associationEClass, ASSOCIATION__TGT);

		reify_AssociationEClass = createEClass(REIFY_ASSOCIATION);
		createEAttribute(reify_AssociationEClass, REIFY_ASSOCIATION__LABEL_AT_TGT);
		createEAttribute(reify_AssociationEClass, REIFY_ASSOCIATION__MULT_AT_TGT);
		createEReference(reify_AssociationEClass, REIFY_ASSOCIATION__TGT);
		createEReference(reify_AssociationEClass, REIFY_ASSOCIATION__SRC);

		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__MULT_AT_TGT);
		createEAttribute(compositionEClass, COMPOSITION__LABEL_AT_TGT);
		createEReference(compositionEClass, COMPOSITION__SRC);
		createEReference(compositionEClass, COMPOSITION__TGT);

		inheritanceEClass = createEClass(INHERITANCE);
		createEReference(inheritanceEClass, INHERITANCE__SRC);
		createEReference(inheritanceEClass, INHERITANCE__TGT);

		work_ProductEClass = createEClass(WORK_PRODUCT);

		performance_DataEClass = createEClass(PERFORMANCE_DATA);
		createEReference(performance_DataEClass, PERFORMANCE_DATA__ATTRIBUTE);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__MULT_AT_SRC);
		createEAttribute(outputEClass, OUTPUT__MULT_AT_TGT);
		createEReference(outputEClass, OUTPUT__TGT);
		createEReference(outputEClass, OUTPUT__SRC);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__MULT_AT_SRC);
		createEAttribute(inputEClass, INPUT__MULT_AT_TGT);
		createEReference(inputEClass, INPUT__SRC);
		createEReference(inputEClass, INPUT__TGT);

		aggregationEClass = createEClass(AGGREGATION);
		createEAttribute(aggregationEClass, AGGREGATION__LABEL_AT_TGT);
		createEAttribute(aggregationEClass, AGGREGATION__MULT_AT_TGT);
		createEReference(aggregationEClass, AGGREGATION__SRC);
		createEReference(aggregationEClass, AGGREGATION__TGT);

		argumentEClass = createEClass(ARGUMENT);
		createEAttribute(argumentEClass, ARGUMENT__NAME);
		createEAttribute(argumentEClass, ARGUMENT__DESCRIPTION);
		createEReference(argumentEClass, ARGUMENT__CONSTRAINT);
		createEReference(argumentEClass, ARGUMENT__CONSTRUCTS);
		createEReference(argumentEClass, ARGUMENT__CONSTRUCTED_BY);
		createEAttribute(argumentEClass, ARGUMENT__SYNTACTIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processEClass.getESuperTypes().add(this.getNode());
		dataEClass.getESuperTypes().add(this.getNode());
		data_DefinitionEClass.getESuperTypes().add(this.getData());
		data_ElementEClass.getESuperTypes().add(this.getData());
		composed_Process_DefinitionEClass.getESuperTypes().add(this.getProcess());
		automatic_Process_DefinitionEClass.getESuperTypes().add(this.getProcess());
		atomic_Process_DefinitionEClass.getESuperTypes().add(this.getProcess());
		associationEClass.getESuperTypes().add(this.getReference());
		reify_AssociationEClass.getESuperTypes().add(this.getReference());
		compositionEClass.getESuperTypes().add(this.getReference());
		inheritanceEClass.getESuperTypes().add(this.getReference());
		work_ProductEClass.getESuperTypes().add(this.getData());
		performance_DataEClass.getESuperTypes().add(this.getData());
		outputEClass.getESuperTypes().add(this.getReference());
		inputEClass.getESuperTypes().add(this.getReference());
		aggregationEClass.getESuperTypes().add(this.getReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(workFlowPlusEClass, WorkFlowPlus.class, "WorkFlowPlus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkFlowPlus_Process(), this.getProcess(), null, "process", null, 0, -1, WorkFlowPlus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlowPlus_Data(), this.getData(), null, "data", null, 0, -1, WorkFlowPlus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlowPlus_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1,
				WorkFlowPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlowPlus_Reference(), this.getReference(), null, "reference", null, 0, -1,
				WorkFlowPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkFlowPlus_Argument(), this.getArgument(), null, "argument", null, 0, -1,
				WorkFlowPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, wFP_V2.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, wFP_V2.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Next(), this.getProcess(), this.getProcess_Previous(), "next", null, 0, -1,
				wFP_V2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Previous(), this.getProcess(), this.getProcess_Next(), "previous", null, 0, -1,
				wFP_V2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Input(), this.getInput(), this.getInput_Tgt(), "input", null, 0, -1,
				wFP_V2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Output(), this.getOutput(), this.getOutput_Src(), "output", null, 0, -1,
				wFP_V2.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", null, 1, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Output(), this.getOutput(), this.getOutput_Tgt(), "output", null, 0, -1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Input(), this.getInput(), this.getInput_Src(), "input", null, 0, -1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getData__ForwardImpactAnalysis(), null, "forwardImpactAnalysis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getData__BackwardImpactAnalysis(), null, "backwardImpactAnalysis", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(data_DefinitionEClass, Data_Definition.class, "Data_Definition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Definition_Data(), this.getData(), null, "data", null, 1, -1, Data_Definition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Definition_IsNormative(), ecorePackage.getEBoolean(), "isNormative", "false", 1, 1,
				Data_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(data_ElementEClass, Data_Element.class, "Data_Element", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Element_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1,
				Data_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Element_IsNormative(), ecorePackage.getEBoolean(), "isNormative", "false", 1, 1,
				Data_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(composed_Process_DefinitionEClass, Composed_Process_Definition.class, "Composed_Process_Definition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposed_Process_Definition_Process(), this.getProcess(), null, "process", null, 1, -1,
				Composed_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automatic_Process_DefinitionEClass, Automatic_Process_Definition.class,
				"Automatic_Process_Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomatic_Process_Definition_FormalDescription(), ecorePackage.getEString(),
				"formalDescription", null, 1, 1, Automatic_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomatic_Process_Definition_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1,
				Automatic_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomic_Process_DefinitionEClass, Atomic_Process_Definition.class, "Atomic_Process_Definition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomic_Process_Definition_IsReview(), ecorePackage.getEBoolean(), "isReview", "false", 1, 1,
				Atomic_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomic_Process_Definition_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1,
				Atomic_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomic_Process_Definition_IsQuery(), ecorePackage.getEBoolean(), "isQuery", null, 1, 1,
				Atomic_Process_Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Description(), ecorePackage.getEString(), "Description", null, 1, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsExecutable(), ecorePackage.getEBoolean(), "isExecutable", "false", 1, 1,
				Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Node(), this.getNode(), null, "node", null, 0, -1, Constraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConstraint_Body(), ecorePackage.getEString(), "body", null, 1, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Syntactic(), ecorePackage.getEBoolean(), "syntactic", "false", 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Argument(), this.getArgument(), this.getArgument_Constraint(), "argument", null, 1,
				-1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Reference(), this.getReference(), null, "reference", null, 0, -1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Aggregate(), this.getAggregation(), this.getAggregation_Src(), "aggregate", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Aggregation(), this.getAggregation(), this.getAggregation_Tgt(), "aggregation", null, 0,
				-1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Reify_association(), this.getReify_Association(), this.getReify_Association_Tgt(),
				"reify_association", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Parent(), this.getInheritance(), this.getInheritance_Src(), "parent", null, 0, 1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Child(), this.getInheritance(), this.getInheritance_Tgt(), "child", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Association_tgt(), this.getAssociation(), this.getAssociation_Src(), "association_tgt",
				null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Association_src(), this.getAssociation(), this.getAssociation_Tgt(), "association_src",
				null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ComposedOf(), this.getComposition(), this.getComposition_Src(), "composedOf", null, 0,
				-1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Composition(), this.getComposition(), this.getComposition_Tgt(), "composition", null, 0,
				1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Reify_association(), this.getReify_Association(), this.getReify_Association_Src(),
				"reify_association", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_MultAtSrc(), ecorePackage.getEString(), "MultAtSrc", null, 1, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_LabelAtSrc(), ecorePackage.getEString(), "LabelAtSrc", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_LabelAtTgt(), ecorePackage.getEString(), "LabelAtTgt", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Src(), this.getNode(), this.getNode_Association_tgt(), "src", null, 1, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Tgt(), this.getNode(), this.getNode_Association_src(), "tgt", null, 1, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reify_AssociationEClass, Reify_Association.class, "Reify_Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReify_Association_LabelAtTgt(), ecorePackage.getEString(), "LabelAtTgt", null, 0, 1,
				Reify_Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReify_Association_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1,
				Reify_Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getReify_Association_Tgt(), this.getNode(), this.getNode_Reify_association(), "tgt", null, 1, 1,
				Reify_Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReify_Association_Src(), this.getReference(), this.getReference_Reify_association(), "src",
				null, 1, 1, Reify_Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_LabelAtTgt(), ecorePackage.getEString(), "LabelAtTgt", null, 0, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Src(), this.getNode(), this.getNode_ComposedOf(), "src", null, 1, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Tgt(), this.getNode(), this.getNode_Composition(), "tgt", null, 1, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritance_Src(), this.getNode(), this.getNode_Parent(), "src", null, 1, 1,
				Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritance_Tgt(), this.getNode(), this.getNode_Child(), "tgt", null, 1, 1, Inheritance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(work_ProductEClass, Work_Product.class, "Work_Product", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(performance_DataEClass, Performance_Data.class, "Performance_Data", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformance_Data_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1,
				Performance_Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_MultAtSrc(), ecorePackage.getEString(), "MultAtSrc", null, 1, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Tgt(), this.getData(), this.getData_Output(), "tgt", null, 1, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Src(), this.getProcess(), this.getProcess_Output(), "src", null, 1, 1, Output.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_MultAtSrc(), ecorePackage.getEString(), "MultAtSrc", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Src(), this.getData(), this.getData_Input(), "src", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Tgt(), this.getProcess(), this.getProcess_Input(), "tgt", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregation_LabelAtTgt(), ecorePackage.getEString(), "LabelAtTgt", null, 0, 1,
				Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregation_MultAtTgt(), ecorePackage.getEString(), "MultAtTgt", null, 1, 1,
				Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAggregation_Src(), this.getNode(), this.getNode_Aggregate(), "src", null, 1, 1,
				Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregation_Tgt(), this.getNode(), this.getNode_Aggregation(), "tgt", null, 1, 1,
				Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgument_Name(), ecorePackage.getEString(), "name", null, 1, 1, Argument.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1, Argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Constraint(), this.getConstraint(), this.getConstraint_Argument(), "constraint",
				null, 1, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_Constructs(), this.getArgument(), this.getArgument_ConstructedBy(), "constructs",
				null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_ConstructedBy(), this.getArgument(), this.getArgument_Constructs(), "constructedBy",
				null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgument_Syntactic(), ecorePackage.getEBoolean(), "syntactic", "false", 1, 1, Argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(reify_AssociationEClass, source, new String[] {});
	}

} //WFP_V2PackageImpl
