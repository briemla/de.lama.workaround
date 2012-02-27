package de.lama.workaround.rcp.jface.components;

import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.widgets.Composite;

import de.lama.workaround.rcp.jface.components.builded.BuildedComponent;
import de.lama.workaround.rcp.jface.components.builded.BuildedDate;

public class DateChooser extends Component
{

    @Override
    public BuildedComponent on(Composite parent)
    {
        Composite container = createContainerOn(parent);
        createDescriptionOn(container);
        CDateTime date = new CDateTime(container, CDT.BORDER | CDT.DROP_DOWN | CDT.DATE_SHORT | CDT.TIME_SHORT);
        date.setLayoutData(fillHorizontal());
        return new BuildedDate(date);
    }

}
