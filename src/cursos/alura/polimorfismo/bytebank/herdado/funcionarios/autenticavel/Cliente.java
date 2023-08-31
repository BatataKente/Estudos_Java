package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.utils.Autenticator;

public class Cliente implements Autenticavel {
	private final Autenticator autenticavelUtil;
	public Cliente() {
		this.autenticavelUtil = new Autenticator();
	}
	public boolean autentica(int senha) {
		return autenticavelUtil.autentica(senha);
	}
	public void setSenha(int senha) {
		autenticavelUtil.setSenha(senha);
	}
}
