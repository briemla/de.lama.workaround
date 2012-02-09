package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.Component;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditOperationPage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        Component textField = new TextField();
        String task = "Arbeitsvorgang";
        EStructuralFeature model = WorkaroundPackage.Literals.OPERATION__TASK;
        textField.build(task).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }
}
