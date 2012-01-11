/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workaround.Plot;
import workaround.WorkaroundPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workaround.impl.PlotImpl#getPlotNumber <em>Plot Number</em>}</li>
 *   <li>{@link workaround.impl.PlotImpl#getUnderNumber <em>Under Number</em>}</li>
 *   <li>{@link workaround.impl.PlotImpl#getCadastralArea <em>Cadastral Area</em>}</li>
 *   <li>{@link workaround.impl.PlotImpl#getNettoArea <em>Netto Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlotImpl extends EObjectImpl implements Plot
{
    /**
	 * The default value of the '{@link #getPlotNumber() <em>Plot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPlotNumber()
	 * @generated
	 * @ordered
	 */
    protected static final String PLOT_NUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPlotNumber() <em>Plot Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPlotNumber()
	 * @generated
	 * @ordered
	 */
    protected String plotNumber = PLOT_NUMBER_EDEFAULT;

    /**
	 * The default value of the '{@link #getUnderNumber() <em>Under Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnderNumber()
	 * @generated
	 * @ordered
	 */
    protected static final String UNDER_NUMBER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getUnderNumber() <em>Under Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnderNumber()
	 * @generated
	 * @ordered
	 */
    protected String underNumber = UNDER_NUMBER_EDEFAULT;

    /**
	 * The default value of the '{@link #getCadastralArea() <em>Cadastral Area</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCadastralArea()
	 * @generated
	 * @ordered
	 */
    protected static final Integer CADASTRAL_AREA_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCadastralArea() <em>Cadastral Area</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCadastralArea()
	 * @generated
	 * @ordered
	 */
    protected Integer cadastralArea = CADASTRAL_AREA_EDEFAULT;

    /**
	 * The default value of the '{@link #getNettoArea() <em>Netto Area</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNettoArea()
	 * @generated
	 * @ordered
	 */
    protected static final Integer NETTO_AREA_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNettoArea() <em>Netto Area</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNettoArea()
	 * @generated
	 * @ordered
	 */
    protected Integer nettoArea = NETTO_AREA_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PlotImpl()
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
		return WorkaroundPackage.Literals.PLOT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPlotNumber()
    {
		return plotNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPlotNumber(String newPlotNumber)
    {
		String oldPlotNumber = plotNumber;
		plotNumber = newPlotNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PLOT__PLOT_NUMBER, oldPlotNumber, plotNumber));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getUnderNumber()
    {
		return underNumber;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnderNumber(String newUnderNumber)
    {
		String oldUnderNumber = underNumber;
		underNumber = newUnderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PLOT__UNDER_NUMBER, oldUnderNumber, underNumber));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getCadastralArea()
    {
		return cadastralArea;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCadastralArea(Integer newCadastralArea)
    {
		Integer oldCadastralArea = cadastralArea;
		cadastralArea = newCadastralArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PLOT__CADASTRAL_AREA, oldCadastralArea, cadastralArea));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getNettoArea()
    {
		return nettoArea;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNettoArea(Integer newNettoArea)
    {
		Integer oldNettoArea = nettoArea;
		nettoArea = newNettoArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkaroundPackage.PLOT__NETTO_AREA, oldNettoArea, nettoArea));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
		switch (featureID) {
			case WorkaroundPackage.PLOT__PLOT_NUMBER:
				return getPlotNumber();
			case WorkaroundPackage.PLOT__UNDER_NUMBER:
				return getUnderNumber();
			case WorkaroundPackage.PLOT__CADASTRAL_AREA:
				return getCadastralArea();
			case WorkaroundPackage.PLOT__NETTO_AREA:
				return getNettoArea();
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
			case WorkaroundPackage.PLOT__PLOT_NUMBER:
				setPlotNumber((String)newValue);
				return;
			case WorkaroundPackage.PLOT__UNDER_NUMBER:
				setUnderNumber((String)newValue);
				return;
			case WorkaroundPackage.PLOT__CADASTRAL_AREA:
				setCadastralArea((Integer)newValue);
				return;
			case WorkaroundPackage.PLOT__NETTO_AREA:
				setNettoArea((Integer)newValue);
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
			case WorkaroundPackage.PLOT__PLOT_NUMBER:
				setPlotNumber(PLOT_NUMBER_EDEFAULT);
				return;
			case WorkaroundPackage.PLOT__UNDER_NUMBER:
				setUnderNumber(UNDER_NUMBER_EDEFAULT);
				return;
			case WorkaroundPackage.PLOT__CADASTRAL_AREA:
				setCadastralArea(CADASTRAL_AREA_EDEFAULT);
				return;
			case WorkaroundPackage.PLOT__NETTO_AREA:
				setNettoArea(NETTO_AREA_EDEFAULT);
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
			case WorkaroundPackage.PLOT__PLOT_NUMBER:
				return PLOT_NUMBER_EDEFAULT == null ? plotNumber != null : !PLOT_NUMBER_EDEFAULT.equals(plotNumber);
			case WorkaroundPackage.PLOT__UNDER_NUMBER:
				return UNDER_NUMBER_EDEFAULT == null ? underNumber != null : !UNDER_NUMBER_EDEFAULT.equals(underNumber);
			case WorkaroundPackage.PLOT__CADASTRAL_AREA:
				return CADASTRAL_AREA_EDEFAULT == null ? cadastralArea != null : !CADASTRAL_AREA_EDEFAULT.equals(cadastralArea);
			case WorkaroundPackage.PLOT__NETTO_AREA:
				return NETTO_AREA_EDEFAULT == null ? nettoArea != null : !NETTO_AREA_EDEFAULT.equals(nettoArea);
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
		result.append(" (plotNumber: ");
		result.append(plotNumber);
		result.append(", underNumber: ");
		result.append(underNumber);
		result.append(", cadastralArea: ");
		result.append(cadastralArea);
		result.append(", nettoArea: ");
		result.append(nettoArea);
		result.append(')');
		return result.toString();
	}

} //PlotImpl
