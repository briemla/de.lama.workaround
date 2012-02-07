package de.lama.workaround.transfer.handler.load.mdb;

import java.sql.Connection;
import java.sql.SQLException;

import workaround.presentation.WorkaroundEditingDomain;
import de.lama.workaround.transfer.handler.load.mdb.move.MoveAll;
import de.lama.workaround.transfer.utilities.EditorUtilities;

public class LoadVehicle extends LoadHandler
{
    protected void moveElementsFrom(Connection mdb)
    {
        WorkaroundEditingDomain editingDomain = (WorkaroundEditingDomain) EditorUtilities.getEditingDomain();

        try
        {
            MoveAll.vehiclesFrom(mdb).into(editingDomain);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
