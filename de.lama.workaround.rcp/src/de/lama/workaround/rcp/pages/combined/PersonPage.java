package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.PersonMasterPage;

public class PersonPage extends MasterDetailsPage
{

    public PersonPage(final FormEditor editor, final FormToolkit toolkit, final WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.person.edit", "Personen");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new PersonMasterPage(getToolkit(), getEditingDomain());
    }

}
