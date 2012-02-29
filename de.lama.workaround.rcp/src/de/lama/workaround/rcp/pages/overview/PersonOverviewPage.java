package de.lama.workaround.rcp.pages.overview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import workaround.Workaround;
import workaround.WorkaroundPackage;
import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.listener.YearFilteredListener;
import de.lama.workaround.rcp.jface.provider.PersonOverviewContentProvider;
import de.lama.workaround.rcp.jface.provider.PersonOverviewLabelProvider;
import de.lama.workaround.rcp.jface.sorter.PersonTimeSorter;
import de.lama.workaround.rcp.pages.ColumnPropertyMapping;

public class PersonOverviewPage extends FormPage
{

    private final FormToolkit toolkit;
    private WorkaroundEditingDomain editingDomain;

    public PersonOverviewPage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain workaroundEditingDomain)
    {
        super(editor, "pages.person.overview", "Personenauswertung");
        this.toolkit = toolkit;
        this.editingDomain = workaroundEditingDomain;
    }

    @Override
    protected void createFormContent(IManagedForm managedForm)
    {
        ScrolledForm form = managedForm.getForm();
        Composite contentBody = form.getBody();
        contentBody.setLayout(new GridLayout());
        toolkit.createLabel(contentBody, "Personen");
        Combo year = new Combo(contentBody, SWT.READ_ONLY);
        year.setItems(createYears());
        TableViewer viewer = new TableViewer(contentBody);
        year.addSelectionListener(new YearFilteredListener(viewer));
        viewer.setSorter(new PersonTimeSorter());
        viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        ColumnPropertyMapping mapping = createPersonMapping();
        addColumnsTo(viewer, mapping);
        bind(viewer, createJobList(), mapping.properties());
    }

    private String[] createYears()
    {
        long currentTime = System.currentTimeMillis();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(currentTime);
        Date time = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY");
        String format = formatter.format(time);
        int currentYear = Integer.parseInt(format);
        int yearOffset = 2008;
        int yearCount = currentYear - yearOffset;
        String[] years = new String[yearCount];
        for (int index = 0; index < years.length; index++)
        {
            int year = yearCount - index;
            years[index] = String.valueOf(yearOffset + year);
        }
        return years;
    }

    private void addColumnsTo(TableViewer viewer, ColumnPropertyMapping mapping)
    {
        for (String title : mapping.titles())
        {
            addColumnTo(viewer, title);
        }
        addColumnTo(viewer, "Zeit");
    }

    protected void addColumnTo(TableViewer viewer, String title)
    {
        final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.LEFT);
        final TableColumn column = viewerColumn.getColumn();
        column.setWidth(175);
        column.setText(title);
        column.setMoveable(false);
        column.setResizable(true);
    }

    private void bind(StructuredViewer viewer, List<?> input, IValueProperty[] labelProperties)
    {
        ObservableListContentProvider contentProvider = new PersonOverviewContentProvider();
        if (viewer.getInput() != null)
        {
            viewer.setInput(null);
        }
        viewer.setContentProvider(contentProvider);
        ObservableMapLabelProvider labelProvider = new PersonOverviewLabelProvider(Properties.observeEach(contentProvider.getKnownElements(),
                labelProperties));
        viewer.setLabelProvider(labelProvider);
        if (input != null)
        {
            viewer.setInput(input);
        }
    }

    private IObservableList createJobList()
    {
        Workaround workaround = editingDomain.getWorkaround();
        EStructuralFeature feature = WorkaroundPackage.Literals.WORKAROUND__JOB_LIST;
        return EMFObservables.observeList(workaround, feature);
    }

    private ColumnPropertyMapping createPersonMapping()
    {
        ColumnPropertyMapping mapping = new ColumnPropertyMapping();
        mapping.put("Nachname", WorkaroundPackage.Literals.PERSON__LAST_NAME);
        mapping.put("Vorname", WorkaroundPackage.Literals.PERSON__FIRST_NAME);
        return mapping;
    }
}
