/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workaround.Acreage;
import workaround.District;
import workaround.Job;
import workaround.Machine;
import workaround.Operation;
import workaround.Person;
import workaround.PostArea;
import workaround.Preparation;
import workaround.Vehicle;
import workaround.Workaround;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workaround</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.WorkaroundImpl#getWorkList <em>Work List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getVehicleList <em>Vehicle List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getMachineList <em>Machine List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getAcreageList <em>Acreage List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getPersonList <em>Person List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getJobList <em>Job List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getDistrictList <em>District List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getPreparationList <em>Preparation List</em>}</li>
 *   <li>{@link workaround.impl.WorkaroundImpl#getPostAreaList <em>Post Area List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkaroundImpl extends EObjectImpl implements Workaround
{
    /**
     * The cached value of the '{@link #getWorkList() <em>Work List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkList()
     * @generated
     * @ordered
     */
    protected EList workList;

    /**
     * The cached value of the '{@link #getVehicleList() <em>Vehicle List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVehicleList()
     * @generated
     * @ordered
     */
    protected EList vehicleList;

    /**
     * The cached value of the '{@link #getMachineList() <em>Machine List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMachineList()
     * @generated
     * @ordered
     */
    protected EList machineList;

    /**
     * The cached value of the '{@link #getAcreageList() <em>Acreage List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcreageList()
     * @generated
     * @ordered
     */
    protected EList acreageList;

    /**
     * The cached value of the '{@link #getPersonList() <em>Person List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersonList()
     * @generated
     * @ordered
     */
    protected EList personList;

    /**
     * The cached value of the '{@link #getJobList() <em>Job List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJobList()
     * @generated
     * @ordered
     */
    protected EList jobList;

    /**
     * The cached value of the '{@link #getDistrictList() <em>District List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistrictList()
     * @generated
     * @ordered
     */
    protected EList districtList;

    /**
     * The cached value of the '{@link #getPreparationList() <em>Preparation List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreparationList()
     * @generated
     * @ordered
     */
    protected EList preparationList;

    /**
     * The cached value of the '{@link #getPostAreaList() <em>Post Area List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostAreaList()
     * @generated
     * @ordered
     */
    protected EList postAreaList;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkaroundImpl()
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
        return WorkaroundPackage.Literals.WORKAROUND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getWorkList()
    {
        if (workList == null)
        {
            workList = new EObjectContainmentEList(Operation.class, this, WorkaroundPackage.WORKAROUND__WORK_LIST);
        }
        return workList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getVehicleList()
    {
        if (vehicleList == null)
        {
            vehicleList = new EObjectContainmentEList(Vehicle.class, this, WorkaroundPackage.WORKAROUND__VEHICLE_LIST);
        }
        return vehicleList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getMachineList()
    {
        if (machineList == null)
        {
            machineList = new EObjectContainmentEList(Machine.class, this, WorkaroundPackage.WORKAROUND__MACHINE_LIST);
        }
        return machineList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getAcreageList()
    {
        if (acreageList == null)
        {
            acreageList = new EObjectContainmentEList(Acreage.class, this, WorkaroundPackage.WORKAROUND__ACREAGE_LIST);
        }
        return acreageList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPersonList()
    {
        if (personList == null)
        {
            personList = new EObjectContainmentEList(Person.class, this, WorkaroundPackage.WORKAROUND__PERSON_LIST);
        }
        return personList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getJobList()
    {
        if (jobList == null)
        {
            jobList = new EObjectContainmentEList(Job.class, this, WorkaroundPackage.WORKAROUND__JOB_LIST);
        }
        return jobList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDistrictList()
    {
        if (districtList == null)
        {
            districtList = new EObjectContainmentEList(District.class, this, WorkaroundPackage.WORKAROUND__DISTRICT_LIST);
        }
        return districtList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPreparationList()
    {
        if (preparationList == null)
        {
            preparationList = new EObjectContainmentEList(Preparation.class, this, WorkaroundPackage.WORKAROUND__PREPARATION_LIST);
        }
        return preparationList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getPostAreaList()
    {
        if (postAreaList == null)
        {
            postAreaList = new EObjectContainmentEList(PostArea.class, this, WorkaroundPackage.WORKAROUND__POST_AREA_LIST);
        }
        return postAreaList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case WorkaroundPackage.WORKAROUND__WORK_LIST:
                return ((InternalEList)getWorkList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
                return ((InternalEList)getVehicleList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
                return ((InternalEList)getMachineList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
                return ((InternalEList)getAcreageList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
                return ((InternalEList)getPersonList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
                return ((InternalEList)getJobList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
                return ((InternalEList)getDistrictList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
                return ((InternalEList)getPreparationList()).basicRemove(otherEnd, msgs);
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
                return ((InternalEList)getPostAreaList()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case WorkaroundPackage.WORKAROUND__WORK_LIST:
                return getWorkList();
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
                return getVehicleList();
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
                return getMachineList();
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
                return getAcreageList();
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
                return getPersonList();
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
                return getJobList();
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
                return getDistrictList();
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
                return getPreparationList();
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
                return getPostAreaList();
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
            case WorkaroundPackage.WORKAROUND__WORK_LIST:
                getWorkList().clear();
                getWorkList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
                getVehicleList().clear();
                getVehicleList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
                getMachineList().clear();
                getMachineList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
                getAcreageList().clear();
                getAcreageList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
                getPersonList().clear();
                getPersonList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
                getJobList().clear();
                getJobList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
                getDistrictList().clear();
                getDistrictList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
                getPreparationList().clear();
                getPreparationList().addAll((Collection)newValue);
                return;
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
                getPostAreaList().clear();
                getPostAreaList().addAll((Collection)newValue);
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
            case WorkaroundPackage.WORKAROUND__WORK_LIST:
                getWorkList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
                getVehicleList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
                getMachineList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
                getAcreageList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
                getPersonList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
                getJobList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
                getDistrictList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
                getPreparationList().clear();
                return;
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
                getPostAreaList().clear();
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
            case WorkaroundPackage.WORKAROUND__WORK_LIST:
                return workList != null && !workList.isEmpty();
            case WorkaroundPackage.WORKAROUND__VEHICLE_LIST:
                return vehicleList != null && !vehicleList.isEmpty();
            case WorkaroundPackage.WORKAROUND__MACHINE_LIST:
                return machineList != null && !machineList.isEmpty();
            case WorkaroundPackage.WORKAROUND__ACREAGE_LIST:
                return acreageList != null && !acreageList.isEmpty();
            case WorkaroundPackage.WORKAROUND__PERSON_LIST:
                return personList != null && !personList.isEmpty();
            case WorkaroundPackage.WORKAROUND__JOB_LIST:
                return jobList != null && !jobList.isEmpty();
            case WorkaroundPackage.WORKAROUND__DISTRICT_LIST:
                return districtList != null && !districtList.isEmpty();
            case WorkaroundPackage.WORKAROUND__PREPARATION_LIST:
                return preparationList != null && !preparationList.isEmpty();
            case WorkaroundPackage.WORKAROUND__POST_AREA_LIST:
                return postAreaList != null && !postAreaList.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //WorkaroundImpl
