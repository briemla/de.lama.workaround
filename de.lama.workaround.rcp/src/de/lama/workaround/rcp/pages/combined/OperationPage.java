package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.master.OperationMasterPage;

public class OperationPage extends MasterDetailsPage
{

    public OperationPage(final FormEditor editor, final FormToolkit toolkit, final WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.operation.edit", "Arbeitsvorgänge");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new OperationMasterPage(getToolkit(), getEditingDomain());
    }
}
