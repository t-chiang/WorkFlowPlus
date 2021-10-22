/**
 */
package wFP_V2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wFP_V2.WFP_V2Factory
 * @model kind="package"
 * @generated
 */
public interface WFP_V2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wFP_V2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/wFP_V2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wFP_V2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WFP_V2Package eINSTANCE = wFP_V2.impl.WFP_V2PackageImpl.init();

	/**
	 * The meta object id for the '{@link wFP_V2.impl.WorkFlowPlusImpl <em>Work Flow Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.WorkFlowPlusImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getWorkFlowPlus()
	 * @generated
	 */
	int WORK_FLOW_PLUS = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS__PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS__DATA = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS__REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS__ARGUMENT = 4;

	/**
	 * The number of structural features of the '<em>Work Flow Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Work Flow Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.NodeImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 10;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AGGREGATE = 0;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AGGREGATION = 1;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REIFY_ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILD = 4;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ASSOCIATION_TGT = 5;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ASSOCIATION_SRC = 6;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSED_OF = 7;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSITION = 8;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.ProcessImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AGGREGATE = NODE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AGGREGATION = NODE__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CHILD = NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMPOSED_OF = NODE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__COMPOSITION = NODE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NEXT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PREVIOUS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUT = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.DataImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AGGREGATE = NODE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__AGGREGATION = NODE__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CHILD = NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__COMPOSED_OF = NODE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__COMPOSITION = NODE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTPUT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INPUT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___FORWARD_IMPACT_ANALYSIS = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___BACKWARD_IMPACT_ANALYSIS = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Data_DefinitionImpl <em>Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Data_DefinitionImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getData_Definition()
	 * @generated
	 */
	int DATA_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__AGGREGATE = DATA__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__AGGREGATION = DATA__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__CHILD = DATA__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__COMPOSED_OF = DATA__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__COMPOSITION = DATA__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__INPUT = DATA__INPUT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__DATA = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Normative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IS_NORMATIVE = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION___FORWARD_IMPACT_ANALYSIS = DATA___FORWARD_IMPACT_ANALYSIS;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION___BACKWARD_IMPACT_ANALYSIS = DATA___BACKWARD_IMPACT_ANALYSIS;

	/**
	 * The number of operations of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Data_ElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Data_ElementImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getData_Element()
	 * @generated
	 */
	int DATA_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__AGGREGATE = DATA__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__AGGREGATION = DATA__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CHILD = DATA__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMPOSED_OF = DATA__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMPOSITION = DATA__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__INPUT = DATA__INPUT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ATTRIBUTE = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Normative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__IS_NORMATIVE = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT___FORWARD_IMPACT_ANALYSIS = DATA___FORWARD_IMPACT_ANALYSIS;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT___BACKWARD_IMPACT_ANALYSIS = DATA___BACKWARD_IMPACT_ANALYSIS;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Composed_Process_DefinitionImpl <em>Composed Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Composed_Process_DefinitionImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getComposed_Process_Definition()
	 * @generated
	 */
	int COMPOSED_PROCESS_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__AGGREGATE = PROCESS__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__AGGREGATION = PROCESS__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__REIFY_ASSOCIATION = PROCESS__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__PARENT = PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__CHILD = PROCESS__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__ASSOCIATION_TGT = PROCESS__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__ASSOCIATION_SRC = PROCESS__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__COMPOSED_OF = PROCESS__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__COMPOSITION = PROCESS__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__NEXT = PROCESS__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__PREVIOUS = PROCESS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__INPUT = PROCESS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__OUTPUT = PROCESS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION__PROCESS = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composed Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROCESS_DEFINITION_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Automatic_Process_DefinitionImpl <em>Automatic Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Automatic_Process_DefinitionImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getAutomatic_Process_Definition()
	 * @generated
	 */
	int AUTOMATIC_PROCESS_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__AGGREGATE = PROCESS__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__AGGREGATION = PROCESS__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__REIFY_ASSOCIATION = PROCESS__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__PARENT = PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__CHILD = PROCESS__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__ASSOCIATION_TGT = PROCESS__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__ASSOCIATION_SRC = PROCESS__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__COMPOSED_OF = PROCESS__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__COMPOSITION = PROCESS__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__NEXT = PROCESS__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__PREVIOUS = PROCESS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__INPUT = PROCESS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__OUTPUT = PROCESS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Formal Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Automatic Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Automatic Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_PROCESS_DEFINITION_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Atomic_Process_DefinitionImpl <em>Atomic Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Atomic_Process_DefinitionImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getAtomic_Process_Definition()
	 * @generated
	 */
	int ATOMIC_PROCESS_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__AGGREGATE = PROCESS__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__AGGREGATION = PROCESS__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__REIFY_ASSOCIATION = PROCESS__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__PARENT = PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__CHILD = PROCESS__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__ASSOCIATION_TGT = PROCESS__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__ASSOCIATION_SRC = PROCESS__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__COMPOSED_OF = PROCESS__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__COMPOSITION = PROCESS__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__NEXT = PROCESS__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__PREVIOUS = PROCESS__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__INPUT = PROCESS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__OUTPUT = PROCESS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__IS_REVIEW = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__ATTRIBUTE = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION__IS_QUERY = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atomic Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_DEFINITION_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.AttributeImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_EXECUTABLE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.ConstraintImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NODE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = 2;

	/**
	 * The feature id for the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SYNTACTIC = 3;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REFERENCE = 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.ReferenceImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REIFY_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.AssociationImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 12;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LABEL_AT_SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SRC = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TGT = REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Reify_AssociationImpl <em>Reify Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Reify_AssociationImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getReify_Association()
	 * @generated
	 */
	int REIFY_ASSOCIATION = 13;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__SRC = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reify Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reify Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.CompositionImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 14;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.InheritanceImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 15;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Work_ProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Work_ProductImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getWork_Product()
	 * @generated
	 */
	int WORK_PRODUCT = 16;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__AGGREGATE = DATA__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__AGGREGATION = DATA__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CHILD = DATA__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__COMPOSED_OF = DATA__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__COMPOSITION = DATA__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__INPUT = DATA__INPUT;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___FORWARD_IMPACT_ANALYSIS = DATA___FORWARD_IMPACT_ANALYSIS;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___BACKWARD_IMPACT_ANALYSIS = DATA___BACKWARD_IMPACT_ANALYSIS;

	/**
	 * The number of operations of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.Performance_DataImpl <em>Performance Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.Performance_DataImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getPerformance_Data()
	 * @generated
	 */
	int PERFORMANCE_DATA = 17;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__AGGREGATE = DATA__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__AGGREGATION = DATA__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__CHILD = DATA__CHILD;

	/**
	 * The feature id for the '<em><b>Association tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__COMPOSED_OF = DATA__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__COMPOSITION = DATA__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__INPUT = DATA__INPUT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA__ATTRIBUTE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA___FORWARD_IMPACT_ANALYSIS = DATA___FORWARD_IMPACT_ANALYSIS;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA___BACKWARD_IMPACT_ANALYSIS = DATA___BACKWARD_IMPACT_ANALYSIS;

	/**
	 * The number of operations of the '<em>Performance Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.OutputImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SRC = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.InputImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 19;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.AggregationImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 20;

	/**
	 * The feature id for the '<em><b>Reify association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__REIFY_ASSOCIATION = REFERENCE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wFP_V2.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wFP_V2.impl.ArgumentImpl
	 * @see wFP_V2.impl.WFP_V2PackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRUCTS = 3;

	/**
	 * The feature id for the '<em><b>Constructed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRUCTED_BY = 4;

	/**
	 * The feature id for the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SYNTACTIC = 5;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link wFP_V2.WorkFlowPlus <em>Work Flow Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow Plus</em>'.
	 * @see wFP_V2.WorkFlowPlus
	 * @generated
	 */
	EClass getWorkFlowPlus();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.WorkFlowPlus#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see wFP_V2.WorkFlowPlus#getProcess()
	 * @see #getWorkFlowPlus()
	 * @generated
	 */
	EReference getWorkFlowPlus_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.WorkFlowPlus#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see wFP_V2.WorkFlowPlus#getData()
	 * @see #getWorkFlowPlus()
	 * @generated
	 */
	EReference getWorkFlowPlus_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.WorkFlowPlus#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see wFP_V2.WorkFlowPlus#getConstraint()
	 * @see #getWorkFlowPlus()
	 * @generated
	 */
	EReference getWorkFlowPlus_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.WorkFlowPlus#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see wFP_V2.WorkFlowPlus#getReference()
	 * @see #getWorkFlowPlus()
	 * @generated
	 */
	EReference getWorkFlowPlus_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.WorkFlowPlus#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see wFP_V2.WorkFlowPlus#getArgument()
	 * @see #getWorkFlowPlus()
	 * @generated
	 */
	EReference getWorkFlowPlus_Argument();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see wFP_V2.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wFP_V2.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Process#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see wFP_V2.Process#getNext()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Next();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Process#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see wFP_V2.Process#getPrevious()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Previous();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Process#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see wFP_V2.Process#getInput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Input();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Process#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see wFP_V2.Process#getOutput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Output();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see wFP_V2.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wFP_V2.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Data#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see wFP_V2.Data#getOutput()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Output();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Data#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see wFP_V2.Data#getInput()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Input();

	/**
	 * Returns the meta object for the '{@link wFP_V2.Data#forwardImpactAnalysis() <em>Forward Impact Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Forward Impact Analysis</em>' operation.
	 * @see wFP_V2.Data#forwardImpactAnalysis()
	 * @generated
	 */
	EOperation getData__ForwardImpactAnalysis();

	/**
	 * Returns the meta object for the '{@link wFP_V2.Data#backwardImpactAnalysis() <em>Backward Impact Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Backward Impact Analysis</em>' operation.
	 * @see wFP_V2.Data#backwardImpactAnalysis()
	 * @generated
	 */
	EOperation getData__BackwardImpactAnalysis();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Data_Definition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see wFP_V2.Data_Definition
	 * @generated
	 */
	EClass getData_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Data_Definition#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see wFP_V2.Data_Definition#getData()
	 * @see #getData_Definition()
	 * @generated
	 */
	EReference getData_Definition_Data();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Data_Definition#isIsNormative <em>Is Normative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Normative</em>'.
	 * @see wFP_V2.Data_Definition#isIsNormative()
	 * @see #getData_Definition()
	 * @generated
	 */
	EAttribute getData_Definition_IsNormative();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Data_Element <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see wFP_V2.Data_Element
	 * @generated
	 */
	EClass getData_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Data_Element#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see wFP_V2.Data_Element#getAttribute()
	 * @see #getData_Element()
	 * @generated
	 */
	EReference getData_Element_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Data_Element#isIsNormative <em>Is Normative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Normative</em>'.
	 * @see wFP_V2.Data_Element#isIsNormative()
	 * @see #getData_Element()
	 * @generated
	 */
	EAttribute getData_Element_IsNormative();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Composed_Process_Definition <em>Composed Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Process Definition</em>'.
	 * @see wFP_V2.Composed_Process_Definition
	 * @generated
	 */
	EClass getComposed_Process_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Composed_Process_Definition#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see wFP_V2.Composed_Process_Definition#getProcess()
	 * @see #getComposed_Process_Definition()
	 * @generated
	 */
	EReference getComposed_Process_Definition_Process();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Automatic_Process_Definition <em>Automatic Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Process Definition</em>'.
	 * @see wFP_V2.Automatic_Process_Definition
	 * @generated
	 */
	EClass getAutomatic_Process_Definition();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Automatic_Process_Definition#getFormalDescription <em>Formal Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Description</em>'.
	 * @see wFP_V2.Automatic_Process_Definition#getFormalDescription()
	 * @see #getAutomatic_Process_Definition()
	 * @generated
	 */
	EAttribute getAutomatic_Process_Definition_FormalDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Automatic_Process_Definition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see wFP_V2.Automatic_Process_Definition#getAttribute()
	 * @see #getAutomatic_Process_Definition()
	 * @generated
	 */
	EReference getAutomatic_Process_Definition_Attribute();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Atomic_Process_Definition <em>Atomic Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Process Definition</em>'.
	 * @see wFP_V2.Atomic_Process_Definition
	 * @generated
	 */
	EClass getAtomic_Process_Definition();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Atomic_Process_Definition#isIsReview <em>Is Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Review</em>'.
	 * @see wFP_V2.Atomic_Process_Definition#isIsReview()
	 * @see #getAtomic_Process_Definition()
	 * @generated
	 */
	EAttribute getAtomic_Process_Definition_IsReview();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Atomic_Process_Definition#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see wFP_V2.Atomic_Process_Definition#getAttribute()
	 * @see #getAtomic_Process_Definition()
	 * @generated
	 */
	EReference getAtomic_Process_Definition_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Atomic_Process_Definition#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see wFP_V2.Atomic_Process_Definition#isIsQuery()
	 * @see #getAtomic_Process_Definition()
	 * @generated
	 */
	EAttribute getAtomic_Process_Definition_IsQuery();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see wFP_V2.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wFP_V2.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wFP_V2.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Attribute#isIsExecutable <em>Is Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Executable</em>'.
	 * @see wFP_V2.Attribute#isIsExecutable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsExecutable();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see wFP_V2.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wFP_V2.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Constraint#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see wFP_V2.Constraint#getNode()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Node();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see wFP_V2.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Body();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Constraint#isSyntactic <em>Syntactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntactic</em>'.
	 * @see wFP_V2.Constraint#isSyntactic()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Syntactic();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Constraint#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument</em>'.
	 * @see wFP_V2.Constraint#getArgument()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Argument();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Constraint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see wFP_V2.Constraint#getReference()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Reference();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see wFP_V2.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregate</em>'.
	 * @see wFP_V2.Node#getAggregate()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Aggregate();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregation</em>'.
	 * @see wFP_V2.Node#getAggregation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Node#getReify_association <em>Reify association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reify association</em>'.
	 * @see wFP_V2.Node#getReify_association()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Reify_association();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see wFP_V2.Node#getChild()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Child();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see wFP_V2.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getAssociation_src <em>Association src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association src</em>'.
	 * @see wFP_V2.Node#getAssociation_src()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Association_src();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed Of</em>'.
	 * @see wFP_V2.Node#getComposedOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ComposedOf();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Node#getAssociation_tgt <em>Association tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association tgt</em>'.
	 * @see wFP_V2.Node#getAssociation_tgt()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Association_tgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Node#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composition</em>'.
	 * @see wFP_V2.Node#getComposition()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Composition();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see wFP_V2.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Reference#getReify_association <em>Reify association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reify association</em>'.
	 * @see wFP_V2.Reference#getReify_association()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reify_association();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see wFP_V2.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Association#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see wFP_V2.Association#getMultAtSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Association#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Association#getMultAtTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Association#getTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Tgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Association#getSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Src();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Association#getLabelAtSrc <em>Label At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Src</em>'.
	 * @see wFP_V2.Association#getLabelAtSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LabelAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Association#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see wFP_V2.Association#getLabelAtTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LabelAtTgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Reify_Association <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reify Association</em>'.
	 * @see wFP_V2.Reify_Association
	 * @generated
	 */
	EClass getReify_Association();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Reify_Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Reify_Association#getSrc()
	 * @see #getReify_Association()
	 * @generated
	 */
	EReference getReify_Association_Src();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Reify_Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Reify_Association#getTgt()
	 * @see #getReify_Association()
	 * @generated
	 */
	EReference getReify_Association_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Reify_Association#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see wFP_V2.Reify_Association#getLabelAtTgt()
	 * @see #getReify_Association()
	 * @generated
	 */
	EAttribute getReify_Association_LabelAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Reify_Association#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Reify_Association#getMultAtTgt()
	 * @see #getReify_Association()
	 * @generated
	 */
	EAttribute getReify_Association_MultAtTgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see wFP_V2.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Composition#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Composition#getMultAtTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_MultAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Composition#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see wFP_V2.Composition#getLabelAtTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_LabelAtTgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Composition#getSrc()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Src();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Composition#getTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Tgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see wFP_V2.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Inheritance#getSrc()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Src();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Inheritance#getTgt()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Tgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Work_Product <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see wFP_V2.Work_Product
	 * @generated
	 */
	EClass getWork_Product();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Performance_Data <em>Performance Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Data</em>'.
	 * @see wFP_V2.Performance_Data
	 * @generated
	 */
	EClass getPerformance_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link wFP_V2.Performance_Data#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see wFP_V2.Performance_Data#getAttribute()
	 * @see #getPerformance_Data()
	 * @generated
	 */
	EReference getPerformance_Data_Attribute();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see wFP_V2.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Output#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see wFP_V2.Output#getMultAtSrc()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Output#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Output#getMultAtTgt()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Output#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Output#getTgt()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Tgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Output#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Output#getSrc()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Src();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see wFP_V2.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Input#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see wFP_V2.Input#getMultAtSrc()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Input#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Input#getMultAtTgt()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Input#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Input#getSrc()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Src();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Input#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Input#getTgt()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Tgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see wFP_V2.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Aggregation#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see wFP_V2.Aggregation#getLabelAtTgt()
	 * @see #getAggregation()
	 * @generated
	 */
	EAttribute getAggregation_LabelAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Aggregation#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see wFP_V2.Aggregation#getMultAtTgt()
	 * @see #getAggregation()
	 * @generated
	 */
	EAttribute getAggregation_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Aggregation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see wFP_V2.Aggregation#getSrc()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Src();

	/**
	 * Returns the meta object for the reference '{@link wFP_V2.Aggregation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see wFP_V2.Aggregation#getTgt()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Tgt();

	/**
	 * Returns the meta object for class '{@link wFP_V2.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see wFP_V2.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wFP_V2.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Argument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wFP_V2.Argument#getDescription()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Description();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Argument#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see wFP_V2.Argument#getConstraint()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Argument#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructs</em>'.
	 * @see wFP_V2.Argument#getConstructs()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Constructs();

	/**
	 * Returns the meta object for the reference list '{@link wFP_V2.Argument#getConstructedBy <em>Constructed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructed By</em>'.
	 * @see wFP_V2.Argument#getConstructedBy()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ConstructedBy();

	/**
	 * Returns the meta object for the attribute '{@link wFP_V2.Argument#isSyntactic <em>Syntactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntactic</em>'.
	 * @see wFP_V2.Argument#isSyntactic()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Syntactic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WFP_V2Factory getWFP_V2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wFP_V2.impl.WorkFlowPlusImpl <em>Work Flow Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.WorkFlowPlusImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getWorkFlowPlus()
		 * @generated
		 */
		EClass WORK_FLOW_PLUS = eINSTANCE.getWorkFlowPlus();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS__PROCESS = eINSTANCE.getWorkFlowPlus_Process();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS__DATA = eINSTANCE.getWorkFlowPlus_Data();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS__CONSTRAINT = eINSTANCE.getWorkFlowPlus_Constraint();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS__REFERENCE = eINSTANCE.getWorkFlowPlus_Reference();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS__ARGUMENT = eINSTANCE.getWorkFlowPlus_Argument();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.ProcessImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__NEXT = eINSTANCE.getProcess_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PREVIOUS = eINSTANCE.getProcess_Previous();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INPUT = eINSTANCE.getProcess_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OUTPUT = eINSTANCE.getProcess_Output();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.DataImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__OUTPUT = eINSTANCE.getData_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__INPUT = eINSTANCE.getData_Input();

		/**
		 * The meta object literal for the '<em><b>Forward Impact Analysis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___FORWARD_IMPACT_ANALYSIS = eINSTANCE.getData__ForwardImpactAnalysis();

		/**
		 * The meta object literal for the '<em><b>Backward Impact Analysis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA___BACKWARD_IMPACT_ANALYSIS = eINSTANCE.getData__BackwardImpactAnalysis();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Data_DefinitionImpl <em>Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Data_DefinitionImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getData_Definition()
		 * @generated
		 */
		EClass DATA_DEFINITION = eINSTANCE.getData_Definition();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINITION__DATA = eINSTANCE.getData_Definition_Data();

		/**
		 * The meta object literal for the '<em><b>Is Normative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEFINITION__IS_NORMATIVE = eINSTANCE.getData_Definition_IsNormative();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Data_ElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Data_ElementImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getData_Element()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getData_Element();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__ATTRIBUTE = eINSTANCE.getData_Element_Attribute();

		/**
		 * The meta object literal for the '<em><b>Is Normative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__IS_NORMATIVE = eINSTANCE.getData_Element_IsNormative();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Composed_Process_DefinitionImpl <em>Composed Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Composed_Process_DefinitionImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getComposed_Process_Definition()
		 * @generated
		 */
		EClass COMPOSED_PROCESS_DEFINITION = eINSTANCE.getComposed_Process_Definition();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_PROCESS_DEFINITION__PROCESS = eINSTANCE.getComposed_Process_Definition_Process();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Automatic_Process_DefinitionImpl <em>Automatic Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Automatic_Process_DefinitionImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getAutomatic_Process_Definition()
		 * @generated
		 */
		EClass AUTOMATIC_PROCESS_DEFINITION = eINSTANCE.getAutomatic_Process_Definition();

		/**
		 * The meta object literal for the '<em><b>Formal Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_PROCESS_DEFINITION__FORMAL_DESCRIPTION = eINSTANCE
				.getAutomatic_Process_Definition_FormalDescription();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_PROCESS_DEFINITION__ATTRIBUTE = eINSTANCE.getAutomatic_Process_Definition_Attribute();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Atomic_Process_DefinitionImpl <em>Atomic Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Atomic_Process_DefinitionImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getAtomic_Process_Definition()
		 * @generated
		 */
		EClass ATOMIC_PROCESS_DEFINITION = eINSTANCE.getAtomic_Process_Definition();

		/**
		 * The meta object literal for the '<em><b>Is Review</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROCESS_DEFINITION__IS_REVIEW = eINSTANCE.getAtomic_Process_Definition_IsReview();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_PROCESS_DEFINITION__ATTRIBUTE = eINSTANCE.getAtomic_Process_Definition_Attribute();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROCESS_DEFINITION__IS_QUERY = eINSTANCE.getAtomic_Process_Definition_IsQuery();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.AttributeImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Is Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_EXECUTABLE = eINSTANCE.getAttribute_IsExecutable();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.ConstraintImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__NODE = eINSTANCE.getConstraint_Node();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

		/**
		 * The meta object literal for the '<em><b>Syntactic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__SYNTACTIC = eINSTANCE.getConstraint_Syntactic();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__ARGUMENT = eINSTANCE.getConstraint_Argument();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__REFERENCE = eINSTANCE.getConstraint_Reference();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.NodeImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__AGGREGATE = eINSTANCE.getNode_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__AGGREGATION = eINSTANCE.getNode_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Reify association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REIFY_ASSOCIATION = eINSTANCE.getNode_Reify_association();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILD = eINSTANCE.getNode_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Association src</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ASSOCIATION_SRC = eINSTANCE.getNode_Association_src();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSED_OF = eINSTANCE.getNode_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Association tgt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ASSOCIATION_TGT = eINSTANCE.getNode_Association_tgt();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSITION = eINSTANCE.getNode_Composition();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.ReferenceImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reify association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REIFY_ASSOCIATION = eINSTANCE.getReference_Reify_association();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.AssociationImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Mult At Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__MULT_AT_SRC = eINSTANCE.getAssociation_MultAtSrc();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__MULT_AT_TGT = eINSTANCE.getAssociation_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TGT = eINSTANCE.getAssociation_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SRC = eINSTANCE.getAssociation_Src();

		/**
		 * The meta object literal for the '<em><b>Label At Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__LABEL_AT_SRC = eINSTANCE.getAssociation_LabelAtSrc();

		/**
		 * The meta object literal for the '<em><b>Label At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__LABEL_AT_TGT = eINSTANCE.getAssociation_LabelAtTgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Reify_AssociationImpl <em>Reify Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Reify_AssociationImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getReify_Association()
		 * @generated
		 */
		EClass REIFY_ASSOCIATION = eINSTANCE.getReify_Association();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REIFY_ASSOCIATION__SRC = eINSTANCE.getReify_Association_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REIFY_ASSOCIATION__TGT = eINSTANCE.getReify_Association_Tgt();

		/**
		 * The meta object literal for the '<em><b>Label At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REIFY_ASSOCIATION__LABEL_AT_TGT = eINSTANCE.getReify_Association_LabelAtTgt();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REIFY_ASSOCIATION__MULT_AT_TGT = eINSTANCE.getReify_Association_MultAtTgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.CompositionImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__MULT_AT_TGT = eINSTANCE.getComposition_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Label At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__LABEL_AT_TGT = eINSTANCE.getComposition_LabelAtTgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__SRC = eINSTANCE.getComposition_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__TGT = eINSTANCE.getComposition_Tgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.InheritanceImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__SRC = eINSTANCE.getInheritance_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__TGT = eINSTANCE.getInheritance_Tgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Work_ProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Work_ProductImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getWork_Product()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWork_Product();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.Performance_DataImpl <em>Performance Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.Performance_DataImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getPerformance_Data()
		 * @generated
		 */
		EClass PERFORMANCE_DATA = eINSTANCE.getPerformance_Data();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_DATA__ATTRIBUTE = eINSTANCE.getPerformance_Data_Attribute();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.OutputImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Mult At Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__MULT_AT_SRC = eINSTANCE.getOutput_MultAtSrc();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__MULT_AT_TGT = eINSTANCE.getOutput_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TGT = eINSTANCE.getOutput_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__SRC = eINSTANCE.getOutput_Src();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.InputImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Mult At Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MULT_AT_SRC = eINSTANCE.getInput_MultAtSrc();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__MULT_AT_TGT = eINSTANCE.getInput_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__SRC = eINSTANCE.getInput_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TGT = eINSTANCE.getInput_Tgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.AggregationImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Label At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION__LABEL_AT_TGT = eINSTANCE.getAggregation_LabelAtTgt();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION__MULT_AT_TGT = eINSTANCE.getAggregation_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__SRC = eINSTANCE.getAggregation_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__TGT = eINSTANCE.getAggregation_Tgt();

		/**
		 * The meta object literal for the '{@link wFP_V2.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wFP_V2.impl.ArgumentImpl
		 * @see wFP_V2.impl.WFP_V2PackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRAINT = eINSTANCE.getArgument_Constraint();

		/**
		 * The meta object literal for the '<em><b>Constructs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRUCTS = eINSTANCE.getArgument_Constructs();

		/**
		 * The meta object literal for the '<em><b>Constructed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRUCTED_BY = eINSTANCE.getArgument_ConstructedBy();

		/**
		 * The meta object literal for the '<em><b>Syntactic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__SYNTACTIC = eINSTANCE.getArgument_Syntactic();

	}

} //WFP_V2Package
