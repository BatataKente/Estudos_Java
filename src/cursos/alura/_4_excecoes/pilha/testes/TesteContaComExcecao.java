package cursos.alura._4_excecoes.pilha.testes;

import cursos.alura._4_excecoes.pilha.models.Conta;
import cursos.alura._4_excecoes.pilha.models.MinhaException;

public class TesteContaComExcecao {
	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch(MinhaException exception) {
			
		}
	}
}
