/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Job#getOperations <em>Operations</em>}</li>
 *   <li>{@link workaround.Job#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link workaround.Job#getMachines <em>Machines</em>}</li>
 *   <li>{@link workaround.Job#getAcreage <em>Acreage</em>}</li>
 *   <li>{@link workaround.Job#getPersons <em>Persons</em>}</li>
 *   <li>{@link workaround.Job#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link workaround.Job#getEndDate <em>End Date</em>}</li>
 *   <li>{@link workaround.Job#getStartDriveDate <em>Start Drive Date</em>}</li>
 *   <li>{@link workaround.Job#getEndDriveDate <em>End Drive Date</em>}</li>
 *   <li>{@link workaround.Job#getRemark <em>Remark</em>}</li>
 *   <li>{@link workaround.Job#getMechanicalWork <em>Mechanical Work</em>}</li>
 *   <li>{@link workaround.Job#getPreparations <em>Preparations</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject
{
    /**
     * Returns the value of the '<em><b>Operations</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' reference.
     * @see #setOperations(Operation)
     * @see workaround.WorkaroundPackage#getJob_Operations()
     * @model required="true"
     * @generated
     */
    Operation getOperations();

    /**
     * Sets the value of the '{@link workaround.Job#getOperations <em>Operations</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operations</em>' reference.
     * @see #getOperations()
     * @generated
     */
    void setOperations(Operation value);

    /**
     * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
     * The list contents are of type {@link workaround.Vehicle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vehicles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vehicles</em>' reference list.
     * @see workaround.WorkaroundPackage#getJob_Vehicles()
     * @model type="workaround.Vehicle"
     * @generated
     */
    EList getVehicles();

    /**
     * Returns the value of the '<em><b>Machines</b></em>' reference list.
     * The list contents are of type {@link workaround.Machine}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Machines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Machines</em>' reference list.
     * @see workaround.WorkaroundPackage#getJob_Machines()
     * @model type="workaround.Machine"
     * @generated
     */
    EList getMachines();

    /**
     * Returns the value of the '<em><b>Acreage</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acreage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Acreage</em>' reference.
     * @see #setAcreage(Acreage)
     * @see workaround.WorkaroundPackage#getJob_Acreage()
     * @model required="true"
     * @generated
     */
    Acreage getAcreage();

    /**
     * Sets the value of the '{@link workaround.Job#getAcreage <em>Acreage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Acreage</em>' reference.
     * @see #getAcreage()
     * @generated
     */
    void setAcreage(Acreage value);

    /**
     * Returns the value of the '<em><b>Persons</b></em>' reference list.
     * The list contents are of type {@link workaround.Person}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persons</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persons</em>' reference list.
     * @see workaround.WorkaroundPackage#getJob_Persons()
     * @model type="workaround.Person" required="true"
     * @generated
     */
    EList getPersons();

    /**
     * Returns the value of the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Date</em>' attribute.
     * @see #setStartDate(Date)
     * @see workaround.WorkaroundPackage#getJob_StartDate()
     * @model required="true"
     * @generated
     */
    Date getStartDate();

    /**
     * Sets the value of the '{@link workaround.Job#getStartDate <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Date</em>' attribute.
     * @see #getStartDate()
     * @generated
     */
    void setStartDate(Date value);

    /**
     * Returns the value of the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Date</em>' attribute.
     * @see #setEndDate(Date)
     * @see workaround.WorkaroundPackage#getJob_EndDate()
     * @model required="true"
     * @generated
     */
    Date getEndDate();

    /**
     * Sets the value of the '{@link workaround.Job#getEndDate <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Date</em>' attribute.
     * @see #getEndDate()
     * @generated
     */
    void setEndDate(Date value);

    /**
     * Returns the value of the '<em><b>Start Drive Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Drive Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Drive Date</em>' attribute.
     * @see #setStartDriveDate(Date)
     * @see workaround.WorkaroundPackage#getJob_StartDriveDate()
     * @model required="true"
     * @generated
     */
    Date getStartDriveDate();

    /**
     * Sets the value of the '{@link workaround.Job#getStartDriveDate <em>Start Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Drive Date</em>' attribute.
     * @see #getStartDriveDate()
     * @generated
     */
    void setStartDriveDate(Date value);

    /**
     * Returns the value of the '<em><b>End Drive Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Drive Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Drive Date</em>' attribute.
     * @see #setEndDriveDate(Date)
     * @see workaround.WorkaroundPackage#getJob_EndDriveDate()
     * @model required="true"
     * @generated
     */
    Date getEndDriveDate();

    /**
     * Sets the value of the '{@link workaround.Job#getEndDriveDate <em>End Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Drive Date</em>' attribute.
     * @see #getEndDriveDate()
     * @generated
     */
    void setEndDriveDate(Date value);

    /**
     * Returns the value of the '<em><b>Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remark</em>' attribute.
     * @see #setRemark(String)
     * @see workaround.WorkaroundPackage#getJob_Remark()
     * @model
     * @generated
     */
    String getRemark();

    /**
     * Sets the value of the '{@link workaround.Job#getRemark <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remark</em>' attribute.
     * @see #getRemark()
     * @generated
     */
    void setRemark(String value);

    /**
     * Returns the value of the '<em><b>Mechanical Work</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mechanical Work</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mechanical Work</em>' attribute.
     * @see #setMechanicalWork(Boolean)
     * @see workaround.WorkaroundPackage#getJob_MechanicalWork()
     * @model required="true"
     * @generated
     */
    Boolean getMechanicalWork();

    /**
     * Sets the value of the '{@link workaround.Job#getMechanicalWork <em>Mechanical Work</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mechanical Work</em>' attribute.
     * @see #getMechanicalWork()
     * @generated
     */
    void setMechanicalWork(Boolean value);

    /**
     * Returns the value of the '<em><b>Preparations</b></em>' reference list.
     * The list contents are of type {@link workaround.Preparation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preparations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preparations</em>' reference list.
     * @see workaround.WorkaroundPackage#getJob_Preparations()
     * @model type="workaround.Preparation"
     * @generated
     */
    EList getPreparations();

} // Job
