/**
 *
 * $Id$
 */
package org.mcmaster.workflowplus.wfp.validation;

import org.eclipse.emf.common.util.EList;

import org.mcmaster.workflowplus.wfp.Association;
import org.mcmaster.workflowplus.wfp.Composition;
import org.mcmaster.workflowplus.wfp.Inheritance;
import org.mcmaster.workflowplus.wfp.ReifyAssociation;

/**
 * A sample validator interface for {@link org.mcmaster.workflowplus.wfp.Node}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateParent(Inheritance value);

	boolean validateChild(EList<Inheritance> value);

	boolean validateComposedOf(EList<Composition> value);

	boolean validateComposition(Composition value);

	boolean validateAssociationTgt(EList<Association> value);

	boolean validateAssociationSrc(EList<Association> value);

	boolean validateReifyassociation(ReifyAssociation value);
}
