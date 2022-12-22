package Objetos.Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto pI = new Produto();
		pI.nome = "Cannabis";
		pI.preco = 4356.89;
		pI.desconto = 0.25;
		
		var pII = new Produto();
		pII.nome = "Caneta Preta";
		pII.preco = 12.56;
		pII.desconto = 0.29;
		
		System.out.println("Nome: " + pI.nome);
		System.out.printf("Preço final: R$ %.2f\n", pI.precoFinal());
		System.out.println("Nome: " + pII.nome);
		System.out.printf("Preço final: R$ %.2f\n", pII.precoFinal());
		double mediaCarrinho = (pI.precoFinal() + pII.precoFinal()) / 2;
		System.out.printf("Média de preço: R$ %.2f\n", mediaCarrinho);
	}
}
