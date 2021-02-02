/**
 *
 * $Id$
 */
package wFP_V2.validation;

import org.eclipse.emf.common.util.EList;

import wFP_V2.Attribute;

/**
 * A sample validator interface for {@link wFP_V2.Normative_Data}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Normative_DataValidator {
	boolean validate();

	boolean validateAttribute(EList<Attribute> value);
}
