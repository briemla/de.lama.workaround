package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Acreage;
import workaround.District;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class AcreageExtractStrategie extends AbstractExtractStrategie<Acreage>
{

    @Override
    public List<Acreage> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Acreage newAcreage = WorkaroundFactory.eINSTANCE.createAcreage();
            String tableColumn = DBKonstanten.COLUMN_NAME;
            String name = extractStringFrom(tableResult, tableColumn);
            newAcreage.setAcreageName(name);
            tableColumn = DBKonstanten.COLUMN_SCHLAGNUMMER;
            String schlagnummer = extractStringFrom(tableResult, tableColumn);
            newAcreage.setNumber(schlagnummer);
            tableColumn = DBKonstanten.COLUMN_GEMARKUNG;
            String gemarkung = extractStringFrom(tableResult, tableColumn);
            District district = find(gemarkung);
            newAcreage.setDistrict(district);

            if ((newAcreage.getAcreageName() == null) || (newAcreage.getDistrict() == null))
            {
                String flidColumn = DBKonstanten.COLUMN_FLID;
                Integer flid = (Integer) extractObjectFrom(tableResult, flidColumn);
                System.out.println("Acreage missing: " + flid);
                continue;
            }
            add(newAcreage);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__ACREAGE_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_FLAECHE;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Acreage> installedElements()
    {
        return getOwner().getAcreageList();
    }

    @SuppressWarnings("unchecked")
    private District find(String gemarkung)
    {
        EList<District> districtList = getOwner().getDistrictList();
        for (District district : districtList)
        {
            if (district.getDistrictName().equals(gemarkung))
            {
                return district;
            }
        }
        return null;
    }

}
