package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.MasterDetailsPage;
import de.lama.workaround.rcp.pages.master.MachineMasterPage;

public class MachinePage extends MasterDetailsPage
{

    public MachinePage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.machine.edit", "Maschinen");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new MachineMasterPage(getToolkit(), getEditingDomain());
    }

}
