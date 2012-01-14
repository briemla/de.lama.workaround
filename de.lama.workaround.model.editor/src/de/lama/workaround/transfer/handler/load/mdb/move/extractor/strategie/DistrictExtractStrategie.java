package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.District;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class DistrictExtractStrategie extends AbstractExtractStrategie<District>
{

    @Override
    public List<District> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            District newDistrict = WorkaroundFactory.eINSTANCE.createDistrict();
            String tableColumn = DBKonstanten.COLUMN_GEMARKUNG;
            String gemarkung = extractStringFrom(tableResult, tableColumn);
            newDistrict.setDistrictName(gemarkung);

            add(newDistrict);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__DISTRICT_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_FLAECHE;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<District> installedElements()
    {
        return getOwner().getDistrictList();
    }

}
