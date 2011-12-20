package de.lama.workaround.rcp.handler.load.mdb;

import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.handler.load.mdb.move.MoveAll;
import de.lama.workaround.rcp.utilities.EditorUtilities;

public class LoadDataFromMDB extends AbstractHandler
{

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        Connection mdb = createConnection();
        if (mdb == null)
        {
            return null;
        }
        moveElementsFrom(mdb);
        close(mdb);
        return null;
    }

    private void close(Connection mdb)
    {
        MDBConnectionManager.close(mdb);
    }

    private void moveElementsFrom(Connection mdb)
    {
        WorkaroundEditingDomain editingDomain = (WorkaroundEditingDomain) EditorUtilities.getEditingDomain();

        try
        {
            MoveAll.personsFrom(mdb).into(editingDomain);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private Connection createConnection()
    {
        Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
        FileDialog dialog = new FileDialog(activeShell);
        String accessPath = dialog.open();
        Connection mdb = MDBConnectionManager.createConnectionFor(accessPath);
        return mdb;
    }
}
