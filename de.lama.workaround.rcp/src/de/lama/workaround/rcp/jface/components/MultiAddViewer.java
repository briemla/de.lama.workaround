package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;
import de.lama.workaround.rcp.jface.components.builded.BuildedMultiAdd;

public class MultiAddViewer extends ItemPropertiesViewer
{

    public MultiAddViewer(final IObservableList listFrom, final IValueProperty[] propertiesToShow)
    {
        super(listFrom, propertiesToShow);
    }

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent, 3);
        createDescriptionOn(container);

        TableViewer to = new TableViewer(container, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FLAT | SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE
                | SWT.FULL_SELECTION);
        to.getControl().setLayoutData(fillBoth());
        addColumnsTo(to);

        MultiAddButtonGroup buttonGroup = new MultiAddButtonGroup();
        buttonGroup.with(toolkit()).on(container);

        TableViewer from = new TableViewer(container, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FLAT | SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE
                | SWT.FULL_SELECTION);
        from.getControl().setLayoutData(fillBoth());
        addColumnsTo(from);
        bind(from);

        return new BuildedMultiAdd(to, from, buttonGroup, getViewerProperties());
    }

}
