package de.lama.workaround.rcp.pages.master;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import de.lama.workaround.rcp.WorkaroundEditingDomain;

public abstract class WorkaroundMasterPage extends MasterDetailsBlock
{
    private final FormToolkit toolkit;
    private final WorkaroundEditingDomain editingDomain;
    private IViewerObservableValue masterObservable;

    public WorkaroundMasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        this.toolkit = toolkit;
        this.editingDomain = editingDomain;
    }

    @Override
    protected void createMasterPart(final IManagedForm managedForm, Composite parent)
    {
        Section sectionContent = createSectionOn(parent);
        final TableViewer masterTable = new TableViewer((Composite) sectionContent.getClient(), SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL
                | SWT.FULL_SELECTION);
        addColumnsTo(masterTable);
        masterTable.getControl().setLayoutData(createFullScaleGridData());
        masterObservable = ViewersObservables.observeSingleSelection(masterTable);
        final SectionPart masterPart = new SectionPart(sectionContent);
        managedForm.addPart(masterPart);
        masterTable.addSelectionChangedListener(new ISelectionChangedListener()
        {

            @Override
            public void selectionChanged(SelectionChangedEvent event)
            {
                managedForm.fireSelectionChanged(masterPart, event.getSelection());
            }
        });

        ViewerSupport.bind(masterTable, masterInput(), columnFeatureMapping().properties());
    }

    private GridData createFullScaleGridData()
    {
        return new GridData(SWT.BEGINNING, SWT.TOP, true, true);
    }

    private Section createSectionOn(Composite parent)
    {
        Section section = toolkit.createSection(parent, SWT.FLAT);
        section.setText(contentTitle());
        Composite sectionContent = toolkit.createComposite(section);
        section.setClient(sectionContent);

        GridLayout parentLayout = new GridLayout();
        parent.setLayout(parentLayout);

        section.setLayoutData(createFullScaleGridData());
        sectionContent.setLayoutData(createFullScaleGridData());

        GridLayout contentLayout = new GridLayout();
        sectionContent.setLayout(contentLayout);

        return section;
    }

    private void addColumnsTo(TableViewer tableViewer)
    {
        for (String title : columnFeatureMapping().titles())
        {
            TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
            TableColumn column = viewerColumn.getColumn();
            column.setWidth(100);
            column.setText(title);
            column.setMoveable(false);
            column.setResizable(false);
        }
    }

    @Override
    protected void createToolBarActions(IManagedForm managedForm)
    {
    }

    protected FormToolkit toolkit()
    {
        return toolkit;
    }

    public IObservableValue masterObservable()
    {
        return masterObservable;
    }

    protected WorkaroundEditingDomain editingDomain()
    {
        return editingDomain;
    }

    protected abstract FeatureColumnMapping columnFeatureMapping();

    protected abstract String contentTitle();

    protected abstract IObservableList masterInput();
}
