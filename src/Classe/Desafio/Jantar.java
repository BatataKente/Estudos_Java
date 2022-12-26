package Classe.Desafio;

public class Jantar {
	public static void main(String[] args) {
		final var josicleison  = new Pessoa("Josicleison", 70);
		final var sanduicheDePresunto = new Comida("Sanduiche de presunto", 2);
		final var pudim = new Comida("Pudim", 0.5);
		josicleison.comer(sanduicheDePresunto);
		josicleison.comer(pudim);
		System.out.print(josicleison.peso);
	}
}
