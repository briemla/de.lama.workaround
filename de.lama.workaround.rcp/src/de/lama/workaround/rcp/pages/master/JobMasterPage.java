package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.FeatureColumnMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditJobPage;

public class JobMasterPage extends MasterPage
{

    private DetailsPage detailsPage;

    public JobMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__JOB_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.JOB;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditJobPage();
        }
        return detailsPage;
    }

    @Override
    protected FeatureColumnMapping columnFeatureMapping()
    {
        FeatureColumnMapping features = new FeatureColumnMapping();
        features.put("Startzeit", WorkaroundPackage.Literals.JOB__START_DATE);
        features.put("Endzeit", WorkaroundPackage.Literals.JOB__END_DATE);
        features.put("Tätigkeit", WorkaroundPackage.Literals.JOB__OPERATION);
        features.put("Fläche", WorkaroundPackage.Literals.JOB__ACREAGE);
        return features;
    }

    @Override
    protected String contentTitle()
    {
        return "Arbeitsvorgänge";
    }

}
