/**
 *
 * $Id$
 */
package org.mcmaster.workflowplus.wfp.validation;

import org.eclipse.emf.common.util.EList;
import org.mcmaster.workflowplus.wfp.Attribute;

/**
 * A sample validator interface for {@link org.mcmaster.workflowplus.wfp.WorkProduct}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkProductValidator {
	boolean validate();

	boolean validateAttribute(EList<Attribute> value);

}
