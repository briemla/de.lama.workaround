package de.lama.workaround.rcp.jface.components;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.lama.workaround.rcp.jface.components.builded.BuildedPrimitive;
import de.lama.workaround.rcp.jface.components.builded.BuildedText;

public class TextField extends Component
{

    private static final String EMPTY = "";

    @Override
    public BuildedPrimitive on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);
        Text textField = toolkit().createText(container, EMPTY, SWT.FLAT);
        textField.setLayoutData(fillHorizontal());
        return new BuildedText(textField);
    }
}
