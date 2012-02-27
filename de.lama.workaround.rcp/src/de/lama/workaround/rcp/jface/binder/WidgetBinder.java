package de.lama.workaround.rcp.jface.binder;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.swt.widgets.Control;

public class WidgetBinder
{
    private final IObservableValue modelMaster;
    private final EditingDomain editingDomain;
    private IWidgetValueProperty uiProperty;

    public WidgetBinder(IObservableValue modelMaster, EditingDomain editingDomain)
    {
        this.modelMaster = modelMaster;
        this.editingDomain = editingDomain;
    }

    public IObservableValue createObservableFor(Control buildedComponent)
    {
        return uiProperty().observe(buildedComponent);
    }

    public IObservableValue createObservableFor(EStructuralFeature feature)
    {
        IEMFValueProperty value = EMFEditProperties.value(editingDomain, feature);
        return value.observeDetail(modelMaster);
    }

    protected IWidgetValueProperty uiProperty()
    {
        return uiProperty;
    }

    public void setWidgetProperty(IWidgetValueProperty uiProperty)
    {
        this.uiProperty = uiProperty;
    }

    protected IObservableValue getModelMaster()
    {
        return modelMaster;
    }

    protected EditingDomain getEditingDomain()
    {
        return editingDomain;
    }

}
