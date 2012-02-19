package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.swt.widgets.Control;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public abstract class BuildedPrimitive extends BuildedComponent
{

    private final Control buildedComponent;

    public BuildedPrimitive(Control control)
    {
        this.buildedComponent = control;
    }

    @Override
    public BuildedComponent and(WidgetBinder binder)
    {
        binder.setWidgetProperty(widgetProperty());
        return super.and(binder);
    }

    @Override
    protected IObservableValue createTargetObservableWith(WidgetBinder binder)
    {
        return binder.createObservableFor(buildedComponent);
    }

    protected abstract IWidgetValueProperty widgetProperty();

}
