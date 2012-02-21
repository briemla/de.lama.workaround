package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.FeatureColumnMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditMachinePage;

public class MachineMasterPage extends MasterPage
{

    private DetailsPage detailsPage;

    public MachineMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__MACHINE_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.MACHINE;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditMachinePage();
        }
        return detailsPage;
    }

    @Override
    protected FeatureColumnMapping columnFeatureMapping()
    {
        FeatureColumnMapping features = new FeatureColumnMapping();
        features.put("Beschreibung", WorkaroundPackage.Literals.MACHINE__DESCRIPTION);
        return features;
    }

    @Override
    protected String contentTitle()
    {
        return "Maschinen";
    }

}
