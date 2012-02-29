package de.lama.workaround.rcp.jface.provider;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import workaround.Job;
import workaround.Person;

public class PersonTimeCollection
{
    private final HashSet<PersonTime> times;

    public PersonTimeCollection()
    {
        super();
        this.times = new HashSet<>();
    }

    public void add(Job job)
    {
        Iterator<?> persons = job.getPersons().iterator();
        while (persons.hasNext())
        {
            Person person = (Person) persons.next();
            add(person, job);
        }
    }

    private void add(Person person, Job job)
    {
        long duration = calculateDurationOf(job);
        PersonTime time = findPersonTimeOf(person);
        time.add(duration);
    }

    private PersonTime findPersonTimeOf(Person person)
    {
        for (PersonTime time : times)
        {
            if (time.getPerson().equals(person))
            {
                return time;
            }
        }
        PersonTime newTime = new PersonTime(person);
        times.add(newTime);
        return newTime;
    }

    protected long calculateDurationOf(Job job)
    {
        Date endDate = job.getEndDate();
        Date startDate = job.getStartDate();
        long endTime = endDate.getTime();
        long startTime = startDate.getTime();
        return endTime - startTime;
    }

    public Object[] toArray()
    {
        return times.toArray();
    }

}
