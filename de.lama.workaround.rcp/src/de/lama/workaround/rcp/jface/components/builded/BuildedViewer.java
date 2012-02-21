package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.StructuredViewer;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public class BuildedViewer extends BuildedComponent
{

    private final StructuredViewer viewer;

    public BuildedViewer(StructuredViewer viewer)
    {
        this.viewer = viewer;
    }

    @Override
    protected IObservableValue createTargetObservableWith(WidgetBinder binder)
    {
        return ViewersObservables.observeSingleSelection(viewer);
    }

    protected StructuredViewer getViewer()
    {
        return viewer;
    }

}
