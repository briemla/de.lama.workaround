package de.lama.workaround.rcp.jface.listener;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Save extends SelectionAdapter
{
    @Override
    public void widgetSelected(SelectionEvent e)
    {
        SaveAction.execute();
    }
}
