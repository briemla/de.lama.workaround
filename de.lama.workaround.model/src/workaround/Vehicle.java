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
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Vehicle#getLicenceNumber <em>Licence Number</em>}</li>
 *   <li>{@link workaround.Vehicle#getDescription <em>Description</em>}</li>
 *   <li>{@link workaround.Vehicle#getAutomotive <em>Automotive</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject
{
    /**
	 * Returns the value of the '<em><b>Licence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Licence Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Licence Number</em>' attribute.
	 * @see #setLicenceNumber(String)
	 * @see workaround.WorkaroundPackage#getVehicle_LicenceNumber()
	 * @model required="true"
	 * @generated
	 */
    String getLicenceNumber();

    /**
	 * Sets the value of the '{@link workaround.Vehicle#getLicenceNumber <em>Licence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licence Number</em>' attribute.
	 * @see #getLicenceNumber()
	 * @generated
	 */
    void setLicenceNumber(String value);

    /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see workaround.WorkaroundPackage#getVehicle_Description()
	 * @model
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link workaround.Vehicle#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(String value);

    /**
	 * Returns the value of the '<em><b>Automotive</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Automotive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Automotive</em>' attribute.
	 * @see #setAutomotive(Boolean)
	 * @see workaround.WorkaroundPackage#getVehicle_Automotive()
	 * @model
	 * @generated
	 */
    Boolean getAutomotive();

    /**
	 * Sets the value of the '{@link workaround.Vehicle#getAutomotive <em>Automotive</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automotive</em>' attribute.
	 * @see #getAutomotive()
	 * @generated
	 */
    void setAutomotive(Boolean value);

} // Vehicle
