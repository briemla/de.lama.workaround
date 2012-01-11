/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import workaround.Plot;
import workaround.WorkaroundPackage;

/**
 * This is the item provider adapter for a {@link workaround.Plot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlotItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource
{
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PlotItemProvider(AdapterFactory adapterFactory)
    {
		super(adapterFactory);
	}

    /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public List getPropertyDescriptors(Object object)
    {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPlotNumberPropertyDescriptor(object);
			addUnderNumberPropertyDescriptor(object);
			addCadastralAreaPropertyDescriptor(object);
			addNettoAreaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Plot Number feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addPlotNumberPropertyDescriptor(Object object)
    {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plot_plotNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plot_plotNumber_feature", "_UI_Plot_type"),
				 WorkaroundPackage.Literals.PLOT__PLOT_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Under Number feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addUnderNumberPropertyDescriptor(Object object)
    {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plot_underNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plot_underNumber_feature", "_UI_Plot_type"),
				 WorkaroundPackage.Literals.PLOT__UNDER_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cadastral Area feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCadastralAreaPropertyDescriptor(Object object)
    {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plot_cadastralArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plot_cadastralArea_feature", "_UI_Plot_type"),
				 WorkaroundPackage.Literals.PLOT__CADASTRAL_AREA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Netto Area feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addNettoAreaPropertyDescriptor(Object object)
    {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plot_nettoArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plot_nettoArea_feature", "_UI_Plot_type"),
				 WorkaroundPackage.Literals.PLOT__NETTO_AREA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This returns Plot.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getImage(Object object)
    {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plot"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getText(Object object)
    {
		String label = ((Plot)object).getPlotNumber();
		return label == null || label.length() == 0 ?
			getString("_UI_Plot_type") :
			getString("_UI_Plot_type") + " " + label;
	}

    /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void notifyChanged(Notification notification)
    {
		updateChildren(notification);

		switch (notification.getFeatureID(Plot.class)) {
			case WorkaroundPackage.PLOT__PLOT_NUMBER:
			case WorkaroundPackage.PLOT__UNDER_NUMBER:
			case WorkaroundPackage.PLOT__CADASTRAL_AREA:
			case WorkaroundPackage.PLOT__NETTO_AREA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
    {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResourceLocator getResourceLocator()
    {
		return WorkaroundEditPlugin.INSTANCE;
	}

}
