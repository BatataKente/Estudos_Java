package cursos.alura._1_2_design_patterns._2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private final Banco url;
	private final String user = "Rute";
	private final String password = "123";
	
	public ConnectionFactory(final Banco url) {
		super();
		this.url = url;
	}

	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url.toString(), user, password);
			return connection;
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
}
