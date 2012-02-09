package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditDistrictPage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        TextField textField = new TextField();
        String name = "Name";
        EStructuralFeature model = WorkaroundPackage.Literals.DISTRICT__DISTRICT_NAME;
        textField.build(name).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

}
