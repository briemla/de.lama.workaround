package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

public abstract class WorkaroundComponent
{

    private FormToolkit toolkit;
    private String description;

    public WorkaroundComponent with(FormToolkit toolkit)
    {
        this.toolkit = toolkit;
        return this;
    }

    public WorkaroundComponent build(String firstNameText)
    {
        this.description = firstNameText;
        return this;
    }

    protected FormToolkit toolkit()
    {
        return toolkit;
    }

    protected String description()
    {
        return description;
    }

    public abstract BuildedComponent on(Composite parent);

    protected void createDescriptionOn(Composite parent)
    {
        Label description = toolkit.createLabel(parent, this.description);
        GridData descriptionData = new GridData(SWT.BEGINNING, SWT.TOP, true, false);
        description.setLayoutData(descriptionData);
    }

    protected Composite createContainerOn(Composite parent)
    {
        Composite container = toolkit.createComposite(parent);
        container.setLayout(new GridLayout());
        GridData containerData = new GridData(SWT.BEGINNING, SWT.TOP, true, false);
        container.setLayoutData(containerData);
        return container;
    }

}
