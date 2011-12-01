package de.lama.workaround.rcp.jface;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class WidgetBuilder
{

    private final EditingDomain editingDomain;
    private final FormToolkit toolkit;

    public WidgetBuilder(EditingDomain editingDomain, FormToolkit toolkit)
    {
        this.editingDomain = editingDomain;
        this.toolkit = toolkit;
    }

    public void createLabel(Composite parent, String text)
    {
        toolkit.createLabel(parent, text);
    }
}
