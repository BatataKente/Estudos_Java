package cursos.alura.polimorfismo.bytebank.herdado.funcionarios;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel.Autenticavel;

public class SistemaInterno {
	private int senha = 2222;
	public void autentica(Autenticavel funcionario) {
		final boolean autenticou = funcionario.autentica(senha);
		if(autenticou) {
			System.out.println(
					"O " + funcionario.getClass().getSimpleName() + " pode entrar no sistema!"
			);
		} else {
			System.out.println(
					"O " + funcionario.getClass().getSimpleName() + " não pode entrar no sistema!"
			);
		}
	}
}
