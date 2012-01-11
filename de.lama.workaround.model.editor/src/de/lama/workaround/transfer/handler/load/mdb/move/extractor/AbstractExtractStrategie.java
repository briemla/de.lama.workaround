package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class AbstractExtractStrategie implements IExtractStrategie
{

    protected String extractStringFrom(ResultSet tableResult, String tableColumn) throws SQLException
    {
        int columnIndex = tableResult.findColumn(tableColumn);
        String nachname = tableResult.getString(columnIndex);
        return nachname;
    }

}
