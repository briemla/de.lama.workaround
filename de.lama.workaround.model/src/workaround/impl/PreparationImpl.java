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

import workaround.Preparation;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preparation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.PreparationImpl#getPreparationName <em>Preparation Name</em>}</li>
 *   <li>{@link workaround.impl.PreparationImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreparationImpl extends EObjectImpl implements Preparation
{
    /**
     * The default value of the '{@link #getPreparationName() <em>Preparation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreparationName()
     * @generated
     * @ordered
     */
    protected static final String PREPARATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreparationName() <em>Preparation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreparationName()
     * @generated
     * @ordered
     */
    protected String preparationName = PREPARATION_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected static final String ABBREVIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbreviation()
     * @generated
     * @ordered
     */
    protected String abbreviation = ABBREVIATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PreparationImpl()
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
        return WorkaroundPackage.Literals.PREPARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPreparationName()
    {
        return preparationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreparationName(String newPreparationName)
    {
        String oldPreparationName = preparationName;
        preparationName = newPreparationName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PREPARATION__PREPARATION_NAME, oldPreparationName, preparationName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAbbreviation()
    {
        return abbreviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbbreviation(String newAbbreviation)
    {
        String oldAbbreviation = abbreviation;
        abbreviation = newAbbreviation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PREPARATION__ABBREVIATION, oldAbbreviation, abbreviation));
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
            case WorkaroundPackage.PREPARATION__PREPARATION_NAME:
                return getPreparationName();
            case WorkaroundPackage.PREPARATION__ABBREVIATION:
                return getAbbreviation();
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
            case WorkaroundPackage.PREPARATION__PREPARATION_NAME:
                setPreparationName((String)newValue);
                return;
            case WorkaroundPackage.PREPARATION__ABBREVIATION:
                setAbbreviation((String)newValue);
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
            case WorkaroundPackage.PREPARATION__PREPARATION_NAME:
                setPreparationName(PREPARATION_NAME_EDEFAULT);
                return;
            case WorkaroundPackage.PREPARATION__ABBREVIATION:
                setAbbreviation(ABBREVIATION_EDEFAULT);
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
            case WorkaroundPackage.PREPARATION__PREPARATION_NAME:
                return PREPARATION_NAME_EDEFAULT == null ? preparationName != null : !PREPARATION_NAME_EDEFAULT.equals(preparationName);
            case WorkaroundPackage.PREPARATION__ABBREVIATION:
                return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
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
        result.append(" (preparationName: ");
        result.append(preparationName);
        result.append(", abbreviation: ");
        result.append(abbreviation);
        result.append(')');
        return result.toString();
    }

} //PreparationImpl
