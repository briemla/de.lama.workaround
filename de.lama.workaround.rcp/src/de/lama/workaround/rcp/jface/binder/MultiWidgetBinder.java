package de.lama.workaround.rcp.jface.binder;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.lama.workaround.rcp.jface.components.MultiAddButtonGroup;
import de.lama.workaround.rcp.jface.listener.AddElement;
import de.lama.workaround.rcp.jface.listener.RemoveElement;

public class MultiWidgetBinder extends WidgetBinder
{

    private IObservableValue elementProvider;
    private IObservableValue selectionMaster;
    private EStructuralFeature feature;

    public MultiWidgetBinder(final IObservableValue modelMaster, final EditingDomain editingDomain)
    {
        super(modelMaster, editingDomain);
    }

    public void addActionsTo(MultiAddButtonGroup buttonGroup)
    {
        buttonGroup.initialize(add());
        buttonGroup.initialize(remove());
    }

    private AddElement add()
    {
        Object owner = getModelMaster().getValue();
        AddElement action = new AddElement(getEditingDomain(), owner, elementProvider, feature);
        return action;
    }

    private RemoveElement remove()
    {
        return new RemoveElement(getEditingDomain(), selectionMaster, getModelMaster(), feature);
    }

    public IObservableList createObservableListFor(EStructuralFeature feature)
    {
        this.feature = feature;
        IObservableValue modelMaster = getModelMaster();
        EObject owner = (EObject) modelMaster.getValue();
        return EMFObservables.observeList(owner, feature);
    }

    public void setElementProvider(IObservableValue elementProvider)
    {
        this.elementProvider = elementProvider;
    }

    public void setSelectionMaster(IObservableValue selectionMaster)
    {
        this.selectionMaster = selectionMaster;
    }

}
