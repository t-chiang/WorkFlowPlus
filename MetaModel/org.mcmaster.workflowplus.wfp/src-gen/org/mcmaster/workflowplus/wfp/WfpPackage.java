/**
 */
package org.mcmaster.workflowplus.wfp;

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
 * @see org.mcmaster.workflowplus.wfp.WfpFactory
 * @model kind="package"
 * @generated
 */
public interface WfpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/wfp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfpPackage eINSTANCE = org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowPlusRootImpl <em>Work Flow Plus Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.WorkFlowPlusRootImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkFlowPlusRoot()
	 * @generated
	 */
	int WORK_FLOW_PLUS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_ROOT__NODE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_ROOT__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_ROOT__WORKFLOW = 2;

	/**
	 * The number of structural features of the '<em>Work Flow Plus Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work Flow Plus Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_PLUS_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.ReferenceImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REIFYASSOCIATION = 0;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.NodeImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSED_OF = 2;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ASSOCIATION_TGT = 4;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ASSOCIATION_SRC = 5;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REIFY_ASSOCIATION = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.DataImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

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
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__INPUT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OUTPUT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NODE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.ProcessImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

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
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.AtomicDataImpl <em>Atomic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.AtomicDataImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAtomicData()
	 * @generated
	 */
	int ATOMIC_DATA = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__CHILD = DATA__CHILD;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__COMPOSED_OF = DATA__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__COMPOSITION = DATA__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__INPUT = DATA__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__ATTRIBUTE = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Normative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA__IS_NORMATIVE = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Forward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA___FORWARD_IMPACT_ANALYSIS = DATA___FORWARD_IMPACT_ANALYSIS;

	/**
	 * The operation id for the '<em>Backward Impact Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA___BACKWARD_IMPACT_ANALYSIS = DATA___BACKWARD_IMPACT_ANALYSIS;

	/**
	 * The number of operations of the '<em>Atomic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.AtomicProcessImpl <em>Atomic Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.AtomicProcessImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAtomicProcess()
	 * @generated
	 */
	int ATOMIC_PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__PARENT = PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__CHILD = PROCESS__CHILD;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__COMPOSED_OF = PROCESS__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__COMPOSITION = PROCESS__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__ASSOCIATION_TGT = PROCESS__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__ASSOCIATION_SRC = PROCESS__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__REIFY_ASSOCIATION = PROCESS__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__INPUT = PROCESS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__OUTPUT = PROCESS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__ATTRIBUTE = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__IS_REVIEW = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS__IS_QUERY = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atomic Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_PROCESS_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.InputImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inport Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPORT_TGT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inport Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPORT_SRC = REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.OutputImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outport Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPORT_SRC = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outport Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPORT_TGT = REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.WorkProductImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 9;

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
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ASSOCIATION_TGT = DATA__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ASSOCIATION_SRC = DATA__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__REIFY_ASSOCIATION = DATA__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__INPUT = DATA__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OUTPUT = DATA__OUTPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ATTRIBUTE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.AttributeImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

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
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.ConstraintImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CHILD = NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMPOSED_OF = NODE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMPOSITION = NODE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SYNTACTIC = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ARGUMENT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REFERENCE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NODE = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.ArgumentImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CHILD = NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__COMPOSED_OF = NODE__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__COMPOSITION = NODE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Association Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ASSOCIATION_TGT = NODE__ASSOCIATION_TGT;

	/**
	 * The feature id for the '<em><b>Association Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ASSOCIATION_SRC = NODE__ASSOCIATION_SRC;

	/**
	 * The feature id for the '<em><b>Reify Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__REIFY_ASSOCIATION = NODE__REIFY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Syntactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SYNTACTIC = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRAINT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constructed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRUCTED_BY = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constructs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONSTRUCTS = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.InheritanceImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 13;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.CompositionImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 14;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.AssociationImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 15;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SRC = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TGT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_AT_SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label At Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LABEL_AT_SRC = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl <em>Reify Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getReifyAssociation()
	 * @generated
	 */
	int REIFY_ASSOCIATION = 16;

	/**
	 * The feature id for the '<em><b>Reifyassociation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__REIFYASSOCIATION = REFERENCE__REIFYASSOCIATION;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mult At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__MULT_AT_TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label At Tgt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REIFY_ASSOCIATION__LABEL_AT_TGT = REFERENCE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl <em>Work Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkFlow()
	 * @generated
	 */
	int WORK_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__NODE = WORK_FLOW_PLUS_ROOT__NODE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__REFERENCE = WORK_FLOW_PLUS_ROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__WORKFLOW = WORK_FLOW_PLUS_ROOT__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__NAME = WORK_FLOW_PLUS_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW__PORT = WORK_FLOW_PLUS_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_FEATURE_COUNT = WORK_FLOW_PLUS_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Work Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FLOW_OPERATION_COUNT = WORK_FLOW_PLUS_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.PortImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.InPortImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Input Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__INPUT_TGT = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__INPUT_SRC = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.workflowplus.wfp.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.workflowplus.wfp.impl.OutPortImpl
	 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Output Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__OUTPUT_SRC = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__OUTPUT_TGT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot <em>Work Flow Plus Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow Plus Root</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot
	 * @generated
	 */
	EClass getWorkFlowPlusRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getNode()
	 * @see #getWorkFlowPlusRoot()
	 * @generated
	 */
	EReference getWorkFlowPlusRoot_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getReference()
	 * @see #getWorkFlowPlusRoot()
	 * @generated
	 */
	EReference getWorkFlowPlusRoot_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlowPlusRoot#getWorkflow()
	 * @see #getWorkFlowPlusRoot()
	 * @generated
	 */
	EReference getWorkFlowPlusRoot_Workflow();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Reference#getReifyassociation <em>Reifyassociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reifyassociation</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Reference#getReifyassociation()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Reifyassociation();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Data#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Data#getInput()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Data#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Data#getOutput()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the '{@link org.mcmaster.workflowplus.wfp.Data#forwardImpactAnalysis() <em>Forward Impact Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Forward Impact Analysis</em>' operation.
	 * @see org.mcmaster.workflowplus.wfp.Data#forwardImpactAnalysis()
	 * @generated
	 */
	EOperation getData__ForwardImpactAnalysis();

	/**
	 * Returns the meta object for the '{@link org.mcmaster.workflowplus.wfp.Data#backwardImpactAnalysis() <em>Backward Impact Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Backward Impact Analysis</em>' operation.
	 * @see org.mcmaster.workflowplus.wfp.Data#backwardImpactAnalysis()
	 * @generated
	 */
	EOperation getData__BackwardImpactAnalysis();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Process#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Process#getInput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Process#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Process#getOutput()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Node#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getChild()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Child();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Node#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed Of</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getComposedOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ComposedOf();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Node#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composition</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getComposition()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Composition();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Node#getAssociationTgt <em>Association Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getAssociationTgt()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_AssociationTgt();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Node#getAssociationSrc <em>Association Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getAssociationSrc()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_AssociationSrc();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Node#getReifyAssociation <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reify Association</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Node#getReifyAssociation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ReifyAssociation();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.AtomicData <em>Atomic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicData
	 * @generated
	 */
	EClass getAtomicData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.AtomicData#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicData#getAttribute()
	 * @see #getAtomicData()
	 * @generated
	 */
	EReference getAtomicData_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.AtomicData#isIsNormative <em>Is Normative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Normative</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicData#isIsNormative()
	 * @see #getAtomicData()
	 * @generated
	 */
	EAttribute getAtomicData_IsNormative();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.AtomicProcess <em>Atomic Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Process</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicProcess
	 * @generated
	 */
	EClass getAtomicProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.AtomicProcess#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicProcess#getAttribute()
	 * @see #getAtomicProcess()
	 * @generated
	 */
	EReference getAtomicProcess_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsReview <em>Is Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Review</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicProcess#isIsReview()
	 * @see #getAtomicProcess()
	 * @generated
	 */
	EAttribute getAtomicProcess_IsReview();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.AtomicProcess#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see org.mcmaster.workflowplus.wfp.AtomicProcess#isIsQuery()
	 * @see #getAtomicProcess()
	 * @generated
	 */
	EAttribute getAtomicProcess_IsQuery();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Input#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getSrc()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Input#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getTgt()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Input#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getMultAtSrc()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Input#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getMultAtTgt()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Input#getInportTgt <em>Inport Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getInportTgt()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InportTgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Input#getInportSrc <em>Inport Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Input#getInportSrc()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InportSrc();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Output#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getTgt()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Output#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getSrc()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Output#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getMultAtSrc()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Output#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getMultAtTgt()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_MultAtTgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Output#getOutportSrc <em>Outport Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getOutportSrc()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_OutportSrc();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Output#getOutportTgt <em>Outport Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Output#getOutportTgt()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_OutportTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.WorkProduct#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkProduct#getAttribute()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Attribute();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Constraint#isSyntactic <em>Syntactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntactic</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#isSyntactic()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Syntactic();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Constraint#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getArgument()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Argument();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Constraint#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getReference()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Reference();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Constraint#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getNode()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Argument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#getDescription()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Argument#isSyntactic <em>Syntactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syntactic</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#isSyntactic()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Syntactic();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Argument#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstraint()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Constraint();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Argument#getConstructedBy <em>Constructed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructed By</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstructedBy()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ConstructedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.workflowplus.wfp.Argument#getConstructs <em>Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constructs</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#getConstructs()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Constructs();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Inheritance#getSrc()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Inheritance#getTgt()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Tgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Composition#getSrc()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Composition#getTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Composition#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Composition#getMultAtTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_MultAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Composition#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Composition#getLabelAtTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_LabelAtTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Tgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Association#getMultAtSrc <em>Mult At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getMultAtSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_MultAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Association#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getMultAtTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_MultAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtSrc <em>Label At Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getLabelAtSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LabelAtSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Association#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Association#getLabelAtTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LabelAtTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation <em>Reify Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reify Association</em>'.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation
	 * @generated
	 */
	EClass getReifyAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getTgt()
	 * @see #getReifyAssociation()
	 * @generated
	 */
	EReference getReifyAssociation_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getSrc()
	 * @see #getReifyAssociation()
	 * @generated
	 */
	EReference getReifyAssociation_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getMultAtTgt <em>Mult At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mult At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getMultAtTgt()
	 * @see #getReifyAssociation()
	 * @generated
	 */
	EAttribute getReifyAssociation_MultAtTgt();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.ReifyAssociation#getLabelAtTgt <em>Label At Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label At Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.ReifyAssociation#getLabelAtTgt()
	 * @see #getReifyAssociation()
	 * @generated
	 */
	EAttribute getReifyAssociation_LabelAtTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.WorkFlow <em>Work Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Flow</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlow
	 * @generated
	 */
	EClass getWorkFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.WorkFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlow#getName()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EAttribute getWorkFlow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.workflowplus.wfp.WorkFlow#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.mcmaster.workflowplus.wfp.WorkFlow#getPort()
	 * @see #getWorkFlow()
	 * @generated
	 */
	EReference getWorkFlow_Port();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see org.mcmaster.workflowplus.wfp.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.InPort#getInputTgt <em>Input Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.InPort#getInputTgt()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_InputTgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.InPort#getInputSrc <em>Input Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.InPort#getInputSrc()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_InputSrc();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see org.mcmaster.workflowplus.wfp.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc <em>Output Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Src</em>'.
	 * @see org.mcmaster.workflowplus.wfp.OutPort#getOutputSrc()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_OutputSrc();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt <em>Output Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Tgt</em>'.
	 * @see org.mcmaster.workflowplus.wfp.OutPort#getOutputTgt()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_OutputTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.workflowplus.wfp.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.workflowplus.wfp.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.workflowplus.wfp.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WfpFactory getWfpFactory();

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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowPlusRootImpl <em>Work Flow Plus Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.WorkFlowPlusRootImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkFlowPlusRoot()
		 * @generated
		 */
		EClass WORK_FLOW_PLUS_ROOT = eINSTANCE.getWorkFlowPlusRoot();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS_ROOT__NODE = eINSTANCE.getWorkFlowPlusRoot_Node();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS_ROOT__REFERENCE = eINSTANCE.getWorkFlowPlusRoot_Reference();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW_PLUS_ROOT__WORKFLOW = eINSTANCE.getWorkFlowPlusRoot_Workflow();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.ReferenceImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reifyassociation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REIFYASSOCIATION = eINSTANCE.getReference_Reifyassociation();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.DataImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__INPUT = eINSTANCE.getData_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__OUTPUT = eINSTANCE.getData_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.ProcessImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.NodeImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILD = eINSTANCE.getNode_Child();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSED_OF = eINSTANCE.getNode_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSITION = eINSTANCE.getNode_Composition();

		/**
		 * The meta object literal for the '<em><b>Association Tgt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ASSOCIATION_TGT = eINSTANCE.getNode_AssociationTgt();

		/**
		 * The meta object literal for the '<em><b>Association Src</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ASSOCIATION_SRC = eINSTANCE.getNode_AssociationSrc();

		/**
		 * The meta object literal for the '<em><b>Reify Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REIFY_ASSOCIATION = eINSTANCE.getNode_ReifyAssociation();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.AtomicDataImpl <em>Atomic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.AtomicDataImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAtomicData()
		 * @generated
		 */
		EClass ATOMIC_DATA = eINSTANCE.getAtomicData();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DATA__ATTRIBUTE = eINSTANCE.getAtomicData_Attribute();

		/**
		 * The meta object literal for the '<em><b>Is Normative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DATA__IS_NORMATIVE = eINSTANCE.getAtomicData_IsNormative();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.AtomicProcessImpl <em>Atomic Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.AtomicProcessImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAtomicProcess()
		 * @generated
		 */
		EClass ATOMIC_PROCESS = eINSTANCE.getAtomicProcess();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_PROCESS__ATTRIBUTE = eINSTANCE.getAtomicProcess_Attribute();

		/**
		 * The meta object literal for the '<em><b>Is Review</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROCESS__IS_REVIEW = eINSTANCE.getAtomicProcess_IsReview();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_PROCESS__IS_QUERY = eINSTANCE.getAtomicProcess_IsQuery();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.InputImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

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
		 * The meta object literal for the '<em><b>Inport Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPORT_TGT = eINSTANCE.getInput_InportTgt();

		/**
		 * The meta object literal for the '<em><b>Inport Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPORT_SRC = eINSTANCE.getInput_InportSrc();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.OutputImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

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
		 * The meta object literal for the '<em><b>Outport Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OUTPORT_SRC = eINSTANCE.getOutput_OutportSrc();

		/**
		 * The meta object literal for the '<em><b>Outport Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OUTPORT_TGT = eINSTANCE.getOutput_OutportTgt();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.WorkProductImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkProduct()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__ATTRIBUTE = eINSTANCE.getWorkProduct_Attribute();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.AttributeImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.ConstraintImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

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
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__NODE = eINSTANCE.getConstraint_Node();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.ArgumentImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

		/**
		 * The meta object literal for the '<em><b>Syntactic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__SYNTACTIC = eINSTANCE.getArgument_Syntactic();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRAINT = eINSTANCE.getArgument_Constraint();

		/**
		 * The meta object literal for the '<em><b>Constructed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRUCTED_BY = eINSTANCE.getArgument_ConstructedBy();

		/**
		 * The meta object literal for the '<em><b>Constructs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONSTRUCTS = eINSTANCE.getArgument_Constructs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.InheritanceImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInheritance()
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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.CompositionImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.AssociationImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SRC = eINSTANCE.getAssociation_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TGT = eINSTANCE.getAssociation_Tgt();

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
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl <em>Reify Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.ReifyAssociationImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getReifyAssociation()
		 * @generated
		 */
		EClass REIFY_ASSOCIATION = eINSTANCE.getReifyAssociation();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REIFY_ASSOCIATION__TGT = eINSTANCE.getReifyAssociation_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REIFY_ASSOCIATION__SRC = eINSTANCE.getReifyAssociation_Src();

		/**
		 * The meta object literal for the '<em><b>Mult At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REIFY_ASSOCIATION__MULT_AT_TGT = eINSTANCE.getReifyAssociation_MultAtTgt();

		/**
		 * The meta object literal for the '<em><b>Label At Tgt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REIFY_ASSOCIATION__LABEL_AT_TGT = eINSTANCE.getReifyAssociation_LabelAtTgt();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl <em>Work Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.WorkFlowImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getWorkFlow()
		 * @generated
		 */
		EClass WORK_FLOW = eINSTANCE.getWorkFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_FLOW__NAME = eINSTANCE.getWorkFlow_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_FLOW__PORT = eINSTANCE.getWorkFlow_Port();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.InPortImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '<em><b>Input Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__INPUT_TGT = eINSTANCE.getInPort_InputTgt();

		/**
		 * The meta object literal for the '<em><b>Input Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__INPUT_SRC = eINSTANCE.getInPort_InputSrc();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.OutPortImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '<em><b>Output Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__OUTPUT_SRC = eINSTANCE.getOutPort_OutputSrc();

		/**
		 * The meta object literal for the '<em><b>Output Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__OUTPUT_TGT = eINSTANCE.getOutPort_OutputTgt();

		/**
		 * The meta object literal for the '{@link org.mcmaster.workflowplus.wfp.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.workflowplus.wfp.impl.PortImpl
		 * @see org.mcmaster.workflowplus.wfp.impl.WfpPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

	}

} //WfpPackage
