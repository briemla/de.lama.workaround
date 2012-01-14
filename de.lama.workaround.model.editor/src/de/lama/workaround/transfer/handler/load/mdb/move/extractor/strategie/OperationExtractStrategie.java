package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Operation;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.AbstractExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;

public class OperationExtractStrategie extends AbstractExtractStrategie<Operation>
{

    public List<Operation> from(ResultSet tableResult) throws SQLException
    {
        while (tableResult.next())
        {
            Operation newOperation = WorkaroundFactory.eINSTANCE.createOperation();
            String tableColumn = DBKonstanten.taetigkeit;
            String taetigkeit = extractStringFrom(tableResult, tableColumn);
            newOperation.setTask(taetigkeit);

            add(newOperation);
        }
        return newElements();
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__OPERATION_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_ARBEITSVORGANG;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected EList<Operation> installedElements()
    {
        return getOwner().getOperationList();
    }

}
