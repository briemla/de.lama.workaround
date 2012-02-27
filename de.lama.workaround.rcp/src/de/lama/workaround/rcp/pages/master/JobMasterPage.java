package de.lama.workaround.rcp.pages.master;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.sorter.JobSorter;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
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
    protected ColumnPropertyMapping columnPropertyMapping()
    {
        ColumnPropertyMapping properties = new ColumnPropertyMapping();
        properties.put("Startzeit", createPropertyFor(WorkaroundPackage.Literals.JOB__START_DATE));
        properties.put("Endzeit", createPropertyFor(WorkaroundPackage.Literals.JOB__END_DATE));
        properties.put("Tätigkeit", operationTask());
        properties.put("Fläche", acreageName());
        return properties;
    }

    private IValueProperty acreageName()
    {
        EStructuralFeature jobAcreage = WorkaroundPackage.Literals.JOB__ACREAGE;
        EStructuralFeature acreageName = WorkaroundPackage.Literals.ACREAGE__ACREAGE_NAME;
        FeaturePath path = FeaturePath.fromList(jobAcreage, acreageName);
        return EMFProperties.value(path);
    }

    private IValueProperty operationTask()
    {
        EStructuralFeature jobOperation = WorkaroundPackage.Literals.JOB__OPERATION;
        EStructuralFeature operationTask = WorkaroundPackage.Literals.OPERATION__TASK;
        FeaturePath path = FeaturePath.fromList(jobOperation, operationTask);
        return createPropertyFor(path);
    }

    @Override
    protected String contentTitle()
    {
        return "Arbeitsvorgänge";
    }

    @Override
    protected ViewerSorter createViewerSorter()
    {
        return new JobSorter();
    }

}
