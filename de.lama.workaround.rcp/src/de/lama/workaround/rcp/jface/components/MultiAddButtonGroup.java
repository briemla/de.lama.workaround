package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;
import de.lama.workaround.rcp.jface.listener.AddElement;
import de.lama.workaround.rcp.jface.listener.RemoveElement;

public class MultiAddButtonGroup extends Component
{

    private Button addButton;
    private Button removeButton;

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        container.setLayoutData(buttonLayoudData());
        addButton = toolkit().createButton(container, "<<", SWT.PUSH);
        removeButton = toolkit().createButton(container, ">>", SWT.PUSH);
        return null;
    }

    private GridData buttonLayoudData()
    {
        return new GridData(SWT.BEGINNING, SWT.TOP, false, false);
    }

    public void initialize(AddElement action)
    {
        if (addButton == null)
        {
            return;
        }
        addButton.addSelectionListener(action);
    }

    public void initialize(RemoveElement action)
    {
        if (removeButton == null)
        {
            return;
        }
        removeButton.addSelectionListener(action);
    }

}
