package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditPreparationPage;

public class PreparationMasterPage extends MasterPage
{

    private DetailsPage detailsPage;

    public PreparationMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__PREPARATION_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.PREPARATION;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditPreparationPage();
        }
        return detailsPage;
    }

    @Override
    protected ColumnPropertyMapping columnPropertyMapping()
    {
        ColumnPropertyMapping properties = new ColumnPropertyMapping();
        properties.put("Name", WorkaroundPackage.Literals.PREPARATION__PREPARATION_NAME);
        properties.put("Abk�rzung", WorkaroundPackage.Literals.PREPARATION__ABBREVIATION);
        return properties;
    }

    @Override
    protected String contentTitle()
    {
        return "Pr�parate";
    }

}
