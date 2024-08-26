package curso.ClasseII.Desafio.MySolution;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Coisa {
	List<Compra> compras;
	public Cliente(String nome) {
		super(nome);
		compras = new ArrayList<Compra>();
	}
	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			for (Item item : compra.items) {
				total +=  item.getPrecoTotal();
			}
		}
		return total;
	}
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	void adicionarCompras(List<Compra> compras) {
		this.compras.addAll(compras);
	}
}
