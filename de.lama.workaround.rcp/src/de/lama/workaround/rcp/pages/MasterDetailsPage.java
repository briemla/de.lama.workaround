package de.lama.workaround.rcp.pages;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class MasterDetailsPage extends FormPage
{

    private final MasterDetailsBlock pageContent;

    public MasterDetailsPage(MasterDetailsBlock pageContent, FormEditor editor, String id, String title)
    {
        super(editor, id, title);
        this.pageContent = pageContent;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm)
    {
        ScrolledForm form = managedForm.getForm();
        form.setText(getTitle());
        Composite pageBody = form.getBody();
        pageContent.createContent(managedForm, pageBody);

        GridLayout pageLayout = new GridLayout();
        pageBody.setLayout(pageLayout);
    }

}
