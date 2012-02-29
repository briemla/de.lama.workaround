package de.lama.workaround.rcp.jface.sorter;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import workaround.Person;
import de.lama.workaround.rcp.jface.provider.PersonTime;

public class PersonTimeSorter extends ViewerSorter
{
    private static final int EQUAL = 0;

    @Override
    public int compare(Viewer viewer, Object element1, Object element2)
    {
        if (element1 instanceof PersonTime)
        {
            if (element2 instanceof PersonTime)
            {
                Person person1 = ((PersonTime) element1).getPerson();
                Person person2 = ((PersonTime) element2).getPerson();
                String lastName1 = person1.getLastName();
                String lastName2 = person2.getLastName();
                int lastNamesCompared = lastName1.compareTo(lastName2);
                if (lastNamesCompared == EQUAL)
                {
                    String firstName1 = person1.getFirstName();
                    String firstName2 = person2.getFirstName();
                    return firstName1.compareTo(firstName2);
                }
            }
        }
        return super.compare(viewer, element1, element2);
    }
}
