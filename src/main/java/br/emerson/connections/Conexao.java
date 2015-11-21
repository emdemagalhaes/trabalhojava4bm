package br.emerson.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private final static String URL = "jdbc:postgresql://localhost:5432/tbJava";
	private final static String USUARIO = "emerson";
	private final static String SENHA = "123456";

	public static Connection conectar() {

		try {
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
