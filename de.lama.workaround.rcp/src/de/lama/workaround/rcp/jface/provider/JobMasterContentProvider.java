package de.lama.workaround.rcp.jface.provider;

import java.util.ArrayList;
import java.util.List;

import workaround.Job;

public class JobMasterContentProvider extends YearFilteredContentProvider
{
    @Override
    public Object[] getElements(Object inputElement)
    {
        Object[] elements = super.getElements(inputElement);
        List<Job> filteredJobs = new ArrayList<>(elements.length);
        for (Object element : elements)
        {
            if (element instanceof Job)
            {
                Job job = (Job) element;
                if (show(job))
                {
                    filteredJobs.add(job);
                }
            }
        }
        return filteredJobs.toArray();
    }
}
