package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Person;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;

public class PersonExtractStrategie extends AbstractExtractStrategie<Person>
{

    public List<Person> from(ResultSet tableResult) throws SQLException
    {
        List<Person> persons = new ArrayList<Person>();
        while (tableResult.next())
        {
            Person nextPerson = WorkaroundFactory.eINSTANCE.createPerson();
            String tableColumn = DBKonstanten.nachname;
            String nachname = extractStringFrom(tableResult, tableColumn);
            nextPerson.setLastName(nachname);
            tableColumn = DBKonstanten.vorname;
            String vorname = extractStringFrom(tableResult, tableColumn);
            nextPerson.setFirstName(vorname);

            if (installedElementsContains(nextPerson))
            {
                continue;
            }
            persons.add(nextPerson);
        }
        return persons;
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_PERSON;
    }

    @Override
    protected EList<Person> installedElements()
    {
        return getOwner().getPersonList();
    }
}
