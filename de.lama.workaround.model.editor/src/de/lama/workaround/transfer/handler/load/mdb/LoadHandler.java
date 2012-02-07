package de.lama.workaround.transfer.handler.load.mdb;

import java.sql.Connection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public abstract class LoadHandler extends AbstractHandler
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

    protected void close(Connection mdb)
    {
        MDBConnectionManager.close(mdb);
    }

    protected abstract void moveElementsFrom(Connection mdb);

    protected Connection createConnection()
    {
        Connection mdb = MDBConnectionManager.createConnectionFor("");
        return mdb;
    }

}
