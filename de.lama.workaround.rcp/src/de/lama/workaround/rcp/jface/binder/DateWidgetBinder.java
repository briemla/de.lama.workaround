package de.lama.workaround.rcp.jface.binder;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.widgets.Control;

import de.lama.workaround.rcp.jface.components.CDateTimeObservableValue;

public class DateWidgetBinder extends WidgetBinder
{

    public DateWidgetBinder(IObservableValue modelMaster, EditingDomain editingDomain)
    {
        super(modelMaster, editingDomain);
    }

    @Override
    public IObservableValue createObservableFor(Control buildedComponent)
    {
        if (buildedComponent instanceof CDateTime)
        {
            return new CDateTimeObservableValue((CDateTime) buildedComponent);
        }
        return super.createObservableFor(buildedComponent);
    }

}
