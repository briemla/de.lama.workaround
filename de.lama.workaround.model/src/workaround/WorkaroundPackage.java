/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see workaround.WorkaroundFactory
 * @model kind="package"
 * @generated
 */
public interface WorkaroundPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "workaround";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://workaround/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "workaround";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    WorkaroundPackage eINSTANCE = workaround.impl.WorkaroundPackageImpl.init();

    /**
     * The meta object id for the '{@link workaround.impl.WorkaroundImpl <em>Workaround</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.WorkaroundImpl
     * @see workaround.impl.WorkaroundPackageImpl#getWorkaround()
     * @generated
     */
    int WORKAROUND = 0;

    /**
     * The feature id for the '<em><b>Work List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__WORK_LIST = 0;

    /**
     * The feature id for the '<em><b>Vehicle List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__VEHICLE_LIST = 1;

    /**
     * The feature id for the '<em><b>Machine List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__MACHINE_LIST = 2;

    /**
     * The feature id for the '<em><b>Acreage List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__ACREAGE_LIST = 3;

    /**
     * The feature id for the '<em><b>Person List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__PERSON_LIST = 4;

    /**
     * The feature id for the '<em><b>Job List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__JOB_LIST = 5;

    /**
     * The feature id for the '<em><b>District List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__DISTRICT_LIST = 6;

    /**
     * The feature id for the '<em><b>Preparation List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__PREPARATION_LIST = 7;

    /**
     * The feature id for the '<em><b>Post Area List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND__POST_AREA_LIST = 8;

    /**
     * The number of structural features of the '<em>Workaround</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKAROUND_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link workaround.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.OperationImpl
     * @see workaround.impl.WorkaroundPackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 1;

    /**
     * The feature id for the '<em><b>Task</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__TASK = 0;

    /**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link workaround.impl.VehicleImpl <em>Vehicle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.VehicleImpl
     * @see workaround.impl.WorkaroundPackageImpl#getVehicle()
     * @generated
     */
    int VEHICLE = 2;

    /**
     * The feature id for the '<em><b>Licence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE__LICENCE_NUMBER = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Automotive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE__AUTOMOTIVE = 2;

    /**
     * The number of structural features of the '<em>Vehicle</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VEHICLE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link workaround.impl.JobImpl <em>Job</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.JobImpl
     * @see workaround.impl.WorkaroundPackageImpl#getJob()
     * @generated
     */
    int JOB = 3;

    /**
     * The feature id for the '<em><b>Operations</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__OPERATIONS = 0;

    /**
     * The feature id for the '<em><b>Vehicles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__VEHICLES = 1;

    /**
     * The feature id for the '<em><b>Machines</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__MACHINES = 2;

    /**
     * The feature id for the '<em><b>Acreage</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__ACREAGE = 3;

    /**
     * The feature id for the '<em><b>Persons</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__PERSONS = 4;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__START_DATE = 5;

    /**
     * The feature id for the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__END_DATE = 6;

    /**
     * The feature id for the '<em><b>Start Drive Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__START_DRIVE_DATE = 7;

    /**
     * The feature id for the '<em><b>End Drive Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__END_DRIVE_DATE = 8;

    /**
     * The feature id for the '<em><b>Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__REMARK = 9;

    /**
     * The feature id for the '<em><b>Mechanical Work</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__MECHANICAL_WORK = 10;

    /**
     * The feature id for the '<em><b>Preparations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB__PREPARATIONS = 11;

    /**
     * The number of structural features of the '<em>Job</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JOB_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link workaround.impl.MachineImpl <em>Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.MachineImpl
     * @see workaround.impl.WorkaroundPackageImpl#getMachine()
     * @generated
     */
    int MACHINE = 4;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACHINE__DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Hand Held</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACHINE__HAND_HELD = 1;

    /**
     * The number of structural features of the '<em>Machine</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MACHINE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link workaround.impl.PlotImpl <em>Plot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.PlotImpl
     * @see workaround.impl.WorkaroundPackageImpl#getPlot()
     * @generated
     */
    int PLOT = 5;

    /**
     * The feature id for the '<em><b>Plot Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLOT__PLOT_NUMBER = 0;

    /**
     * The feature id for the '<em><b>Under Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLOT__UNDER_NUMBER = 1;

    /**
     * The feature id for the '<em><b>Cadastral Area</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLOT__CADASTRAL_AREA = 2;

    /**
     * The feature id for the '<em><b>Netto Area</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLOT__NETTO_AREA = 3;

    /**
     * The number of structural features of the '<em>Plot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link workaround.impl.AcreageImpl <em>Acreage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.AcreageImpl
     * @see workaround.impl.WorkaroundPackageImpl#getAcreage()
     * @generated
     */
    int ACREAGE = 6;

    /**
     * The feature id for the '<em><b>Acreage Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACREAGE__ACREAGE_NAME = 0;

    /**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACREAGE__NUMBER = 1;

    /**
     * The feature id for the '<em><b>District</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACREAGE__DISTRICT = 2;

    /**
     * The feature id for the '<em><b>Plot List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACREAGE__PLOT_LIST = 3;

    /**
     * The number of structural features of the '<em>Acreage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACREAGE_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link workaround.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.PersonImpl
     * @see workaround.impl.WorkaroundPackageImpl#getPerson()
     * @generated
     */
    int PERSON = 7;

    /**
     * The feature id for the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__LAST_NAME = 0;

    /**
     * The feature id for the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__FIRST_NAME = 1;

    /**
     * The feature id for the '<em><b>Postarea</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__POSTAREA = 2;

    /**
     * The feature id for the '<em><b>Birthday</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__BIRTHDAY = 3;

    /**
     * The feature id for the '<em><b>Street</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__STREET = 4;

    /**
     * The feature id for the '<em><b>Housenumber</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__HOUSENUMBER = 5;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__PHONE = 6;

    /**
     * The feature id for the '<em><b>Mobile</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__MOBILE = 7;

    /**
     * The feature id for the '<em><b>EMail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__EMAIL = 8;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = 9;

    /**
     * The meta object id for the '{@link workaround.impl.DistrictImpl <em>District</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.DistrictImpl
     * @see workaround.impl.WorkaroundPackageImpl#getDistrict()
     * @generated
     */
    int DISTRICT = 8;

    /**
     * The feature id for the '<em><b>District Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISTRICT__DISTRICT_NAME = 0;

    /**
     * The number of structural features of the '<em>District</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISTRICT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link workaround.impl.PreparationImpl <em>Preparation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.PreparationImpl
     * @see workaround.impl.WorkaroundPackageImpl#getPreparation()
     * @generated
     */
    int PREPARATION = 9;

    /**
     * The feature id for the '<em><b>Preparation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPARATION__PREPARATION_NAME = 0;

    /**
     * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPARATION__ABBREVIATION = 1;

    /**
     * The number of structural features of the '<em>Preparation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PREPARATION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link workaround.impl.PostAreaImpl <em>Post Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see workaround.impl.PostAreaImpl
     * @see workaround.impl.WorkaroundPackageImpl#getPostArea()
     * @generated
     */
    int POST_AREA = 10;

    /**
     * The feature id for the '<em><b>Postcode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POST_AREA__POSTCODE = 0;

    /**
     * The feature id for the '<em><b>District</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POST_AREA__DISTRICT = 1;

    /**
     * The number of structural features of the '<em>Post Area</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POST_AREA_FEATURE_COUNT = 2;


    /**
     * Returns the meta object for class '{@link workaround.Workaround <em>Workaround</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Workaround</em>'.
     * @see workaround.Workaround
     * @generated
     */
    EClass getWorkaround();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getWorkList <em>Work List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Work List</em>'.
     * @see workaround.Workaround#getWorkList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_WorkList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getVehicleList <em>Vehicle List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Vehicle List</em>'.
     * @see workaround.Workaround#getVehicleList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_VehicleList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getMachineList <em>Machine List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Machine List</em>'.
     * @see workaround.Workaround#getMachineList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_MachineList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getAcreageList <em>Acreage List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Acreage List</em>'.
     * @see workaround.Workaround#getAcreageList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_AcreageList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getPersonList <em>Person List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Person List</em>'.
     * @see workaround.Workaround#getPersonList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_PersonList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getJobList <em>Job List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Job List</em>'.
     * @see workaround.Workaround#getJobList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_JobList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getDistrictList <em>District List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>District List</em>'.
     * @see workaround.Workaround#getDistrictList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_DistrictList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getPreparationList <em>Preparation List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Preparation List</em>'.
     * @see workaround.Workaround#getPreparationList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_PreparationList();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Workaround#getPostAreaList <em>Post Area List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Post Area List</em>'.
     * @see workaround.Workaround#getPostAreaList()
     * @see #getWorkaround()
     * @generated
     */
    EReference getWorkaround_PostAreaList();

    /**
     * Returns the meta object for class '{@link workaround.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see workaround.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the attribute '{@link workaround.Operation#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Task</em>'.
     * @see workaround.Operation#getTask()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Task();

    /**
     * Returns the meta object for class '{@link workaround.Vehicle <em>Vehicle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vehicle</em>'.
     * @see workaround.Vehicle
     * @generated
     */
    EClass getVehicle();

    /**
     * Returns the meta object for the attribute '{@link workaround.Vehicle#getLicenceNumber <em>Licence Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Licence Number</em>'.
     * @see workaround.Vehicle#getLicenceNumber()
     * @see #getVehicle()
     * @generated
     */
    EAttribute getVehicle_LicenceNumber();

    /**
     * Returns the meta object for the attribute '{@link workaround.Vehicle#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see workaround.Vehicle#getDescription()
     * @see #getVehicle()
     * @generated
     */
    EAttribute getVehicle_Description();

    /**
     * Returns the meta object for the attribute '{@link workaround.Vehicle#getAutomotive <em>Automotive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Automotive</em>'.
     * @see workaround.Vehicle#getAutomotive()
     * @see #getVehicle()
     * @generated
     */
    EAttribute getVehicle_Automotive();

    /**
     * Returns the meta object for class '{@link workaround.Job <em>Job</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Job</em>'.
     * @see workaround.Job
     * @generated
     */
    EClass getJob();

    /**
     * Returns the meta object for the reference '{@link workaround.Job#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operations</em>'.
     * @see workaround.Job#getOperations()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Operations();

    /**
     * Returns the meta object for the reference list '{@link workaround.Job#getVehicles <em>Vehicles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Vehicles</em>'.
     * @see workaround.Job#getVehicles()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Vehicles();

    /**
     * Returns the meta object for the reference list '{@link workaround.Job#getMachines <em>Machines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Machines</em>'.
     * @see workaround.Job#getMachines()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Machines();

    /**
     * Returns the meta object for the reference '{@link workaround.Job#getAcreage <em>Acreage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Acreage</em>'.
     * @see workaround.Job#getAcreage()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Acreage();

    /**
     * Returns the meta object for the reference list '{@link workaround.Job#getPersons <em>Persons</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Persons</em>'.
     * @see workaround.Job#getPersons()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Persons();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getStartDate <em>Start Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Date</em>'.
     * @see workaround.Job#getStartDate()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_StartDate();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getEndDate <em>End Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Date</em>'.
     * @see workaround.Job#getEndDate()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_EndDate();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getStartDriveDate <em>Start Drive Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Drive Date</em>'.
     * @see workaround.Job#getStartDriveDate()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_StartDriveDate();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getEndDriveDate <em>End Drive Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Drive Date</em>'.
     * @see workaround.Job#getEndDriveDate()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_EndDriveDate();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getRemark <em>Remark</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Remark</em>'.
     * @see workaround.Job#getRemark()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_Remark();

    /**
     * Returns the meta object for the attribute '{@link workaround.Job#getMechanicalWork <em>Mechanical Work</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mechanical Work</em>'.
     * @see workaround.Job#getMechanicalWork()
     * @see #getJob()
     * @generated
     */
    EAttribute getJob_MechanicalWork();

    /**
     * Returns the meta object for the reference list '{@link workaround.Job#getPreparations <em>Preparations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Preparations</em>'.
     * @see workaround.Job#getPreparations()
     * @see #getJob()
     * @generated
     */
    EReference getJob_Preparations();

    /**
     * Returns the meta object for class '{@link workaround.Machine <em>Machine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Machine</em>'.
     * @see workaround.Machine
     * @generated
     */
    EClass getMachine();

    /**
     * Returns the meta object for the attribute '{@link workaround.Machine#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see workaround.Machine#getDescription()
     * @see #getMachine()
     * @generated
     */
    EAttribute getMachine_Description();

    /**
     * Returns the meta object for the attribute '{@link workaround.Machine#getHandHeld <em>Hand Held</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hand Held</em>'.
     * @see workaround.Machine#getHandHeld()
     * @see #getMachine()
     * @generated
     */
    EAttribute getMachine_HandHeld();

    /**
     * Returns the meta object for class '{@link workaround.Plot <em>Plot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plot</em>'.
     * @see workaround.Plot
     * @generated
     */
    EClass getPlot();

    /**
     * Returns the meta object for the attribute '{@link workaround.Plot#getPlotNumber <em>Plot Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Plot Number</em>'.
     * @see workaround.Plot#getPlotNumber()
     * @see #getPlot()
     * @generated
     */
    EAttribute getPlot_PlotNumber();

    /**
     * Returns the meta object for the attribute '{@link workaround.Plot#getUnderNumber <em>Under Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Under Number</em>'.
     * @see workaround.Plot#getUnderNumber()
     * @see #getPlot()
     * @generated
     */
    EAttribute getPlot_UnderNumber();

    /**
     * Returns the meta object for the attribute '{@link workaround.Plot#getCadastralArea <em>Cadastral Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cadastral Area</em>'.
     * @see workaround.Plot#getCadastralArea()
     * @see #getPlot()
     * @generated
     */
    EAttribute getPlot_CadastralArea();

    /**
     * Returns the meta object for the attribute '{@link workaround.Plot#getNettoArea <em>Netto Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Netto Area</em>'.
     * @see workaround.Plot#getNettoArea()
     * @see #getPlot()
     * @generated
     */
    EAttribute getPlot_NettoArea();

    /**
     * Returns the meta object for class '{@link workaround.Acreage <em>Acreage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Acreage</em>'.
     * @see workaround.Acreage
     * @generated
     */
    EClass getAcreage();

    /**
     * Returns the meta object for the attribute '{@link workaround.Acreage#getAcreageName <em>Acreage Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Acreage Name</em>'.
     * @see workaround.Acreage#getAcreageName()
     * @see #getAcreage()
     * @generated
     */
    EAttribute getAcreage_AcreageName();

    /**
     * Returns the meta object for the attribute '{@link workaround.Acreage#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see workaround.Acreage#getNumber()
     * @see #getAcreage()
     * @generated
     */
    EAttribute getAcreage_Number();

    /**
     * Returns the meta object for the reference '{@link workaround.Acreage#getDistrict <em>District</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>District</em>'.
     * @see workaround.Acreage#getDistrict()
     * @see #getAcreage()
     * @generated
     */
    EReference getAcreage_District();

    /**
     * Returns the meta object for the containment reference list '{@link workaround.Acreage#getPlotList <em>Plot List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Plot List</em>'.
     * @see workaround.Acreage#getPlotList()
     * @see #getAcreage()
     * @generated
     */
    EReference getAcreage_PlotList();

    /**
     * Returns the meta object for class '{@link workaround.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see workaround.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getLastName <em>Last Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Last Name</em>'.
     * @see workaround.Person#getLastName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_LastName();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getFirstName <em>First Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>First Name</em>'.
     * @see workaround.Person#getFirstName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_FirstName();

    /**
     * Returns the meta object for the reference '{@link workaround.Person#getPostarea <em>Postarea</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Postarea</em>'.
     * @see workaround.Person#getPostarea()
     * @see #getPerson()
     * @generated
     */
    EReference getPerson_Postarea();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getBirthday <em>Birthday</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Birthday</em>'.
     * @see workaround.Person#getBirthday()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Birthday();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getStreet <em>Street</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Street</em>'.
     * @see workaround.Person#getStreet()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Street();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getHousenumber <em>Housenumber</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Housenumber</em>'.
     * @see workaround.Person#getHousenumber()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Housenumber();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getPhone <em>Phone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Phone</em>'.
     * @see workaround.Person#getPhone()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Phone();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getMobile <em>Mobile</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mobile</em>'.
     * @see workaround.Person#getMobile()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Mobile();

    /**
     * Returns the meta object for the attribute '{@link workaround.Person#getEMail <em>EMail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EMail</em>'.
     * @see workaround.Person#getEMail()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_EMail();

    /**
     * Returns the meta object for class '{@link workaround.District <em>District</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>District</em>'.
     * @see workaround.District
     * @generated
     */
    EClass getDistrict();

    /**
     * Returns the meta object for the attribute '{@link workaround.District#getDistrictName <em>District Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>District Name</em>'.
     * @see workaround.District#getDistrictName()
     * @see #getDistrict()
     * @generated
     */
    EAttribute getDistrict_DistrictName();

    /**
     * Returns the meta object for class '{@link workaround.Preparation <em>Preparation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Preparation</em>'.
     * @see workaround.Preparation
     * @generated
     */
    EClass getPreparation();

    /**
     * Returns the meta object for the attribute '{@link workaround.Preparation#getPreparationName <em>Preparation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Preparation Name</em>'.
     * @see workaround.Preparation#getPreparationName()
     * @see #getPreparation()
     * @generated
     */
    EAttribute getPreparation_PreparationName();

    /**
     * Returns the meta object for the attribute '{@link workaround.Preparation#getAbbreviation <em>Abbreviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbreviation</em>'.
     * @see workaround.Preparation#getAbbreviation()
     * @see #getPreparation()
     * @generated
     */
    EAttribute getPreparation_Abbreviation();

    /**
     * Returns the meta object for class '{@link workaround.PostArea <em>Post Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Post Area</em>'.
     * @see workaround.PostArea
     * @generated
     */
    EClass getPostArea();

    /**
     * Returns the meta object for the attribute '{@link workaround.PostArea#getPostcode <em>Postcode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Postcode</em>'.
     * @see workaround.PostArea#getPostcode()
     * @see #getPostArea()
     * @generated
     */
    EAttribute getPostArea_Postcode();

    /**
     * Returns the meta object for the reference '{@link workaround.PostArea#getDistrict <em>District</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>District</em>'.
     * @see workaround.PostArea#getDistrict()
     * @see #getPostArea()
     * @generated
     */
    EReference getPostArea_District();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    WorkaroundFactory getWorkaroundFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link workaround.impl.WorkaroundImpl <em>Workaround</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.WorkaroundImpl
         * @see workaround.impl.WorkaroundPackageImpl#getWorkaround()
         * @generated
         */
        EClass WORKAROUND = eINSTANCE.getWorkaround();

        /**
         * The meta object literal for the '<em><b>Work List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__WORK_LIST = eINSTANCE.getWorkaround_WorkList();

        /**
         * The meta object literal for the '<em><b>Vehicle List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__VEHICLE_LIST = eINSTANCE.getWorkaround_VehicleList();

        /**
         * The meta object literal for the '<em><b>Machine List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__MACHINE_LIST = eINSTANCE.getWorkaround_MachineList();

        /**
         * The meta object literal for the '<em><b>Acreage List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__ACREAGE_LIST = eINSTANCE.getWorkaround_AcreageList();

        /**
         * The meta object literal for the '<em><b>Person List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__PERSON_LIST = eINSTANCE.getWorkaround_PersonList();

        /**
         * The meta object literal for the '<em><b>Job List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__JOB_LIST = eINSTANCE.getWorkaround_JobList();

        /**
         * The meta object literal for the '<em><b>District List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__DISTRICT_LIST = eINSTANCE.getWorkaround_DistrictList();

        /**
         * The meta object literal for the '<em><b>Preparation List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__PREPARATION_LIST = eINSTANCE.getWorkaround_PreparationList();

        /**
         * The meta object literal for the '<em><b>Post Area List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKAROUND__POST_AREA_LIST = eINSTANCE.getWorkaround_PostAreaList();

        /**
         * The meta object literal for the '{@link workaround.impl.OperationImpl <em>Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.OperationImpl
         * @see workaround.impl.WorkaroundPackageImpl#getOperation()
         * @generated
         */
        EClass OPERATION = eINSTANCE.getOperation();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__TASK = eINSTANCE.getOperation_Task();

        /**
         * The meta object literal for the '{@link workaround.impl.VehicleImpl <em>Vehicle</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.VehicleImpl
         * @see workaround.impl.WorkaroundPackageImpl#getVehicle()
         * @generated
         */
        EClass VEHICLE = eINSTANCE.getVehicle();

        /**
         * The meta object literal for the '<em><b>Licence Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VEHICLE__LICENCE_NUMBER = eINSTANCE.getVehicle_LicenceNumber();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VEHICLE__DESCRIPTION = eINSTANCE.getVehicle_Description();

        /**
         * The meta object literal for the '<em><b>Automotive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VEHICLE__AUTOMOTIVE = eINSTANCE.getVehicle_Automotive();

        /**
         * The meta object literal for the '{@link workaround.impl.JobImpl <em>Job</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.JobImpl
         * @see workaround.impl.WorkaroundPackageImpl#getJob()
         * @generated
         */
        EClass JOB = eINSTANCE.getJob();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__OPERATIONS = eINSTANCE.getJob_Operations();

        /**
         * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__VEHICLES = eINSTANCE.getJob_Vehicles();

        /**
         * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__MACHINES = eINSTANCE.getJob_Machines();

        /**
         * The meta object literal for the '<em><b>Acreage</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__ACREAGE = eINSTANCE.getJob_Acreage();

        /**
         * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__PERSONS = eINSTANCE.getJob_Persons();

        /**
         * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__START_DATE = eINSTANCE.getJob_StartDate();

        /**
         * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__END_DATE = eINSTANCE.getJob_EndDate();

        /**
         * The meta object literal for the '<em><b>Start Drive Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__START_DRIVE_DATE = eINSTANCE.getJob_StartDriveDate();

        /**
         * The meta object literal for the '<em><b>End Drive Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__END_DRIVE_DATE = eINSTANCE.getJob_EndDriveDate();

        /**
         * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__REMARK = eINSTANCE.getJob_Remark();

        /**
         * The meta object literal for the '<em><b>Mechanical Work</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute JOB__MECHANICAL_WORK = eINSTANCE.getJob_MechanicalWork();

        /**
         * The meta object literal for the '<em><b>Preparations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference JOB__PREPARATIONS = eINSTANCE.getJob_Preparations();

        /**
         * The meta object literal for the '{@link workaround.impl.MachineImpl <em>Machine</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.MachineImpl
         * @see workaround.impl.WorkaroundPackageImpl#getMachine()
         * @generated
         */
        EClass MACHINE = eINSTANCE.getMachine();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MACHINE__DESCRIPTION = eINSTANCE.getMachine_Description();

        /**
         * The meta object literal for the '<em><b>Hand Held</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MACHINE__HAND_HELD = eINSTANCE.getMachine_HandHeld();

        /**
         * The meta object literal for the '{@link workaround.impl.PlotImpl <em>Plot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.PlotImpl
         * @see workaround.impl.WorkaroundPackageImpl#getPlot()
         * @generated
         */
        EClass PLOT = eINSTANCE.getPlot();

        /**
         * The meta object literal for the '<em><b>Plot Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLOT__PLOT_NUMBER = eINSTANCE.getPlot_PlotNumber();

        /**
         * The meta object literal for the '<em><b>Under Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLOT__UNDER_NUMBER = eINSTANCE.getPlot_UnderNumber();

        /**
         * The meta object literal for the '<em><b>Cadastral Area</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLOT__CADASTRAL_AREA = eINSTANCE.getPlot_CadastralArea();

        /**
         * The meta object literal for the '<em><b>Netto Area</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLOT__NETTO_AREA = eINSTANCE.getPlot_NettoArea();

        /**
         * The meta object literal for the '{@link workaround.impl.AcreageImpl <em>Acreage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.AcreageImpl
         * @see workaround.impl.WorkaroundPackageImpl#getAcreage()
         * @generated
         */
        EClass ACREAGE = eINSTANCE.getAcreage();

        /**
         * The meta object literal for the '<em><b>Acreage Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACREAGE__ACREAGE_NAME = eINSTANCE.getAcreage_AcreageName();

        /**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACREAGE__NUMBER = eINSTANCE.getAcreage_Number();

        /**
         * The meta object literal for the '<em><b>District</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACREAGE__DISTRICT = eINSTANCE.getAcreage_District();

        /**
         * The meta object literal for the '<em><b>Plot List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACREAGE__PLOT_LIST = eINSTANCE.getAcreage_PlotList();

        /**
         * The meta object literal for the '{@link workaround.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.PersonImpl
         * @see workaround.impl.WorkaroundPackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

        /**
         * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

        /**
         * The meta object literal for the '<em><b>Postarea</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSON__POSTAREA = eINSTANCE.getPerson_Postarea();

        /**
         * The meta object literal for the '<em><b>Birthday</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__BIRTHDAY = eINSTANCE.getPerson_Birthday();

        /**
         * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__STREET = eINSTANCE.getPerson_Street();

        /**
         * The meta object literal for the '<em><b>Housenumber</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__HOUSENUMBER = eINSTANCE.getPerson_Housenumber();

        /**
         * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__PHONE = eINSTANCE.getPerson_Phone();

        /**
         * The meta object literal for the '<em><b>Mobile</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__MOBILE = eINSTANCE.getPerson_Mobile();

        /**
         * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__EMAIL = eINSTANCE.getPerson_EMail();

        /**
         * The meta object literal for the '{@link workaround.impl.DistrictImpl <em>District</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.DistrictImpl
         * @see workaround.impl.WorkaroundPackageImpl#getDistrict()
         * @generated
         */
        EClass DISTRICT = eINSTANCE.getDistrict();

        /**
         * The meta object literal for the '<em><b>District Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DISTRICT__DISTRICT_NAME = eINSTANCE.getDistrict_DistrictName();

        /**
         * The meta object literal for the '{@link workaround.impl.PreparationImpl <em>Preparation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.PreparationImpl
         * @see workaround.impl.WorkaroundPackageImpl#getPreparation()
         * @generated
         */
        EClass PREPARATION = eINSTANCE.getPreparation();

        /**
         * The meta object literal for the '<em><b>Preparation Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPARATION__PREPARATION_NAME = eINSTANCE.getPreparation_PreparationName();

        /**
         * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PREPARATION__ABBREVIATION = eINSTANCE.getPreparation_Abbreviation();

        /**
         * The meta object literal for the '{@link workaround.impl.PostAreaImpl <em>Post Area</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see workaround.impl.PostAreaImpl
         * @see workaround.impl.WorkaroundPackageImpl#getPostArea()
         * @generated
         */
        EClass POST_AREA = eINSTANCE.getPostArea();

        /**
         * The meta object literal for the '<em><b>Postcode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POST_AREA__POSTCODE = eINSTANCE.getPostArea_Postcode();

        /**
         * The meta object literal for the '<em><b>District</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POST_AREA__DISTRICT = eINSTANCE.getPostArea_District();

    }

} //WorkaroundPackage
