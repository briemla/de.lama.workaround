package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import workaround.Person;
import workaround.presentation.WorkaroundEditingDomain;

public interface Move<T>
{
    public List<T> read() throws SQLException;

    public void insertInto(EObject owner, List<Person> persons);

    public void into(WorkaroundEditingDomain editingDomain) throws SQLException;
}
 