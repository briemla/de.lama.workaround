package de.lama.workaround.rcp;

import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import workaround.Workaround;
import workaround.WorkaroundFactory;

public class WorkaroundEditingDomain extends AdapterFactoryEditingDomain
{

    private Workaround root;

    public WorkaroundEditingDomain(AdapterFactory adapterFactory, CommandStack commandStack, HashMap<Resource, Boolean> resourceToReadOnlyMap)
    {
        super(adapterFactory, commandStack, resourceToReadOnlyMap);
    }

    public Workaround getWorkaround()
    {
        return root;
    }

    public void loadResource(URI resourceURI)
    {
        try
        {
            Resource resource = getResourceSet().getResource(resourceURI, true);

            if (resource.getContents().size() == 0)
            {
                resource.getContents().add(WorkaroundFactory.eINSTANCE.createWorkaround());
                resource.save(Collections.EMPTY_MAP);
            }

            saveWorkaroundRootOf(resource);

        }
        catch (Exception e)
        {
            getResourceSet().getResource(resourceURI, false);
        }

    }

    private void saveWorkaroundRootOf(Resource resource)
    {
        EList<EObject> contents = resource.getContents();
        for (EObject eObject : contents)
        {
            if (eObject instanceof Workaround)
            {
                root = (Workaround) eObject;
                break;
            }
        }
    }
}
