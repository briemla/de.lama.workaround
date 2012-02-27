package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditOperationPage;

public class OperationMasterPage extends MasterPage
{

    private EditOperationPage detailsPage = null;

    public OperationMasterPage(final FormToolkit toolkit, final WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__OPERATION_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.OPERATION;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditOperationPage();
        }
        return detailsPage;
    }

    @Override
    protected ColumnPropertyMapping columnPropertyMapping()
    {
        ColumnPropertyMapping properties = new ColumnPropertyMapping();
        properties.put("Arbeitsvorgang", createPropertyFor(WorkaroundPackage.Literals.OPERATION__TASK));
        return properties;
    }

    @Override
    protected String contentTitle()
    {
        return "Arbeitsvorgänge";
    }

}
