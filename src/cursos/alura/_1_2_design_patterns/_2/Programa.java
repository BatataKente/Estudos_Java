package cursos.alura._1_2_design_patterns._2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) throws SQLException {
//		Connection connection = new ConnectionFactory(Banco.MYSQL).getConnection();
		Connection connection = new ConnectionFactory(Banco.POSTGRES).getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from tabela");
	}
}
