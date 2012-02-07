package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Vehicle;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class VehicleExtractStrategie extends AbstractExtractStrategie<Vehicle>
{

    @Override
    public List<Vehicle> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Vehicle newVehicle = WorkaroundFactory.eINSTANCE.createVehicle();
            String tableColumn = DBKonstanten.COLUMN_BEZEICHNUNG;
            String bezeichnung = extractStringFrom(tableResult, tableColumn);
            newVehicle.setDescription(bezeichnung);
            tableColumn = DBKonstanten.COLUMN_KENNZEICHEN;
            String kennzeichen = extractStringFrom(tableResult, tableColumn);
            newVehicle.setLicenceNumber(kennzeichen);
            if (newVehicle.getLicenceNumber() == null)
            {
                String fzidColumn = DBKonstanten.COLUMN_FZID;
                Integer fzid = (Integer) extractObjectFrom(tableResult, fzidColumn);
                System.out.println("Vehicle missing: " + fzid);
                continue;
            }
            add(newVehicle);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__VEHICLE_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_FAHRZEUG;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Vehicle> installedElements()
    {
        return getOwner().getVehicleList();
    }

}
