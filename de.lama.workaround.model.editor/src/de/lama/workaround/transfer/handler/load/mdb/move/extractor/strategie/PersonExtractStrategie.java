package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Person;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class PersonExtractStrategie extends AbstractExtractStrategie<Person>
{

    @Override
    public List<Person> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Person newPerson = WorkaroundFactory.eINSTANCE.createPerson();
            String tableColumn = DBKonstanten.COLUMN_NACHNAME;
            String nachname = extractStringFrom(tableResult, tableColumn);
            newPerson.setLastName(nachname);
            tableColumn = DBKonstanten.COLUMN_VORNAME;
            String vorname = extractStringFrom(tableResult, tableColumn);
            newPerson.setFirstName(vorname);
            if ((newPerson.getFirstName() == null) || (newPerson.getLastName() == null))
            {
                String pidColumn = DBKonstanten.COLUMN_PID;
                Integer pid = (Integer) extractObjectFrom(tableResult, pidColumn);
                System.out.println("Person missing: " + pid);
                continue;
            }
            add(newPerson);
        }
        return newElements();
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

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Person> installedElements()
    {
        return getOwner().getPersonList();
    }
}
