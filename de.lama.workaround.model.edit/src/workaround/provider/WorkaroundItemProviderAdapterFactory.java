/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.provider;

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

import workaround.util.WorkaroundAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkaroundItemProviderAdapterFactory extends WorkaroundAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
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
    protected Collection supportedTypes = new ArrayList();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkaroundItemProviderAdapterFactory()
    {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Workaround} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkaroundItemProvider workaroundItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Workaround}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createWorkaroundAdapter()
    {
        if (workaroundItemProvider == null)
        {
            workaroundItemProvider = new WorkaroundItemProvider(this);
        }

        return workaroundItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Operation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationItemProvider operationItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Operation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createOperationAdapter()
    {
        if (operationItemProvider == null)
        {
            operationItemProvider = new OperationItemProvider(this);
        }

        return operationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Vehicle} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VehicleItemProvider vehicleItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Vehicle}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createVehicleAdapter()
    {
        if (vehicleItemProvider == null)
        {
            vehicleItemProvider = new VehicleItemProvider(this);
        }

        return vehicleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Job} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JobItemProvider jobItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Job}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createJobAdapter()
    {
        if (jobItemProvider == null)
        {
            jobItemProvider = new JobItemProvider(this);
        }

        return jobItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Machine} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MachineItemProvider machineItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Machine}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createMachineAdapter()
    {
        if (machineItemProvider == null)
        {
            machineItemProvider = new MachineItemProvider(this);
        }

        return machineItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Plot} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlotItemProvider plotItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Plot}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createPlotAdapter()
    {
        if (plotItemProvider == null)
        {
            plotItemProvider = new PlotItemProvider(this);
        }

        return plotItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Acreage} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AcreageItemProvider acreageItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Acreage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createAcreageAdapter()
    {
        if (acreageItemProvider == null)
        {
            acreageItemProvider = new AcreageItemProvider(this);
        }

        return acreageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Person} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonItemProvider personItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Person}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createPersonAdapter()
    {
        if (personItemProvider == null)
        {
            personItemProvider = new PersonItemProvider(this);
        }

        return personItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.District} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DistrictItemProvider districtItemProvider;

    /**
     * This creates an adapter for a {@link workaround.District}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createDistrictAdapter()
    {
        if (districtItemProvider == null)
        {
            districtItemProvider = new DistrictItemProvider(this);
        }

        return districtItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.Preparation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PreparationItemProvider preparationItemProvider;

    /**
     * This creates an adapter for a {@link workaround.Preparation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createPreparationAdapter()
    {
        if (preparationItemProvider == null)
        {
            preparationItemProvider = new PreparationItemProvider(this);
        }

        return preparationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link workaround.PostArea} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PostAreaItemProvider postAreaItemProvider;

    /**
     * This creates an adapter for a {@link workaround.PostArea}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter createPostAreaAdapter()
    {
        if (postAreaItemProvider == null)
        {
            postAreaItemProvider = new PostAreaItemProvider(this);
        }

        return postAreaItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFactoryForType(Object type)
    {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Adapter adapt(Notifier notifier, Object type)
    {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object adapt(Object object, Object type)
    {
        if (isFactoryForType(type))
        {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class)type).isInstance(adapter)))
            {
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
    public void addListener(INotifyChangedListener notifyChangedListener)
    {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener)
    {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification)
    {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null)
        {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose()
    {
        if (workaroundItemProvider != null) workaroundItemProvider.dispose();
        if (operationItemProvider != null) operationItemProvider.dispose();
        if (vehicleItemProvider != null) vehicleItemProvider.dispose();
        if (jobItemProvider != null) jobItemProvider.dispose();
        if (machineItemProvider != null) machineItemProvider.dispose();
        if (plotItemProvider != null) plotItemProvider.dispose();
        if (acreageItemProvider != null) acreageItemProvider.dispose();
        if (personItemProvider != null) personItemProvider.dispose();
        if (districtItemProvider != null) districtItemProvider.dispose();
        if (preparationItemProvider != null) preparationItemProvider.dispose();
        if (postAreaItemProvider != null) postAreaItemProvider.dispose();
    }

}
