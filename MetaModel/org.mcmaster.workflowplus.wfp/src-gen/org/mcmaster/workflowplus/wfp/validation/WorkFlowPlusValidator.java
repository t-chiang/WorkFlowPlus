/**
 *
 * $Id$
 */
package org.mcmaster.workflowplus.wfp.validation;

import org.eclipse.emf.common.util.EList;

import org.mcmaster.workflowplus.wfp.Node;
import org.mcmaster.workflowplus.wfp.Reference;

/**
 * A sample validator interface for {@link org.mcmaster.workflowplus.wfp.WorkFlowPlus}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkFlowPlusValidator {
	boolean validate();

	boolean validateNode(EList<Node> value);

	boolean validateReference(EList<Reference> value);
}
