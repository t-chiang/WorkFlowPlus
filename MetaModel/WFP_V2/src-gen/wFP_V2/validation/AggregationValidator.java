/**
 *
 * $Id$
 */
package wFP_V2.validation;

import wFP_V2.Node;

/**
 * A sample validator interface for {@link wFP_V2.Aggregation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AggregationValidator {
	boolean validate();

	boolean validateLabelAtTgt(String value);

	boolean validateMultAtTgt(String value);

	boolean validateSrc(Node value);

	boolean validateTgt(Node value);

	boolean validateConsists(Node value);

	boolean validateConsistedOf(Node value);
}
