/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workaround.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkaroundFactoryImpl extends EFactoryImpl implements WorkaroundFactory
{
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static WorkaroundFactory init()
    {
		try {
			WorkaroundFactory theWorkaroundFactory = (WorkaroundFactory)EPackage.Registry.INSTANCE.getEFactory("http://workaround/1.0"); 
			if (theWorkaroundFactory != null) {
				return theWorkaroundFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkaroundFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WorkaroundFactoryImpl()
    {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EObject create(EClass eClass)
    {
		switch (eClass.getClassifierID()) {
			case WorkaroundPackage.WORKAROUND: return createWorkaround();
			case WorkaroundPackage.OPERATION: return createOperation();
			case WorkaroundPackage.VEHICLE: return createVehicle();
			case WorkaroundPackage.JOB: return createJob();
			case WorkaroundPackage.MACHINE: return createMachine();
			case WorkaroundPackage.PLOT: return createPlot();
			case WorkaroundPackage.ACREAGE: return createAcreage();
			case WorkaroundPackage.PERSON: return createPerson();
			case WorkaroundPackage.DISTRICT: return createDistrict();
			case WorkaroundPackage.PREPARATION: return createPreparation();
			case WorkaroundPackage.POST_AREA: return createPostArea();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Workaround createWorkaround()
    {
		WorkaroundImpl workaround = new WorkaroundImpl();
		return workaround;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Operation createOperation()
    {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Vehicle createVehicle()
    {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Job createJob()
    {
		JobImpl job = new JobImpl();
		return job;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Machine createMachine()
    {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Plot createPlot()
    {
		PlotImpl plot = new PlotImpl();
		return plot;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Acreage createAcreage()
    {
		AcreageImpl acreage = new AcreageImpl();
		return acreage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Person createPerson()
    {
		PersonImpl person = new PersonImpl();
		return person;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public District createDistrict()
    {
		DistrictImpl district = new DistrictImpl();
		return district;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Preparation createPreparation()
    {
		PreparationImpl preparation = new PreparationImpl();
		return preparation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PostArea createPostArea()
    {
		PostAreaImpl postArea = new PostAreaImpl();
		return postArea;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WorkaroundPackage getWorkaroundPackage()
    {
		return (WorkaroundPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    public static WorkaroundPackage getPackage()
    {
		return WorkaroundPackage.eINSTANCE;
	}

} //WorkaroundFactoryImpl
