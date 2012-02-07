package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Machine;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class MachineExtractStrategie extends AbstractExtractStrategie<Machine>
{

    @Override
    public List<Machine> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Machine newMachine = WorkaroundFactory.eINSTANCE.createMachine();
            String tableColumn = DBKonstanten.COLUMN_BEZEICHNUNG;
            String bezeichnung = extractStringFrom(tableResult, tableColumn);
            newMachine.setDescription(bezeichnung);
            if (newMachine.getDescription() == null)
            {
                String gidColumn = DBKonstanten.COLUMN_GID;
                Integer gid = (Integer) extractObjectFrom(tableResult, gidColumn);
                System.out.println("Machine missing: " + gid);
                continue;
            }
            add(newMachine);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__MACHINE_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_GERAET;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Machine> installedElements()
    {
        return getOwner().getMachineList();
    }

}
