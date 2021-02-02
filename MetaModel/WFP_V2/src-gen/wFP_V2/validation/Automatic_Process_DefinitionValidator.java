/**
 *
 * $Id$
 */
package wFP_V2.validation;

import org.eclipse.emf.common.util.EList;

import wFP_V2.Attribute;

/**
 * A sample validator interface for {@link wFP_V2.Automatic_Process_Definition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Automatic_Process_DefinitionValidator {
	boolean validate();

	boolean validateFormalDescription(String value);

	boolean validateAttribute(EList<Attribute> value);
}
