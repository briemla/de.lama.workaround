package de.lama.workaround.rcp.jface.sorter;

import java.util.Date;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import workaround.Job;

public class JobSorter extends ViewerSorter
{
    private static final int EQUAL = 0;

    private static final int DESC = -1;
    private static final int ASC = -1;

    @Override
    public int compare(Viewer viewer, Object element1, Object element2)
    {
        if (element1 instanceof Job)
        {
            if (element2 instanceof Job)
            {
                Job job1 = (Job) element1;
                Job job2 = (Job) element2;
                int startDateCompare = compareStartDateOf(job1, job2);
                if (startDateCompare != EQUAL)
                {
                    return setDirection(startDateCompare);
                }
                int endDateCompare = compareEndDate(job1, job2);
                if (endDateCompare != EQUAL)
                {
                    return setDirection(endDateCompare);
                }
            }
        }
        return setDirection(super.compare(viewer, element1, element2));
    }

    private int compareStartDateOf(Job job1, Job job2)
    {
        Date startDate1 = job1.getStartDate();
        Date startDate2 = job2.getStartDate();
        return startDate1.compareTo(startDate2);
    }

    private int compareEndDate(Job job1, Job job2)
    {
        Date endDate1 = job1.getEndDate();
        Date endDate2 = job2.getEndDate();
        return endDate1.compareTo(endDate2);
    }

    private int setDirection(int compareResult)
    {
        return DESC * compareResult;
    }
}
