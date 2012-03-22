package de.lama.workaround.rcp.jface.listener;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddElement extends SelectionAdapter
{

    private final EditingDomain editingDomain;
    private final IObservableValue ownerProvider;
    private final IObservableValue elementProvider;
    private final EStructuralFeature feature;

    public AddElement(final EditingDomain editingDomain, final IObservableValue ownerProvider, final IObservableValue elementProvider,
            final EStructuralFeature feature)
    {
        this.editingDomain = editingDomain;
        this.ownerProvider = ownerProvider;
        this.elementProvider = elementProvider;
        this.feature = feature;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
        Object owner = ownerProvider.getValue();
        Object element = elementProvider.getValue();
        Command add = AddCommand.create(editingDomain, owner, feature, element);
        if (add != null)
        {
            editingDomain.getCommandStack().execute(add);
        }
    }

}
