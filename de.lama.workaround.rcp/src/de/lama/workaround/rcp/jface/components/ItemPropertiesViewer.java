package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;

public abstract class ItemPropertiesViewer extends ItemViewer
{

    private final IValueProperty[] propertiesToShow;

    public ItemPropertiesViewer(final IObservableList listFrom, final IValueProperty[] propertiesToShow)
    {
        super(listFrom);
        this.propertiesToShow = propertiesToShow;
    }

    @Override
    protected IValueProperty[] getViewerProperties()
    {
        return propertiesToShow;
    }

    protected void addColumnsTo(TableViewer viewer)
    {
        for (int index = 0; index < propertiesToShow.length; index++)
        {
            final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.LEFT);
            final TableColumn column = viewerColumn.getColumn();
            column.setWidth(100);
            column.setMoveable(false);
            column.setResizable(true);
        }
    }

}
