package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;

public class BuildedText extends BuildedComponent
{

    public BuildedText(Control control)
    {
        super(control);
    }

    @Override
    protected IWidgetValueProperty widgetProperty()
    {
        return WidgetProperties.text(SWT.Modify);
    }

}
