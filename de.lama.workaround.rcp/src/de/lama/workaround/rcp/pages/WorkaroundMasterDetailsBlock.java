package de.lama.workaround.rcp.pages;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;

public abstract class WorkaroundMasterDetailsBlock extends MasterDetailsBlock
{

    private final FormToolkit toolkit;
    private final WorkaroundEditingDomain editingDomain;
    private IViewerObservableValue masterObservable;

    public WorkaroundMasterDetailsBlock(final FormToolkit toolkit, final WorkaroundEditingDomain editingDomain)
    {
        this.toolkit = toolkit;
        this.editingDomain = editingDomain;
    }

    @Override
    protected void createToolBarActions(IManagedForm managedForm)
    {
    }

    protected FormToolkit getToolkit()
    {
        return toolkit;
    }

    public IObservableValue getMasterObservable()
    {
        return masterObservable;
    }

    protected WorkaroundEditingDomain getEditingDomain()
    {
        return editingDomain;
    }

    protected void setMasterObservable(final TableViewer masterTable)
    {
        masterObservable = ViewersObservables.observeSingleSelection(masterTable);
    }

    protected GridData createFullScaleGridData()
    {
        return new GridData(SWT.FILL, SWT.FILL, true, true);
    }

}
