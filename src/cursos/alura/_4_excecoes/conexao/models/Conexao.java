package cursos.alura._4_excecoes.conexao.models;

public class Conexao/* implements AutoCloseable*/ {
//	@Override
//	private void close() {
//		System.out.println("Fechando conexão.");
//	}
	public Conexao() {
		System.out.println("Abrindo conexão.");
		throw new IllegalStateException();
	}
	public void lerDados() {
		System.out.println("Recebendo dados.");
		throw new IllegalStateException();
	}
	public void fechar() {
		System.out.println("Fechando conexão.");
	}
}
