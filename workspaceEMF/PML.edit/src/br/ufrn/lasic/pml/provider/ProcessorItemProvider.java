/**
 */
package br.ufrn.lasic.pml.provider;


import br.ufrn.lasic.pml.PMLFactory;
import br.ufrn.lasic.pml.PMLPackage;
import br.ufrn.lasic.pml.Processor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.ufrn.lasic.pml.Processor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Processor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Processor_name_feature", "_UI_Processor_type"),
				 PMLPackage.Literals.PROCESSOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__DEMUX);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__ULAS);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__REGISTERS);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__MEMORIES);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__MUX);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__CONTROL_UNITS);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__DECODERS);
			childrenFeatures.add(PMLPackage.Literals.PROCESSOR__PROCESSOR_SIGNAL_EVENTS);
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
	 * This returns Processor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Processor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Processor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Processor_type") :
			getString("_UI_Processor_type") + " " + label;
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

		switch (notification.getFeatureID(Processor.class)) {
			case PMLPackage.PROCESSOR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PMLPackage.PROCESSOR__DEMUX:
			case PMLPackage.PROCESSOR__ULAS:
			case PMLPackage.PROCESSOR__REGISTERS:
			case PMLPackage.PROCESSOR__MEMORIES:
			case PMLPackage.PROCESSOR__MUX:
			case PMLPackage.PROCESSOR__CONTROL_UNITS:
			case PMLPackage.PROCESSOR__DECODERS:
			case PMLPackage.PROCESSOR__PROCESSOR_SIGNAL_EVENTS:
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

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__DEMUX,
				 PMLFactory.eINSTANCE.createDemultiplexor()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__ULAS,
				 PMLFactory.eINSTANCE.createULA()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__REGISTERS,
				 PMLFactory.eINSTANCE.createRegister()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__MEMORIES,
				 PMLFactory.eINSTANCE.createMemory()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__MUX,
				 PMLFactory.eINSTANCE.createMultiplexor()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__CONTROL_UNITS,
				 PMLFactory.eINSTANCE.createControlUnit()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__DECODERS,
				 PMLFactory.eINSTANCE.createDecoder()));

		newChildDescriptors.add
			(createChildParameter
				(PMLPackage.Literals.PROCESSOR__PROCESSOR_SIGNAL_EVENTS,
				 PMLFactory.eINSTANCE.createSignalEvent()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PMLEditPlugin.INSTANCE;
	}

}
