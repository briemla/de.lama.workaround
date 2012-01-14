/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workaround</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Workaround#getOperationList <em>Operation List</em>}</li>
 *   <li>{@link workaround.Workaround#getVehicleList <em>Vehicle List</em>}</li>
 *   <li>{@link workaround.Workaround#getMachineList <em>Machine List</em>}</li>
 *   <li>{@link workaround.Workaround#getAcreageList <em>Acreage List</em>}</li>
 *   <li>{@link workaround.Workaround#getPersonList <em>Person List</em>}</li>
 *   <li>{@link workaround.Workaround#getJobList <em>Job List</em>}</li>
 *   <li>{@link workaround.Workaround#getDistrictList <em>District List</em>}</li>
 *   <li>{@link workaround.Workaround#getPreparationList <em>Preparation List</em>}</li>
 *   <li>{@link workaround.Workaround#getPostAreaList <em>Post Area List</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getWorkaround()
 * @model
 * @generated
 */
public interface Workaround extends EObject
{
    /**
     * Returns the value of the '<em><b>Operation List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_OperationList()
     * @model type="workaround.Operation" containment="true"
     * @generated
     */
    EList getOperationList();

    /**
     * Returns the value of the '<em><b>Vehicle List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Vehicle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vehicle List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vehicle List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_VehicleList()
     * @model type="workaround.Vehicle" containment="true"
     * @generated
     */
    EList getVehicleList();

    /**
     * Returns the value of the '<em><b>Machine List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Machine}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Machine List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Machine List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_MachineList()
     * @model type="workaround.Machine" containment="true"
     * @generated
     */
    EList getMachineList();

    /**
     * Returns the value of the '<em><b>Acreage List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Acreage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acreage List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acreage List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_AcreageList()
     * @model type="workaround.Acreage" containment="true"
     * @generated
     */
    EList getAcreageList();

    /**
     * Returns the value of the '<em><b>Person List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Person}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Person List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Person List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_PersonList()
     * @model type="workaround.Person" containment="true"
     * @generated
     */
    EList getPersonList();

    /**
     * Returns the value of the '<em><b>Job List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Job}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Job List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Job List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_JobList()
     * @model type="workaround.Job" containment="true"
     * @generated
     */
    EList getJobList();

    /**
     * Returns the value of the '<em><b>District List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.District}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>District List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>District List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_DistrictList()
     * @model type="workaround.District" containment="true"
     * @generated
     */
    EList getDistrictList();

    /**
     * Returns the value of the '<em><b>Preparation List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.Preparation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preparation List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preparation List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_PreparationList()
     * @model type="workaround.Preparation" containment="true"
     * @generated
     */
    EList getPreparationList();

    /**
     * Returns the value of the '<em><b>Post Area List</b></em>' containment reference list.
     * The list contents are of type {@link workaround.PostArea}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Area List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Area List</em>' containment reference list.
     * @see workaround.WorkaroundPackage#getWorkaround_PostAreaList()
     * @model type="workaround.PostArea" containment="true"
     * @generated
     */
    EList getPostAreaList();

} // Workaround
