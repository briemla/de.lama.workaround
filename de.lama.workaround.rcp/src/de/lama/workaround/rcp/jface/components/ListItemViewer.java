package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;
import de.lama.workaround.rcp.jface.components.builded.BuildedViewer;

public class ListItemViewer extends ItemPropertyViewer
{

    public ListItemViewer(final IObservableList input, final IValueProperty property)
    {
        super(input, property);
    }

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);

        ListViewer list = new ListViewer(container, SWT.V_SCROLL | SWT.SINGLE | SWT.H_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.READ_ONLY);
        GridData fillBoth = fillBoth();
        fillBoth.heightHint = 80;
        list.getControl().setLayoutData(fillBoth);
        list.setSorter(new ViewerSorter());
        bind(list);
        return new BuildedViewer(list);
    }

}
