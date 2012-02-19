package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.Viewer;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public class BuildedViewer extends BuildedComponent
{

    private final Viewer viewer;

    public BuildedViewer(Viewer viewer)
    {
        this.viewer = viewer;
    }

    @Override
    protected IObservableValue createTargetObservableWith(WidgetBinder binder)
    {
        return ViewersObservables.observeSingleSelection(viewer);
    }

}
