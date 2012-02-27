package de.lama.workaround.rcp.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ColumnPropertyMapping
{

    private final List<ColumnProperty> columnFeatures;

    public ColumnPropertyMapping()
    {
        this.columnFeatures = new ArrayList<ColumnProperty>();
    }

    public void put(String columnTitle, EStructuralFeature... features)
    {
        FeaturePath path = FeaturePath.fromList(features);
        IValueProperty property = EMFProperties.value(path);
        ColumnProperty element = new ColumnProperty(columnTitle, property);
        columnFeatures.add(element);
    }

    public void remove(String columnTitle)
    {
        if (columnTitle == null)
        {
            return;
        }
        for (int index = 0; index < columnFeatures.size(); index++)
        {
            ColumnProperty columnFeature = columnFeatures.get(index);
            String title = columnFeature.getTitle();
            if (columnFeature.equals(title))
            {
                columnFeatures.remove(index);
                break;
            }
        }
    }

    public List<String> titles()
    {
        List<String> titles = new ArrayList<String>();
        for (ColumnProperty element : columnFeatures)
        {
            titles.add(element.getTitle());
        }
        return titles;
    }

    public IValueProperty[] properties()
    {
        List<IValueProperty> properties = new ArrayList<IValueProperty>();
        for (ColumnProperty element : columnFeatures)
        {
            properties.add(element.getProperty());
        }
        return properties.toArray(new IValueProperty[properties.size()]);
    }

}
