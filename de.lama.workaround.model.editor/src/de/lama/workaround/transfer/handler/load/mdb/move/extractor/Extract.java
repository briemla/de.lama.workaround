package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Extract {

	private IExtractStrategie strategie;
	private String tableName;

	public Extract(IExtractStrategie strategie) {
		this.strategie = strategie;
	}

	public static Extract the(IExtractStrategie strategie) {
		return new Extract(strategie);
	}

	public Extract from(String tableName) {
		this.tableName = tableName;
		return this;
	}

	public <T> List<T> of(Connection database) throws SQLException {
		Statement statement = database.createStatement();
		ResultSet tableResult = statement.executeQuery("SELECT * FROM "
				+ tableName);
		return strategie.<T> extractFrom(tableResult);
	}

}
