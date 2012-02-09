package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.Component;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditPersonPage extends DetailsPage
{

    public EditPersonPage()
    {
        super();
    }

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createFirstNameOn(parent);
        createLastNameOn(parent);
    }

    private void createFirstNameOn(Composite parent)
    {
        EStructuralFeature model = WorkaroundPackage.Literals.PERSON__FIRST_NAME;
        Component workaroundTextField = new TextField();
        String firstNameText = "Vorname";
        workaroundTextField.build(firstNameText).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createLastNameOn(Composite parent)
    {
        EStructuralFeature model = WorkaroundPackage.Literals.PERSON__LAST_NAME;
        Component workaroundTextField = new TextField();
        String firstName = "Nachname";
        workaroundTextField.build(firstName).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }
}
