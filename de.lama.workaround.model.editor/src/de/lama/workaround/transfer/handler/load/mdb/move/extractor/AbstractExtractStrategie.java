package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import workaround.Workaround;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie.IExtractStrategie;

public abstract class AbstractExtractStrategie<T> implements IExtractStrategie<T>
{

    private Workaround owner;
    private List<T> newElements;

    @Override
    public IExtractStrategie<T> extract(Workaround owner)
    {
        newElements = new ArrayList<T>();
        this.owner = owner;
        return this;
    }

    protected String extractStringFrom(ResultSet tableResult, String tableColumn) throws SQLException
    {
        int columnIndex = tableResult.findColumn(tableColumn);
        String text = tableResult.getString(columnIndex);
        return text;
    }

    protected Object extractObjectFrom(ResultSet tableResult, String tableColumn) throws SQLException
    {
        int columnIndex = tableResult.findColumn(tableColumn);
        Object text = tableResult.getObject(columnIndex);
        return text;
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

    public Workaround getOwner()
    {
        return owner;
    }

    public List<T> newElements()
    {
        return newElements;
    }

    public void add(T newElement)
    {
        if (newElementsContains(newElement))
        {
            return;
        }
        if (installedElementsContains(newElement))
        {
            return;
        }
        newElements.add(newElement);
    }

    private boolean newElementsContains(T newElement)
    {
        for (T element : newElements)
        {
            if (elementsAreEqual(element, newElement))
            {
                return true;
            }
        }
        return false;
    }

    private boolean installedElementsContains(T newElement)
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
}
