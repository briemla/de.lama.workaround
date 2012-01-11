/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workaround.District;
import workaround.PostArea;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.PostAreaImpl#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link workaround.impl.PostAreaImpl#getDistrict <em>District</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostAreaImpl extends EObjectImpl implements PostArea
{
    /**
	 * The default value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
    protected static final Integer POSTCODE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
    protected Integer postcode = POSTCODE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
    protected District district;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PostAreaImpl()
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
		return WorkaroundPackage.Literals.POST_AREA;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getPostcode()
    {
		return postcode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPostcode(Integer newPostcode)
    {
		Integer oldPostcode = postcode;
		postcode = newPostcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.POST_AREA__POSTCODE, oldPostcode, postcode));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public District getDistrict()
    {
		if (district != null && district.eIsProxy()) {
			InternalEObject oldDistrict = (InternalEObject)district;
			district = (District)eResolveProxy(oldDistrict);
			if (district != oldDistrict) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkaroundPackage.POST_AREA__DISTRICT, oldDistrict, district));
			}
		}
		return district;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public District basicGetDistrict()
    {
		return district;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDistrict(District newDistrict)
    {
		District oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.POST_AREA__DISTRICT, oldDistrict, district));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
		switch (featureID) {
			case WorkaroundPackage.POST_AREA__POSTCODE:
				return getPostcode();
			case WorkaroundPackage.POST_AREA__DISTRICT:
				if (resolve) return getDistrict();
				return basicGetDistrict();
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
			case WorkaroundPackage.POST_AREA__POSTCODE:
				setPostcode((Integer)newValue);
				return;
			case WorkaroundPackage.POST_AREA__DISTRICT:
				setDistrict((District)newValue);
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
			case WorkaroundPackage.POST_AREA__POSTCODE:
				setPostcode(POSTCODE_EDEFAULT);
				return;
			case WorkaroundPackage.POST_AREA__DISTRICT:
				setDistrict((District)null);
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
			case WorkaroundPackage.POST_AREA__POSTCODE:
				return POSTCODE_EDEFAULT == null ? postcode != null : !POSTCODE_EDEFAULT.equals(postcode);
			case WorkaroundPackage.POST_AREA__DISTRICT:
				return district != null;
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
		result.append(" (postcode: ");
		result.append(postcode);
		result.append(')');
		return result.toString();
	}

} //PostAreaImpl
