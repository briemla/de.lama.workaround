/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.PostArea#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link workaround.PostArea#getDistrict <em>District</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getPostArea()
 * @model
 * @generated
 */
public interface PostArea extends EObject
{
    /**
	 * Returns the value of the '<em><b>Postcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postcode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcode</em>' attribute.
	 * @see #setPostcode(Integer)
	 * @see workaround.WorkaroundPackage#getPostArea_Postcode()
	 * @model
	 * @generated
	 */
    Integer getPostcode();

    /**
	 * Sets the value of the '{@link workaround.PostArea#getPostcode <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcode</em>' attribute.
	 * @see #getPostcode()
	 * @generated
	 */
    void setPostcode(Integer value);

    /**
	 * Returns the value of the '<em><b>District</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>District</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' reference.
	 * @see #setDistrict(District)
	 * @see workaround.WorkaroundPackage#getPostArea_District()
	 * @model required="true"
	 * @generated
	 */
    District getDistrict();

    /**
	 * Sets the value of the '{@link workaround.PostArea#getDistrict <em>District</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' reference.
	 * @see #getDistrict()
	 * @generated
	 */
    void setDistrict(District value);

} // PostArea
