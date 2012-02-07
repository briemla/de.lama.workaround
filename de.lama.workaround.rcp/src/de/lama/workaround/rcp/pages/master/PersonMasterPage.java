package de.lama.workaround.rcp.pages.master;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.Workaround;
import workaround.WorkaroundPackage;
import workaround.impl.PersonImpl;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.details.EditPersonPage;

public class PersonMasterPage extends WorkaroundMasterPage
{

    public PersonMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected String contentTitle()
    {
        return "Personen";
    }

    @Override
    protected IObservableList masterInput()
    {
        Workaround workaround = editingDomain().getWorkaround();
        return EMFObservables.observeList(workaround, WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST);
    }

    @Override
    protected void registerPages(DetailsPart detailsPart)
    {
        detailsPart.registerPage(PersonImpl.class, new EditPersonPage(toolkit(), editingDomain(), masterObservable()));
    }

    @Override
    protected FeatureColumnMapping columnFeatureMapping()
    {
        FeatureColumnMapping features = new FeatureColumnMapping();
        features.put("Nachname", WorkaroundPackage.Literals.PERSON__LAST_NAME);
        features.put("Vorname", WorkaroundPackage.Literals.PERSON__FIRST_NAME);
        return features;
    }

}
