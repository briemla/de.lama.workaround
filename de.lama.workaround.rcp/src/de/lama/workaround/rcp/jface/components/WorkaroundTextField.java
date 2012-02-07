package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class WorkaroundTextField extends WorkaroundComponent
{

    private static final String EMPTY = "";

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);
        Text textField = toolkit().createText(container, EMPTY, SWT.FLAT);
        textField.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
        return new BuildedTextComponent(textField);
    }
}
