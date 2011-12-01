package de.lama.workaround.rcp.handler;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class OpenEditorRunnable implements Runnable
{
    private URI uri;

    public OpenEditorRunnable(URI uri)
    {
        super();
        this.uri = uri;
    }

    @Override
    public void run()
    {
        try
        {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                    .openEditor(new URIEditorInput(uri), "de.lama.workaround.rcp.mainEditor");
        }
        catch (PartInitException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
