package de.lama.workaround.transfer.handler.load.mdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MDBConnectionManager {

	public static Connection createConnectionFor(String accessPath) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url = "jdbc:odbc:Workaround";// Driver={Microsoft Access
												// Driver (*.mdb)};DBQ=" +
												// accessPath;
			return DriverManager.getConnection(url, "", "");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
