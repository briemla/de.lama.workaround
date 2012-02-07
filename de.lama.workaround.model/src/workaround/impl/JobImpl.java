/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import workaround.Acreage;
import workaround.Job;
import workaround.Machine;
import workaround.Operation;
import workaround.Person;
import workaround.Preparation;
import workaround.Vehicle;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.JobImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getAcreage <em>Acreage</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getStartDriveDate <em>Start Drive Date</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getEndDriveDate <em>End Drive Date</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link workaround.impl.JobImpl#getPreparations <em>Preparations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobImpl extends EObjectImpl implements Job
{
    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected Operation operation;

    /**
     * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVehicles()
     * @generated
     * @ordered
     */
    protected EList vehicles;

    /**
     * The cached value of the '{@link #getMachines() <em>Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMachines()
     * @generated
     * @ordered
     */
    protected EList machines;

    /**
     * The cached value of the '{@link #getAcreage() <em>Acreage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcreage()
     * @generated
     * @ordered
     */
    protected Acreage acreage;

    /**
     * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersons()
     * @generated
     * @ordered
     */
    protected EList persons;

    /**
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected Date startDate = START_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected static final Date END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected Date endDate = END_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getStartDriveDate() <em>Start Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDriveDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DRIVE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDriveDate() <em>Start Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDriveDate()
     * @generated
     * @ordered
     */
    protected Date startDriveDate = START_DRIVE_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndDriveDate() <em>End Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDriveDate()
     * @generated
     * @ordered
     */
    protected static final Date END_DRIVE_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDriveDate() <em>End Drive Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDriveDate()
     * @generated
     * @ordered
     */
    protected Date endDriveDate = END_DRIVE_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected static final String REMARK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemark()
     * @generated
     * @ordered
     */
    protected String remark = REMARK_EDEFAULT;

    /**
     * The cached value of the '{@link #getPreparations() <em>Preparations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreparations()
     * @generated
     * @ordered
     */
    protected EList preparations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JobImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass()
    {
        return WorkaroundPackage.Literals.JOB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation()
    {
        if (operation != null && operation.eIsProxy())
        {
            InternalEObject oldOperation = (InternalEObject)operation;
            operation = (Operation)eResolveProxy(oldOperation);
            if (operation != oldOperation)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkaroundPackage.JOB__OPERATION, oldOperation, operation));
            }
        }
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperation()
    {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation)
    {
        Operation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__OPERATION, oldOperation, operation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getVehicles()
    {
        if (vehicles == null)
        {
            vehicles = new EObjectResolvingEList(Vehicle.class, this, WorkaroundPackage.JOB__VEHICLES);
        }
        return vehicles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getMachines()
    {
        if (machines == null)
        {
            machines = new EObjectResolvingEList(Machine.class, this, WorkaroundPackage.JOB__MACHINES);
        }
        return machines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Acreage getAcreage()
    {
        if (acreage != null && acreage.eIsProxy())
        {
            InternalEObject oldAcreage = (InternalEObject)acreage;
            acreage = (Acreage)eResolveProxy(oldAcreage);
            if (acreage != oldAcreage)
            {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkaroundPackage.JOB__ACREAGE, oldAcreage, acreage));
            }
        }
        return acreage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Acreage basicGetAcreage()
    {
        return acreage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAcreage(Acreage newAcreage)
    {
        Acreage oldAcreage = acreage;
        acreage = newAcreage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__ACREAGE, oldAcreage, acreage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPersons()
    {
        if (persons == null)
        {
            persons = new EObjectResolvingEList(Person.class, this, WorkaroundPackage.JOB__PERSONS);
        }
        return persons;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStartDate()
    {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartDate(Date newStartDate)
    {
        Date oldStartDate = startDate;
        startDate = newStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__START_DATE, oldStartDate, startDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEndDate()
    {
        return endDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndDate(Date newEndDate)
    {
        Date oldEndDate = endDate;
        endDate = newEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__END_DATE, oldEndDate, endDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStartDriveDate()
    {
        return startDriveDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartDriveDate(Date newStartDriveDate)
    {
        Date oldStartDriveDate = startDriveDate;
        startDriveDate = newStartDriveDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__START_DRIVE_DATE, oldStartDriveDate, startDriveDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEndDriveDate()
    {
        return endDriveDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndDriveDate(Date newEndDriveDate)
    {
        Date oldEndDriveDate = endDriveDate;
        endDriveDate = newEndDriveDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__END_DRIVE_DATE, oldEndDriveDate, endDriveDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRemark()
    {
        return remark;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRemark(String newRemark)
    {
        String oldRemark = remark;
        remark = newRemark;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.JOB__REMARK, oldRemark, remark));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPreparations()
    {
        if (preparations == null)
        {
            preparations = new EObjectResolvingEList(Preparation.class, this, WorkaroundPackage.JOB__PREPARATIONS);
        }
        return preparations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case WorkaroundPackage.JOB__OPERATION:
                if (resolve) return getOperation();
                return basicGetOperation();
            case WorkaroundPackage.JOB__VEHICLES:
                return getVehicles();
            case WorkaroundPackage.JOB__MACHINES:
                return getMachines();
            case WorkaroundPackage.JOB__ACREAGE:
                if (resolve) return getAcreage();
                return basicGetAcreage();
            case WorkaroundPackage.JOB__PERSONS:
                return getPersons();
            case WorkaroundPackage.JOB__START_DATE:
                return getStartDate();
            case WorkaroundPackage.JOB__END_DATE:
                return getEndDate();
            case WorkaroundPackage.JOB__START_DRIVE_DATE:
                return getStartDriveDate();
            case WorkaroundPackage.JOB__END_DRIVE_DATE:
                return getEndDriveDate();
            case WorkaroundPackage.JOB__REMARK:
                return getRemark();
            case WorkaroundPackage.JOB__PREPARATIONS:
                return getPreparations();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case WorkaroundPackage.JOB__OPERATION:
                setOperation((Operation)newValue);
                return;
            case WorkaroundPackage.JOB__VEHICLES:
                getVehicles().clear();
                getVehicles().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.JOB__MACHINES:
                getMachines().clear();
                getMachines().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.JOB__ACREAGE:
                setAcreage((Acreage)newValue);
                return;
            case WorkaroundPackage.JOB__PERSONS:
                getPersons().clear();
                getPersons().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.JOB__START_DATE:
                setStartDate((Date)newValue);
                return;
            case WorkaroundPackage.JOB__END_DATE:
                setEndDate((Date)newValue);
                return;
            case WorkaroundPackage.JOB__START_DRIVE_DATE:
                setStartDriveDate((Date)newValue);
                return;
            case WorkaroundPackage.JOB__END_DRIVE_DATE:
                setEndDriveDate((Date)newValue);
                return;
            case WorkaroundPackage.JOB__REMARK:
                setRemark((String)newValue);
                return;
            case WorkaroundPackage.JOB__PREPARATIONS:
                getPreparations().clear();
                getPreparations().addAll((Collection)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case WorkaroundPackage.JOB__OPERATION:
                setOperation((Operation)null);
                return;
            case WorkaroundPackage.JOB__VEHICLES:
                getVehicles().clear();
                return;
            case WorkaroundPackage.JOB__MACHINES:
                getMachines().clear();
                return;
            case WorkaroundPackage.JOB__ACREAGE:
                setAcreage((Acreage)null);
                return;
            case WorkaroundPackage.JOB__PERSONS:
                getPersons().clear();
                return;
            case WorkaroundPackage.JOB__START_DATE:
                setStartDate(START_DATE_EDEFAULT);
                return;
            case WorkaroundPackage.JOB__END_DATE:
                setEndDate(END_DATE_EDEFAULT);
                return;
            case WorkaroundPackage.JOB__START_DRIVE_DATE:
                setStartDriveDate(START_DRIVE_DATE_EDEFAULT);
                return;
            case WorkaroundPackage.JOB__END_DRIVE_DATE:
                setEndDriveDate(END_DRIVE_DATE_EDEFAULT);
                return;
            case WorkaroundPackage.JOB__REMARK:
                setRemark(REMARK_EDEFAULT);
                return;
            case WorkaroundPackage.JOB__PREPARATIONS:
                getPreparations().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case WorkaroundPackage.JOB__OPERATION:
                return operation != null;
            case WorkaroundPackage.JOB__VEHICLES:
                return vehicles != null && !vehicles.isEmpty();
            case WorkaroundPackage.JOB__MACHINES:
                return machines != null && !machines.isEmpty();
            case WorkaroundPackage.JOB__ACREAGE:
                return acreage != null;
            case WorkaroundPackage.JOB__PERSONS:
                return persons != null && !persons.isEmpty();
            case WorkaroundPackage.JOB__START_DATE:
                return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
            case WorkaroundPackage.JOB__END_DATE:
                return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
            case WorkaroundPackage.JOB__START_DRIVE_DATE:
                return START_DRIVE_DATE_EDEFAULT == null ? startDriveDate != null : !START_DRIVE_DATE_EDEFAULT.equals(startDriveDate);
            case WorkaroundPackage.JOB__END_DRIVE_DATE:
                return END_DRIVE_DATE_EDEFAULT == null ? endDriveDate != null : !END_DRIVE_DATE_EDEFAULT.equals(endDriveDate);
            case WorkaroundPackage.JOB__REMARK:
                return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
            case WorkaroundPackage.JOB__PREPARATIONS:
                return preparations != null && !preparations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (startDate: ");
        result.append(startDate);
        result.append(", endDate: ");
        result.append(endDate);
        result.append(", startDriveDate: ");
        result.append(startDriveDate);
        result.append(", endDriveDate: ");
        result.append(endDriveDate);
        result.append(", remark: ");
        result.append(remark);
        result.append(')');
        return result.toString();
    }

} //JobImpl
