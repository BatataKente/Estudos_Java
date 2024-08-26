package cursos.alura._1_2_design_patterns._1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> items;
	
	private EstadoDeUmOrcamento currentState;
	
	public Orcamento(final double valor) {
		this.valor = valor;
		this.items = new ArrayList<Item>();
		this.currentState = new EmAprovacao();
	}
	
	protected void setCurrentState(EstadoDeUmOrcamento currentState) {
		this.currentState = currentState;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void addItem(final Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}

	public void aplicaDescontoExtra() {
		currentState.aplicaDescontoExtra(this);
	}

	public void aprova() {
		currentState.aprova(this);
	}

	public void reprova() {
		currentState.reprova(this);
	}

	public void finaliza() {
		currentState.finaliza(this);
	}
}
