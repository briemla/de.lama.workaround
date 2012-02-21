package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.FeatureColumnMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditDistrictPage;

public class DistrictMasterPage extends MasterPage
{

    private DetailsPage detailsPage;

    public DistrictMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__DISTRICT_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.DISTRICT;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditDistrictPage();
        }
        return detailsPage;
    }

    @Override
    protected FeatureColumnMapping columnFeatureMapping()
    {
        FeatureColumnMapping features = new FeatureColumnMapping();
        features.put("Name", WorkaroundPackage.Literals.DISTRICT__DISTRICT_NAME);
        return features;
    }

    @Override
    protected String contentTitle()
    {
        return "Gemarkung";
    }

}
