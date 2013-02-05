package de.lama.workaround.rcp.jface.listener;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class RemoveElement extends SelectionAdapter
{

    private final EditingDomain editingDomain;
    private final IObservableValue elementMaster;
    private final EStructuralFeature feature;
    private final IObservableValue ownerMaster;

    public RemoveElement(final EditingDomain editingDomain, final IObservableValue elementMaster, final EStructuralFeature feature)
    {
        this(editingDomain, elementMaster, null, feature);
    }

    public RemoveElement(EditingDomain editingDomain, IObservableValue elemenMaster, IObservableValue ownerMaster, EStructuralFeature feature)
    {
        this.editingDomain = editingDomain;
        this.elementMaster = elemenMaster;
        this.ownerMaster = ownerMaster;
        this.feature = feature;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
        execute();
    }

    public void execute()
    {
        Object value = elementMaster.getValue();
        if (value instanceof EObject)
        {
            EObject element = (EObject) value;
            Object owner = getOwner(element);
            Command remove = RemoveCommand.create(editingDomain, owner, feature, element);
            if (remove != null)
            {
                editingDomain.getCommandStack().execute(remove);
                triggerSave();
            }
        }
    }

    private void triggerSave()
    {
        if (ownerMaster == null)
        {
            SaveAction.execute();
        }
    }

    protected Object getOwner(EObject element)
    {
        if (ownerMaster == null)
        {
            return element.eContainer();
        }
        return ownerMaster.getValue();
    }

}
