package br.com.alert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	public Connection getConnection() throws SQLException {
		System.out.println("conectando ...");

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
		
		return DriverManager.getConnection("jdbc:oracle:thin:TCC/TCC@localhost:1521:xe");
	}

}
