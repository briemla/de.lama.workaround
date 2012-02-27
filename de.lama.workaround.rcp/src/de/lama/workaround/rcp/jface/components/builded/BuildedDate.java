package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.widgets.Control;

public class BuildedDate extends BuildedPrimitive
{

    public BuildedDate(Control control)
    {
        super(control);
    }

    @Override
    protected IWidgetValueProperty widgetProperty()
    {
        return WidgetProperties.selection();
    }

}
