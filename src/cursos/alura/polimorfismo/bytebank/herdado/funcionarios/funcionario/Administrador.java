package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {
	private int senha;
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public double getBonificacao() {
		return 50;
	}
}
