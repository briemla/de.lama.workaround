package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Operation;
import workaround.WorkaroundFactory;
import workaround.WorkaroundPackage;

public class OperationExtractStrategie extends AbstractExtractStrategie<Operation>
{

    @Override
    public List<Operation> extractFrom(ResultSet tableResult) throws SQLException
    {
        List<Operation> operations = new ArrayList<Operation>();
        while (tableResult.next())
        {
            Operation nextOperation = WorkaroundFactory.eINSTANCE.createOperation();
            String tableColumn = DBKonstanten.taetigkeit;
            String taetigkeit = extractStringFrom(tableResult, tableColumn);
            nextOperation.setTask(taetigkeit);
            operations.add(nextOperation);
        }
        return operations;
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__WORK_LIST;
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_ARBEITSVORGANG;
    }

}
