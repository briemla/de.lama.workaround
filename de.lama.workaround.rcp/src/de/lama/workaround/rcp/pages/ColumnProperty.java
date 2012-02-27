package de.lama.workaround.rcp.pages;

import org.eclipse.core.databinding.property.value.IValueProperty;

public class ColumnProperty
{
    private final String title;
    private final IValueProperty property;

    public ColumnProperty(String title, IValueProperty property)
    {
        super();
        this.title = title;
        this.property = property;
    }

    public String getTitle()
    {
        return title;
    }

    public IValueProperty getProperty()
    {
        return property;
    }
}
