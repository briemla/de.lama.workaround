/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workaround.Person;
import workaround.PostArea;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getPostarea <em>Postarea</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link workaround.impl.PersonImpl#getEMail <em>EMail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person
{
    /**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
    protected static final String LAST_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
    protected String lastName = LAST_NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
    protected static final String FIRST_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
    protected String firstName = FIRST_NAME_EDEFAULT;

    /**
	 * The cached value of the '{@link #getPostarea() <em>Postarea</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPostarea()
	 * @generated
	 * @ordered
	 */
    protected PostArea postarea;

    /**
	 * The default value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
    protected static final Date BIRTHDAY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getBirthday() <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBirthday()
	 * @generated
	 * @ordered
	 */
    protected Date birthday = BIRTHDAY_EDEFAULT;

    /**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
    protected static final String STREET_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
    protected String street = STREET_EDEFAULT;

    /**
	 * The default value of the '{@link #getHousenumber() <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHousenumber()
	 * @generated
	 * @ordered
	 */
    protected static final Integer HOUSENUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getHousenumber() <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHousenumber()
	 * @generated
	 * @ordered
	 */
    protected Integer housenumber = HOUSENUMBER_EDEFAULT;

    /**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
    protected static final String PHONE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
    protected String phone = PHONE_EDEFAULT;

    /**
	 * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
    protected static final String MOBILE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
    protected String mobile = MOBILE_EDEFAULT;

    /**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
    protected static final String EMAIL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
    protected String eMail = EMAIL_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PersonImpl()
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
		return WorkaroundPackage.Literals.PERSON;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLastName()
    {
		return lastName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLastName(String newLastName)
    {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFirstName()
    {
		return firstName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFirstName(String newFirstName)
    {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PostArea getPostarea()
    {
		if (postarea != null && postarea.eIsProxy()) {
			InternalEObject oldPostarea = (InternalEObject)postarea;
			postarea = (PostArea)eResolveProxy(oldPostarea);
			if (postarea != oldPostarea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkaroundPackage.PERSON__POSTAREA, oldPostarea, postarea));
			}
		}
		return postarea;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public PostArea basicGetPostarea()
    {
		return postarea;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPostarea(PostArea newPostarea)
    {
		PostArea oldPostarea = postarea;
		postarea = newPostarea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__POSTAREA, oldPostarea, postarea));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getBirthday()
    {
		return birthday;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBirthday(Date newBirthday)
    {
		Date oldBirthday = birthday;
		birthday = newBirthday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__BIRTHDAY, oldBirthday, birthday));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getStreet()
    {
		return street;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStreet(String newStreet)
    {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__STREET, oldStreet, street));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getHousenumber()
    {
		return housenumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHousenumber(Integer newHousenumber)
    {
		Integer oldHousenumber = housenumber;
		housenumber = newHousenumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__HOUSENUMBER, oldHousenumber, housenumber));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPhone()
    {
		return phone;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPhone(String newPhone)
    {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__PHONE, oldPhone, phone));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMobile()
    {
		return mobile;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMobile(String newMobile)
    {
		String oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__MOBILE, oldMobile, mobile));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getEMail()
    {
		return eMail;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEMail(String newEMail)
    {
		String oldEMail = eMail;
		eMail = newEMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PERSON__EMAIL, oldEMail, eMail));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
		switch (featureID) {
			case WorkaroundPackage.PERSON__LAST_NAME:
				return getLastName();
			case WorkaroundPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case WorkaroundPackage.PERSON__POSTAREA:
				if (resolve) return getPostarea();
				return basicGetPostarea();
			case WorkaroundPackage.PERSON__BIRTHDAY:
				return getBirthday();
			case WorkaroundPackage.PERSON__STREET:
				return getStreet();
			case WorkaroundPackage.PERSON__HOUSENUMBER:
				return getHousenumber();
			case WorkaroundPackage.PERSON__PHONE:
				return getPhone();
			case WorkaroundPackage.PERSON__MOBILE:
				return getMobile();
			case WorkaroundPackage.PERSON__EMAIL:
				return getEMail();
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
			case WorkaroundPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case WorkaroundPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case WorkaroundPackage.PERSON__POSTAREA:
				setPostarea((PostArea)newValue);
				return;
			case WorkaroundPackage.PERSON__BIRTHDAY:
				setBirthday((Date)newValue);
				return;
			case WorkaroundPackage.PERSON__STREET:
				setStreet((String)newValue);
				return;
			case WorkaroundPackage.PERSON__HOUSENUMBER:
				setHousenumber((Integer)newValue);
				return;
			case WorkaroundPackage.PERSON__PHONE:
				setPhone((String)newValue);
				return;
			case WorkaroundPackage.PERSON__MOBILE:
				setMobile((String)newValue);
				return;
			case WorkaroundPackage.PERSON__EMAIL:
				setEMail((String)newValue);
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
			case WorkaroundPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__POSTAREA:
				setPostarea((PostArea)null);
				return;
			case WorkaroundPackage.PERSON__BIRTHDAY:
				setBirthday(BIRTHDAY_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__HOUSENUMBER:
				setHousenumber(HOUSENUMBER_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__MOBILE:
				setMobile(MOBILE_EDEFAULT);
				return;
			case WorkaroundPackage.PERSON__EMAIL:
				setEMail(EMAIL_EDEFAULT);
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
			case WorkaroundPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case WorkaroundPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case WorkaroundPackage.PERSON__POSTAREA:
				return postarea != null;
			case WorkaroundPackage.PERSON__BIRTHDAY:
				return BIRTHDAY_EDEFAULT == null ? birthday != null : !BIRTHDAY_EDEFAULT.equals(birthday);
			case WorkaroundPackage.PERSON__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case WorkaroundPackage.PERSON__HOUSENUMBER:
				return HOUSENUMBER_EDEFAULT == null ? housenumber != null : !HOUSENUMBER_EDEFAULT.equals(housenumber);
			case WorkaroundPackage.PERSON__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case WorkaroundPackage.PERSON__MOBILE:
				return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
			case WorkaroundPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? eMail != null : !EMAIL_EDEFAULT.equals(eMail);
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
		result.append(" (lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", birthday: ");
		result.append(birthday);
		result.append(", street: ");
		result.append(street);
		result.append(", housenumber: ");
		result.append(housenumber);
		result.append(", phone: ");
		result.append(phone);
		result.append(", mobile: ");
		result.append(mobile);
		result.append(", eMail: ");
		result.append(eMail);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
