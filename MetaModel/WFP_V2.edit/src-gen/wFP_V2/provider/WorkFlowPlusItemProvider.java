/**
 */
package wFP_V2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import wFP_V2.WFP_V2Factory;
import wFP_V2.WFP_V2Package;
import wFP_V2.WorkFlowPlus;

/**
 * This is the item provider adapter for a {@link wFP_V2.WorkFlowPlus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFlowPlusItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowPlusItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WFP_V2Package.Literals.WORK_FLOW_PLUS__PROCESS);
			childrenFeatures.add(WFP_V2Package.Literals.WORK_FLOW_PLUS__DATA);
			childrenFeatures.add(WFP_V2Package.Literals.WORK_FLOW_PLUS__CONSTRAINT);
			childrenFeatures.add(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WorkFlowPlus.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkFlowPlus"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WorkFlowPlus_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WorkFlowPlus.class)) {
		case WFP_V2Package.WORK_FLOW_PLUS__PROCESS:
		case WFP_V2Package.WORK_FLOW_PLUS__DATA:
		case WFP_V2Package.WORK_FLOW_PLUS__CONSTRAINT:
		case WFP_V2Package.WORK_FLOW_PLUS__REFERENCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__PROCESS,
				WFP_V2Factory.eINSTANCE.createComposed_Process_Definition()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__PROCESS,
				WFP_V2Factory.eINSTANCE.createAutomatic_Process_Definition()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__PROCESS,
				WFP_V2Factory.eINSTANCE.createAtomic_Process_Definition()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__DATA,
				WFP_V2Factory.eINSTANCE.createData_Definition()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__DATA,
				WFP_V2Factory.eINSTANCE.createData_Element()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__DATA,
				WFP_V2Factory.eINSTANCE.createWork_Product()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__DATA,
				WFP_V2Factory.eINSTANCE.createPerformance_Data()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__CONSTRAINT,
				WFP_V2Factory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createReify_Association()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createComposition()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createInheritance()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createOutput()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(WFP_V2Package.Literals.WORK_FLOW_PLUS__REFERENCE,
				WFP_V2Factory.eINSTANCE.createAggregation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WFP_V2EditPlugin.INSTANCE;
	}

}
