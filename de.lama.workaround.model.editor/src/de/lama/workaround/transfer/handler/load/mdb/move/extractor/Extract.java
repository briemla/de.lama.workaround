package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import workaround.Workaround;

public class Extract<T>
{

    private final IExtractStrategie<T> strategie;
    private Connection database;

    public Extract(IExtractStrategie<T> strategie)
    {
        this.strategie = strategie;
    }

    public Extract<T> from(Connection database)
    {
        this.database = database;
        return this;
    }

    public List<T> with(Workaround owner) throws SQLException
    {
        Statement statement = database.createStatement();
        ResultSet tableResult = statement.executeQuery("SELECT * FROM " + strategie.table());
        return strategie.extract(owner).from(tableResult);
    }

}
