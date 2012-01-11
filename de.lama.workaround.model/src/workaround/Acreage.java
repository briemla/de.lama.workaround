/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acreage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Acreage#getAcreageName <em>Acreage Name</em>}</li>
 *   <li>{@link workaround.Acreage#getNumber <em>Number</em>}</li>
 *   <li>{@link workaround.Acreage#getDistrict <em>District</em>}</li>
 *   <li>{@link workaround.Acreage#getPlotList <em>Plot List</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getAcreage()
 * @model
 * @generated
 */
public interface Acreage extends EObject
{
    /**
	 * Returns the value of the '<em><b>Acreage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Acreage Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Acreage Name</em>' attribute.
	 * @see #setAcreageName(String)
	 * @see workaround.WorkaroundPackage#getAcreage_AcreageName()
	 * @model required="true"
	 * @generated
	 */
    String getAcreageName();

    /**
	 * Sets the value of the '{@link workaround.Acreage#getAcreageName <em>Acreage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acreage Name</em>' attribute.
	 * @see #getAcreageName()
	 * @generated
	 */
    void setAcreageName(String value);

    /**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see workaround.WorkaroundPackage#getAcreage_Number()
	 * @model
	 * @generated
	 */
    String getNumber();

    /**
	 * Sets the value of the '{@link workaround.Acreage#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
    void setNumber(String value);

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
	 * @see workaround.WorkaroundPackage#getAcreage_District()
	 * @model required="true"
	 * @generated
	 */
    District getDistrict();

    /**
	 * Sets the value of the '{@link workaround.Acreage#getDistrict <em>District</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' reference.
	 * @see #getDistrict()
	 * @generated
	 */
    void setDistrict(District value);

    /**
	 * Returns the value of the '<em><b>Plot List</b></em>' containment reference list.
	 * The list contents are of type {@link workaround.Plot}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plot List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot List</em>' containment reference list.
	 * @see workaround.WorkaroundPackage#getAcreage_PlotList()
	 * @model type="workaround.Plot" containment="true"
	 * @generated
	 */
    EList getPlotList();

} // Acreage
