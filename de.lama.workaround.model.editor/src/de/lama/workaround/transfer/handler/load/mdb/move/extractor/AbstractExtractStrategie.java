package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import workaround.Workaround;

public abstract class AbstractExtractStrategie<T> implements IExtractStrategie<T>
{

    private Workaround owner;

    @Override
    public IExtractStrategie<T> extract(Workaround owner)
    {
        this.owner = owner;
        return this;
    }

    protected String extractStringFrom(ResultSet tableResult, String tableColumn) throws SQLException
    {
        int columnIndex = tableResult.findColumn(tableColumn);
        String nachname = tableResult.getString(columnIndex);
        return nachname;
    }

    protected abstract EList<T> installedElements();

    protected boolean elementsAreEqual(T object1, T object2)
    {
        if (object1 instanceof EObject && object2 instanceof EObject)
        {
            EObject eObject1 = (EObject) object1;
            EObject eObject2 = (EObject) object2;
            return EcoreUtil.equals(eObject1, eObject2);
        }
        return false;
    }

    protected boolean installedElementsContains(T newElement)
    {
        for (T element : installedElements())
        {
            if (elementsAreEqual(element, newElement))
            {
                return true;
            }
        }
        return false;
    }

    public Workaround getOwner()
    {
        return owner;
    }
}
