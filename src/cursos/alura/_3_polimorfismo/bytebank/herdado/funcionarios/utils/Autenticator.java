package cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.utils;

public class Autenticator {
	private int senha;
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}