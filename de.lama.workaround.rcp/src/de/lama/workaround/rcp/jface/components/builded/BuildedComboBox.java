package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.widgets.Combo;

public class BuildedComboBox extends BuildedComponent
{

    public BuildedComboBox(Combo combobox)
    {
        super(combobox);
    }

    @Override
    protected IWidgetValueProperty widgetProperty()
    {
        return WidgetProperties.selection();
    }

}
