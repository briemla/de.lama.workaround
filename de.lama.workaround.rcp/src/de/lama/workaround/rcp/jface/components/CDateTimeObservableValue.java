package de.lama.workaround.rcp.jface.components;

import java.util.Date;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class CDateTimeObservableValue extends AbstractObservableValue
{

    /**
     * 
     */
    private Date date;
    private final CDateTime widget;
    private boolean currentlyUpdatingFlag;

    private SelectionListener widgetListener = new SelectionListener()
    {

        @Override
        public void widgetDefaultSelected(SelectionEvent e)
        {
        }

        @Override
        public void widgetSelected(SelectionEvent e)
        {
            if (!currentlyUpdatingFlag)
            {
                // change from widget not handled right now
                Date newDate = widget.getSelection();
                fireValueChange(Diffs.createValueDiff(date, newDate));
                date = newDate;
            }
        }
    };

    /**
     * Constructor.
     * 
     * @param widget
     *            the control to observe
     * @param dateChooser
     *            TODO
     */
    public CDateTimeObservableValue(CDateTime widget)
    {
        this.widget = widget;
        date = widget.getSelection();
        this.widget.addSelectionListener(widgetListener);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void dispose()
    {
        widget.removeSelectionListener(widgetListener);
        super.dispose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object doGetValue()
    {
        if (!widget.isDisposed())
        {
            return widget.getSelection();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doSetValue(Object value)
    {
        if (value == null)
        {
            widget.setSelection(null);
        }
        else if (value instanceof Date && !widget.isDisposed())
        {
            Date oldDate;
            Date newDate;
            try
            {
                currentlyUpdatingFlag = true;
                oldDate = widget.getSelection();
                newDate = (Date) value;
                widget.setSelection(newDate);
                date = newDate;
                fireValueChange(Diffs.createValueDiff(oldDate, newDate));
            }
            finally
            {
                currentlyUpdatingFlag = false;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public Object getValueType()
    {
        return Date.class;
    }

}
