package de.lama.workaround.rcp.jface.binder;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Control;


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
