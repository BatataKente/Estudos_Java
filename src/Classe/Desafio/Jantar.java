package Classe.Desafio;

public class Jantar {
	public static void main(String[] args) {
		final var josicleison  = new Pessoa("Josicleison", 70);
		final var josicleide  = new Pessoa("Josicleide", 60);
		final Comida[] comidas = {
				new Comida("Sanduiche de presunto", 2),
				new Comida("Pudim", 0.5)
		};
		servir(comidas, josicleison);
		servir(comidas, josicleide);
		System.out.println(josicleison.peso);
		System.out.print(josicleide.peso);
	}
	static void servir(final Comida[] comidas, final Pessoa pessoa) {
		for (Comida comida : comidas) {
			pessoa.comer(comida);
		}
	}
}
