package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.jface.components.ListItemViewer;
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
        IValueProperty property = createDistrictProperty();
        IObservableList districts = createDistrictObservable();
        ListItemViewer list = new ListItemViewer(districts, property);
        String district = "Gemarkung";
        EStructuralFeature model = WorkaroundPackage.Literals.ACREAGE__DISTRICT;
        list.build(district).with(toolkit()).on(parent).and(bind()).to(model);
    }

    protected IValueProperty createDistrictProperty()
    {
        EStructuralFeature properties = WorkaroundPackage.Literals.DISTRICT__DISTRICT_NAME;
        return EMFProperties.value(properties);
    }

    protected IObservableList createDistrictObservable()
    {
        EObject master = editingDomain().getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__DISTRICT_LIST;
        return EMFObservables.observeList(master, feature);
    }

    private void createPlotOn(Composite parent)
    {
        // TODO Add control to add plots
    }

}
