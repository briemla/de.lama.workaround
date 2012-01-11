package de.lama.workaround.transfer.utilities;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public abstract class EditorUtilities
{

    public static EditingDomain getEditingDomain()
    {
        IEditorPart activeEditor = getActiveEditor();
        if (activeEditor == null)
        {
            return null;
        }
        if (activeEditor instanceof IEditingDomainProvider)
        {
            IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) activeEditor;
            return editingDomainProvider.getEditingDomain();
        }
        return null;
    }

    public static IEditorInput getEditorInput()
    {
        IEditorPart activeEditor = getActiveEditor();
        if (activeEditor == null)
        {
            return null;
        }
        return activeEditor.getEditorInput();
    }

    public static IEditorPart getActiveEditor()
    {
        IWorkbenchPage activePage = getActivePage();
        if (activePage == null)
        {
            return null;
        }
        return activePage.getActiveEditor();
    }

    public static IWorkbenchPage getActivePage()
    {
        IWorkbenchWindow activeWorkbenchWindow = getActiveWorkbenchWindow();
        if (activeWorkbenchWindow == null)
        {
            return null;
        }
        return activeWorkbenchWindow.getActivePage();
    }

    public static IWorkbenchWindow getActiveWorkbenchWindow()
    {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    }

}
