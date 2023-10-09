package cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.funcionario;

import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.autenticavel.Autenticavel;
import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.utils.Autenticator;

public class Administrador extends Funcionario implements Autenticavel {
	private final Autenticator autenticavelUtil;
	public Administrador() {
		this.autenticavelUtil = new Autenticator();
	}
	public boolean autentica(int senha) {
		return autenticavelUtil.autentica(senha);
	}
	public void setSenha(int senha) {
		autenticavelUtil.setSenha(senha);
	}
	@Override
	public double getBonificacao() {
		return 50;
	}
}
