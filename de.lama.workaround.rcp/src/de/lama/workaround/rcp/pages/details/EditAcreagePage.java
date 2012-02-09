package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.ComboBox;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditAcreagePage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createNameOn(parent);
        createNumberOn(parent);
        createDistrictOn(parent);
        createPlotOn(parent);
    }

    private void createNameOn(Composite parent)
    {
        TextField textField = new TextField();
        String name = "Name";
        EStructuralFeature model = WorkaroundPackage.Literals.ACREAGE__ACREAGE_NAME;
        textField.build(name).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createNumberOn(Composite parent)
    {
        TextField textField = new TextField();
        String number = "Nummer";
        EStructuralFeature model = WorkaroundPackage.Literals.ACREAGE__NUMBER;
        textField.build(number).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createDistrictOn(Composite parent)
    {
        ComboBox comboBoc = new ComboBox();
        String district = "Gemarkung";
        EStructuralFeature model = WorkaroundPackage.Literals.ACREAGE__DISTRICT;
        comboBoc.build(district).with(toolkit()).on(parent).and(bind()).to(model);
    }

    private void createPlotOn(Composite parent)
    {
        // TODO Add control to add plots
    }

}
