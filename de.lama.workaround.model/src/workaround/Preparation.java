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
 * A representation of the model object '<em><b>Preparation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Preparation#getPreparationName <em>Preparation Name</em>}</li>
 *   <li>{@link workaround.Preparation#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getPreparation()
 * @model
 * @generated
 */
public interface Preparation extends EObject
{
    /**
     * Returns the value of the '<em><b>Preparation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preparation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Preparation Name</em>' attribute.
     * @see #setPreparationName(String)
     * @see workaround.WorkaroundPackage#getPreparation_PreparationName()
     * @model required="true"
     * @generated
     */
    String getPreparationName();

    /**
     * Sets the value of the '{@link workaround.Preparation#getPreparationName <em>Preparation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Preparation Name</em>' attribute.
     * @see #getPreparationName()
     * @generated
     */
    void setPreparationName(String value);

    /**
     * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abbreviation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbreviation</em>' attribute.
     * @see #setAbbreviation(String)
     * @see workaround.WorkaroundPackage#getPreparation_Abbreviation()
     * @model required="true"
     * @generated
     */
    String getAbbreviation();

    /**
     * Sets the value of the '{@link workaround.Preparation#getAbbreviation <em>Abbreviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbreviation</em>' attribute.
     * @see #getAbbreviation()
     * @generated
     */
    void setAbbreviation(String value);

} // Preparation
