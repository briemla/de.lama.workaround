package de.lama.workaround.rcp.jface.listener;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;

import de.lama.workaround.rcp.jface.provider.YearFilteredContentProvider;

public class YearFilteredListener extends SelectionAdapter
{

    private final StructuredViewer viewer;

    public YearFilteredListener(StructuredViewer viewer)
    {
        this.viewer = viewer;
    }

    @Override
    public void widgetSelected(SelectionEvent e)
    {
        Object source = e.getSource();
        if (source instanceof Combo)
        {
            Combo combo = (Combo) source;
            String year = combo.getItem(combo.getSelectionIndex());
            IContentProvider contentProvider = viewer.getContentProvider();
            if (contentProvider instanceof YearFilteredContentProvider)
            {
                YearFilteredContentProvider provider = (YearFilteredContentProvider) contentProvider;
                provider.setYear(year);
                viewer.refresh();
            }
        }
    }

}
