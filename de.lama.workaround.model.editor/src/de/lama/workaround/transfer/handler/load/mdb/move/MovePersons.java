package de.lama.workaround.transfer.handler.load.mdb.move;

import static de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten.TBL_PERSON;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;

import workaround.Person;
import workaround.WorkaroundPackage;
import workaround.presentation.WorkaroundEditingDomain;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.Extract;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.IExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.PersonExtractStrategie;
import de.lama.workaround.transfer.utilities.EditorUtilities;

public class MovePersons implements Move<Person>
{

    private Connection database;
    private WorkaroundEditingDomain editingDomain;

    public MovePersons(Connection database)
    {
        this.database = database;
    }

    @Override
    public void into(WorkaroundEditingDomain editingDomain) throws SQLException
    {
        this.editingDomain = editingDomain;
        List<Person> persons = read();
        EObject owner = editingDomain.getWorkaround();
        insertInto(owner, persons);
    }

    @Override
    public List<Person> read() throws SQLException
    {
        IExtractStrategie persons = new PersonExtractStrategie();
        return Extract.the(persons).fromTable(TBL_PERSON).of(database);
    }

    @Override
    public void insertInto(EObject owner, List<Person> persons)
    {
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST;
        Command command = AddCommand.create(editingDomain, owner, feature, persons);
        EditorUtilities.getEditingDomain().getCommandStack().execute(command);
    }
}
