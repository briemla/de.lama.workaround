package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public abstract class BuildedComponent
{
    private WidgetBinder binder;

    public BuildedComponent and(WidgetBinder binder)
    {
        this.binder = binder;
        return this;
    }

    public void to(EStructuralFeature feature)
    {
        IObservableValue targetElement = createTargetObservableWith(binder);
        IObservableValue modelElement = binder.createObservableFor(feature);

        DataBindingContext context = new DataBindingContext();
        UpdateValueStrategy targetToModel = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
        UpdateValueStrategy modelToTarget = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
        context.bindValue(targetElement, modelElement, targetToModel, modelToTarget);
    }

    protected abstract IObservableValue createTargetObservableWith(WidgetBinder binder);
}
