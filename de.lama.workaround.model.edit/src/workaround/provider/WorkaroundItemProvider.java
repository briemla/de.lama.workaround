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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import workaround.Workaround;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;

/**
 * This is the item provider adapter for a {@link workaround.Workaround} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkaroundItemProvider
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
    public WorkaroundItemProvider(AdapterFactory adapterFactory)
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
        if (itemPropertyDescriptors == null)
        {
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
    public Collection getChildrenFeatures(Object object)
    {
        if (childrenFeatures == null)
        {
            super.getChildrenFeatures(object);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__OPERATION_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__VEHICLE_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__MACHINE_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__ACREAGE_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__JOB_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__DISTRICT_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__PREPARATION_LIST);
            childrenFeatures.add(WorkaroundPackage.Literals.WORKAROUND__POST_AREA_LIST);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EStructuralFeature getChildFeature(Object object, Object child)
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Workaround.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getImage(Object object)
    {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Workaround"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText(Object object)
    {
        return getString("_UI_Workaround_type");
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

        switch (notification.getFeatureID(Workaround.class))
        {
            case WorkaroundPackage.WORKAROUND__OPERATION_LIST:
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
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
    protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
    {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__OPERATION_LIST,
                 WorkaroundFactory.eINSTANCE.createOperation()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__VEHICLE_LIST,
                 WorkaroundFactory.eINSTANCE.createVehicle()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__MACHINE_LIST,
                 WorkaroundFactory.eINSTANCE.createMachine()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__ACREAGE_LIST,
                 WorkaroundFactory.eINSTANCE.createAcreage()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST,
                 WorkaroundFactory.eINSTANCE.createPerson()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__JOB_LIST,
                 WorkaroundFactory.eINSTANCE.createJob()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__DISTRICT_LIST,
                 WorkaroundFactory.eINSTANCE.createDistrict()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__PREPARATION_LIST,
                 WorkaroundFactory.eINSTANCE.createPreparation()));

        newChildDescriptors.add
            (createChildParameter
                (WorkaroundPackage.Literals.WORKAROUND__POST_AREA_LIST,
                 WorkaroundFactory.eINSTANCE.createPostArea()));
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
