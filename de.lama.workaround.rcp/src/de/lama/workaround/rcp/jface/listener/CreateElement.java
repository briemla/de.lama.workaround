package de.lama.workaround.rcp.jface.listener;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import workaround.WorkaroundFactory;

public class CreateElement extends SelectionAdapter
{

    private final EditingDomain editingDomain;
    private final EObject owner;
    private final EClass elementClass;
    private final EStructuralFeature feature;

    public CreateElement(final EditingDomain editingDomain, final EObject owner, final EClass elementClass, final EStructuralFeature feature)
    {
        this.editingDomain = editingDomain;
        this.owner = owner;
        this.elementClass = elementClass;
        this.feature = feature;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
        EObject element = WorkaroundFactory.eINSTANCE.create(elementClass);
        Command add = AddCommand.create(editingDomain, owner, feature, element);
        if (add != null)
        {
            editingDomain.getCommandStack().execute(add);
        }
    }

}
