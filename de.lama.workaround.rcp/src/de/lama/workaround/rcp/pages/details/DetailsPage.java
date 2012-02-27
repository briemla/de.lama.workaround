package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.binder.DateWidgetBinder;
import de.lama.workaround.rcp.jface.binder.DelayedWidgetBinder;
import de.lama.workaround.rcp.jface.binder.MultiWidgetBinder;
import de.lama.workaround.rcp.jface.binder.WidgetBinder;
import de.lama.workaround.rcp.jface.listener.Save;

public abstract class DetailsPage implements IDetailsPage
{

    private WorkaroundEditingDomain editingDomain;
    private FormToolkit toolkit;
    private IObservableValue masterObservable;

    public void initialize(FormToolkit toolkit, WorkaroundEditingDomain editingDomain, IObservableValue masterObservable)
    {
        this.toolkit = toolkit;
        this.editingDomain = editingDomain;
        this.masterObservable = masterObservable;
    }

    protected WorkaroundEditingDomain getEditingDomain()
    {
        return editingDomain;
    }

    protected WidgetBinder bind()
    {
        return new WidgetBinder(masterObservable, getEditingDomain());
    }

    protected WidgetBinder bindDelayed()
    {
        return new DelayedWidgetBinder(masterObservable, getEditingDomain());
    }

    protected WidgetBinder bindMulti()
    {
        return new MultiWidgetBinder(masterObservable, getEditingDomain());
    }

    protected WidgetBinder bindDate()
    {
        return new DateWidgetBinder(masterObservable, getEditingDomain());
    }

    protected FormToolkit toolkit()
    {
        return toolkit;
    }

    @Override
    public void createContents(Composite parent)
    {
        createLayout(parent);
        createPageContentOn(parent);
        addSaveButton(parent);
    }

    private void addSaveButton(Composite parent)
    {
        final Button save = toolkit.createButton(parent, "Speichern", SWT.PUSH);
        save.addSelectionListener(new Save());
        save.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false, false));
    }

    private void createLayout(Composite parent)
    {
        GridLayout layout = new GridLayout();
        parent.setLayout(layout);
    }

    protected abstract void createPageContentOn(Composite parent);

    @Override
    public void initialize(IManagedForm form)
    {
    }

    @Override
    public void dispose()
    {
    }

    @Override
    public boolean isDirty()
    {
        return false;
    }

    @Override
    public void commit(boolean onSave)
    {
    }

    @Override
    public boolean setFormInput(Object input)
    {
        return false;
    }

    @Override
    public void setFocus()
    {
    }

    @Override
    public boolean isStale()
    {
        return false;
    }

    @Override
    public void refresh()
    {
    }

    @Override
    public void selectionChanged(IFormPart part, ISelection selection)
    {
    }

}
