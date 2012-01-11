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
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Machine#getDescription <em>Description</em>}</li>
 *   <li>{@link workaround.Machine#getHandHeld <em>Hand Held</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
{
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
	 * @see workaround.WorkaroundPackage#getMachine_Description()
	 * @model required="true"
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link workaround.Machine#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(String value);

    /**
	 * Returns the value of the '<em><b>Hand Held</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hand Held</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hand Held</em>' attribute.
	 * @see #setHandHeld(Boolean)
	 * @see workaround.WorkaroundPackage#getMachine_HandHeld()
	 * @model
	 * @generated
	 */
    Boolean getHandHeld();

    /**
	 * Sets the value of the '{@link workaround.Machine#getHandHeld <em>Hand Held</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hand Held</em>' attribute.
	 * @see #getHandHeld()
	 * @generated
	 */
    void setHandHeld(Boolean value);

} // Machine
