package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.CheckBox;
import de.lama.workaround.rcp.jface.components.Component;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditVehiclePage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createLicenceNumberOn(parent);
        createDescriptionOn(parent);
        createAutomotiveOn(parent);
    }

    private void createLicenceNumberOn(Composite parent)
    {
        Component textField = new TextField();
        String licenceNumber = "Kennzeichen";
        EStructuralFeature model = WorkaroundPackage.Literals.VEHICLE__LICENCE_NUMBER;
        textField.build(licenceNumber).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createDescriptionOn(Composite parent)
    {
        Component textField = new TextField();
        String description = "Beschreibung";
        EStructuralFeature model = WorkaroundPackage.Literals.VEHICLE__DESCRIPTION;
        textField.build(description).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createAutomotiveOn(Composite parent)
    {
        CheckBox checkBox = new CheckBox();
        String automotive = "Selbst fahrend";
        EStructuralFeature model = WorkaroundPackage.Literals.VEHICLE__AUTOMOTIVE;
        checkBox.build(automotive).with(toolkit()).on(parent).and(bind()).to(model);
    }

}
