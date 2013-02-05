package de.lama.workaround.rcp.jface.components;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
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
        Composite container = createContainerOn(parent, 3, 2);
        createDescriptionOn(container);

        TableViewer to = new TableViewer(container, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FLAT | SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE
                | SWT.FULL_SELECTION);
        GridData fillBoth = fillBoth();
        fillBoth.heightHint = 80;
        to.getControl().setLayoutData(fillBoth);
        addColumnsTo(to);
        to.setSorter(viewerSorter());

        MultiAddButtonGroup buttonGroup = new MultiAddButtonGroup();
        buttonGroup.with(toolkit()).on(container);

        to.getTable().addKeyListener(new RemoveListener(buttonGroup));

        TableViewer from = new TableViewer(container, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FLAT | SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE
                | SWT.FULL_SELECTION);
        fillBoth = fillBoth();
        fillBoth.heightHint = 80;
        from.getControl().setLayoutData(fillBoth);
        addColumnsTo(from);
        from.setSorter(viewerSorter());
        from.getTable().addKeyListener(new AddListener(buttonGroup));
        bind(from);

        return new BuildedMultiAdd(to, from, buttonGroup, getViewerProperties());
    }

    private ViewerSorter viewerSorter()
    {
        return new ViewerSorter();
    }

}
