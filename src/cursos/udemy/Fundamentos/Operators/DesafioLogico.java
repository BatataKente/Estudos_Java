package curso.Fundamentos.Operators;

public class DesafioLogico {
	public static void main(String[] args) {
		solution(false, false);
	}
	static void solution(boolean trabalhouTerça, boolean trabalhouQuinta) {
		final var televisaoDe50P = trabalhouTerça && trabalhouQuinta;
		final var televisaoDe32P = trabalhouTerça ^ trabalhouQuinta;
		final var irParaOShopping = trabalhouTerça || trabalhouQuinta;
		final var tomarSorvete = televisaoDe50P || televisaoDe32P;
		final var fome = !tomarSorvete;
		System.out.print(
				"Comprou a televisão de 50 polegadas? " + televisaoDe50P + 
				"\nComprou a televisão de 32 polegadas? " + televisaoDe32P + 
				"\nFoi para o shopping? " + irParaOShopping + 
				"\nTomou sorvete? " + tomarSorvete + 
				"\nPassou fome? " + fome
		);
	}
}
