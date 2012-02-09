package de.lama.workaround.rcp.jface.listener;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import de.lama.workaround.rcp.WorkaroundEditingDomain;

public class RemoveElement extends SelectionAdapter
{

    private final WorkaroundEditingDomain editingDomain;
    private final IObservableValue masterObservable;
    private final EStructuralFeature feature;

    public RemoveElement(final WorkaroundEditingDomain editingDomain, final IObservableValue masterObservable,
            final EStructuralFeature feature)
    {
        this.editingDomain = editingDomain;
        this.masterObservable = masterObservable;
        this.feature = feature;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
        Object value = masterObservable.getValue();
        if (value instanceof EObject)
        {
            EObject element = (EObject) value;
            EObject owner = element.eContainer();
            Command remove = RemoveCommand.create(editingDomain, owner, feature, element);
            if (remove != null)
            {
                editingDomain.getCommandStack().execute(remove);
            }
        }
    }
}
