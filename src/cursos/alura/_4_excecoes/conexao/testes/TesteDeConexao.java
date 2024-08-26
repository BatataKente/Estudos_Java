package cursos.alura._4_excecoes.conexao.testes;

import cursos.alura._4_excecoes.conexao.models.Conexao;

public class TesteDeConexao {
	public static void main(String[] args) {
//		try(Conexao connection = new Conexao()) {
//			connection.lerDados();
//		} catch(Exception exception) {
//			System.out.println("Deu ruim!");
//		}
//		----------------------------------------------------------
		Conexao connection = null;
		try {
			connection = new Conexao();
			connection.lerDados();
		} catch(Exception exception) {
			System.out.println("Deu ruim!");
		} finally {
			if(connection != null) connection.fechar();
		}
	}
}
