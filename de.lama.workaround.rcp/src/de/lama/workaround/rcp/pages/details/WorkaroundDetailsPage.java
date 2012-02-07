package de.lama.workaround.rcp.pages.details;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.jface.binder.WidgetBinder;

public abstract class WorkaroundDetailsPage implements IDetailsPage
{

    private final WorkaroundEditingDomain editingDomain;
    private final FormToolkit toolkit;
    private final IObservableValue masterObservable;

    public WorkaroundDetailsPage(FormToolkit toolkit, WorkaroundEditingDomain editingDomain, IObservableValue masterObservable)
    {
        this.toolkit = toolkit;
        this.editingDomain = editingDomain;
        this.masterObservable = masterObservable;
    }

    protected WorkaroundEditingDomain editingDomain()
    {
        return editingDomain;
    }

    protected WidgetBinder bind()
    {
        return new WidgetBinder(masterObservable, editingDomain());
    }

    protected WidgetBinder bindDelayed()
    {
        return new DelayedWidgetBinder(masterObservable, editingDomain());
    }

    protected FormToolkit toolkit()
    {
        return toolkit;
    }

    @Override
    public void createContents(Composite parent)
    {
        createPageContentOn(parent);
        createLayout(parent);
    }

    private void createLayout(Composite parent)
    {
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.makeColumnsEqualWidth = true;
        parent.setLayout(layout);
    }

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

    protected abstract void createPageContentOn(Composite parent);

}
