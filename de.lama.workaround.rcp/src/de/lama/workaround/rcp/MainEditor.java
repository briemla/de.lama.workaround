package de.lama.workaround.rcp;

import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import workaround.util.WorkaroundAdapterFactory;
import de.lama.workaround.rcp.jface.WidgetBuilder;

public class MainEditor extends FormEditor implements IEditingDomainProvider
{
    private EditingDomain editingDomain;

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
    public EditingDomain getEditingDomain()
    {
        return editingDomain;
    }

    @Override
    protected void addPages()
    {
        initializeEditingDomain();

        createModel();

        WidgetBuilder builder = initializeWidgetBuilder();

        try
        {
            addPage(new CreateJobPage(this, editingDomain, builder));
        }
        catch (PartInitException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private WidgetBuilder initializeWidgetBuilder()
    {
        WidgetBuilder builder = new WidgetBuilder(getEditingDomain(), getToolkit());
        return builder;
    }

    private void createModel()
    {
        URI resourceURI = EditUIUtil.getURI(getEditorInput());

        try
        {
            editingDomain.getResourceSet().getResource(resourceURI, true);
        }
        catch (Exception e)
        {
            editingDomain.getResourceSet().getResource(resourceURI, false);
        }

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
        WorkaroundAdapterFactory adapterFactory = new WorkaroundAdapterFactory();
        editingDomain = new WorkaroundEditingDomain(adapterFactory, commandStack);

    }

    @Override
    public void doSave(IProgressMonitor monitor)
    {

    }

    @Override
    public void doSaveAs()
    {

    }

    @Override
    public boolean isDirty()
    {
        return false;
    }

    @Override
    public boolean isSaveAsAllowed()
    {
        return false;
    }

}
