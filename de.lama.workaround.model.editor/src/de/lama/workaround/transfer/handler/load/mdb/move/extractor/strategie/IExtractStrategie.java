package de.lama.workaround.transfer.handler.load.mdb.move.extractor.strategie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import workaround.Workaround;

public interface IExtractStrategie<T>
{

    public IExtractStrategie<T> extract(Workaround owner);

    public List<T> from(ResultSet tableResult) throws SQLException;

    /**
     * Returns the <code>EStructuralFeature</code> for this move operation.
     * Example: WorkaroundPackage.Literals.WORKAROUND__PERSON_LIST
     * 
     * @return
     */
    public EStructuralFeature feature();

    /**
     * Returns the table name of the table where the
     * <code>IExtractStrategie</code> should extract elements from. Example:
     * de.lama.workaround.transfer.handler.load.mdb.move.extractor.DBKonstanten.
     * TBL_PERSON
     * 
     * @return
     */
    public String table();

}
