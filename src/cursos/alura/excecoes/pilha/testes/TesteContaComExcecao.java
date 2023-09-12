package cursos.alura.excecoes.pilha.testes;

import cursos.alura.excecoes.pilha.models.Conta;
import cursos.alura.excecoes.pilha.models.MinhaException;

public class TesteContaComExcecao {
	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch(MinhaException exception) {
			
		}
	}
}
