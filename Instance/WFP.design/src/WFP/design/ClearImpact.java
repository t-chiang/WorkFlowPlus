package WFP.design;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.*;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;

import wFP_V2.*;
import wFP_V2.Process;

public class ClearImpact extends AbstractExternalJavaAction{

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
			//System.out.println(modelObj instanceof Data);
			if (modelObj instanceof Process){
				return false;
			}
			if (modelObj instanceof Work_Product) {
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
			var modelObj = (DDiagramElementContainer)((DSemanticDecorator) iter.next());
			ContainerStyle containerStyle = modelObj.getOwnedStyle();
			RGBValues newBorderColor = RGBValues.create(0, 0, 0);
			containerStyle.setBorderColor(newBorderColor);
			containerStyle.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
		}
	}
}
