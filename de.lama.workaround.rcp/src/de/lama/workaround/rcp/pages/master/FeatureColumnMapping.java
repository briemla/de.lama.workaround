package de.lama.workaround.rcp.pages.master;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureColumnMapping
{

    private final Map<String, EStructuralFeature> features;

    public FeatureColumnMapping()
    {
        this.features = new HashMap<String, EStructuralFeature>();
    }

    public void put(String columnTitle, EStructuralFeature feature)
    {
        features.put(columnTitle, feature);
    }

    public void remove(String columnTitle)
    {
        features.remove(columnTitle);
    }

    public Set<String> titles()
    {
        return features.keySet();
    }

    public IValueProperty[] properties()
    {
        EStructuralFeature[] featureArray = features.values().toArray(new EStructuralFeature[0]);
        return EMFProperties.values(featureArray);
    }

}
