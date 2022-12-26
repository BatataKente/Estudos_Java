package Classe.Desafio;

public class Pessoa extends Organico {
	Pessoa(String nome, double peso) {
		super(nome, peso);
	}
	void comer(final Comida rango) {
		peso += rango.peso;
	}
}
