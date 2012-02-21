package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;

public abstract class ItemPropertyViewer extends ItemViewer
{

    private final IValueProperty property;

    public ItemPropertyViewer(final IObservableList listFrom, final IValueProperty propertyToShow)
    {
        super(listFrom);
        this.property = propertyToShow;
    }

    @Override
    protected IValueProperty[] getViewerProperties()
    {
        return new IValueProperty[] { property };
    }

}
