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
 * A representation of the model object '<em><b>District</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.District#getDistrictName <em>District Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getDistrict()
 * @model
 * @generated
 */
public interface District extends EObject
{
    /**
	 * Returns the value of the '<em><b>District Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>District Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>District Name</em>' attribute.
	 * @see #setDistrictName(String)
	 * @see workaround.WorkaroundPackage#getDistrict_DistrictName()
	 * @model required="true"
	 * @generated
	 */
    String getDistrictName();

    /**
	 * Sets the value of the '{@link workaround.District#getDistrictName <em>District Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District Name</em>' attribute.
	 * @see #getDistrictName()
	 * @generated
	 */
    void setDistrictName(String value);

} // District
