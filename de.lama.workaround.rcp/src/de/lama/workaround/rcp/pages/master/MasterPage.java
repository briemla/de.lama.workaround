package de.lama.workaround.rcp.pages.master;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import workaround.Workaround;
import workaround.WorkaroundFactory;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.listener.CreateElement;
import de.lama.workaround.rcp.jface.listener.RemoveElement;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;
import de.lama.workaround.rcp.pages.WorkaroundMasterDetailsBlock;
import de.lama.workaround.rcp.pages.details.DetailsPage;

public abstract class MasterPage extends WorkaroundMasterDetailsBlock
{
    private Section masterSection;

    public MasterPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(toolkit, editingDomain);
    }

    @Override
    protected void createMasterPart(final IManagedForm managedForm, Composite parent)
    {
        final Composite sectionContent = createSectionOn(parent);
        final TableViewer masterTable = createTable(managedForm, sectionContent);
        masterTable.setSorter(createViewerSorter());
        ViewerSupport.bind(masterTable, masterInput(), columnPropertyMapping().properties());
        createButtonArea(sectionContent);
    }

    private void createButtonArea(Composite parent)
    {
        Composite buttonArea = getToolkit().createComposite(parent);
        Button add = getToolkit().createButton(buttonArea, "Neu", SWT.PUSH);
        add.addSelectionListener(new CreateElement(getEditingDomain(), getEditingDomain().getWorkaround(), masterClass(), masterFeature()));

        GridData addData = new GridData(SWT.FILL, SWT.TOP, false, false);
        add.setLayoutData(addData);

        Button remove = getToolkit().createButton(buttonArea, "Entfernen", SWT.PUSH);
        remove.addSelectionListener(new RemoveElement(getEditingDomain(), getMasterObservable(), masterFeature()));

        buttonArea.setLayout(new GridLayout());

        GridData removeData = new GridData(SWT.FILL, SWT.TOP, false, false);
        remove.setLayoutData(removeData);

        GridData buttonAreaData = new GridData(SWT.BEGINNING, SWT.FILL, false, false);
        buttonArea.setLayoutData(buttonAreaData);
    }

    protected TableViewer createTable(final IManagedForm managedForm, Composite parent)
    {
        final TableViewer masterTable = new TableViewer(parent, SWT.V_SCROLL | SWT.SINGLE | SWT.H_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
        addColumnsTo(masterTable);
        masterTable.getControl().setLayoutData(createFullScaleGridData());
        masterTable.getTable().setHeaderVisible(true);
        setMasterObservable(masterTable);
        final SectionPart masterPart = new SectionPart(masterSection);
        masterTable.addSelectionChangedListener(new ISelectionChangedListener()
        {

            @Override
            public void selectionChanged(SelectionChangedEvent event)
            {
                managedForm.fireSelectionChanged(masterPart, event.getSelection());
            }
        });
        return masterTable;
    }

    protected Composite createSectionOn(Composite parent)
    {
        masterSection = toolkit.createSection(parent, SWT.FLAT);
        masterSection.setText(contentTitle());
        final Composite sectionContent = toolkit.createComposite(masterSection);
        masterSection.setClient(sectionContent);

        masterSection.setLayoutData(createFullScaleGridData());
        masterSection.setLayout(new GridLayout());

        final GridLayout contentLayout = new GridLayout();
        contentLayout.numColumns = 2;
        sectionContent.setLayout(contentLayout);

        sectionContent.setLayoutData(createFullScaleGridData());

        return sectionContent;
    }

    protected void addColumnsTo(TableViewer tableViewer)
    {
        for (String title : columnPropertyMapping().titles())
        {
            final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.LEFT);
            final TableColumn column = viewerColumn.getColumn();
            column.setWidth(175);
            column.setText(title);
            column.setMoveable(false);
            column.setResizable(true);
        }
    }

    protected IObservableList masterInput()
    {
        final Workaround workaround = getEditingDomain().getWorkaround();
        return EMFObservables.observeList(workaround, masterFeature());
    }

    @Override
    protected void registerPages(DetailsPart detailsPart)
    {
        detailsPage().initialize(getToolkit(), getEditingDomain(), getMasterObservable());
        EObject element = WorkaroundFactory.eINSTANCE.create(masterClass());
        detailsPart.registerPage(element.getClass(), detailsPage());
    }

    protected IValueProperty createPropertyFor(EStructuralFeature feature)
    {
        return EMFProperties.value(feature);
    }

    protected IValueProperty createPropertyFor(FeaturePath path)
    {
        return EMFProperties.value(path);
    }

    protected abstract EStructuralFeature masterFeature();

    protected abstract EClass masterClass();

    protected abstract DetailsPage detailsPage();

    protected abstract ColumnPropertyMapping columnPropertyMapping();

    protected abstract String contentTitle();

    protected ViewerSorter createViewerSorter()
    {
        return null;
    }
}
