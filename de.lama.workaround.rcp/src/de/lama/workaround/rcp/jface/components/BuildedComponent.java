package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.swt.widgets.Control;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public abstract class BuildedComponent
{

    private final Control buildedComponent;
    private WidgetBinder binder;

    public BuildedComponent(Control control)
    {
        this.buildedComponent = control;
    }

    public BuildedComponent and(WidgetBinder binder)
    {
        this.binder = binder;
        this.binder.setWidgetProperty(widgetProperty());
        return this;
    }

    public void to(EStructuralFeature firstName)
    {
        IObservableValue targetElement = binder.createObservableFor(buildedComponent);
        IObservableValue modelElement = binder.createObservableFor(firstName);

        DataBindingContext context = new DataBindingContext();
        UpdateValueStrategy targetToModel = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
        UpdateValueStrategy modelToTarget = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
        context.bindValue(targetElement, modelElement, targetToModel, modelToTarget);
    }

    protected abstract IWidgetValueProperty widgetProperty();

}
