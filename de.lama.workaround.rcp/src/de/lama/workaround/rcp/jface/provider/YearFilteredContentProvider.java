package de.lama.workaround.rcp.jface.provider;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;

import workaround.Job;

public abstract class YearFilteredContentProvider extends ObservableListContentProvider
{

    private Date lowerYear;
    private Date upperYear;

    public YearFilteredContentProvider()
    {
        lowerYear = currentYear();
        upperYear = nextYear();
    }

    protected boolean show(Job job)
    {
        boolean noFilterSet = lowerYear == null;
        boolean afterFilterYear = job.getStartDate().after(lowerYear);
        boolean beforeNextYear = job.getStartDate().before(upperYear);
        boolean inFilterYear = afterFilterYear && beforeNextYear;
        return noFilterSet || inFilterYear;
    }

    public void setYear(String year)
    {
        try
        {
            int yearValue = Integer.parseInt(year);
            this.lowerYear = calculateDateOf(yearValue);
            this.upperYear = calculateDateOf(yearValue + 1);
        }
        catch (NumberFormatException e)
        {
            this.lowerYear = currentYear();
            this.upperYear = nextYear();
        }

    }

    private Date currentYear()
    {
        long currentTime = System.currentTimeMillis();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(currentTime);
        int year = calendar.get(Calendar.YEAR);
        return calculateDateOf(year);
    }

    private Date nextYear()
    {
        long currentTime = System.currentTimeMillis();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(currentTime);
        int year = calendar.get(Calendar.YEAR);
        return calculateDateOf(year + 1);
    }

    private Date calculateDateOf(int year)
    {
        GregorianCalendar calendar = new GregorianCalendar(year, 0, 1);
        return calendar.getTime();
    }

}
