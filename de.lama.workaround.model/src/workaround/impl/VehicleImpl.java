/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workaround.Vehicle;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.VehicleImpl#getLicenceNumber <em>Licence Number</em>}</li>
 *   <li>{@link workaround.impl.VehicleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link workaround.impl.VehicleImpl#getAutomotive <em>Automotive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleImpl extends EObjectImpl implements Vehicle
{
    /**
     * The default value of the '{@link #getLicenceNumber() <em>Licence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicenceNumber()
     * @generated
     * @ordered
     */
    protected static final String LICENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLicenceNumber() <em>Licence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLicenceNumber()
     * @generated
     * @ordered
     */
    protected String licenceNumber = LICENCE_NUMBER_EDEFAULT;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getAutomotive() <em>Automotive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutomotive()
     * @generated
     * @ordered
     */
    protected static final Boolean AUTOMOTIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAutomotive() <em>Automotive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutomotive()
     * @generated
     * @ordered
     */
    protected Boolean automotive = AUTOMOTIVE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VehicleImpl()
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
        return WorkaroundPackage.Literals.VEHICLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLicenceNumber()
    {
        return licenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLicenceNumber(String newLicenceNumber)
    {
        String oldLicenceNumber = licenceNumber;
        licenceNumber = newLicenceNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.VEHICLE__LICENCE_NUMBER, oldLicenceNumber, licenceNumber));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription)
    {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.VEHICLE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getAutomotive()
    {
        return automotive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAutomotive(Boolean newAutomotive)
    {
        Boolean oldAutomotive = automotive;
        automotive = newAutomotive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.VEHICLE__AUTOMOTIVE, oldAutomotive, automotive));
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
            case WorkaroundPackage.VEHICLE__LICENCE_NUMBER:
                return getLicenceNumber();
            case WorkaroundPackage.VEHICLE__DESCRIPTION:
                return getDescription();
            case WorkaroundPackage.VEHICLE__AUTOMOTIVE:
                return getAutomotive();
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
            case WorkaroundPackage.VEHICLE__LICENCE_NUMBER:
                setLicenceNumber((String)newValue);
                return;
            case WorkaroundPackage.VEHICLE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case WorkaroundPackage.VEHICLE__AUTOMOTIVE:
                setAutomotive((Boolean)newValue);
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
            case WorkaroundPackage.VEHICLE__LICENCE_NUMBER:
                setLicenceNumber(LICENCE_NUMBER_EDEFAULT);
                return;
            case WorkaroundPackage.VEHICLE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case WorkaroundPackage.VEHICLE__AUTOMOTIVE:
                setAutomotive(AUTOMOTIVE_EDEFAULT);
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
            case WorkaroundPackage.VEHICLE__LICENCE_NUMBER:
                return LICENCE_NUMBER_EDEFAULT == null ? licenceNumber != null : !LICENCE_NUMBER_EDEFAULT.equals(licenceNumber);
            case WorkaroundPackage.VEHICLE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case WorkaroundPackage.VEHICLE__AUTOMOTIVE:
                return AUTOMOTIVE_EDEFAULT == null ? automotive != null : !AUTOMOTIVE_EDEFAULT.equals(automotive);
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
        result.append(" (licenceNumber: ");
        result.append(licenceNumber);
        result.append(", description: ");
        result.append(description);
        result.append(", automotive: ");
        result.append(automotive);
        result.append(')');
        return result.toString();
    }

} //VehicleImpl
