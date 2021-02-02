/**
 *
 * $Id$
 */
package wFP_V2.validation;

import org.eclipse.emf.common.util.EList;

import wFP_V2.Constraint;
import wFP_V2.Data;
import wFP_V2.Reference;

/**
 * A sample validator interface for {@link wFP_V2.WorkFlowPlus}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkFlowPlusValidator {
	boolean validate();

	boolean validateProcess(EList<wFP_V2.Process> value);

	boolean validateData(EList<Data> value);

	boolean validateConstraint(EList<Constraint> value);

	boolean validateReference(EList<Reference> value);
}
