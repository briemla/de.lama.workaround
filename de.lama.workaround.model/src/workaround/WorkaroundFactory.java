/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workaround;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workaround.WorkaroundPackage
 * @generated
 */
public interface WorkaroundFactory extends EFactory
{
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    WorkaroundFactory eINSTANCE = workaround.impl.WorkaroundFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Workaround</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workaround</em>'.
	 * @generated
	 */
    Workaround createWorkaround();

    /**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
    Operation createOperation();

    /**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
    Vehicle createVehicle();

    /**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
    Job createJob();

    /**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
    Machine createMachine();

    /**
	 * Returns a new object of class '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plot</em>'.
	 * @generated
	 */
    Plot createPlot();

    /**
	 * Returns a new object of class '<em>Acreage</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acreage</em>'.
	 * @generated
	 */
    Acreage createAcreage();

    /**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
    Person createPerson();

    /**
	 * Returns a new object of class '<em>District</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>District</em>'.
	 * @generated
	 */
    District createDistrict();

    /**
	 * Returns a new object of class '<em>Preparation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preparation</em>'.
	 * @generated
	 */
    Preparation createPreparation();

    /**
	 * Returns a new object of class '<em>Post Area</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Area</em>'.
	 * @generated
	 */
    PostArea createPostArea();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    WorkaroundPackage getWorkaroundPackage();

} //WorkaroundFactory
