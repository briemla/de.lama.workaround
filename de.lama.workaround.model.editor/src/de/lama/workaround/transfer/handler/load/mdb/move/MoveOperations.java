package de.lama.workaround.transfer.handler.load.mdb.move;

import java.sql.Connection;

import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Operation;
import workaround.WorkaroundPackage;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.IExtractStrategie;
import de.lama.workaround.transfer.handler.load.mdb.move.extractor.OperationExtractStrategie;

public class MoveOperations extends Move<Operation>
{

    public MoveOperations(Connection database)
    {
        super(database);
    }

    @Override
    public EStructuralFeature feature()
    {
        return WorkaroundPackage.Literals.WORKAROUND__WORK_LIST;
    }

    @Override
    public IExtractStrategie elements()
    {
        return new OperationExtractStrategie();
    }

    @Override
    public String table()
    {
        return DBKonstanten.TBL_ARBEITSVORGANG;
    }

}
