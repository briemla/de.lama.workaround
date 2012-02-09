package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.CheckBox;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditMachinePage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createDescriptionOn(parent);
        createHandHeldOn(parent);
    }

    private void createDescriptionOn(Composite parent)
    {
        TextField textField = new TextField();
        String description = "Beschreibung";
        EStructuralFeature model = WorkaroundPackage.Literals.MACHINE__DESCRIPTION;
        textField.build(description).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createHandHeldOn(Composite parent)
    {
        CheckBox checkBox = new CheckBox();
        String handHeld = "Handgerät";
        EStructuralFeature model = WorkaroundPackage.Literals.MACHINE__HAND_HELD;
        checkBox.build(handHeld).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

}
