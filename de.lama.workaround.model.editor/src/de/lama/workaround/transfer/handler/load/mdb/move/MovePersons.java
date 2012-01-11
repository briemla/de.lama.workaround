package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;

import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Person;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.IExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.PersonExtractStrategie;

public class MovePersons extends Move<Person>
{

    public MovePersons(Connection database)
    {
        super(database);
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST;
    }

    @Override
    public IExtractStrategie elements()
    {
        return new PersonExtractStrategie();
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_PERSON;
    }
}
