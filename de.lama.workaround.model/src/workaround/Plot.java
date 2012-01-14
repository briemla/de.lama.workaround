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
 * A representation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workaround.Plot#getPlotNumber <em>Plot Number</em>}</li>
 *   <li>{@link workaround.Plot#getUnderNumber <em>Under Number</em>}</li>
 *   <li>{@link workaround.Plot#getCadastralArea <em>Cadastral Area</em>}</li>
 *   <li>{@link workaround.Plot#getNettoArea <em>Netto Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see workaround.WorkaroundPackage#getPlot()
 * @model
 * @generated
 */
public interface Plot extends EObject
{
    /**
     * Returns the value of the '<em><b>Plot Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plot Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plot Number</em>' attribute.
     * @see #setPlotNumber(String)
     * @see workaround.WorkaroundPackage#getPlot_PlotNumber()
     * @model required="true"
     * @generated
     */
    String getPlotNumber();

    /**
     * Sets the value of the '{@link workaround.Plot#getPlotNumber <em>Plot Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plot Number</em>' attribute.
     * @see #getPlotNumber()
     * @generated
     */
    void setPlotNumber(String value);

    /**
     * Returns the value of the '<em><b>Under Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Under Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Under Number</em>' attribute.
     * @see #setUnderNumber(String)
     * @see workaround.WorkaroundPackage#getPlot_UnderNumber()
     * @model required="true"
     * @generated
     */
    String getUnderNumber();

    /**
     * Sets the value of the '{@link workaround.Plot#getUnderNumber <em>Under Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Under Number</em>' attribute.
     * @see #getUnderNumber()
     * @generated
     */
    void setUnderNumber(String value);

    /**
     * Returns the value of the '<em><b>Cadastral Area</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cadastral Area</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cadastral Area</em>' attribute.
     * @see #setCadastralArea(Integer)
     * @see workaround.WorkaroundPackage#getPlot_CadastralArea()
     * @model required="true"
     * @generated
     */
    Integer getCadastralArea();

    /**
     * Sets the value of the '{@link workaround.Plot#getCadastralArea <em>Cadastral Area</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cadastral Area</em>' attribute.
     * @see #getCadastralArea()
     * @generated
     */
    void setCadastralArea(Integer value);

    /**
     * Returns the value of the '<em><b>Netto Area</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Netto Area</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Netto Area</em>' attribute.
     * @see #setNettoArea(Integer)
     * @see workaround.WorkaroundPackage#getPlot_NettoArea()
     * @model required="true"
     * @generated
     */
    Integer getNettoArea();

    /**
     * Sets the value of the '{@link workaround.Plot#getNettoArea <em>Netto Area</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Netto Area</em>' attribute.
     * @see #getNettoArea()
     * @generated
     */
    void setNettoArea(Integer value);

} // Plot
