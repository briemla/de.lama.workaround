package de.lama.workaround.rcp.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureColumnMapping
{

    private final List<ColumnFeature> columnFeatures;

    public FeatureColumnMapping()
    {
        this.columnFeatures = new ArrayList<ColumnFeature>();
    }

    public void put(String columnTitle, EStructuralFeature feature)
    {
        ColumnFeature element = new ColumnFeature(columnTitle, feature);
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
            ColumnFeature columnFeature = columnFeatures.get(index);
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
        for (ColumnFeature element : columnFeatures)
        {
            titles.add(element.getTitle());
        }
        return titles;
    }

    public IValueProperty[] properties()
    {
        List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
        for (ColumnFeature element : columnFeatures)
        {
            features.add(element.getFeature());
        }
        EStructuralFeature[] featureArray = features.toArray(new EStructuralFeature[0]);
        return EMFProperties.values(featureArray);
    }

}
