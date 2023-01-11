package ClasseII.Desafio.Solution;

public class Sistema {
	public static void main(String[] args) {
		var cliente = new Cliente("Josicleison Elves");
		var umaCompra = new Compra();
		umaCompra.adicionarItem("Caneta", 1, 100);
		umaCompra.adicionarItem(new Produto("NoteBook",	2000.00), 2);
		var outraCompra = new Compra();
		outraCompra.adicionarItem("Caderno", 10, 10);
		outraCompra.adicionarItem(new Produto("Impressora", 1000), 1);
		cliente.adicionarCompra(umaCompra);
		cliente.adicionarCompra(outraCompra);
		System.out.print(cliente.obterValorTotal());
	}
}
