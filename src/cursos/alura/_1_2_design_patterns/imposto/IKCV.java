package cursos.alura._1_2_design_patterns.imposto;

import java.util.List;

import cursos.alura._1_2_design_patterns.Item;
import cursos.alura._1_2_design_patterns.Orcamento;

public class IKCV extends ImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.1;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && anyItemMaiorQue100(orcamento.getItems());
	}

	private boolean anyItemMaiorQue100(List<Item> items) {
		for (Item item : items) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}
}
