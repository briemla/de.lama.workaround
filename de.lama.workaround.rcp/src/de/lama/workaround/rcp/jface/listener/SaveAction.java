package de.lama.workaround.rcp.jface.listener;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.handlers.IHandlerService;

public abstract class SaveAction
{

    public static void execute()
    {
        final String saveId = ActionFactory.SAVE.getCommandId();
        final IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
        try
        {
            handlerService.executeCommand(saveId, null);
        }
        catch (Exception ex)
        {
            throw new RuntimeException(saveId + " not found");
        }
    }
}
