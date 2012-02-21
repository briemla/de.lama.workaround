package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.PreparationMasterPage;

public class PreparationPage extends MasterDetailsPage
{

    public PreparationPage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.preparation.edit", "Präparate");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new PreparationMasterPage(getToolkit(), getEditingDomain());
    }

}
