package ClasseII.Desafio.MySolution;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> items;
	public Compra(List<Item> items) {
		this.items = items;
	}
	public Compra() {
		this.items = new ArrayList<Item>();
	}
	void adicionarNaCompra(int quantidade, String nome, double preco) {
		items.add(new Item(quantidade, nome, preco));
	}
	void adicionarNaCompra(List<Item> items) {
		items.addAll(items);
	}
}
