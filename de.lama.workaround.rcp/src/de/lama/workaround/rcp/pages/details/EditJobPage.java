package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.Workaround;
import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.ListItemViewer;
import de.lama.workaround.rcp.jface.components.MultiAddViewer;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditJobPage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createStartDriveDateOn(parent);
        createStartDateOn(parent);
        createEndDateOn(parent);
        createEndDriveDateOn(parent);
        createOperationOn(parent);
        createAcreageOn(parent);
        createPersonsOn(parent);
        createMachinesOn(parent);
        createVehiclesOn(parent);
        createPreparationsOn(parent);
        createRemarkOn(parent);
    }

    private void createStartDriveDateOn(Composite parent)
    {
        TextField textField = new TextField();
        String startDriveDate = "Startfahrdatum";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__START_DRIVE_DATE;
        textField.build(startDriveDate).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createStartDateOn(Composite parent)
    {
        TextField textField = new TextField();
        String startDate = "Startdatum";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__START_DATE;
        textField.build(startDate).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createEndDateOn(Composite parent)
    {
        TextField textField = new TextField();
        String endDate = "Enddatum";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__END_DATE;
        textField.build(endDate).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createEndDriveDateOn(Composite parent)
    {
        TextField textField = new TextField();
        String endDriveDate = "Endfahrdatum";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__END_DRIVE_DATE;
        textField.build(endDriveDate).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createOperationOn(Composite parent)
    {
        IObservableList input = createOperationInput();
        IValueProperty property = createOperationProperty();
        ListItemViewer list = new ListItemViewer(input, property);
        String operation = "Arbeitsvorgang";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__OPERATION;
        list.build(operation).with(toolkit()).on(parent).and(bind()).to(model);
    }

    private IObservableList createOperationInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EReference feature = WorkaroundPackage.Literals.WORKAROUND__OPERATION_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty createOperationProperty()
    {
        return EMFProperties.value(WorkaroundPackage.Literals.OPERATION__TASK);
    }

    private void createAcreageOn(Composite parent)
    {
        IObservableList input = createAcreageInput();
        IValueProperty property = createAcreageProperty();
        ListItemViewer list = new ListItemViewer(input, property);
        String acreage = "Fläche";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__ACREAGE;
        list.build(acreage).with(toolkit()).on(parent).and(bind()).to(model);
    }

    private IObservableList createAcreageInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__ACREAGE_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty createAcreageProperty()
    {
        return EMFProperties.value(WorkaroundPackage.Literals.ACREAGE__ACREAGE_NAME);
    }

    private void createPersonsOn(Composite parent)
    {
        IObservableList listFrom = createPersonInput();
        IValueProperty[] columnsToDisplay = createPersonProperties();
        MultiAddViewer multiAdd = new MultiAddViewer(listFrom, columnsToDisplay);
        String persons = "Personen";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__PERSONS;
        multiAdd.build(persons).with(toolkit()).on(parent).and(bindMulti()).to(model);
    }

    private IObservableList createPersonInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty[] createPersonProperties()
    {
        IValueProperty[] valueProperties = new IValueProperty[2];
        valueProperties[0] = EMFProperties.value(WorkaroundPackage.Literals.PERSON__FIRST_NAME);
        valueProperties[1] = EMFProperties.value(WorkaroundPackage.Literals.PERSON__LAST_NAME);
        return valueProperties;
    }

    private void createMachinesOn(Composite parent)
    {
        IObservableList listFrom = createMachineInput();
        IValueProperty[] columnsToDisplay = createMachineProperties();
        MultiAddViewer multiAdd = new MultiAddViewer(listFrom, columnsToDisplay);
        String persons = "Maschinen";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__MACHINES;
        multiAdd.build(persons).with(toolkit()).on(parent).and(bindMulti()).to(model);
    }

    private IObservableList createMachineInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__MACHINE_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty[] createMachineProperties()
    {
        IValueProperty[] valueProperties = new IValueProperty[1];
        valueProperties[0] = EMFProperties.value(WorkaroundPackage.Literals.MACHINE__DESCRIPTION);
        return valueProperties;
    }

    private void createVehiclesOn(Composite parent)
    {
        IObservableList listFrom = createVehicleInput();
        IValueProperty[] columnsToDisplay = createVehicleProperties();
        MultiAddViewer multiAdd = new MultiAddViewer(listFrom, columnsToDisplay);
        String persons = "Fahrzeuge";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__VEHICLES;
        multiAdd.build(persons).with(toolkit()).on(parent).and(bindMulti()).to(model);
    }

    private IObservableList createVehicleInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__VEHICLE_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty[] createVehicleProperties()
    {
        IValueProperty[] valueProperties = new IValueProperty[1];
        valueProperties[0] = EMFProperties.value(WorkaroundPackage.Literals.VEHICLE__DESCRIPTION);
        return valueProperties;
    }

    private void createPreparationsOn(Composite parent)
    {
        IObservableList listFrom = createPreparationInput();
        IValueProperty[] columnsToDisplay = createPreparationProperties();
        MultiAddViewer multiAdd = new MultiAddViewer(listFrom, columnsToDisplay);
        String persons = "Präparate";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__PREPARATIONS;
        multiAdd.build(persons).with(toolkit()).on(parent).and(bindMulti()).to(model);
    }

    private IObservableList createPreparationInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__PREPARATION_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private IValueProperty[] createPreparationProperties()
    {
        IValueProperty[] valueProperties = new IValueProperty[2];
        valueProperties[0] = EMFProperties.value(WorkaroundPackage.Literals.PREPARATION__PREPARATION_NAME);
        valueProperties[1] = EMFProperties.value(WorkaroundPackage.Literals.PREPARATION__ABBREVIATION);
        return valueProperties;
    }

    private void createRemarkOn(Composite parent)
    {
        TextField textField = new TextField();
        String remark = "Bemerkung";
        EStructuralFeature model = WorkaroundPackage.Literals.JOB__REMARK;
        textField.build(remark).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

}
