/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link workaround.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link workaround.Person#getPostarea <em>Postarea</em>}</li>
 *   <li>{@link workaround.Person#getBirthday <em>Birthday</em>}</li>
 *   <li>{@link workaround.Person#getStreet <em>Street</em>}</li>
 *   <li>{@link workaround.Person#getHousenumber <em>Housenumber</em>}</li>
 *   <li>{@link workaround.Person#getPhone <em>Phone</em>}</li>
 *   <li>{@link workaround.Person#getMobile <em>Mobile</em>}</li>
 *   <li>{@link workaround.Person#getEMail <em>EMail</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
    /**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see workaround.WorkaroundPackage#getPerson_LastName()
	 * @model required="true"
	 * @generated
	 */
    String getLastName();

    /**
	 * Sets the value of the '{@link workaround.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
    void setLastName(String value);

    /**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see workaround.WorkaroundPackage#getPerson_FirstName()
	 * @model required="true"
	 * @generated
	 */
    String getFirstName();

    /**
	 * Sets the value of the '{@link workaround.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
    void setFirstName(String value);

    /**
	 * Returns the value of the '<em><b>Postarea</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postarea</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Postarea</em>' reference.
	 * @see #setPostarea(PostArea)
	 * @see workaround.WorkaroundPackage#getPerson_Postarea()
	 * @model
	 * @generated
	 */
    PostArea getPostarea();

    /**
	 * Sets the value of the '{@link workaround.Person#getPostarea <em>Postarea</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postarea</em>' reference.
	 * @see #getPostarea()
	 * @generated
	 */
    void setPostarea(PostArea value);

    /**
	 * Returns the value of the '<em><b>Birthday</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Birthday</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday</em>' attribute.
	 * @see #setBirthday(Date)
	 * @see workaround.WorkaroundPackage#getPerson_Birthday()
	 * @model
	 * @generated
	 */
    Date getBirthday();

    /**
	 * Sets the value of the '{@link workaround.Person#getBirthday <em>Birthday</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday</em>' attribute.
	 * @see #getBirthday()
	 * @generated
	 */
    void setBirthday(Date value);

    /**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Street</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see workaround.WorkaroundPackage#getPerson_Street()
	 * @model
	 * @generated
	 */
    String getStreet();

    /**
	 * Sets the value of the '{@link workaround.Person#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
    void setStreet(String value);

    /**
	 * Returns the value of the '<em><b>Housenumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Housenumber</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Housenumber</em>' attribute.
	 * @see #setHousenumber(Integer)
	 * @see workaround.WorkaroundPackage#getPerson_Housenumber()
	 * @model
	 * @generated
	 */
    Integer getHousenumber();

    /**
	 * Sets the value of the '{@link workaround.Person#getHousenumber <em>Housenumber</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housenumber</em>' attribute.
	 * @see #getHousenumber()
	 * @generated
	 */
    void setHousenumber(Integer value);

    /**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see workaround.WorkaroundPackage#getPerson_Phone()
	 * @model
	 * @generated
	 */
    String getPhone();

    /**
	 * Sets the value of the '{@link workaround.Person#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
    void setPhone(String value);

    /**
	 * Returns the value of the '<em><b>Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mobile</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' attribute.
	 * @see #setMobile(String)
	 * @see workaround.WorkaroundPackage#getPerson_Mobile()
	 * @model
	 * @generated
	 */
    String getMobile();

    /**
	 * Sets the value of the '{@link workaround.Person#getMobile <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' attribute.
	 * @see #getMobile()
	 * @generated
	 */
    void setMobile(String value);

    /**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EMail</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see workaround.WorkaroundPackage#getPerson_EMail()
	 * @model
	 * @generated
	 */
    String getEMail();

    /**
	 * Sets the value of the '{@link workaround.Person#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
    void setEMail(String value);

} // Person
