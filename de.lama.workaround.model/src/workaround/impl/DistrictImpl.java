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

import workaround.District;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.DistrictImpl#getDistrictName <em>District Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistrictImpl extends EObjectImpl implements District
{
    /**
     * The default value of the '{@link #getDistrictName() <em>District Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistrictName()
     * @generated
     * @ordered
     */
    protected static final String DISTRICT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistrictName() <em>District Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistrictName()
     * @generated
     * @ordered
     */
    protected String districtName = DISTRICT_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DistrictImpl()
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
        return WorkaroundPackage.Literals.DISTRICT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDistrictName()
    {
        return districtName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDistrictName(String newDistrictName)
    {
        String oldDistrictName = districtName;
        districtName = newDistrictName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.DISTRICT__DISTRICT_NAME, oldDistrictName, districtName));
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
            case WorkaroundPackage.DISTRICT__DISTRICT_NAME:
                return getDistrictName();
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
            case WorkaroundPackage.DISTRICT__DISTRICT_NAME:
                setDistrictName((String)newValue);
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
            case WorkaroundPackage.DISTRICT__DISTRICT_NAME:
                setDistrictName(DISTRICT_NAME_EDEFAULT);
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
            case WorkaroundPackage.DISTRICT__DISTRICT_NAME:
                return DISTRICT_NAME_EDEFAULT == null ? districtName != null : !DISTRICT_NAME_EDEFAULT.equals(districtName);
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
        result.append(" (districtName: ");
        result.append(districtName);
        result.append(')');
        return result.toString();
    }

} //DistrictImpl
