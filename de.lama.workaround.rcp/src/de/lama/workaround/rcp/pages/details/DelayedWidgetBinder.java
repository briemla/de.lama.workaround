package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Control;

import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public class DelayedWidgetBinder extends WidgetBinder
{

    public DelayedWidgetBinder(IObservableValue master, EditingDomain editingDomain)
    {
        super(master, editingDomain);
    }

    @Override
    public IObservableValue createObservableFor(Control control)
    {
        return uiProperty().observeDelayed(400, control);
    }

}
