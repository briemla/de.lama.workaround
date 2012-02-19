package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.widgets.Button;

public class BuildedCheckBox extends BuildedPrimitive
{

    public BuildedCheckBox(Button checkbox)
    {
        super(checkbox);
    }

    @Override
    protected IWidgetValueProperty widgetProperty()
    {

        return WidgetProperties.selection();
    }

}
