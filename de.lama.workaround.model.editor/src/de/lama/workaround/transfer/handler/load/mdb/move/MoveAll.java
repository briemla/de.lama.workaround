package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;

import workaround.Operation;
import workaround.Person;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.OperationExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.PersonExtractStrategie;

public class MoveAll
{

    public static Move<Person> personsFrom(Connection connection)
    {
        return new Move<Person>(new PersonExtractStrategie()).from(connection);
    }

    public static Move<Operation> operationsFrom(Connection connection)
    {
        return new Move<Operation>(new OperationExtractStrategie()).from(connection);
    }

}
