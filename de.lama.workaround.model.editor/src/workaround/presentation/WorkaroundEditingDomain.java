package workaround.presentation;

import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import workaround.Workaround;
import de.lama.workaround.transfer.utilities.EditorUtilities;

public class WorkaroundEditingDomain extends AdapterFactoryEditingDomain {

	public WorkaroundEditingDomain(AdapterFactory adapterFactory,
			CommandStack commandStack) {
		super(adapterFactory, commandStack);
	}

	public WorkaroundEditingDomain(ComposedAdapterFactory adapterFactory,
			BasicCommandStack commandStack, HashMap hashMap) {
		super(adapterFactory, commandStack, hashMap);
	}

	public EObject getWorkaround() {

		EObject owner = null;
		EList<Resource> resources = EditorUtilities.getEditingDomain()
				.getResourceSet().getResources();
		for (Resource resource : resources) {
			EList<EObject> contents = resource.getContents();
			for (EObject eObject : contents) {
				if (eObject instanceof Workaround) {
					owner = eObject;
					break;
				}
			}
		}
		return owner;

	}

}
