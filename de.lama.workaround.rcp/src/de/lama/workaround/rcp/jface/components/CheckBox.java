package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedCheckBox;
import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;

public class CheckBox extends Component
{

    @Override
    public BuildedComponent on(Composite parent)
    {
        Button checkbox = toolkit().createButton(parent, description(), SWT.CHECK);
        checkbox.setLayoutData(fillHorizontal());
        return new BuildedCheckBox(checkbox);
    }

}
