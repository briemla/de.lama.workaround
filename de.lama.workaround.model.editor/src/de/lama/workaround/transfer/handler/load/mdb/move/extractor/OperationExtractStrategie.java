package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import workaround.Operation;
import workaround.WorkaroundFactory;

public class OperationExtractStrategie extends AbstractExtractStrategie
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

}
