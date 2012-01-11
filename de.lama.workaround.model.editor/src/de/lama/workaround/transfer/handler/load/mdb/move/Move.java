package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;

import workaround.presentation.WorkaroundEditingDomain;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.Extract;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.IExtractStrategie;
import de.lama.workaround.transfer.utilities.EditorUtilities;

public abstract class Move<T>
{

    private Connection database;
    private WorkaroundEditingDomain editingDomain;

    public Move(Connection database)
    {
        this.database = database;
    }

    public void into(WorkaroundEditingDomain editingDomain) throws SQLException
    {
        this.editingDomain = editingDomain;
        List<T> persons = read();
        EObject owner = editingDomain.getWorkaround();
        insertInto(owner, persons);
    }

    public List<T> read() throws SQLException
    {
        return Extract.the(elements()).from(table()).of(database);
    }

    public void insertInto(EObject owner, List<T> elements)
    {
        Command command = AddCommand.create(editingDomain, owner, feature(), elements);
        EditorUtilities.getEditingDomain().getCommandStack().execute(command);
    }

    /**
     * Returns the <code>EStructuralFeature</code> for this move operation.
     * Example: WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST
     * 
     * @return
     */
    public abstract EStructuralFeature feature();

    /**
     * Returns the <code>IExtractStrategie</code> for which elements the move is
     * done. Example:
     * de.lama.workaround.transfer.handler.load.mdb.move.extractor
     * .PersonExtractStrategie
     * 
     * @return
     */
    public abstract IExtractStrategie elements();

    /**
     * Returns the table name of the table where the
     * <code>IExtractStrategie</code> should extract elements from. Example:
     * de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten.
     * TBL_PERSON
     * 
     * @return
     */
    public abstract String table();

}
