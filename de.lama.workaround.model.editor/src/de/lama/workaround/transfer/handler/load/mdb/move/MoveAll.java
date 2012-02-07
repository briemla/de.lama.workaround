package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;

import workaround.Acreage;
import workaround.District;
import workaround.Job;
import workaround.Machine;
import workaround.Operation;
import workaround.Person;
import workaround.Preparation;
import workaround.Vehicle;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.AcreageExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.DistrictExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.JobExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.MachineExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.OperationExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.PersonExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.PreparationExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.VehicleExtractStrategie;

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

    public static Move<Vehicle> vehiclesFrom(Connection connection)
    {
        return new Move<Vehicle>(new VehicleExtractStrategie()).from(connection);
    }

    public static Move<Machine> machinesFrom(Connection connection)
    {
        return new Move<Machine>(new MachineExtractStrategie()).from(connection);
    }

    public static Move<District> districtsFrom(Connection connection)
    {
        return new Move<District>(new DistrictExtractStrategie()).from(connection);
    }

    public static Move<Acreage> acreagesFrom(Connection connection)
    {
        return new Move<Acreage>(new AcreageExtractStrategie()).from(connection);
    }

    public static Move<Preparation> preparationsFrom(Connection connection)
    {
        return new Move<Preparation>(new PreparationExtractStrategie()).from(connection);
    }

    public static Move<Job> jobsFrom(Connection connection)
    {
        return new Move<Job>(new JobExtractStrategie(connection)).from(connection);
    }

}
