package de.lama.workaround.rcp.jface.provider;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;

import workaround.Person;

public class PersonOverviewLabelProvider extends ObservableMapLabelProvider
{

    public PersonOverviewLabelProvider(IObservableMap[] observeEach)
    {
        super(observeEach);
    }

    @Override
    public String getColumnText(Object element, int columnIndex)
    {
        if (element instanceof PersonTime)
        {
            PersonTime calculated = (PersonTime) element;
            Person person = calculated.getPerson();
            if (columnIndex == 0)
            {
                return person.getLastName();
            }
            if (columnIndex == 1)
            {
                return person.getFirstName();
            }
            if (columnIndex == 2)
            {
                return calculated.getFormatedTime();
            }
        }
        return super.getColumnText(element, columnIndex);
    }

}
