package de.lama.workaround.rcp.pages.master;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
import de.lama.workaround.rcp.pages.details.DetailsPage;
import de.lama.workaround.rcp.pages.details.EditPersonPage;

public class PersonMasterPage extends MasterPage
{

    private DetailsPage detailsPage = null;

    public PersonMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected EStructuralFeature masterFeature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST;
    }

    @Override
    protected EClass masterClass()
    {
        return WorkaroundPackage.Literals.PERSON;
    }

    @Override
    protected DetailsPage detailsPage()
    {
        if (detailsPage == null)
        {
            detailsPage = new EditPersonPage();
        }
        return detailsPage;
    }

    @Override
    protected ColumnPropertyMapping columnPropertyMapping()
    {
        ColumnPropertyMapping properties = new ColumnPropertyMapping();
        properties.put("Nachname", WorkaroundPackage.Literals.PERSON__LAST_NAME);
        properties.put("Vorname", WorkaroundPackage.Literals.PERSON__FIRST_NAME);
        return properties;
    }

    @Override
    protected String contentTitle()
    {
        return "Personen";
    }
}
