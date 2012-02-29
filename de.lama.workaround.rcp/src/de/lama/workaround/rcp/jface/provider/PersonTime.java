package de.lama.workaround.rcp.jface.provider;

import workaround.Person;

public class PersonTime
{
    private final Person person;
    private long time;

    public PersonTime(Person person)
    {
        super();
        this.person = person;
        this.time = 0L;
    }

    public Person getPerson()
    {
        return person;
    }

    public long getTime()
    {
        return time;
    }

    @Override
    public int hashCode()
    {
        return person.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (person != null)
        {
            return person.equals(obj);
        }
        return false;
    }

    public void add(long duration)
    {
        time += duration;
    }

    public String getFormatedTime()
    {
        long time = this.time / 1000;
        time /= 60;
        long minutes = time % 60;
        time /= 60;
        long hours = time;
        return hours + ":" + prependSecondDigitTo(minutes);
    }

    private Object prependSecondDigitTo(long minutes)
    {
        return minutes < 10 ? "0" + minutes : minutes;
    }
}
