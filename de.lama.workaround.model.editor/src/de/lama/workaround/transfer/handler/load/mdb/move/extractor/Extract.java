package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Extract<T>
{

    private IExtractStrategie<T> strategie;

    public Extract(IExtractStrategie<T> strategie)
    {
        this.strategie = strategie;
    }

    public List<T> from(Connection database) throws SQLException
    {
        Statement statement = database.createStatement();
        ResultSet tableResult = statement.executeQuery("SELECT * FROM " + strategie.table());
        return strategie.extractFrom(tableResult);
    }

}
