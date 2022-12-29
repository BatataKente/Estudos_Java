package Classe.Desafio;

public class Pessoa extends Organico {
	Pessoa(String nome, double peso) {
		super(nome, peso);
	}
	void comer(final Comida rango) {
		if (rango != null) {
			peso += rango.peso;
		}
	}
	String apresentar() {
		return "Nome: " + nome + "\nPeso: " + peso + "Kgs.";
	}
}