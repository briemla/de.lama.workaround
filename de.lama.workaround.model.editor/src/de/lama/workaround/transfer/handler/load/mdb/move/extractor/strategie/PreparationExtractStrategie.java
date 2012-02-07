package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Preparation;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class PreparationExtractStrategie extends AbstractExtractStrategie<Preparation>
{

    @Override
    public List<Preparation> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Preparation newPreparation = WorkaroundFactory.eINSTANCE.createPreparation();
            String tableColumn = DBKonstanten.COLUMN_NAME;
            String name = extractStringFrom(tableResult, tableColumn);
            newPreparation.setPreparationName(name);
            tableColumn = DBKonstanten.COLUMN_ABKUERZUNG;
            String abkuerzung = extractStringFrom(tableResult, tableColumn);
            newPreparation.setAbbreviation(abkuerzung);
            if ((newPreparation.getAbbreviation() == null) || (newPreparation.getPreparationName() == null))
            {
                String pridColumn = DBKonstanten.COLUMN_PRID;
                Integer prid = (Integer) extractObjectFrom(tableResult, pridColumn);
                System.out.println("Preparation missing: " + prid);
                continue;
            }
            add(newPreparation);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__PREPARATION_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_PRAEPARAT;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Preparation> installedElements()
    {
        return getOwner().getPreparationList();
    }

}
