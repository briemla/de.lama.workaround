package de.lama.workaround.rcp;

import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.util.WorkaroundAdapterFactory;
import de.lama.workaround.rcp.pages.combined.AcreagePage;
import de.lama.workaround.rcp.pages.combined.DistrictPage;
import de.lama.workaround.rcp.pages.combined.JobPage;
import de.lama.workaround.rcp.pages.combined.MachinePage;
import de.lama.workaround.rcp.pages.combined.OperationPage;
import de.lama.workaround.rcp.pages.combined.PersonPage;
import de.lama.workaround.rcp.pages.combined.PreparationPage;
import de.lama.workaround.rcp.pages.combined.VehiclePage;

public class WorkaroundEditor extends FormEditor implements IEditingDomainProvider
{
    private WorkaroundEditingDomain editingDomain;

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException
    {
        setInput(input);
        setSite(site);
    }

    @Override
    protected FormToolkit createToolkit(Display display)
    {
        return new FormToolkit(display);
    }

    @Override
    public WorkaroundEditingDomain getEditingDomain()
    {
        return editingDomain;
    }

    @Override
    protected void addPages()
    {
        initializeEditingDomain();

        createModel();

        try
        {
            addPage(new JobPage(this, getToolkit(), getEditingDomain()));
            addPage(new PersonPage(this, getToolkit(), getEditingDomain()));
            addPage(new OperationPage(this, getToolkit(), getEditingDomain()));
            addPage(new VehiclePage(this, getToolkit(), getEditingDomain()));
            addPage(new MachinePage(this, getToolkit(), getEditingDomain()));
            addPage(new PreparationPage(this, getToolkit(), getEditingDomain()));
            addPage(new AcreagePage(this, getToolkit(), getEditingDomain()));
            addPage(new DistrictPage(this, getToolkit(), getEditingDomain()));
        }
        catch (PartInitException e)
        {
            e.printStackTrace();
        }
    }

    private void createModel()
    {
        URI resourceURI = EditUIUtil.getURI(getEditorInput());
        editingDomain.loadResource(resourceURI);
    }

    private void initializeEditingDomain()
    {
        BasicCommandStack commandStack = new BasicCommandStack();
        commandStack.addCommandStackListener(new CommandStackListener()
        {

            @Override
            public void commandStackChanged(EventObject event)
            {
                firePropertyChange(IEditorPart.PROP_DIRTY);

            }
        });

        // ComposedAdapterFactory adapterFactory = new
        // ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        // adapterFactory.addAdapterFactory(new
        // ResourceItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new
        // WorkaroundItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new
        // ReflectiveItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new WorkaroundAdapterFactory());
        // adapterFactory.addAdapterFactory(adapterFactory)
        WorkaroundAdapterFactory adapterFactory = new WorkaroundAdapterFactory();
        editingDomain = new WorkaroundEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

    }

    @Override
    public void doSave(IProgressMonitor monitor)
    {
        IRunnableWithProgress operation = new IRunnableWithProgress()
        {
            public void run(IProgressMonitor monitor)
            {
                for (Resource resource : editingDomain.getResourceSet().getResources())
                {
                    if (resource.getContents().isEmpty())
                    {
                        continue;
                    }
                    try
                    {
                        resource.save(Collections.EMPTY_MAP);
                    }
                    catch (Exception exception)
                    {
                        String bundleName = Activator.getDefault().getBundle().getSymbolicName();
                        String message = "Daten konnten nicht in die Datenbank gespeichert werden.";
                        IStatus error = new Status(IStatus.ERROR, bundleName, message);
                        Activator.getDefault().getLog().log(error);
                    }
                }
            }
        };
        try
        {
            new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);
            ((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
            firePropertyChange(IEditorPart.PROP_DIRTY);
        }
        catch (Exception exception)
        {

        }
    }

    @Override
    public void doSaveAs()
    {

    }

    @Override
    public boolean isDirty()
    {
        return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();
    }

    @Override
    public boolean isSaveAsAllowed()
    {
        return false;
    }

}
