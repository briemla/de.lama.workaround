package de.lama.workaround.rcp.jface.provider;

import org.eclipse.jface.viewers.LabelProvider;

import workaround.District;

public class DistrictLabelProvider extends LabelProvider
{

    @Override
    public String getText(Object element)
    {
        if (element instanceof District)
        {
            return ((District) element).getDistrictName();
        }
        return super.getText(element);
    }

}
