package ClasseII.Desafio.MySolution;

public class ClienteTeste {
	public static void main(String[] args) {
		var cliente = new Cliente("Josicleison");
		var compraDeSegunda = new Compra();
		compraDeSegunda.adicionarNaCompra(1, "Costela de porco", 55.90);
		compraDeSegunda.adicionarNaCompra(2, "Cabeça de porco", 11.99);
		compraDeSegunda.adicionarNaCompra(5, "Queijo", 15.99);
		var compraDeSexta = new Compra();
		compraDeSexta.adicionarNaCompra(1, "Cachaça", 36.34);
		cliente.adicionarCompra(compraDeSegunda);
		cliente.adicionarCompra(compraDeSexta);
		System.out.print(cliente.obterValorTotal());
	}
}
