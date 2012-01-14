/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import workaround.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see workaround.WorkaroundPackage
 * @generated
 */
public class WorkaroundAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static WorkaroundPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkaroundAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = WorkaroundPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    public boolean isFactoryForType(Object object)
    {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkaroundSwitch modelSwitch =
        new WorkaroundSwitch()
        {
            public Object caseWorkaround(Workaround object)
            {
                return createWorkaroundAdapter();
            }
            public Object caseOperation(Operation object)
            {
                return createOperationAdapter();
            }
            public Object caseVehicle(Vehicle object)
            {
                return createVehicleAdapter();
            }
            public Object caseJob(Job object)
            {
                return createJobAdapter();
            }
            public Object caseMachine(Machine object)
            {
                return createMachineAdapter();
            }
            public Object casePlot(Plot object)
            {
                return createPlotAdapter();
            }
            public Object caseAcreage(Acreage object)
            {
                return createAcreageAdapter();
            }
            public Object casePerson(Person object)
            {
                return createPersonAdapter();
            }
            public Object caseDistrict(District object)
            {
                return createDistrictAdapter();
            }
            public Object casePreparation(Preparation object)
            {
                return createPreparationAdapter();
            }
            public Object casePostArea(PostArea object)
            {
                return createPostAreaAdapter();
            }
            public Object defaultCase(EObject object)
            {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    public Adapter createAdapter(Notifier target)
    {
        return (Adapter)modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link workaround.Workaround <em>Workaround</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Workaround
     * @generated
     */
    public Adapter createWorkaroundAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Operation
     * @generated
     */
    public Adapter createOperationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Vehicle <em>Vehicle</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Vehicle
     * @generated
     */
    public Adapter createVehicleAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Job <em>Job</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Job
     * @generated
     */
    public Adapter createJobAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Machine <em>Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Machine
     * @generated
     */
    public Adapter createMachineAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Plot <em>Plot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Plot
     * @generated
     */
    public Adapter createPlotAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Acreage <em>Acreage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Acreage
     * @generated
     */
    public Adapter createAcreageAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Person
     * @generated
     */
    public Adapter createPersonAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.District <em>District</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.District
     * @generated
     */
    public Adapter createDistrictAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.Preparation <em>Preparation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.Preparation
     * @generated
     */
    public Adapter createPreparationAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workaround.PostArea <em>Post Area</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workaround.PostArea
     * @generated
     */
    public Adapter createPostAreaAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter()
    {
        return null;
    }

} //WorkaroundAdapterFactory
