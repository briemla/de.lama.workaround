package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;

public abstract class Component
{

    private FormToolkit toolkit;
    private String description;

    public Component with(FormToolkit toolkit)
    {
        this.toolkit = toolkit;
        return this;
    }

    public Component build(String description)
    {
        this.description = description;
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
        Label description = toolkit.createLabel(parent, description());
        GridData descriptionData = new GridData(SWT.FILL, SWT.TOP, true, false);
        description.setLayoutData(descriptionData);
    }

    protected Composite createContainerOn(Composite parent)
    {
        Composite container = toolkit.createComposite(parent);
        container.setLayout(new GridLayout());
        GridData containerData = new GridData(SWT.FILL, SWT.TOP, true, false);
        container.setLayoutData(containerData);
        return container;
    }

    protected GridData fillHorizontal()
    {
        return new GridData(SWT.FILL, SWT.TOP, true, false);
    }

    protected GridData fillBoth()
    {
        return new GridData(SWT.FILL, SWT.FILL, true, true);
    }
}
