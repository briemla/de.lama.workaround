package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.StructuredViewer;

public abstract class ItemViewer extends Component
{

    private final IObservableList input;

    public ItemViewer(final IObservableList input)
    {
        this.input = input;
    }

    protected void bind(StructuredViewer viewer)
    {

        ViewerSupport.bind(viewer, input, getViewerProperties());
    }

    protected abstract IValueProperty[] getViewerProperties();

}
