package de.lama.workaround.rcp.jface.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;

import workaround.Job;

public class WorkaroundObservableMapLabelProvider extends ObservableMapLabelProvider
{

    public WorkaroundObservableMapLabelProvider(IObservableMap[] attributeMaps)
    {
        super(attributeMaps);
    }

    @Override
    public String getColumnText(Object element, int columnIndex)
    {
        if (element instanceof Job)
        {
            if (columnIndex < attributeMaps.length)
            {
                Object result = attributeMaps[columnIndex].get(element);
                if (result instanceof Date)
                {
                    Date date = (Date) result;
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - hh:mm");
                    return dateFormat.format(date);
                }
            }
        }
        return super.getColumnText(element, columnIndex);
    }

}
