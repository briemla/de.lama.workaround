package de.lama.workaround.rcp;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import workaround.Workaround;
import de.lama.workaround.rcp.utilities.EditorUtilities;

public class WorkaroundEditingDomain extends AdapterFactoryEditingDomain
{

    public WorkaroundEditingDomain(AdapterFactory adapterFactory, CommandStack commandStack)
    {
        super(adapterFactory, commandStack);
    }

    public EObject getWorkaround()
    {

        EObject owner = null;
        EList<Resource> resources = EditorUtilities.getEditingDomain().getResourceSet().getResources();
        for (Resource resource : resources)
        {
            EList<EObject> contents = resource.getContents();
            for (EObject eObject : contents)
            {
                if (eObject instanceof Workaround)
                {
                    owner = eObject;
                    break;
                }
            }
        }
        return owner;

    }

}
