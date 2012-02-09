package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComboBox;
import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;

public class ComboBox extends Component
{

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);
        Combo combobox = new Combo(container, SWT.FLAT);
        combobox.setLayoutData(fillHorizontal());
        return new BuildedComboBox(combobox);
    }

}
