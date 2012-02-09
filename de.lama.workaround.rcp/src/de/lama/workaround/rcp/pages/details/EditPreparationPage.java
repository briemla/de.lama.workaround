package de.lama.workaround.rcp.pages.details;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.TextField;

public class EditPreparationPage extends DetailsPage
{

    @Override
    protected void createPageContentOn(Composite parent)
    {
        createNameOn(parent);
        createAbbreviationOn(parent);
    }

    private void createNameOn(Composite parent)
    {
        TextField textField = new TextField();
        String name = "Name";
        EStructuralFeature model = WorkaroundPackage.Literals.PREPARATION__PREPARATION_NAME;
        textField.build(name).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }

    private void createAbbreviationOn(Composite parent)
    {
        TextField textField = new TextField();
        String abbreviation = "Abkürzung";
        EStructuralFeature model = WorkaroundPackage.Literals.PREPARATION__ABBREVIATION;
        textField.build(abbreviation).with(toolkit()).on(parent).and(bindDelayed()).to(model);
    }
}
