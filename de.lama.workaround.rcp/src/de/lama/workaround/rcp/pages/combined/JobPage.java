package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.JobMasterPage;

public class JobPage extends MasterDetailsPage
{

    public JobPage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.job.edit", "Arbeitsvorgang");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new JobMasterPage(getToolkit(), getEditingDomain());
    }

}
