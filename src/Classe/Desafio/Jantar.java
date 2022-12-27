package Classe.Desafio;

public class Jantar {
	public static void main(String[] args) {
		solution();
	}
	static void solution() {
		Comida arroz = new Comida("Arroz", 0.1);
		Comida feijao = new Comida("Feijão", 0.3);
		
		Pessoa joao = new Pessoa("João", 99.8);
		System.out.print(joao.apresentar() + "\n\n");
		joao.comer(arroz);
		System.out.print(joao.apresentar() + "\n\n");
		joao.comer(feijao);
		System.out.print(joao.apresentar());
	}
	static void mySolution() {
		final var josicleison  = new Pessoa("Josicleison", 70);
		final var josicleide  = new Pessoa("Josicleide", 60);
		final Comida[] comidas = {
				new Comida("Sanduiche de presunto", 2),
				new Comida("Pudim", 0.5)
		};
		System.out.print(
				"Peso do " + josicleison.nome + ": "+  josicleison.peso
				+ "\nPeso da " + josicleide.nome + ": "+  josicleide.peso + "\n\n"
		);
		servir(comidas, josicleison);
		servir(comidas, josicleide);
		System.out.print(
				"Peso do " + josicleison.nome + ": "+  josicleison.peso
				+ "\nPeso da " + josicleide.nome + ": "+  josicleide.peso
		);
	}
	static void servir(final Comida[] comidas, final Pessoa pessoa) {
		for (Comida comida : comidas) {
			pessoa.comer(comida);
		}
	}
}
