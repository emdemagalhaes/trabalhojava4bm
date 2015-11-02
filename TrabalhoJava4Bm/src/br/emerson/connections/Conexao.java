package br.emerson.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:456//banco","postgres","postgres");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
