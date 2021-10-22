/**
 */
package wFP_V2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import wFP_V2.WFP_V2Package;

/**
 * This is the item provider adapter for a {@link wFP_V2.Node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
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

			addAggregatePropertyDescriptor(object);
			addAggregationPropertyDescriptor(object);
			addReify_associationPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addChildPropertyDescriptor(object);
			addAssociation_tgtPropertyDescriptor(object);
			addAssociation_srcPropertyDescriptor(object);
			addComposedOfPropertyDescriptor(object);
			addCompositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aggregate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_aggregate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_aggregate_feature", "_UI_Node_type"),
						WFP_V2Package.Literals.NODE__AGGREGATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Aggregation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_aggregation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_aggregation_feature",
								"_UI_Node_type"),
						WFP_V2Package.Literals.NODE__AGGREGATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Reify association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReify_associationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_reify_association_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_reify_association_feature",
								"_UI_Node_type"),
						WFP_V2Package.Literals.NODE__REIFY_ASSOCIATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_parent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_parent_feature", "_UI_Node_type"),
						WFP_V2Package.Literals.NODE__PARENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Child feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_child_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_child_feature", "_UI_Node_type"),
						WFP_V2Package.Literals.NODE__CHILD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Association tgt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociation_tgtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_association_tgt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_association_tgt_feature",
								"_UI_Node_type"),
						WFP_V2Package.Literals.NODE__ASSOCIATION_TGT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Association src feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociation_srcPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_association_src_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_association_src_feature",
								"_UI_Node_type"),
						WFP_V2Package.Literals.NODE__ASSOCIATION_SRC, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Composed Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComposedOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_composedOf_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_composedOf_feature", "_UI_Node_type"),
						WFP_V2Package.Literals.NODE__COMPOSED_OF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Composition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_composition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_composition_feature",
								"_UI_Node_type"),
						WFP_V2Package.Literals.NODE__COMPOSITION, true, false, true, null, null, null));
	}

	/**
	 * This returns Node.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Node"));
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
		return getString("_UI_Node_type");
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
