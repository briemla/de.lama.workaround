package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.DistrictMasterPage;

public class DistrictPage extends MasterDetailsPage
{

    public DistrictPage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.district.edit", "Gemarkung");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new DistrictMasterPage(getToolkit(), getEditingDomain());
    }

}
