package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.AcreageMasterPage;

public class AcreagePage extends MasterDetailsPage
{

    public AcreagePage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.acreage.edit", "Fläche");
    }

    protected MasterDetailsBlock createPageContent()
    {
        return new AcreageMasterPage(getToolkit(), getEditingDomain());
    }

}
