package de.lama.workaround.rcp.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IExtractStrategie
{

    public <T> List<T> extractFrom(ResultSet tableResult) throws SQLException;

}
