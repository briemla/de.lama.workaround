package de.lama.workaround.rcp.pages;

import org.eclipse.emf.ecore.EStructuralFeature;

public class ColumnFeature
{
    private final String title;
    private final EStructuralFeature feature;

    public ColumnFeature(String title, EStructuralFeature feature)
    {
        super();
        this.title = title;
        this.feature = feature;
    }

    public String getTitle()
    {
        return title;
    }

    public EStructuralFeature getFeature()
    {
        return feature;
    }
}
