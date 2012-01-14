package de.lama.workaround.transfer.handler.load.mdb;

import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import workaround.presentation.WorkaroundEditingDomain;
import de.lama.workaround.transfer.handler.load.mdb.move.MoveAll;
import de.lama.workaround.transfer.utilities.EditorUtilities;

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
            MoveAll.operationsFrom(mdb).into(editingDomain);
            MoveAll.vehiclesFrom(mdb).into(editingDomain);
            MoveAll.machinesFrom(mdb).into(editingDomain);
            MoveAll.districtsFrom(mdb).into(editingDomain);
            MoveAll.acreagesFrom(mdb).into(editingDomain);
            MoveAll.preparationsFrom(mdb).into(editingDomain);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private Connection createConnection()
    {
        // Shell activeShell = PlatformUI.getWorkbench().getDisplay()
        // .getActiveShell();
        // FileDialog dialog = new FileDialog(activeShell);
        // String accessPath = dialog.open();
        // if (accessPath == null) {
        // return null;
        // }
        Connection mdb = MDBConnectionManager.createConnectionFor("");
        return mdb;
    }
}
