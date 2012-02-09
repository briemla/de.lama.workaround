package de.lama.workaround.rcp.pages.combined;

import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.lama.workaround.rcp.WorkaroundEditingDomain;
import de.lama.workaround.rcp.pages.MasterDetailsPage;
import de.lama.workaround.rcp.pages.master.VehicleMasterPage;

public class VehiclePage extends MasterDetailsPage
{

    public VehiclePage(FormEditor editor, FormToolkit toolkit, WorkaroundEditingDomain editingDomain)
    {
        super(editor, toolkit, editingDomain, "page.vehicle.edit", "Fahrzeuge");
    }

    @Override
    protected MasterDetailsBlock createPageContent()
    {
        return new VehicleMasterPage(getToolkit(), getEditingDomain());
    }

}
