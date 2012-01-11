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

import workaround.Machine;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.MachineImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link workaround.impl.MachineImpl#getHandHeld <em>Hand Held</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends EObjectImpl implements Machine
{
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
	 * The default value of the '{@link #getHandHeld() <em>Hand Held</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHandHeld()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean HAND_HELD_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getHandHeld() <em>Hand Held</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHandHeld()
	 * @generated
	 * @ordered
	 */
    protected Boolean handHeld = HAND_HELD_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MachineImpl()
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
		return WorkaroundPackage.Literals.MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.MACHINE__DESCRIPTION, oldDescription, description));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getHandHeld()
    {
		return handHeld;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHandHeld(Boolean newHandHeld)
    {
		Boolean oldHandHeld = handHeld;
		handHeld = newHandHeld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.MACHINE__HAND_HELD, oldHandHeld, handHeld));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
		switch (featureID) {
			case WorkaroundPackage.MACHINE__DESCRIPTION:
				return getDescription();
			case WorkaroundPackage.MACHINE__HAND_HELD:
				return getHandHeld();
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
		switch (featureID) {
			case WorkaroundPackage.MACHINE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkaroundPackage.MACHINE__HAND_HELD:
				setHandHeld((Boolean)newValue);
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
		switch (featureID) {
			case WorkaroundPackage.MACHINE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkaroundPackage.MACHINE__HAND_HELD:
				setHandHeld(HAND_HELD_EDEFAULT);
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
		switch (featureID) {
			case WorkaroundPackage.MACHINE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkaroundPackage.MACHINE__HAND_HELD:
				return HAND_HELD_EDEFAULT == null ? handHeld != null : !HAND_HELD_EDEFAULT.equals(handHeld);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", handHeld: ");
		result.append(handHeld);
		result.append(')');
		return result.toString();
	}

} //MachineImpl
