package de.lama.workaround.rcp.jface.components.builded;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.StructuredViewer;

import de.lama.workaround.rcp.jface.binder.MultiWidgetBinder;
import de.lama.workaround.rcp.jface.components.MultiAddButtonGroup;

public class BuildedMultiAdd extends BuildedViewer
{

    private final StructuredViewer providingViewer;
    private final MultiAddButtonGroup buttons;
    private final IValueProperty[] valueProperties;

    public BuildedMultiAdd(StructuredViewer viewer, StructuredViewer providingViewer, MultiAddButtonGroup buttonGroup,
            IValueProperty[] valueProperties)
    {
        super(viewer);
        this.providingViewer = providingViewer;
        this.buttons = buttonGroup;
        this.valueProperties = valueProperties;
    }

    @Override
    public void to(EStructuralFeature feature)
    {
        // super.to(feature);
        if (getBinder() instanceof MultiWidgetBinder)
        {
            MultiWidgetBinder multiBinder = (MultiWidgetBinder) getBinder();

            IObservableList input = multiBinder.createObservableListFor(feature);
            ViewerSupport.bind(getViewer(), input, valueProperties);

            IViewerObservableValue modelMaster = ViewersObservables.observeSingleSelection(providingViewer);
            multiBinder.setElementProvider(modelMaster);
            multiBinder.setSelectionMaster(createTargetObservableWith(multiBinder));
            multiBinder.addActionsTo(buttons);
        }
    }
}
