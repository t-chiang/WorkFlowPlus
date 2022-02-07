package org.mcmaster.workflowplus.wfp.design;

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

import org.mcmaster.workflowplus.wfp.Data;
import org.mcmaster.workflowplus.wfp.Process;

public class CallBackwardImpactAnalysis extends AbstractExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		Iterator<? extends EObject> it = selections.iterator();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof DSemanticDiagram){
				//System.out.println("Object name is " + next.eClass().getName());
				return false;
			}
			var modelObj = ((DSemanticDecorator) next).getTarget();
			if (modelObj instanceof Process){
				return false;
			}
			
		}
		return true;
	}
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		Iterator<? extends EObject> iter = selections.iterator();
		while(iter.hasNext()) {
			var modelObj = ((DSemanticDecorator) iter.next()).getTarget();
			((Data) modelObj).backwardImpactAnalysis();
		}
	}
}
