package de.lama.workaround.rcp;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.lama.workaround.rcp.jface.WidgetBuilder;

public class CreateJobPage extends FormPage
{
    private final EditingDomain editingDomain;
    private final WidgetBuilder builder;

    public CreateJobPage(FormEditor editor, EditingDomain editingDomain, WidgetBuilder builder)
    {
        super(editor, "CreateJobPage", "Neuen Job anlegen");
        this.editingDomain = editingDomain;
        this.builder = builder;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm)
    {
        ScrolledForm form = managedForm.getForm();
        Composite parent = form.getBody();
        builder.createLabel(parent, "Test");

        GridLayout layout = new GridLayout();
        parent.setLayout(layout);
    }

}
