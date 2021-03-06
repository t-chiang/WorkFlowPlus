/**
 */
package wFP_V2.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import wFP_V2.util.WFP_V2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WFP_V2ItemProviderAdapterFactory extends WFP_V2AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFP_V2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.WorkFlowPlus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkFlowPlusItemProvider workFlowPlusItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.WorkFlowPlus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkFlowPlusAdapter() {
		if (workFlowPlusItemProvider == null) {
			workFlowPlusItemProvider = new WorkFlowPlusItemProvider(this);
		}

		return workFlowPlusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Data_Definition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_DefinitionItemProvider data_DefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Data_Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createData_DefinitionAdapter() {
		if (data_DefinitionItemProvider == null) {
			data_DefinitionItemProvider = new Data_DefinitionItemProvider(this);
		}

		return data_DefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Data_Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data_ElementItemProvider data_ElementItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Data_Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createData_ElementAdapter() {
		if (data_ElementItemProvider == null) {
			data_ElementItemProvider = new Data_ElementItemProvider(this);
		}

		return data_ElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Composed_Process_Definition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composed_Process_DefinitionItemProvider composed_Process_DefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Composed_Process_Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposed_Process_DefinitionAdapter() {
		if (composed_Process_DefinitionItemProvider == null) {
			composed_Process_DefinitionItemProvider = new Composed_Process_DefinitionItemProvider(this);
		}

		return composed_Process_DefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Automatic_Process_Definition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Automatic_Process_DefinitionItemProvider automatic_Process_DefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Automatic_Process_Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutomatic_Process_DefinitionAdapter() {
		if (automatic_Process_DefinitionItemProvider == null) {
			automatic_Process_DefinitionItemProvider = new Automatic_Process_DefinitionItemProvider(this);
		}

		return automatic_Process_DefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Atomic_Process_Definition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Atomic_Process_DefinitionItemProvider atomic_Process_DefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Atomic_Process_Definition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomic_Process_DefinitionAdapter() {
		if (atomic_Process_DefinitionItemProvider == null) {
			atomic_Process_DefinitionItemProvider = new Atomic_Process_DefinitionItemProvider(this);
		}

		return atomic_Process_DefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Reify_Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reify_AssociationItemProvider reify_AssociationItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Reify_Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReify_AssociationAdapter() {
		if (reify_AssociationItemProvider == null) {
			reify_AssociationItemProvider = new Reify_AssociationItemProvider(this);
		}

		return reify_AssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Composition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionItemProvider compositionItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositionAdapter() {
		if (compositionItemProvider == null) {
			compositionItemProvider = new CompositionItemProvider(this);
		}

		return compositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Inheritance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceItemProvider inheritanceItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Inheritance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInheritanceAdapter() {
		if (inheritanceItemProvider == null) {
			inheritanceItemProvider = new InheritanceItemProvider(this);
		}

		return inheritanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Work_Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Work_ProductItemProvider work_ProductItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Work_Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWork_ProductAdapter() {
		if (work_ProductItemProvider == null) {
			work_ProductItemProvider = new Work_ProductItemProvider(this);
		}

		return work_ProductItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Performance_Data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Performance_DataItemProvider performance_DataItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Performance_Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformance_DataAdapter() {
		if (performance_DataItemProvider == null) {
			performance_DataItemProvider = new Performance_DataItemProvider(this);
		}

		return performance_DataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wFP_V2.Aggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationItemProvider aggregationItemProvider;

	/**
	 * This creates an adapter for a {@link wFP_V2.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregationAdapter() {
		if (aggregationItemProvider == null) {
			aggregationItemProvider = new AggregationItemProvider(this);
		}

		return aggregationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (workFlowPlusItemProvider != null)
			workFlowPlusItemProvider.dispose();
		if (data_DefinitionItemProvider != null)
			data_DefinitionItemProvider.dispose();
		if (data_ElementItemProvider != null)
			data_ElementItemProvider.dispose();
		if (composed_Process_DefinitionItemProvider != null)
			composed_Process_DefinitionItemProvider.dispose();
		if (automatic_Process_DefinitionItemProvider != null)
			automatic_Process_DefinitionItemProvider.dispose();
		if (atomic_Process_DefinitionItemProvider != null)
			atomic_Process_DefinitionItemProvider.dispose();
		if (attributeItemProvider != null)
			attributeItemProvider.dispose();
		if (constraintItemProvider != null)
			constraintItemProvider.dispose();
		if (associationItemProvider != null)
			associationItemProvider.dispose();
		if (reify_AssociationItemProvider != null)
			reify_AssociationItemProvider.dispose();
		if (compositionItemProvider != null)
			compositionItemProvider.dispose();
		if (inheritanceItemProvider != null)
			inheritanceItemProvider.dispose();
		if (work_ProductItemProvider != null)
			work_ProductItemProvider.dispose();
		if (performance_DataItemProvider != null)
			performance_DataItemProvider.dispose();
		if (outputItemProvider != null)
			outputItemProvider.dispose();
		if (inputItemProvider != null)
			inputItemProvider.dispose();
		if (aggregationItemProvider != null)
			aggregationItemProvider.dispose();
	}

}
