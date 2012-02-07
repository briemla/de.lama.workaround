package de.lama.workaround.rcp.jface.components;

import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;

public class BuildedTextComponent extends BuildedComponent
{

    public BuildedTextComponent(Control control)
    {
        super(control);
    }

    @Override
    protected IWidgetValueProperty widgetProperty()
    {
        return WidgetProperties.text(SWT.Modify);
    }

}
