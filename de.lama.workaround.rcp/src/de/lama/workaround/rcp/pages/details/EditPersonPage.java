package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.components.WorkaroundComponent;
import de.lama.workaround.rcp.jface.components.WorkaroundTextField;

public class EditPersonPage extends WorkaroundDetailsPage
{

    public EditPersonPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain, IObservableValue masterObservable)
    {
        super(toolkit, editingDomain, masterObservable);
    }

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createFirstName(parent);
        createLastName(parent);
    }

    private void createFirstName(Composite parent)
    {
        EStructuralFeature firstName = WorkaroundPackage.Literals.PERSON__FIRST_NAME;
        WorkaroundComponent workaroundTextField = new WorkaroundTextField();
        String firstNameText = "Vorname";
        workaroundTextField.build(firstNameText).with(toolkit()).on(parent).and(bindDelayed()).to(firstName);
    }

    private void createLastName(Composite parent)
    {
        EStructuralFeature firstName = WorkaroundPackage.Literals.PERSON__LAST_NAME;
        WorkaroundComponent workaroundTextField = new WorkaroundTextField();
        String firstNameText = "Nachname";
        workaroundTextField.build(firstNameText).with(toolkit()).on(parent).and(bindDelayed()).to(firstName);
    }
}
