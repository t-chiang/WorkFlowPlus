/**
 * 
 */
package WFP.design;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.*;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import wFP_V2.*;
import wFP_V2.Process;
import wFP_V2.Data;
/**
 * @author sirch
 *
 */
public class myAction extends AbstractExternalJavaAction{
	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		/*
		 * This method checks the selected elements in the model to see if we want to have this action visible. Currently set to only work on Data. Also set to not be able to run when user clicks on 
		 * blank space
		 */
		Iterator<? extends EObject> it = arg0.iterator();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof DSemanticDiagram){
				//System.out.println("Object name is " + next.eClass().getName());
				return false;
			}
			var modelObj = ((DSemanticDecorator) next).getTarget();
			//System.out.println(modelObj instanceof Data);
			if (modelObj instanceof Process){
				return false;
			}
			
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		// Calls the forwardImpactAnalysis method from the Data class
		var modelObj = ((DSemanticDecorator) arg0.iterator().next()).getTarget();
		if(modelObj instanceof Data_Element) {
			((Data_Element) modelObj).forwardImpactAnalysis();
		}
	}
}