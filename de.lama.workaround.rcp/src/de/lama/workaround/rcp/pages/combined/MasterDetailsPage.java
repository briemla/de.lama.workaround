package de.lama.workaround.rcp.pages.combined;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.lama.workaround.rcp.WorkaroundEditingDomain;

public abstract class MasterDetailsPage extends FormPage
{

    private final FormToolkit toolkit;
    private final WorkaroundEditingDomain editingDomain;
    private MasterDetailsBlock pageContent;

    public MasterDetailsPage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain, String id, String title)
    {
        super(editor, id, title);
        this.toolkit = toolkit;
        this.editingDomain = editingDomain;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm)
    {
        final ScrolledForm form = managedForm.getForm();
        form.setText(getTitle());
        final Composite pageBody = form.getBody();
        pageContent().createContent(managedForm, pageBody);
        pageBody.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        pageBody.setLayout(new GridLayout());
    }

    public FormToolkit getToolkit()
    {
        return toolkit;
    }

    public WorkaroundEditingDomain getEditingDomain()
    {
        return editingDomain;
    }

    protected MasterDetailsBlock pageContent()
    {
        if (pageContent == null)
        {
            pageContent = createPageContent();
        }
        return pageContent;
    }

    protected abstract MasterDetailsBlock createPageContent();

}
