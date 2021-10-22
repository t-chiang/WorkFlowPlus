/**
 *
 * $Id$
 */
package wFP_V2.validation;

import org.eclipse.emf.common.util.EList;
import wFP_V2.Aggregation;
import wFP_V2.Association;
import wFP_V2.Composition;
import wFP_V2.Inheritance;
import wFP_V2.Reify_Association;

/**
 * A sample validator interface for {@link wFP_V2.Node}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeValidator {
	boolean validate();

	boolean validateAggregate(EList<Aggregation> value);

	boolean validateAggregation(EList<Aggregation> value);

	boolean validateAggregate(Aggregation value);

	boolean validateAggregation(Aggregation value);

	boolean validateReify_association(Reify_Association value);

	boolean validateChild(Inheritance value);

	boolean validateParent(Inheritance value);

	boolean validateChild(EList<Inheritance> value);

	boolean validateAssociation_src(EList<Association> value);

	boolean validateComposedOf(EList<Composition> value);

	boolean validateAssociation_tgt(EList<Association> value);

	boolean validateComposite(EList<Composition> value);

	boolean validateAssociation_src(Association value);

	boolean validateAssociation_tgt(Association value);

	boolean validateComposite(Composition value);

	boolean validateComposition(EList<Composition> value);

	boolean validateComposition(Composition value);

}
