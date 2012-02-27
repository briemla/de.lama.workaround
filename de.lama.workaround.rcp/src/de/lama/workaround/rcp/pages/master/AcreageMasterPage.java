package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditAcreagePage;

public class AcreageMasterPage extends MasterPage
{

    private DetailsPage detailsPage;

    public AcreageMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__ACREAGE_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.ACREAGE;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditAcreagePage();
        }
        return detailsPage;
    }

    @Override
    protected ColumnPropertyMapping columnPropertyMapping()
    {
        ColumnPropertyMapping properties = new ColumnPropertyMapping();
        properties.put("Name", createPropertyFor(WorkaroundPackage.Literals.ACREAGE__ACREAGE_NAME));
        return properties;
    }

    @Override
    protected String contentTitle()
    {
        return "Fläche";
    }

}
