package de.lama.workaround.rcp.jface.provider;

import workaround.Job;

public class PersonOverviewContentProvider extends YearFilteredContentProvider
{

    @Override
    public Object[] getElements(Object inputElement)
    {
        Object[] elements = super.getElements(inputElement);
        PersonTimeCollection persons = new PersonTimeCollection();
        for (Object element : elements)
        {
            if (element instanceof Job)
            {
                Job job = (Job) element;
                if (show(job))
                {
                    persons.add(job);
                }
            }
        }
        return persons.toArray();
    }
}
