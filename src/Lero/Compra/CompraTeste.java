package Lero.Compra;

public class CompraTeste {
	public static void main(String[] args) {
		var firstCompra = new Compra();
		firstCompra.nomeDoCliente = "Josicleison Elves";
		firstCompra.adicionarItem("Caneta", 20, 7.45);
		firstCompra.adicionarItem("Borracha", 12, 3.89);
		firstCompra.adicionarItem("Caderno", 3, 18.79);
		System.out.println(firstCompra.itens.size());
		System.out.println("Preço total: " + firstCompra.pegarValorTotal());
		System.out.println(
				"Já que é biDirecional.. "
				+ firstCompra.itens.get(0).compra.itens.get(0).compra.pegarValorTotal()
		);
	}
}
