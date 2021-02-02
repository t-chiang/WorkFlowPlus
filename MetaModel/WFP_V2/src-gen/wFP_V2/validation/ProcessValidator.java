/**
 *
 * $Id$
 */
package wFP_V2.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link wFP_V2.Process}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateNext(EList<wFP_V2.Process> value);

	boolean validatePrevious(EList<wFP_V2.Process> value);
}
