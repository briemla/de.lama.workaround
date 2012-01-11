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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Operation#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
    /**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see workaround.WorkaroundPackage#getOperation_Task()
	 * @model required="true"
	 * @generated
	 */
    String getTask();

    /**
	 * Sets the value of the '{@link workaround.Operation#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
    void setTask(String value);

} // Operation
