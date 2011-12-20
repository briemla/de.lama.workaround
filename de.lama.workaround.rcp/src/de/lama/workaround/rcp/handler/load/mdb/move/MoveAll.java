package de.lama.workaround.rcp.handler.load.mdb.move;

import java.sql.Connection;

public class MoveAll
{

    public static MovePersons personsFrom(Connection connection)
    {
        return new MovePersons(connection);
    }

}
