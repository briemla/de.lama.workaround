/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workaround.Acreage;
import workaround.District;
import workaround.Plot;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acreage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.AcreageImpl#getAcreageName <em>Acreage Name</em>}</li>
 *   <li>{@link workaround.impl.AcreageImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link workaround.impl.AcreageImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link workaround.impl.AcreageImpl#getPlotList <em>Plot List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcreageImpl extends EObjectImpl implements Acreage
{
    /**
	 * The default value of the '{@link #getAcreageName() <em>Acreage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAcreageName()
	 * @generated
	 * @ordered
	 */
    protected static final String ACREAGE_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAcreageName() <em>Acreage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAcreageName()
	 * @generated
	 * @ordered
	 */
    protected String acreageName = ACREAGE_NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
    protected static final String NUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
    protected String number = NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getPlotList() <em>Plot List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPlotList()
	 * @generated
	 * @ordered
	 */
    protected EList plotList;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AcreageImpl()
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
		return WorkaroundPackage.Literals.ACREAGE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getAcreageName()
    {
		return acreageName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAcreageName(String newAcreageName)
    {
		String oldAcreageName = acreageName;
		acreageName = newAcreageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.ACREAGE__ACREAGE_NAME, oldAcreageName, acreageName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getNumber()
    {
		return number;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNumber(String newNumber)
    {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.ACREAGE__NUMBER, oldNumber, number));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkaroundPackage.ACREAGE__DISTRICT, oldDistrict, district));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.ACREAGE__DISTRICT, oldDistrict, district));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList getPlotList()
    {
		if (plotList == null) {
			plotList = new EObjectContainmentEList(Plot.class, this, WorkaroundPackage.ACREAGE__PLOT_LIST);
		}
		return plotList;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
		switch (featureID) {
			case WorkaroundPackage.ACREAGE__PLOT_LIST:
				return ((InternalEList)getPlotList()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case WorkaroundPackage.ACREAGE__ACREAGE_NAME:
				return getAcreageName();
			case WorkaroundPackage.ACREAGE__NUMBER:
				return getNumber();
			case WorkaroundPackage.ACREAGE__DISTRICT:
				if (resolve) return getDistrict();
				return basicGetDistrict();
			case WorkaroundPackage.ACREAGE__PLOT_LIST:
				return getPlotList();
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
			case WorkaroundPackage.ACREAGE__ACREAGE_NAME:
				setAcreageName((String)newValue);
				return;
			case WorkaroundPackage.ACREAGE__NUMBER:
				setNumber((String)newValue);
				return;
			case WorkaroundPackage.ACREAGE__DISTRICT:
				setDistrict((District)newValue);
				return;
			case WorkaroundPackage.ACREAGE__PLOT_LIST:
				getPlotList().clear();
				getPlotList().addAll((Collection)newValue);
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
			case WorkaroundPackage.ACREAGE__ACREAGE_NAME:
				setAcreageName(ACREAGE_NAME_EDEFAULT);
				return;
			case WorkaroundPackage.ACREAGE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case WorkaroundPackage.ACREAGE__DISTRICT:
				setDistrict((District)null);
				return;
			case WorkaroundPackage.ACREAGE__PLOT_LIST:
				getPlotList().clear();
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
			case WorkaroundPackage.ACREAGE__ACREAGE_NAME:
				return ACREAGE_NAME_EDEFAULT == null ? acreageName != null : !ACREAGE_NAME_EDEFAULT.equals(acreageName);
			case WorkaroundPackage.ACREAGE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case WorkaroundPackage.ACREAGE__DISTRICT:
				return district != null;
			case WorkaroundPackage.ACREAGE__PLOT_LIST:
				return plotList != null && !plotList.isEmpty();
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
		result.append(" (acreageName: ");
		result.append(acreageName);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //AcreageImpl
