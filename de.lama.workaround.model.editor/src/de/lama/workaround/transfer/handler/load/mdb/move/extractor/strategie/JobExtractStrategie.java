package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Acreage;
import workaround.Job;
import workaround.Machine;
import workaround.Operation;
import workaround.Person;
import workaround.Preparation;
import workaround.Vehicle;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class JobExtractStrategie extends AbstractExtractStrategie<Job>
{

    private final Connection connection;

    public JobExtractStrategie(Connection connection)
    {
        this.connection = connection;
    }

    @Override
    public List<Job> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Job newJob = WorkaroundFactory.eINSTANCE.createJob();

            String tableColumn = DBKonstanten.COLUMN_ARBID;
            Integer arbID = (Integer) extractObjectFrom(tableResult, tableColumn);

            tableColumn = DBKonstanten.COLUMN_STARTDATUM;
            Date startDatum = (Date) extractObjectFrom(tableResult, tableColumn);
            if (startDatum == null)
            {
                System.out.println("StartDatum missing - ArbID: " + arbID);
                continue;
            }
            newJob.setStartDate(startDatum);

            tableColumn = DBKonstanten.COLUMN_STARTFAHRDATUM;
            Date startFahrDatum = (Date) extractObjectFrom(tableResult, tableColumn);
            if (startFahrDatum == null)
            {
                // TODO LOG job
                startFahrDatum = startDatum;
            }
            newJob.setStartDriveDate(startFahrDatum);

            tableColumn = DBKonstanten.COLUMN_ENDDATUM;
            Date endDatum = (Date) extractObjectFrom(tableResult, tableColumn);
            if (endDatum == null)
            {
                System.out.println("EndDate missing - ArbID: " + arbID);
                continue;
            }
            newJob.setEndDate(endDatum);

            tableColumn = DBKonstanten.COLUMN_ENDFAHRDATUM;
            Date endFahrDatum = (Date) extractObjectFrom(tableResult, tableColumn);
            if (endFahrDatum == null)
            {
                // TODO LOG job
                endFahrDatum = endDatum;
            }
            newJob.setEndDriveDate(endFahrDatum);

            tableColumn = DBKonstanten.COLUMN_NAME;
            String flaecheName = extractStringFrom(tableResult, tableColumn);
            tableColumn = DBKonstanten.COLUMN_GEMARKUNG;
            String flaecheGemarkung = extractStringFrom(tableResult, tableColumn);
            Acreage acreage = findAcreage(flaecheName, flaecheGemarkung);
            if (acreage == null)
            {
                System.out.println("Acreage missing - ArbID: " + arbID);
                continue;
            }
            newJob.setAcreage(acreage);

            tableColumn = DBKonstanten.COLUMN_TAETIGKEIT;
            String taetigkeit = extractStringFrom(tableResult, tableColumn);
            Operation operation = findOperation(taetigkeit);
            if (operation == null)
            {
                System.out.println("Operation missing - ArbID: " + arbID);
                continue;
            }
            newJob.setOperation(operation);

            tableColumn = DBKonstanten.COLUMN_BEMERKUNG;
            String bemerkung = extractStringFrom(tableResult, tableColumn);
            newJob.setRemark(bemerkung);

            tableColumn = DBKonstanten.COLUMN_PRAEPARAT_EINS;
            String praeparatEins = extractStringFrom(tableResult, tableColumn);
            Preparation preparationOne = findPreparation(praeparatEins);
            if (preparationOne != null)
            {
                newJob.getPreparations().add(preparationOne);
            }
            tableColumn = DBKonstanten.COLUMN_PRAEPARAT_ZWEI;
            String praeparatZwei = extractStringFrom(tableResult, tableColumn);
            Preparation preparationTwo = findPreparation(praeparatZwei);
            if (preparationOne != null)
            {
                newJob.getPreparations().add(preparationTwo);
            }

            tableColumn = DBKonstanten.COLUMN_PRAEPARAT_DREI;
            String praeparatDrei = extractStringFrom(tableResult, tableColumn);
            Preparation preparationThree = findPreparation(praeparatDrei);
            if (preparationOne != null)
            {
                newJob.getPreparations().add(preparationThree);
            }

            Statement fahrzeugStatement = connection.createStatement();
            ResultSet fahrzeugResultSet = fahrzeugStatement
                    .executeQuery("SELECT tblFahrzeug.Bezeichnung FROM tblArbeitFahrzeug, tblFahrzeug WHERE tblArbeitFahrzeug."
                            + DBKonstanten.COLUMN_ARBID + " = " + arbID.toString() + " AND tblArbeitFahrzeug." + DBKonstanten.COLUMN_FZID
                            + " = tblFahrzeug." + DBKonstanten.COLUMN_FZID);
            tableColumn = DBKonstanten.COLUMN_BEZEICHNUNG;
            while (fahrzeugResultSet.next())
            {
                String fbezeichnung = extractStringFrom(fahrzeugResultSet, tableColumn);
                Vehicle vehicle = findVehicle(fbezeichnung);
                if (vehicle != null)
                {
                    newJob.getVehicles().add(vehicle);
                }
            }
            fahrzeugResultSet.close();
            fahrzeugStatement.close();

            Statement geraeteStatement = connection.createStatement();
            ResultSet geraeteResultSet = geraeteStatement
                    .executeQuery("SELECT tblGerät.Bezeichnung FROM tblArbeitGerät, tblGerät WHERE tblArbeitGerät." + DBKonstanten.COLUMN_ARBID
                            + " = " + arbID.toString() + " AND tblArbeitGerät." + DBKonstanten.COLUMN_GID + " = tblGerät." + DBKonstanten.COLUMN_GID);
            tableColumn = DBKonstanten.COLUMN_BEZEICHNUNG;
            while (geraeteResultSet.next())
            {
                String gbezeichnung = extractStringFrom(geraeteResultSet, tableColumn);
                Machine machine = findMachine(gbezeichnung);
                if (machine != null)
                {
                    newJob.getMachines().add(machine);
                }
            }
            geraeteResultSet.close();
            geraeteStatement.close();

            Statement personenStatement = connection.createStatement();
            ResultSet personsnResultSet = personenStatement
                    .executeQuery("SELECT tblPerson.Vorname, tblPerson.Nachname FROM tblArbeitPerson, tblPerson WHERE tblArbeitPerson."
                            + DBKonstanten.COLUMN_ARBID + " = " + arbID.toString() + " AND tblArbeitPerson." + DBKonstanten.COLUMN_PID
                            + " = tblPerson." + DBKonstanten.COLUMN_PID);
            String nachnameColumn = DBKonstanten.COLUMN_NACHNAME;
            String vornameColumn = DBKonstanten.COLUMN_VORNAME;
            while (personsnResultSet.next())
            {
                String nachname = extractStringFrom(personsnResultSet, nachnameColumn);
                String vorname = extractStringFrom(personsnResultSet, vornameColumn);
                Person person = findPerson(nachname, vorname);
                if (person != null)
                {
                    newJob.getPersons().add(person);
                }
            }
            personsnResultSet.close();
            personenStatement.close();

            if (newJob.getPersons().size() == 0)
            {
                System.out.println("Person missing - ArbID: " + arbID);
                continue;
            }

            add(newJob);
        }
        return newElements();
    }

    private Person findPerson(String nachname, String vorname)
    {
        EList<Person> personList = getOwner().getPersonList();
        for (Person person : personList)
        {
            String lastName = person.getLastName();
            String firstName = person.getFirstName();
            if (lastName.equals(nachname) && firstName.equals(vorname))
            {
                return person;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Machine findMachine(String gbezeichnung)
    {
        EList<Machine> machineList = getOwner().getMachineList();
        for (Machine machine : machineList)
        {
            if (machine.getDescription().equals(gbezeichnung))
            {
                return machine;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Vehicle findVehicle(String fbezeichnung)
    {
        EList<Vehicle> vehicleList = getOwner().getVehicleList();
        for (Vehicle vehicle : vehicleList)
        {
            if (vehicle.getDescription().equals(fbezeichnung))
            {
                return vehicle;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Operation findOperation(String taetigkeit)
    {
        EList<Operation> operationList = getOwner().getOperationList();
        for (Operation operation : operationList)
        {
            if (operation.getTask().equals(taetigkeit))
            {
                return operation;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Acreage findAcreage(String flaecheName, String flaecheGemarkung)
    {
        EList<Acreage> acreageList = getOwner().getAcreageList();
        for (Acreage acreage : acreageList)
        {
            String acreageName = acreage.getAcreageName();
            String districtName = acreage.getDistrict().getDistrictName();
            if (acreageName.equals(flaecheName) && districtName.equals(flaecheGemarkung))
            {
                return acreage;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Preparation findPreparation(String praeparat)
    {
        EList<Preparation> preparationList = getOwner().getPreparationList();
        for (Preparation preparation : preparationList)
        {
            if (preparation.getPreparationName().equals(preparation))
            {
                return preparation;
            }
        }
        return null;
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__JOB_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.QRY_JOB;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Job> installedElements()
    {
        return getOwner().getJobList();
    }

}
