package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;

import workaround.Workaround;
import workaround.presentation.WorkaroundEditingDomain;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.Extract;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.IExtractStrategie;
import de.lama.workaround.transfer.utilities.EditorUtilities;

public class Move<T>
{

    private Connection database;
    private WorkaroundEditingDomain editingDomain;
    private final IExtractStrategie<T> strategie;

    public Move(IExtractStrategie<T> extractStrategie)
    {
        this.strategie = extractStrategie;
    }

    public Move<T> from(Connection database)
    {
        this.database = database;
        return this;
    }

    @SuppressWarnings("unchecked")
    public void into(WorkaroundEditingDomain editingDomain) throws SQLException
    {
        this.editingDomain = editingDomain;
        Workaround owner = editingDomain.getWorkaround();
        List<T> persons = read(owner);
        insertInto(owner, persons);
    }

    public List<T> read(Workaround owner) throws SQLException
    {
        return new Extract<T>(strategie).from(database).with(owner);
    }

    public void insertInto(Workaround owner, List<T> elements)
    {
        Command command = AddCommand.create(editingDomain, owner, strategie.feature(), elements);
        EditorUtilities.getEditingDomain().getCommandStack().execute(command);
    }

}
