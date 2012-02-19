package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;
import de.lama.workaround.rcp.jface.components.builded.BuildedList;

public class ListItemViewer extends Component
{

    private final IObservableList input;
    private final IValueProperty property;

    public ListItemViewer(final IObservableList input, final IValueProperty property)
    {
        this.input = input;
        this.property = property;
    }

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);

        ListViewer list = new ListViewer(container, SWT.FLAT | SWT.BORDER | SWT.READ_ONLY);
        list.getControl().setLayoutData(fillBoth());
        ViewerSupport.bind(list, input, property);
        return new BuildedList(list);
    }

}
