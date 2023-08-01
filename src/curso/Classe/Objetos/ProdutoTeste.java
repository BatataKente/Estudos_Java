package curso.Classe.Objetos;

public class ProdutoTeste {
	public static void main(String[] args) {
		exampleI();
	}
	static void exampleI() {
		Produto pI = new Produto("Cannabis");
		pI.preco = 4356.89;
//		pI.desconto = 0.25;
		var pII = new Produto("Caneta Preta", 12.56);
//		pII.desconto = 0.29;
		System.out.println("Nome: " + pI.nome);
		System.out.printf("Preço final: R$ %.2f\n", pI.precoFinal());
		System.out.println("\nNome: " + pII.nome);
		System.out.printf("Preço final: R$ %.2f\n", pII.precoFinal(0.1));
		double mediaCarrinho = (pI.precoFinal() + pII.precoFinal()) / 2;
		System.out.printf("\nMédia de preço: R$ %.2f\n", mediaCarrinho);
	}
}
